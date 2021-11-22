package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToWishlist {
	WebDriver driver;
	By hoverEle=By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[11]/a");
	By productBottles=By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[11]/ul/li[11]/a");
	By bottleEle=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div/div[1]/div/a/div[2]/div[1]");
	By wishlistEle=By.xpath("//*[@id=\"ProductSection-3962206519384\"]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/button");
	public addToWishlist(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement hoverelement() {
		return driver.findElement(hoverEle);
	}
	public WebElement clickProduct() {
		return driver.findElement(productBottles);
	}
	public WebElement ClickBottle() {
		return driver.findElement(bottleEle);
	}
	public WebElement addToWishlistclk() {
		return driver.findElement(wishlistEle);
	}
}
