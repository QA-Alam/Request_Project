package zoopla.uk.hookstest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import zoopla.uk.basepage.Base_Page;

public class Hooks extends Base_Page {

	@Before
	public void getSetUp() {
		logger.info("<<<<<<<<<< Started Automation >>>>>>>>>");
		Base_Page.initialization();
	}

	@After
	public void getTearDown() {
		logger.info("<<<<<<<<<< Ended Automation >>>>>>>>>");
		driver.quit();
	}

}
