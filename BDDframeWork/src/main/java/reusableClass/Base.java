package reusableClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentTest;

public class Base {

	public static ExtentTest test;
	public static WebDriver driver;
	public static String url;
	public static String pathString;

	public static Logger Log=LogManager.getLogger(Base.class.getName());
	Properties prop =new Properties();

	public WebDriver initialize() throws IOException {

		FileInputStream file=new FileInputStream("./resources/siteData.properties");
		prop.load(file);
		String browserName= prop.getProperty("browser");

		url=prop.getProperty("url");

		pathString=prop.getProperty("excelFile");

		ChromeOptions options=new ChromeOptions();

		options.addArguments("disable-infobars");

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeSetup"));
			driver=new ChromeDriver(options); 
		}
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
	}

	public static String getScreenshot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+result+".png";
		FileUtils.copyFile(src,new File(path));

		return path;
	}

}