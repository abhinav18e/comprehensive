package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.addToWishlist;
import reusableClass.Base;


public class addTowishlistSteps extends Base{

addToWishlist w=new addToWishlist(driver);
		
@Given("user is on product detail page")

public void user_is_on_product_detail_page() {
		
	Actions action = new Actions(driver);
	
	WebElement ele=w.hoverelement();
	action.moveToElement(ele).perform();
	w.clickProduct().click();
	Log.info("Display products list ");
	test.info("Display products list ");
	
	w.ClickBottle().click();
	Log.info("On one product details page");
	test.info("On one product details page");
	
}

@When("user clicks on add to wishlist button")

public void user_clicks_on_add_to_wishlist_button() throws InterruptedException {
	
	Thread.sleep(4000);
	w.addToWishlistclk().click();
	Log.info("product added to wishlist");
	test.info("product added to wishlist");
}

@Then("product added to wishlist")

public void product_added_to_wishlist() {
	if(driver.getPageSource().contains("remove")) {
		Log.info("product added to wishlist");
		test.info("product added to wishlist");
	} 
	else{
		Log.error("unable to add product");
		test.fail("unable to add product");
	} 

	Log.info(" browser closed");
	test.info("browser closed");
}
}



