package stepDefinitions;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.login;
import reusableClass.Base;


public class loginSteps extends Base{
	login l=new login(driver);
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		Log.info("landed on home page");
		test.info("landed on home page");
		l.signpage().click();
		Log.info("loading signIn page");
		test.info("loading signIn page");
	}

	@When("^user login using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_using_username_something_and_password_something(String uname, String pass) throws Throwable {
		l.emailBox().sendKeys(uname);
		Log.info("sending username");  
		test.info("sending username");
		
		l.passwordBox().sendKeys(pass);
		Log.info("sending password");  
		test.info("sending password");
		
		l.submitClk().click();	
		Log.info("credentials submitted");  
		test.info("credentials submitted"); 
	}

	@Then("^user should successfully login$")
	public void user_should_successfully_login() throws Throwable {

	}
	@Then("home page should appear")
	public void home_page_should_appear() {
		Log.info("test passed and browser closed");
		test.info("test passed and browser closed");
	}




}
