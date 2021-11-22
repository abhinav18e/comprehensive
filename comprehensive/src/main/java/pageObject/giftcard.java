package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class giftcard {
	WebDriver driver;
	By giftcardclk=By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]");
	By addGiftcardTocart=By.xpath("//*[@id=\"AddToCartForm-738195636312\"]/button");
	
	public giftcard(WebDriver driver){
		this.driver=driver;
	}

	public WebElement giftcardClick() {
		return driver.findElement(giftcardclk);
	}

	public WebElement addtoCartclk() {
		return driver.findElement(addGiftcardTocart);
	}

}
