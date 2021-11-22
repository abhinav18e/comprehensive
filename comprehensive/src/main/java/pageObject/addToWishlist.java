package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToWishlist {
	WebDriver driver;
	By hoverPath=By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[11]/a");
	By productBottles=By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[11]/ul/li[11]/a");
	By bottlePath=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div/div[1]/div/a/div[2]/div[1]");
	By wishlistBtnPath=By.xpath("//*[@id=\"ProductSection-3962206519384\"]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/button");
	public addToWishlist(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement hoverelement() {
		return driver.findElement(hoverPath);
	}
	public WebElement clickProduct() {
		return driver.findElement(productBottles);
	}
	public WebElement ClickBottle() {
		return driver.findElement(bottlePath);
	}
	public WebElement addToWishlistclk() {
		return driver.findElement(wishlistBtnPath);
	}
}
