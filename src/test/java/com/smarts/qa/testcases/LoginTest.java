package com.smarts.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.page.LoginPage;
import com.smarts.qa.page.MyAccountpage;
import com.smarts.qa.util.TestUtil;

public class LoginTest extends TestBase {
	LoginPage loginpage;
	MyAccountpage myaccountpage;
	public LoginTest() {
		super();
	}
	

	@BeforeMethod
	public void setup() throws InterruptedException {
		Initiliazition();
		loginpage = new LoginPage();
		loginpage.Loginclick();
	}

	@Test(priority = 1)
	public void validatetitle() {	
	Assert.assertEquals(loginpage.validateTitle(), "Account Login");
	}
	@Test(priority = 2)
	public void logintesrcase() throws InterruptedException {
		loginpage.setUserName("bsrtest@yahoo.com");
		loginpage.setPassWord("Tikku9");
		//loginpage = new LoginPage();
		loginpage.performlogin();
		Thread.sleep(2000);
		Assert.assertEquals(loginpage.validateTitle(), "Account Login");
	}
	
	@Test(priority = 3)
	public void invalidLogin() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		loginpage.setUserName("tfuhgi");
		loginpage.setPassWord("Tikku9");
		//loginpage = new LoginPage();
		loginpage.performlogin();
		System.out.println("title================"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "My Account");
	}


	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
