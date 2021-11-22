package reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentTest;

public class base {

	public static ExtentTest test;
	public static WebDriver driver;
	public static String url;
    public static String pathString;
    public static String prodName;
    public static String emailId;
    public static String pinCode;
	Properties prop =new Properties();

	public WebDriver initialize() throws IOException {

		FileInputStream file=new FileInputStream("./src/resources/siteData.properties");
		prop.load(file);
		
		url=prop.getProperty("url");
		String browserName= prop.getProperty("browser");
		
		String driverpath=prop.getProperty("chromeSetup");
		
		pathString=prop.getProperty("excelFile");
		
		prodName=prop.getProperty("product");
		
		emailId=prop.getProperty("email");
		
		pinCode=prop.getProperty("pincode");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverpath);
			driver=new ChromeDriver(options); 
		}
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
		public static String getScreenshot(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+result+".png";
		FileUtils.copyFile(src,new File(path));
		return path;
	}

}
