package com.usa.crossbrowser;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import zoopla.uk.basepage.Base_Page;
import zoopla.uk.genericlivery.ReadExcel;

public class PassTheDataFromExcelToWebsite extends Base_Page {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");

		ArrayList<String> userName = ReadExcel.readExcelData(0);
		ArrayList<String> passWord = ReadExcel.readExcelData(1);
		for (int i = 0; i < userName.size(); i++) {

			driver.findElement(By.xpath("//*[@id='main-header']/div/div/div/div[1]/div[2]/ul/li[4]/a")).click();

			driver.findElement(By.xpath("//*[@id='input-email-address']")).sendKeys(userName.get(i));
			driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(passWord.get(i));

			driver.findElement(By.xpath("//*[@data-testid='signin-button']")).click();

		}
	}
}
