package com.stock.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private  static Connection con = null;
	public static MyConnectionPool pool;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/myapp";
		 con = DriverManager.getConnection(url, "root", "tiger");
		return con;
		
	}
	public static MyConnectionPool geetConnectionPool()throws ClassNotFoundException, SQLException{
	 pool = new MyConnectionPool(20, 5, "jdbc:mysql://localhost:3306/myapp", "root", "tiger", "com.mysql.jdbc.Driver");
	 return pool;
	}
	
	
	

}
