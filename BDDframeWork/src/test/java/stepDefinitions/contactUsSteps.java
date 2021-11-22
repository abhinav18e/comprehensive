package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.contactUs;
import reusableClass.Base;


public class contactUsSteps extends Base{
	contactUs c=new contactUs(driver);
	@Given("user on home page")
	public void user_on_home_page() {
		Log.info("landed on home page");
		test.info("landed on home page");
	}
    
	@When("click on contactUs")
	public void click_on_contact_us() {
		c.contactUsclk().click();
		Log.info("clicked on contactUs");
		test.info("clicked on contactUs");
	}
	
	@When("user fills the contactUs form with name {string} email {string} msg {string}")
	public void user_fills_the_contact_us_form_with_name_email_msg(String string, String string2, String string3) {
		c.nameBox().sendKeys(string);
		c.emailBox().sendKeys(string2);
		c.msgBox().sendKeys(string3);
		Log.info("sending details");
		test.info("sending details");
	}

	@When("submit the contact form")
	public void submit_the_contact_form() {
		c.sendBtn().click();
		Log.info("details send successfully");
		test.info("sending send successfully");
	}

	@Then("success message should be displayed")
	public void success_message_should_be_displayed() {
        
		//Log.info(c.successMsg().getText());
		//test.info(c.successMsg().getText());
		Log.info("details send successfully");
		test.info("sending send successfully");
        Log.info("browser closed");
        test.info("browser closed");
	}
}








