package package2;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.EnquireGift;
import pageObject.addToWishlist;
import pageObject.checkPincode;
import pageObject.contactUs;
import pageObject.createAccount;
import pageObject.giftcard;
import pageObject.login;
import pageObject.newsLetter;
import pageObject.search;
import reusable.base;
import utilities.XLUtils;

public class AppTestTest extends base{
	private static Logger Log=LogManager.getLogger(AppTestTest.class.getName());

	@Test
	public void addToWishlistTest() throws IOException, InterruptedException {
		Log.info("landed on home page");
		test.info("landed on home page");

		Actions action = new Actions(driver);
		addToWishlist w=new addToWishlist(driver);
		WebElement ele=w.hoverelement();
		action.moveToElement(ele).perform();
		w.clickProduct().click();
		Log.info("Display products list ");
		test.info("Display products list ");

		w.ClickBottle().click();
		Log.info("On one product details page");
		test.info("On one product details page");
		Thread.sleep(4000);

		w.addToWishlistclk().click();
		Log.info("adding to wishlist");
		test.info("adding to wishlist");

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

	@Test(dataProvider = "loginData")
	public void loginTest(String uname,String pass) throws IOException {
		login l=new login(driver);
		Log.info("landed on home page");
		test.info("landed on home page");

		l.signpage().click();
		Log.info("loading signIn page");
		test.info("loading signIn page");

		l.emailBox().sendKeys(uname);
		Log.info("sending username");  
		test.info("sending username");

		l.passwordBox().sendKeys(pass);
		Log.info("sending password");  
		test.info("sending password");

		l.submitClk().click();	
		Log.info("credentials submitted");  
		test.info("credentials submitted"); 

		Log.info("test passed and browser closed");
		test.info("test passed and browser closed");

	}

	@Test
	public void searchTest() throws IOException {
		search s=new search(driver);
		Log.info("landed on home page");
		test.info("landed on home page");

		s.seachbox().sendKeys(prodName);
		Log.info("searching product");
		test.info("searching product");

		s.seachbox().sendKeys(Keys.ENTER);
		Log.info("products list page");
		test.info("products list page");

		s.prodDetails().click();
		Log.info("product searched successfully");
		test.info("product searched successfully");

		if(driver.getPageSource().contains("PUBG Pan Metallic Keychain")) {
			Log.info("product verified ");
			test.info("product verified ");
		} 
		else{
			Log.error("wrong product displayed");
			test.fail("wrong product displayed");
		} 

		Log.info("test passes and browser closed successfully");
		test.info("test passed and browser closed successfully");
	}

	@Test
	public void giftCardTest() throws IOException, InterruptedException {
		giftcard g=new giftcard(driver);
		Log.info("landed on home page");
		test.info("landed on home page");

		g.giftcardClick().click();
		Log.info("giftcard details page");
		test.info("giftcard details page");

		g.addtoCartclk().click();
		Log.info("clicked on ADD TO CART button");
		test.info("clicked on ADD TO CART button");
		Thread.sleep(3000);
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

	@Test
	public void giftEnquiry() throws IOException {
		EnquireGift e=new EnquireGift(driver);
		Log.info("landed on home page");
		test.info("landed on home page");

		e.GiftTypeClk().click();
		Log.info("landed on gift enquiry page");
		test.info("landed on gift enquiry page");

		e.namebox().sendKeys("abhinav");
		e.Emailbox().sendKeys("abhi@gmail.com");
		e.contactBox().sendKeys("868786677");
		e.enquiryBox().sendKeys("300 gifts budget 250rs");
		Log.info("details filled");
		test.info("details filled");

		e.submitBtn().click();
		Log.info("gift enquiry request submitted");
		test.info("gift enquiry request submitted");

		Log.info("test successful and browser closed");
		test.info("test successful and browser closed");
	}

	@Test
	public void pincodeCheckAndValidate() throws InterruptedException {
		checkPincode c=new checkPincode(driver);
		Log.info("landed on home page");
		test.info("landed on home page"); 


		c.clkNewProd().click();
		Log.info("On products list page");
		test.info("On products list page"); 

		c.prodDetails().click();
		Log.info("One product details");
		test.info("On product details"); 

		c.pinBox().sendKeys(pinCode);
		Log.info("sending pincode");
		test.info("sending pincode"); 

		c.checkButton().click();
		Log.info("pincode submitted");
		test.info("pincode submitted"); 

		Thread.sleep(2000);
		//verify this "Cash on Delivery is available."
		Log.info(c.getAvailability().getText());
		test.info(c.getAvailability().getText()); 

		Log.info("test successful and browser closed");
		test.info("test successful and browser closed");

	}

	@Test
	public void SignUp() {
		createAccount ca=new createAccount(driver);
		Log.info("landed on home page");
		test.info("landed on home page"); 

		ca.clkSigninBtn().click();
		ca.clkCreateAcc().click();
		Log.info("On sign up page");
		test.info("On sign up page"); 

		ca.firstNameBox().sendKeys("abhinav");
		ca.lastNameBox().sendKeys("nagpure");
		ca.emailBox().sendKeys("abhi@gmail.com");
		ca.passwordBox().sendKeys("abhinav");
		Log.info("filling details");
		test.info("filling details"); 

		ca.submitBtn().click();
		Log.info("Clicked on submit button");
		test.info("Clicked on submit button");

		Log.info("sign up successful");
		test.info("sign up successful");
	}
	@Test
	public void newLetterSubscribe() {
		newsLetter n=new newsLetter(driver);
		Log.info("landed on home page");
		test.info("landed on home page"); 

		n.emailBox().sendKeys(emailId);
		Log.info("sending email id in the newsLetter section");
		test.info("sending email id in the newsLetter section");

		n.clickBtn().click();
		Log.info("email id submitted");
		test.info("email id submitted");

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
	
	@Test
	public void validateTitle() {
		
		Log.info("landed on home page");
		test.info("landed on home page");
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
	
	@Test
	public void contactUspage() {
		
		contactUs c=new contactUs(driver);
		Log.info("landed on home page");
		test.info("landed on home page");
		
		c.contactUsclk().click();
		Log.info("clicked on contactUs");
		test.info("clicked on contactUs");
		
		c.nameBox().sendKeys("name");
		c.emailBox().sendKeys(emailId);
		c.msgBox().sendKeys("hello, can you call me");
		Log.info("sending details");
		test.info("sending details");
		
		c.sendBtn().click();
		Log.info("details send successfully");
		test.info("sending send successfully");
		
		Log.info("browser closed");
		test.info("browser closed");
	}
	
	@DataProvider(name="loginData")
	String[][] getData() throws IOException{

		int rowCount=XLUtils.getRowCount(pathString,"Sheet1");
		int cellCount=XLUtils.getCellCount(pathString,"Sheet1", rowCount);

		String logindata[][]=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(pathString,"Sheet1", i, j);
			}
		}
		return logindata;
	}
	
}
