package com.smarts.qa.testcases;

import java.awt.Button;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.smarts.qa.base.TestBase;
import com.smarts.qa.page.CheckOutpage;
import com.smarts.qa.page.HomePage;
import com.smarts.qa.page.Ipadclassicpage;
import com.smarts.qa.page.LoginPage;
import com.smarts.qa.page.Monitorspage;
import com.smarts.qa.page.Mp3playerpage;
import com.smarts.qa.page.Shopingcartpage;
import com.smarts.qa.util.TestUtil;

public class End_To_Endtest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	Monitorspage monitors;
	Mp3playerpage players;
	Ipadclassicpage classicpage;
	Shopingcartpage shopcart;
	CheckOutpage checkout;
	Button object;

	public End_To_Endtest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		Initiliazition();
		homepage = new HomePage();
	}

	/*
	 * @Test(priority=1) public void validatetitle() { String
	 * title=homepage.ValidatingPage(); Assert.assertEquals(title, "Your Store"); }
	 */
	@Test(priority = 1)
	public void testcomponents() {
		monitors = homepage.mouseovering();
		players = monitors.selectingplayers();
		classicpage = players.selectingipadclassic();
		shopcart = classicpage.clickIpadclassic("1");
		checkout = shopcart.checkout();
		checkout.clickradiobtn();
		checkout.ClickOncontinue();
		// checkout.login(prop.getProperty("email"));

	}
	/*
	 * @Test(priority=3) public void testmonitors() { //monitors=new Monitorspage();
	 * monitors=homepage.mouseovering(); players=monitors.selectingplayers();
	 * classicpage=players.selectingipadclassic();
	 * shopcart=classicpage.clickIpadclassic("1"); checkout=shopcart.checkout(); }
	 * 
	 * @Test(priority=4) public void testselectpad() {
	 * monitors=homepage.mouseovering(); players=monitors.selectingplayers();
	 * classicpage=players.selectingipadclassic();
	 * 
	 * }
	 * 
	 * @Test(priority=5) public void testaddcart() {
	 * monitors=homepage.mouseovering(); players=monitors.selectingplayers();
	 * classicpage=players.selectingipadclassic();
	 * shopcart=classicpage.clickIpadclassic("1");
	 * 
	 * }
	 * 
	 * @Test(priority=6) public void testcheckout() {
	 * monitors=homepage.mouseovering(); players=monitors.selectingplayers();
	 * classicpage=players.selectingipadclassic();
	 * shopcart=classicpage.clickIpadclassic("1");
	 * 
	 * checkout=shopcart.checkout();
	 * 
	 * }
	 * 
	 * @AfterTest public void teardown() { driver.quit(); }
	 */
}
