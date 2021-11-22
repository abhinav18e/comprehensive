package stepDefinitions;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.createAccount;
import reusableClass.Base;

public class signupSteps extends Base{
	createAccount ca=new createAccount(driver);
	@Given("User is on create account page")
	public void user_is_on_create_account_page() {
		
		Log.info("landed on home page");
		test.info("landed on home page"); 
		ca.clkSigninBtn().click();
		ca.clkCreateAcc().click();
		Log.info("On sign up page");
		test.info("On sign up page"); 
	}

	@When("user provides {string} {string} {string} {string}")
	public void user_provides(String string, String string2, String string3, String string4) {

		ca.firstNameBox().sendKeys(string);
		ca.lastNameBox().sendKeys(string2);
		ca.emailBox().sendKeys(string3);
		ca.passwordBox().sendKeys(string4);
		Log.info("filling details");
		test.info("filling details"); 
		
		ca.submitBtn().click();
		Log.info("Clicked on submit button");
		test.info("Clicked on submit button");
	}

	@Then("account should be created")
	public void account_should_be_created() {
		Log.info("sign up successful");
		test.info("sign up successful");
	}

}

