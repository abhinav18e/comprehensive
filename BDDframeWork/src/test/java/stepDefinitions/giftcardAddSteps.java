package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.giftcard;
import reusableClass.Base;

public class giftcardAddSteps extends Base {
	giftcard g=new giftcard(driver);
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		Log.info("landed on home page");
		test.info("landed on home page");
	}

	@When("user clicks on giftcards")
	public void user_clicks_on_giftcards() {
		g.giftcardClick().click();
		Log.info("giftcard details page");
		test.info("giftcard details page");
	}

	@When("clicks on add to cart")
	public void clicks_on_add_to_cart() {
		g.addtoCartclk().click();
		Log.info("clicked on ADD TO CART button");
		test.info("clicked on ADD TO CART button");
	}

	@Then("giftcard should successfully added to cart")
	public void giftcard_should_successfully_added_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		if(driver.getPageSource().contains("Subtotal")) {
			Log.info("product added to cart");
			test.info("product added to cart");
		} 
		else{
			Log.error("failed to add");
			test.fail("failed to add");
		} 
		Log.info("test completed and browser closed");
	}
	
	
	
	
}
