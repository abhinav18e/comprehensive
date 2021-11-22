package stepDefinitions;
import java.io.IOException;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.search;
import reusableClass.Base;

public class searchSteps extends Base {
	search s=new search(driver);
	@Given("User is on default home page")
	public void user_is_on_default_home_page() {
		
		Log.info("landed on home page");
		test.info("landed on home page");
	}

	@When("user search product {string} in searchbox")
	public void user_search_product_in_searchbox(String product) {
		
		s.seachbox().sendKeys(product);
		Log.info("searching product");
		test.info("searching product");
		
		s.seachbox().sendKeys(Keys.ENTER);
		Log.info("products list page");
		test.info("products list page");
	}

	@Then("the products list should appear")
	public void the_products_list_should_appear() {
		Log.info("test passes and browser closed successfully");
		test.info("test passed and browser closed successfully");
	}
}


