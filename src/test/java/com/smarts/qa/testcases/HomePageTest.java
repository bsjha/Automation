package com.smarts.qa.testcases;

import org.testng.annotations.Test;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.page.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomePageTest  extends TestBase{
 HomePage homepage;
	public  HomePageTest () {
		super();
	}
  @BeforeMethod
  public void setup() {
	  Initiliazition();
	  homepage=new HomePage();
	  
  }

  @Test
  public void Validatetitletest() {
	 String title= homepage.ValidatingPage();
	 Assert.assertEquals(title, "Your Store");
	// homepage.mouseovering();
  }
 /* @Test(priority=2)
  public void mousrtest() {
	  homepage.mouseover();
  }*/
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
	  
  }

}
