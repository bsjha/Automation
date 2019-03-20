package com.smarts.qa.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseUtils {

	/**
	 * 
	 * Decription:Method to excute sql and return results for a specific column
	 * 
	 * @author Srini
	 * @param query      select query
	 * @param connection database connection
	 * @param columnname columnname
	 */
	public static String runSqlReturnSingleColumnValue(String query, Connection connection, String columnName)
			throws Exception {

		ResultSet rs = null;
		String result = null;
		try {
			if (connection != null) {
				Statement stmt = connection.createStatement();
				rs = stmt.executeQuery(query);
			}

			while (rs.next()) {
				result = rs.getString(columnName);

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("error executing runsqlandreturnsinglecolumnvalue" + e);
		}
		return result;

	}

}
