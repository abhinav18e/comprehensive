package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.EnquireGift;
import reusableClass.Base;


public class submitGiftEnquirySteps extends Base{
	   EnquireGift e=new EnquireGift(driver);
	@Given("user is on equiry page")
	public void user_is_on_equiry_page() {
		
		Log.info("landed on home page");
		test.info("landed on home page");
		
		e.GiftTypeClk().click();
		Log.info("landed on gift enquiry page");
		test.info("landed on gift enquiry page");
	}

	@When("user fills the enquiry form with {string} {string} {string} {string}")
	public void user_fills_the_enquiry_form_with(String string, String string2, String string3, String string4) {
		e.namebox().sendKeys(string);
		e.Emailbox().sendKeys(string2);
		e.contactBox().sendKeys(string3);
		e.enquiryBox().sendKeys(string4);
		Log.info("details filled");
		test.info("details filled");
	}

	@When("submit the form")
	public void submit_the_form() {
		e.submitBtn().click();
		Log.info("gift enquiry request submitted");
		test.info("gift enquiry request submitted");
	}

	@Then("the details should be successfully submited")
	public void the_details_should_be_successfully_submited() {
		Log.info("test successful and browser closed");
		test.info("test successful and browser closed");
	}

}
