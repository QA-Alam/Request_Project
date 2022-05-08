package com.usa.crossbrowser;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import zoopla.uk.basepage.Base_Page;

public class ParallelTest extends Base_Page {

	@Test
	public void SafariBrowserTest() {
		logger.info("******** Test Execute on Safari Browser  *********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com");
		driver.quit();
	}

	@Test
	public void ChromeBrowserTest() {
		logger.info("******** Test Execute on Chrome Browser  *********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com");
		driver.quit();
	}
	
	@Test
	public void EdgeBrowserTest() {
		logger.info("******** Test Execute on Edge Browser  *********");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com");
		driver.quit();
	}
}