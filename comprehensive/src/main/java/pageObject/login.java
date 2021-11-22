package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	public WebDriver driver;
	By sign =By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]");
	By emailBoxpath=By.id("CustomerEmail");
	By passBoxpath=By.id("CustomerPassword");
	By submit=By.xpath("//*[@id=\"customer_login\"]/p[1]/input");

	public login(WebDriver driver){
		this.driver=driver;
	}

	public WebElement signpage() {
		return driver.findElement(sign);
	}
	
	public WebElement emailBox() {
		return driver.findElement(emailBoxpath);
	}
	public WebElement passwordBox() {
		return driver.findElement(passBoxpath);
	}
	public WebElement submitClk() {
		return driver.findElement(submit);
	}

}
