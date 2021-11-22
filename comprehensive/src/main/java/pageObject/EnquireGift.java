package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnquireGift {
	WebDriver driver;
	By typeOfGift=By.xpath("//*[@id=\"shopify-section-1598476780220\"]/div/div/div[1]/a/div/div/div/button");
	By namePath=By.id("contactFormName");
	By emailpath=By.id("contactFormEmail");
	By contact=By.id("contactFormPhone");
	By enquiryboxPath=By.id("contactFormMessage");
	By submitbtln=By.xpath("//*[@id=\"contactFormWrapper\"]/div/input[4]");
	
	public EnquireGift(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement GiftTypeClk() {
		return driver.findElement(typeOfGift);
	}
	
	public WebElement namebox() {
		return driver.findElement(namePath);
	}
	public WebElement Emailbox() {
		return driver.findElement(emailpath);
	}
	public WebElement contactBox() {
		return driver.findElement(contact);
	}
	
	public WebElement enquiryBox() {
		return driver.findElement(enquiryboxPath);
	}
	
	public WebElement submitBtn() {
		return driver.findElement(submitbtln);
	}
}
