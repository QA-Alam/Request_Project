package selenium.chalenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	// @Test
	public void getGoogleSearch() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		WebElement elem = driver.findElement(By.name("q"));
		elem.sendKeys("Java");

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().contains("java online compiler")) {

				list.get(i).click();
			}
		}
	}

	@Test
	public void getIAmFelingLucy() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='gbqfbb']"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().contains("I'm Feeling Lucky")) {

				list.get(i).click();
			}
		}

	}

}