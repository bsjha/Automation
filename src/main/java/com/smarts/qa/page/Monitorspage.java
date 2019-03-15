package com.smarts.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;

public class Monitorspage extends TestBase {
	HomePage homepage;
	Monitorspage monitors;
	
	@FindBy(xpath="//a[contains(text(),'Cameras (2)')]/parent::*/following-sibling::li[1]/a")
	private WebElement Mp3players;
	public Monitorspage() {
		PageFactory.initElements(driver, this);
	}
public Mp3playerpage selectingplayers() {
	//monitors=homepage.mouseovering();	
	Mp3players.click();
	try {
		Thread.sleep(4000);
	} catch (Exception e) {

	}
	return new Mp3playerpage();
}
}
