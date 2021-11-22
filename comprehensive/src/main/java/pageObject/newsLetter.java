package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newsLetter {
	public WebDriver driver;
    By EmailPath=By.id("Email");
    By submit=By.id("subscribe");
	public newsLetter(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement emailBox() {
		return driver.findElement(EmailPath);
	}
	
	public WebElement clickBtn() {
		return driver.findElement(submit);
	}
}
