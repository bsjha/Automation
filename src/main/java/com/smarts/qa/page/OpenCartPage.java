package com.smarts.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class OpenCartPage {
	protected WebDriver driver ;
	
public OpenCartPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


}
