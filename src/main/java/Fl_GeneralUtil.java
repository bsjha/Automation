import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Fl_GeneralUtil {
	public WebDriver driver;
	public void settext(By  element,String strobjname,String strvalue) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(strvalue);
	}
	
	}


