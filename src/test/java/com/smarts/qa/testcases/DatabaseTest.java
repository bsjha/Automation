package com.smarts.qa.testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	   static final String databaseName="";  
	   static final String DB_URL = "jdbc:sqlserver://"+"serverandport"+"databaseName=" + databaseName + ";integratedSecurity=true";

	   //  Database credentials
//	   static final String USER = "username";
//	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "\r\n" + 
	      		"select TOP 1 *from  student";
	      ResultSet rs = stmt.executeQuery(sql);

	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("id");
	        // int claim_num = rs.getInt("claim_num");
	        
	         //Display values
	         System.out.print("id: " + id);
	        // System.out.print("claim_num: " + claim_num);

	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(Exception se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }

	   }}
