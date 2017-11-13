package com.stock.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnectionPool {

	private BlockingQueue<Connection> pool;
	Logger logger = Logger.getAnonymousLogger();

	/**
	 * Maximum number of connections that the pool can have
	 */
	private int maxPoolSize;
	/**
	 * Number of connections that should be created initially
	 */
	private int initialPoolSize;
	/**
	 * Number of connections generated so far
	 */
	private int currentPoolSize;

	private String dbUrl;
	private String dbUser;
	private String dbPassword;
	public MyConnectionPool(){}

	public MyConnectionPool(int maxPoolSize, int initialPoolSize, String url, String username, String password,
			String driverClassName) throws ClassNotFoundException, SQLException {

		if ((initialPoolSize > maxPoolSize) || initialPoolSize < 1 || maxPoolSize < 1) {
			throw new IllegalArgumentException("Invalid pool size parameters");
		}
		this.maxPoolSize = maxPoolSize > 0 ? maxPoolSize : 10;
        this.initialPoolSize = initialPoolSize;
        this.dbUrl = url;
        this.dbUser = username;
        this.dbPassword = password;
        this.pool = new LinkedBlockingQueue<Connection>(maxPoolSize);

        initPooledConnections(driverClassName);

        if (pool.size() != initialPoolSize) {
            logger.log(Level.WARNING,
                       "Initial sized pool creation failed. InitializedPoolSize={0}, initialPoolSize={1}",
                       new Object[]{pool.size(), initialPoolSize});
        }

	}
	
	  private void initPooledConnections(String driverClassName)
	            throws ClassNotFoundException, SQLException {

	        // 1. Attempt to load the driver class
	        Class.forName(driverClassName);

	        // 2. Create and pool connections
	        for (int i = 0; i < initialPoolSize; i++) {
	            openAndPoolConnection();
	        }
	    }
	  
	  private synchronized void openAndPoolConnection() throws SQLException {
	        if (currentPoolSize == maxPoolSize) {
	            return;
	        }

	        Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
	        pool.offer(conn);
	        currentPoolSize++;

	        logger.log(Level.FINE, "Created connection {0}, currentPoolSize={1}, maxPoolSize={2}",
	                   new Object[]{conn, currentPoolSize, maxPoolSize});
	    }
	  
	  public Connection borrowConnection() throws InterruptedException, SQLException {

	        if (pool.peek()==null && currentPoolSize < maxPoolSize) {
	            openAndPoolConnection();
	        }
	        // Borrowing thread will be blocked till connection
	        // becomes available in the queue
	        return pool.take();
	    }

	    public void surrenderConnection(Connection conn) {
	        if (!(conn instanceof Connection)) {
	            return;
	        }
	        pool.offer(conn); // offer() as we do not want to go beyond capacity
	    }
}
