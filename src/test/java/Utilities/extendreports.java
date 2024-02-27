package Utilities;
 
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
 
public class extendreports implements ITestListener{
	public ExtentSparkReporter sparkReporter;  
	public ExtentReports extent;//info on the report
	public ExtentTest test;//add test case entries in the report

	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter("C:\\Users\\2304027\\eclipse-workspace\\Finding_Hospitals_Hackathon\\reports\\myreport.html"); //UI of the report
		sparkReporter.config().setDocumentTitle("Hackathon Project"); 
		sparkReporter.config().setReportName("Finding Hospitals");
		sparkReporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);	
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("BROWSER","Chrome,Edge");
	}
 
 
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); 
		test.log(Status.PASS, "Test case PASSED is:" + result.getName());
	}
 
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
	}
 
	public void onTestSkipped(ITestResult result) {
 
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case SKIPPED is:" + result.getName());
	}
 
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}