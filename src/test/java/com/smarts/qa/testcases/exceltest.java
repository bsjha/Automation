package com.smarts.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.page.HomePage;
import com.smarts.qa.page.RegesteringPage;
import com.smarts.qa.util.Reader;

public class exceltest  extends TestBase{
	HomePage homepage;
	RegesteringPage registration;
public exceltest() {
	super();
}
@BeforeMethod
public void setup() {
	Initiliazition();
	//homepage = new HomePage();
	registration=new RegesteringPage();
	registration.registrationlink();
}
@DataProvider
public Object[][] getdata() {
	Object data[] [] = Reader.getdata("Sheet1");
	return data;
}
@Test(dataProvider="Sheet1")
public void fillup(String firstname,String lastname,String email,String phone) {
	registration= new RegesteringPage();	
	registration.FillupPersonaldetails(firstname,lastname,email,phone);


}
}
