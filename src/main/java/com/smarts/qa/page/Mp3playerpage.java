package com.smarts.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;

public class Mp3playerpage extends TestBase {
	@FindBy(xpath = "//div[@class='name']//a[contains(text(),'iPod Classic')]")
	private WebElement ipad1;

	public Mp3playerpage() {
		PageFactory.initElements(driver, this);
	}

	public Ipadclassicpage selectingipadclassic() {
		ipad1.click();
		try {
			Thread.sleep(4000);
		} catch (Exception e) {

		}
		return new Ipadclassicpage();
	}

}
