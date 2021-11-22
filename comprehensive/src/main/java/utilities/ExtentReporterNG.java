package utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
		static ExtentReports extent;
	
		public static ExtentReports extentReportGenerator() {
			String path=System.getProperty("user.dir")+"\\reports\\"+"report"+System.currentTimeMillis()+".html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("BigSmall Automation Results");
			reporter.config().setDocumentTitle("Test Results");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			return extent;
		}
	}