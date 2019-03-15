package com.smarts.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.smarts.qa.page.LoginPage;

public abstract class TestNgAnnotations {
	protected static WebDriver driver = null;
	//protected static LoginPage login;
	
	@BeforeClass
	public static void beforeClass() {
		PropertyManager.LoadProperties("C:\\myproject\\jyoReal\\src\\resources\\config.properties");
		

	}

	@BeforeMethod
	public static WebDriver setUp() {
		String browsername = PropertyManager.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\myproject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.geico.driver", "C:\\myproject\\drivers\\geicodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("driver not found");

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(PropertyManager.getProperty("url"));
		//login = new LoginPage(driver);

		return driver;

	}

@AfterMethod
public void tearDown() {
	try {
	if(driver!=null){
		driver.close();
		
	}}
	catch(Exception e){
		e.printStackTrace();
	}
	finally {
		
		if(driver!=null){
			driver.quit();
	}
	
}
	

}}
