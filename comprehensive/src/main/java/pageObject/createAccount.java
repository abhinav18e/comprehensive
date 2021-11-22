package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createAccount {
	WebDriver driver;
	By SignInBtn=By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]");
	By CreateActBtn=By.id("customer_register_link");
    By firstNamePath=By.id("FirstName");
    By LastNamePath=By.id("LastName");
    By emailBoxPath=By.id("Email");
    By passBoxPath=By.id("CreatePassword");
    By ClickCreatePath=By.xpath("//*[@id=\"create_customer\"]/p/input");
	public createAccount(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement clkSigninBtn() {
		return driver.findElement(SignInBtn);
	}
	public WebElement clkCreateAcc() {
		return driver.findElement(CreateActBtn);

	}
	public WebElement firstNameBox() {
		return driver.findElement(firstNamePath);
	}
	
    public WebElement lastNameBox() {
    	return driver.findElement(LastNamePath);
    }
    public WebElement emailBox() {
    	return driver.findElement(emailBoxPath);
    }
    public WebElement passwordBox() {
    	return driver.findElement(passBoxPath);
    }
    public WebElement submitBtn() {
    	return driver.findElement(ClickCreatePath);
    }

}
