package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkPincode {
	WebDriver driver;
	By whatsnewPath=By.xpath("//*[@id=\"shopify-section-1598476309369\"]/div/a/div/button");
	By productClkPath=By.className("grid-product__title");
	By pincodeBox =By.id("PostalCode");
	By checkClk=By.xpath("//*[@id=\"cod-cheker\"]/button");
    By	availabilityPath=By.id("PostalCodeCheckerAvailability");
	public checkPincode(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clkNewProd() {
		return driver.findElement(whatsnewPath);
	}
	public WebElement prodDetails() {
		return driver.findElement(productClkPath);
	}
	public WebElement pinBox() {
		return driver.findElement(pincodeBox);
	}
	public WebElement checkButton() {
		return driver.findElement(checkClk);
	}
	public WebElement getAvailability() {
		return driver.findElement(availabilityPath);
	}
}
