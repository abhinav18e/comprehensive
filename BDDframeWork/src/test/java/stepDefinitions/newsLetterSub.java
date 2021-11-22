package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.newsLetter;
import reusableClass.Base;

public class newsLetterSub extends Base{
	newsLetter n=new newsLetter(driver);
	@Given("User is on home page1")
	public void user_is_on_home_page1() {
		Log.info("landed on home page");
		test.info("landed on home page");
	}

	@When("user sends email id {string} in the newsLetter section")
	public void user_sends_email_id_in_the_news_letter_section(String string) {

		n.emailBox().sendKeys(string);
		Log.info("sending email id in the newsLetter section");
		test.info("sending email id in the newsLetter section");
	}

	@When("clicks on submit")
	public void clicks_on_submit() {
		n.clickBtn().click();
		Log.info("email id submitted");
		test.info("email id submitted");
	}

	@Then("user is redirected to news page")
	public void user_is_redirected_to_news_page() {
		if(driver.getPageSource().contains("Welcome To NewsLetter")) {
			Log.info("news page successfully opened");
			test.info("news page successfully opened");
		} 
		else{
			Log.error("unable to find newsletter page");
			test.fail("unable to find newsletter page");
		} 

		Log.info("browser closed");
		test.info("browser closed");
	}
}
