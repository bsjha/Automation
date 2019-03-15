package com.smarts.qa.testcases;

import org.testng.annotations.Test;

import com.smarts.qa.page.LoginPage;
import com.smarts.qa.util.TestNgAnnotations;

public class LoginTest1 extends TestNgAnnotations {
	String d="jahjkfhkahf";
			

	@Test
	public void loginTesting() {
		
		LoginPage login = new LoginPage(driver);
		

		login.LogintoOpenCart();

	}
	@Test
	public void loginTesting3() {
		
		LoginPage login = new LoginPage(driver);
		

		login.LogintoOpenCart();

	}

}
