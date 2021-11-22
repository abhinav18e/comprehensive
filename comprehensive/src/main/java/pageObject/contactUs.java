package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactUs {
	WebDriver driver;
	By contactUsPath=By.xpath("//*[@id=\"shopify-section-footer\"]/footer[1]/div[1]/div[1]/div[3]/ul/li[1]/a");
	By namepath=By.id("ContactFormName-page-contact-template-0");
	By Emailpath=By.id("ContactFormEmail-page-contact-template-0");
	By msgPath=By.id("ContactFormMessage-page-contact-template-0");
	By sendClk=By.xpath("//*[@id=\"contact_form\"]/button");
	
	public contactUs(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement contactUsclk() {
		return driver.findElement(contactUsPath);
	}
	public WebElement nameBox() {
		return driver.findElement(namepath);
	}
	public WebElement emailBox() {
		return driver.findElement(Emailpath);
	}
	public WebElement msgBox() {
		return driver.findElement(msgPath);
	}
	public WebElement sendBtn() {
		return driver.findElement(sendClk);
	}
}

