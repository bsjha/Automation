package com.smarts.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.smarts.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	  public static  Properties prop;
	 public TestBase() {
		 
		 prop=new Properties();
		 try {
			FileInputStream ip= new FileInputStream("C:\\myproject\\jyoReal\\src\\main\\java\\com\\smarts\\qa\\confi\\confi.properties");
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
	
	 public  static WebDriver Initiliazition() {
		String browsername= prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\myproject\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		} else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.geico.driver", "C:\\myproject\\drivers\\geicodriver.exe");
			 driver = new FirefoxDriver();
		}else {
			System.out.println("driver not found");
			
			
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
	 }
	 

}
