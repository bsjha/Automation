package com.smarts.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;

public class RegesteringPage extends TestBase {
	@FindBy(name="firstname")
	private WebElement txtFirstname;
	@FindBy(name="lastname")
	private WebElement txtLastname;
	@FindBy(name="email")
	private WebElement txtEmail;
	@FindBy(name="telephone")
	private WebElement txtphone;
	@FindBy(name = "fax")
	private WebElement txtFax;
	@FindBy(name = "company")
	private WebElement txtCompany;
	@FindBy(xpath = "//*[@id=\"company-id-display\"]/td[2]/input")
	private WebElement txtCompanyId;
	@FindBy(name = "address_1")
	private WebElement txtAddress;
	@FindBy(name = "address_2")
	private WebElement txtAddress2;
	@FindBy(name = "city")
	private WebElement txtCity;
	@FindBy(name = "postcode")
	private WebElement txtPostcode;
	@FindBy(name="country_id")
	private WebElement Country;
	@FindBy(name="zone_id")
	private WebElement State;
	@FindBy(name="password")
	private WebElement txtPassword;
	@FindBy(name="confirm")
	private WebElement txtConpassword;
	@FindBy(xpath="//*[@id=\"welcome\"]/a[2]")
	private WebElement linaccount;
	public RegesteringPage() {
		//this.driver=webdriver;
		PageFactory.initElements(driver, this);
			}
public void registrationlink() {
	linaccount.click();
}
	public String validatetitle() {
		return driver.getTitle();
	}
	public void FillupPersonaldetails(String firstname,String lastname,String email,String phone) {
		txtFirstname.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		txtEmail.sendKeys(email);
		txtphone.sendKeys(phone);
	}
}
