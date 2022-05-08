package zoopla.uk.hookstest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import zoopla.uk.basepage.Base_Page;
import zoopla.uk.genericlivery.Utility;

public class Hooks extends Base_Page {
	public Scenario scenario;
	
	@Before
	public void suiteSetup(Scenario scenario)  {
		this.scenario = scenario; 
		Base_Page.initialization();
		logger.info("");
		logger.info("...........START AUTOMATION.............");
		logger.info("");
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			Utility.getScreenshot(driver, scenario);
		}		
		driver.quit();
		logger.info("");
		logger.info("...........END AUTOMATION.............");
		logger.info("");
	}

}



