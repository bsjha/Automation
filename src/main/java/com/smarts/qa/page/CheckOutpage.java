package com.smarts.qa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.util.TestUtil;

public class CheckOutpage extends TestBase {
	//LoginPage loginpage;
	@FindBy(name="email")
	private WebElement Email;
	@FindBy(xpath="//*[@id=\"checkout\"]/div[2]/div[1]/label[2]/b")
	private WebElement radbregister;
	@FindBy(xpath="//*[@id=\"button-account\"]")
	private WebElement Continue;
	public CheckOutpage() {
		PageFactory.initElements(driver, this);
	}
	public void clickradiobtn() {
		radbregister.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	public void ClickOncontinue() {
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Continue.click();
	}
public void login(String email) {
	//loginpage.performlogin(prop.getProperty("email"), prop.getProperty("password"));
	Email.sendKeys(email);
}
}
