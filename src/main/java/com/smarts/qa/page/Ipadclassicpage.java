package com.smarts.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;

public class Ipadclassicpage  extends TestBase{
	@FindBy(name="quantity")
	private WebElement Quantaty;
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	private WebElement Addtocart;
	//@FindBy(xpath="//*[@id=\"header\"]/div[5]/a[4]")
	@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	private WebElement Shoppingcart;
	public Ipadclassicpage() {
		PageFactory.initElements(driver, this);
	}

	public Shopingcartpage clickIpadclassic(String quantati) {
		Quantaty.clear();
		Quantaty.sendKeys(quantati);
		Addtocart.click();
		Shoppingcart.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		return new Shopingcartpage();
	}
	
}
