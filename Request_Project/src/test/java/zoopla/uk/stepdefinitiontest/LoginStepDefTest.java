package zoopla.uk.stepdefinitiontest;

import org.openqa.selenium.Keys;
import cucumber.api.java.en.*;
import zoopla.uk.basepage.Base_Page;
import zoopla.uk.elementspage.ZooplaUK_LogingPage;
import zoopla.uk.genericlivery.Utility;
import zoopla.uk.genericlivery.WaitHelper;

public class LoginStepDefTest extends Base_Page {
	ZooplaUK_LogingPage pf;

	@Given("^Users is able to verify login information successfully$")
	public void users_is_able_to_verify_login_information_successfully() {
		pf = new ZooplaUK_LogingPage();
		pf.getLoginApplication();
		Utility.getAssertions(prop.getProperty("actualText"), driver.getTitle());
	}

	@When("^Users can hover over the page on the For Sale module and click on the UK Property For Sale$")
	public void users_can_hover_over_the_page_on_the_For_Sale_module_and_click_on_the_UK_Property_For_Sale() {

		WaitHelper.waitForElement(pf.getHoverOverForSale(), 30);
		logger.info("<<<<<<<<<< User able to mouse hover on for sale button >>>>>>>>>");
		Utility.getHighLightes(pf.getHoverOverForSale());
		Utility.getHoverOver(pf.getHoverOverForSale());
		WaitHelper.waitForElement(pf.getclickUkPropertiesForSale(), 30);
		logger.info("<<<<<<<<<< User able to click on uk properties for sale button  >>>>>>>>>");
		Utility.getHighLightes(pf.getclickUkPropertiesForSale());
		Utility.getActionClick(pf.getclickUkPropertiesForSale());
	}

	@When("^Users is able to enter location- \"([^\"]*)\"- in the text box & hit enter button$")
	public void users_is_able_to_enter_location_in_the_text_box_hit_enter_button(String location) {

		WaitHelper.waitForElement(pf.getSearchProperties(), 30);
		Utility.getHighLightes(pf.getSearchProperties());
		logger.info("<<<<<<<<<< User able to enter the location  >>>>>>>>>");
		pf.getSearchProperties().sendKeys(prop.getProperty("location"));

		pf.getSearchProperties().sendKeys(Keys.ENTER);
		Utility.captureScreenshot(driver, "EnterTheLocation");
	}

	@When("^Users is able to print all value/price of the properties in the console$")
	public void users_is_able_to_print_all_value_price_of_the_properties_in_the_console() {

	}

	@When("^click on the third property from the properties list$")
	public void click_on_the_third_property_from_the_properties_list() {

	}

	@When("^Users is able to print out the selected property details$")
	public void users_is_able_to_print_out_the_selected_property_details() {

	}

	@Then("^Users can Verify the price of the selected property$")
	public void users_can_Verify_the_price_of_the_selected_property() {

	}

	@Then("^User is able to logout the application$")
	public void user_is_able_to_logout_the_application() {

	}
}
