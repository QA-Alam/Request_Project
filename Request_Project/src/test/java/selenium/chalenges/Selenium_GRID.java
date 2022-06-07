package selenium.chalenges;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Selenium_GRID {

	public static void main(String[] args) throws ParseException, MalformedURLException {
		//WebDriver driver;
		//String exePath = "/Driver/chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		     //nodeURL = "http://192.168.43.223:5566/wd/hub";
	         DesiredCapabilities capability = new DesiredCapabilities();
	         capability.setBrowserName("chrome");
	         capability.setPlatform(Platform.WIN10);
	         
	         WebDriver  driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), capability);
	         
	         
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		driver.get("http://demo.guru99.com/test/table.html");
		// To locate table.
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		// To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		// Loop will execute till the last row of table.
		for (int row = 0; row < rows_count; row++) {
			// To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			// To calculate no of columns (cells). In that specific row.
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are " + columns_count);
			// Loop will execute till the last cell of that specific row.
			for (int column = 0; column < columns_count; column++) {
				// To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				System.out
						.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			}
			System.out.println("-------------------------------------------------- ");
		}
	}
}
