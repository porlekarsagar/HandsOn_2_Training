	package Listeners;
	
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import com.aventstack.extentreports.Status;
	import Base_class.TestBase;
	import Utilities.DriverUtils;

public class MyListeners  extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
	
		test = report.createTest(result.getName());
	}
	// ITestResult Interface
	// This Interface describes the result of a test.
	
	
	public void onTestSuccess(ITestResult result) {
	
		test.log (Status.PASS, "testcase passed with name as:- "+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
	
		test.log (Status.FAIL, "testcase failed with name as:- "+ result.getName());
		String path = DriverUtils.getScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "testcase skipped with name as " + result.getName());
		
	}

	public void onStart(ITestContext context) {
		reportInit();
		// method defined by us in base class to initialize report
	}
	public void onFinish(ITestContext context) {
		report.flush();
		// flush() method
		// Writes test information from the started reporters to their output view 
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}



}
