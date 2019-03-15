
package com.smarts.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;

public class Shopingcartpage extends TestBase {
//@FindBy(xpath="//*[@id=\"content\"]/div[5]/div[1]/a")
	@FindBy(xpath="//a[@class='button'][contains(text(),'Checkout')]")
	private WebElement Checkout;

public Shopingcartpage() {
	PageFactory.initElements(driver, this);
}
public  CheckOutpage checkout() {

	Checkout.click();
	try {
		Thread.sleep(4000);
	} catch (Exception e) {

	}
	return new CheckOutpage();
}

}
