package com.stock.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.stock.utils.DBUtils;
import com.stock.utils.MyConnectionPool;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		Connection con = DBUtils.getConnection();
		System.out.println(con);
		MyConnectionPool pool = DBUtils.geetConnectionPool();
		System.out.println(pool.borrowConnection());

	}

}
