package com.smarts.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
	protected static Properties prop = new Properties();

	private PropertyManager() {

	}

	public static void LoadProperties(String propfilename) {
		 try {
				FileInputStream ip= new FileInputStream(propfilename);
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}	 

	public static String getProperty(String propertyName) {
		String propertyValue = null;
		return propertyValue = prop.getProperty(propertyName);
	}

	public static String getHost() {
		// TODO Auto-generated method stub
		String propertyValue = null;
		
		return propertyValue=prop.getProperty("Host");
	}
}
