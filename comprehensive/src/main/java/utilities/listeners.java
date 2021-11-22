package utilities;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

import reusable.base;

public class listeners extends base implements ITestListener {
	ExtentReports extent= ExtentReporterNG.extentReportGenerator();
	String abc=null;
	public void onTestStart(ITestResult result) {
		test= extent.createTest(result.getName());	
		try {
			 driver=initialize();
			 driver.manage().window().maximize();
			 driver.get(url);
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

	public void onTestFailure(ITestResult result)
	{
		try {
			abc=base.getScreenshot("Screenshot captured");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		test.fail(" test failed ",MediaEntityBuilder.createScreenCaptureFromPath(abc).build());
		driver.close();
	}
	public void onTestSuccess(ITestResult result)
	{
		try {
			abc=base.getScreenshot("Screenshot captured");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		test.pass(" test successful",MediaEntityBuilder.createScreenCaptureFromPath(abc).build());
		driver.close();
	
	}
}