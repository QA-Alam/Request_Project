package zoopla.uk.elementspage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.basepage.Base_Page;
import zoopla.uk.genericlivery.Utility;

public class ZooplaUK_LogingPage extends Base_Page{

	// initialize the page factory by using constructor 
	public ZooplaUK_LogingPage() {
		PageFactory.initElements(driver, this);
		  // this -> is a java keyword whenever we declare this keyword it means refer the current class properties 
	}
	
	// Selenium PageFactory concepts or design pattern

		@FindBy(xpath = "(//a[@data-testid='header-profile-sign-in'])[1]") // I have to store the web-element by using// find-by annotation
		@CacheLookup // CacheLookup annotation help to execute the test more faster way
						// Because of CacheLookup find-out the computer cash memory
		private WebElement clickOnSignBTN;

		public WebElement getClickOnSignBTN() {
			return clickOnSignBTN;
		}

		@FindBy(id = "input-email-address") // I have to store the web-element by using find-by annotation
		@CacheLookup // CacheLookup annotation help to execute the test more faster way
						// Because of CacheLookup find-out the computer cash memory
		private WebElement enterUserName;

		public WebElement getenterUserName() {
			return enterUserName;
		}

		@FindBy(id = "input-password") // I have to store the web-element by using find-by annotation
		@CacheLookup // CacheLookup annotation help to execute the test more faster way
						// Because of CacheLookup find-out the computer cash memory
		private WebElement enterPassWord;

		public WebElement getEnterPassWord() {
			return enterPassWord;
		}

		@FindBy(xpath = "//button[text()='Sign in']") // I have to store the web-element by using find-by annotation
		@CacheLookup // CacheLookup annotation help to execute the test more faster way
						// Because of CacheLookup find-out the computer cash memory
		private WebElement signIn;

		public WebElement getSignIn() {
			return signIn;
		}

		@FindBy(xpath = "(//*[text()='For sale'])[1]") 
		@CacheLookup 
		private WebElement hoverOverForSale;
		public WebElement getHoverOverForSale() {
			return hoverOverForSale;
		}

		@FindBy(xpath = "//*[text()='UK property for sale']") 
		@CacheLookup 
		private WebElement clickUkPropertiesForSale;
		public WebElement getclickUkPropertiesForSale() {
			return clickUkPropertiesForSale;
		}
		
		
		@FindBy(id = "search-input-location") 
		@CacheLookup 
		private WebElement searchProperties;
		public WebElement getSearchProperties() {
			return searchProperties;
		}
	
	public void getLoginApplication() {
		logger.info("<<<<<<<<<< User click on sign button  >>>>>>>>>");
		Utility.getHighLightes(clickOnSignBTN);
		clickOnSignBTN.click();
		
		Utility.getHighLightes(enterUserName);
		logger.info("<<<<<<<<<< User enter the user name  >>>>>>>>>");
		enterUserName.sendKeys(prop.getProperty("userName"));
		
		Utility.getHighLightes(enterPassWord);
		logger.info("<<<<<<<<<< User enter the password >>>>>>>>>");
		enterPassWord.sendKeys(prop.getProperty("textPassword"));
		
		Utility.getHighLightes(signIn);
		logger.info("<<<<<<<<<< User able to click sing in button >>>>>>>>>");
		signIn.click();
	}
}
