package com.smarts.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.smarts.qa.util.PropertyManager;

public class LoginPage extends OpenCartPage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "email")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(name = "password")
	private WebElement passWord;

	public WebElement getPassWord() {
		return passWord;
	}

	@FindBy(xpath = "//a[contains(text(),'login')]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "//a[contains(text(),'login')]")
	private WebElement loginHyperlink;

	public WebElement getLoginHyperlink() {
		return loginHyperlink;
	}
/**
 * 
 * method start from here
 */
	public void LogintoOpenCart() {
		this.getLoginHyperlink().click();
		this.getUserName().sendKeys(PropertyManager.getProperty("username"));
		this.getPassWord().sendKeys(PropertyManager.getProperty("password"));
		this.loginButton.click();
		System.out.println(this.driver.getTitle());
		
		Assert.assertEquals(this.driver.getTitle(), "Account Login");
		
		
	}
	
}
