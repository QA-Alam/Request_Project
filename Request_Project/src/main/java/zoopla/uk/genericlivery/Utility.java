package zoopla.uk.genericlivery;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import zoopla.uk.basepage.Base_Page;

public class Utility extends Base_Page {
	public static Actions action = new Actions(driver);

	public static void getAssertions(String actual, String ele) {
		Assert.assertEquals(actual, ele);
	}

	public static void getActionClick(WebElement elem) {
		action.click(elem).build().perform();
	}

	public static void getHoverOver(WebElement elem) {
		action.moveToElement(elem).perform();
	}
	
	public static void getHighLightes(WebElement ele) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", ele);   
	}

}
