package listenersPack;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import reusableClass.Base;
import utilities.ExtentReporterNG;


public class Listeners extends Base implements ITestListener {

	ExtentReports extent = ExtentReporterNG.extentReportGenerator();

	String Path = null;

	@Override
	public void onTestStart(ITestResult result) {
		   try {
			driver=initialize();
			driver.manage().window().maximize();
			driver.get(url);
			
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test = extent.createTest(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();

	}


	public void onTestFailure(ITestResult result) {

		try {
			Path = Base.getScreenshot(result.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		test.fail(result.getClass().getName() + " test failed",MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
		driver.close();
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName());

		try {
			Path = Base.getScreenshot(result.getName());
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		test.info(driver.getTitle());

		test.pass(driver.getClass().getCanonicalName() + " test successful",MediaEntityBuilder.createScreenCaptureFromPath(Path).build());
		driver.close();
	}

}
