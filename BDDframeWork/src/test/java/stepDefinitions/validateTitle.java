package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import reusableClass.Base;

public class validateTitle extends Base{
	@Given("user is on home page2")
	public void user_is_on_home_page2() {
		Log.info("landed on home page");
		test.info("landed on home page");
	}

	@Then("verify page title contains'Gifts Online'")
	public void verify_page_title_contains_gifts_online() {
		if(driver.getTitle().contains("Gifts Online")) {
			Log.info("page title successfully validated");
			test.info("page title successfully validated");

		} 
		else{
			Log.error("wrong title");
			test.fail("wrong title");
			
		} 
		Log.info("browser closed");
		test.info("browser closed");	
	}

}


