package com.smarts.qa.testcases;

import org.testng.annotations.Test;

import com.smarts.qa.page.LoginPage;
import com.smarts.qa.util.TestNgAnnotations;

public class LoginTest1 extends TestNgAnnotations {
	

	@Test
	public void loginTesting() {
		LoginPage login = new LoginPage(driver);

		login.LogintoOpenCart();

	}

}
