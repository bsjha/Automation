package com.smarts.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.smarts.qa.page.LoginPage;
import com.smarts.qa.util.DataBaseUtils;
import com.smarts.qa.util.TestNgAnnotations;

public class LoginTest1 extends TestNgAnnotations {

	@Test
	public void loginTesting() throws Exception {

		LoginPage login = new LoginPage(driver);

		login.LogintoOpenCart();
		// database validation

		String query = "SELECT  [empno]\r\n" + "    \r\n"
				+ "  FROM [sampledatabase].[dbo].[empinfo] where emplast='bo'";
		String empno = DataBaseUtils.runSqlReturnSingleColumnValue(query, sampleconnection, "empno");
		Assert.assertEquals(3, empno);

	}

}
