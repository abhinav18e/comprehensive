package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
	WebDriver driver;
	By searchboxclick=By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	By prodPath=By.className("snize-title");
	public search(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement seachbox() {
		return driver.findElement(searchboxclick);
	}
	public WebElement prodDetails() {
		return driver.findElement(prodPath);
	}
}
