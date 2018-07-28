package com.globant.Topic4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{

	String USER = "root";
	String PASS = "admin";
	String DB_URL = "jdbc:mysql://localhost/high-school?serverTimezone=UTC";
	private Connection connect = null;

	private static DBConnection getConnection = null;

	private DBConnection(){
	}

	public static DBConnection getInstance(){
		if (getConnection == null)
			getConnection = new DBConnection();
		return getConnection;
	}

	/**
	 * This method connects to a specified database.
	 * 
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect = DriverManager.getConnection(DB_URL, USER, PASS);
		return connect;
	}

}
