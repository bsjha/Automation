package com.smarts.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.page.RegesteringPage;

public class Registrationtest extends TestBase{
	//WebElement Elements;
	//protected static WebDriver driver=null;  
	RegesteringPage registration;
	
public Registrationtest() {
	super();
}
@BeforeMethod
public void setup() {
	Initiliazition();
	registration=new RegesteringPage();
	registration.registrationlink();
}
@Test(priority=1)
public void validatetitle() {
	String title=registration.validatetitle();
	Assert.assertEquals(title, "Register Account");
}
@Test
public void  titletest() {
	registration= new RegesteringPage();	
	registration.FillupPersonaldetails("jyo", "kamitname", "bjdeviil", "7896543");
	
}
@AfterTest
public void aftertest() {
	driver.quit();
}
}
