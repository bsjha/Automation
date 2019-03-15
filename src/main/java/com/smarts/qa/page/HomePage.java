package com.smarts.qa.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.util.TestUtil;

public class HomePage extends TestBase {

	// @FindBy(xpath="//*[@id=\"menu\"]/ul/li[3]/a")
	@FindBy(xpath = "//a[contains(text(),'Components')]")
	private WebElement Components;
	@FindBy(xpath = "//a[contains(text(),'Monitors (2)')]")
	private WebElement Moniters;
	@FindBy(xpath = "//a[contains(text(),'Components')]/parent::*/preceding-sibling::li[2]/a")
	private WebElement desktops;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String ValidatingPage() {
		return driver.getTitle();
	}

	public Monitorspage mouseovering() {
		Actions action = new Actions(driver);
		action.moveToElement(Components).build().perform();
		action.moveToElement(Moniters).click().build().perform();
		return new Monitorspage();
		// driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,
		// TimeUnit.SECONDS);
	}

	public void mouseover() {
		Actions action = new Actions(driver);
		action.moveToElement(desktops).build().perform();

	}

}
