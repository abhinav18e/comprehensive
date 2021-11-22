package stepDefinitions;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.checkPincode;
import reusableClass.Base;

public class pincodeCheckSteps extends Base {
	checkPincode c=new checkPincode(driver);
	@Given("User is on any product details page")
	public void user_is_on_any_product_details_page() {
		
		Log.info("landed on home page");
		test.info("landed on home page"); 
		
		c.clkNewProd().click();
		Log.info("On products list page");
		test.info("On products list page"); 
		
		c.prodDetails().click();
		Log.info("One product details");
		test.info("On product details");
	}

	@When("user enter pincode {string} and check")
	public void user_enter_pincode_and_check(String pincode) {
		c.pinBox().sendKeys(pincode);
		Log.info("sending pincode");
		test.info("sending pincode"); 
		
		c.checkButton().click();
		Log.info("pincode submitted");
		test.info("pincode submitted"); 
	}

	@Then("product availability details should appear")
	public void product_availability_details_should_appear() throws InterruptedException {
		Thread.sleep(2000);
		//verify this "Cash on Delivery is available."
		Log.info(c.getAvailability().getText());
		test.info(c.getAvailability().getText()); 

		Log.info("test successful and browser closed");
		test.info("test successful and browser closed");
		
	}
	
}
