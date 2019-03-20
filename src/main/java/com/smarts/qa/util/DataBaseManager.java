package com.smarts.qa.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseManager {
	public static void setUpDatabaseConnection() {

	}

	public static Connection getDbConnectionsfor(String databaseName) {
		Connection Connection=null;
		try {
	
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver()");
			System.out.println("Driver registered");
			String url = PropertyManager.getHost() + "instance=SQLEXPRESS;"+"databaseName=" + databaseName + ";";
			Connection=DriverManager.getConnection(url);
			System.out.println("Connection established");
 
		} catch (Exception e) {

			e.printStackTrace();
		}
		return Connection;

	}
	//public static void getDatafor(String tableName) {
		
		
	}
