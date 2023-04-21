package com.ls.test.testlisteners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.ls.java.base.TestBase;
import com.ls.java.pages.PreCheck;
import com.ls.java.util.ExtentSetup;


public class Listeners extends TestBase implements ITestListener{

	String projectPath = System.getProperty("user.dir");
	String screenshotsFolder = projectPath + "\\test-output\\Screenshots\\";

	PreCheck preCheck = new PreCheck();

	private static final Logger logger = LogManager.getLogger(Listeners.class);

	public Listeners() {

	}
	
	public void onStart(ITestContext context) {
		logger.info("Started test execution : " + context.getName());
		//setup Extent Report
		extent = ExtentSetup.setupExtentReport();
	}
	
	public void onTestStart(ITestResult result) {
		extentTest = extent.createTest(result.getMethod().getMethodName());
		extentTest.info(result.getMethod().getDescription());
	}
	
	public void onTestSuccess(ITestResult result) {
		logger.info("Test passed : " + result.getName());
		extentTest.log(testStatus(result), "Test passed : " + result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult result) {
		logger.info("Test failed : " + result.getName());
		extentTest.log(testStatus(result), "Test failed : " + result.getMethod().getMethodName());
		extentTest.log(testStatus(result),result.getThrowable().getMessage());
		String testName = result.getMethod().getMethodName();
		screenshot(testName);
		extentTest.addScreenCaptureFromPath(screenshotsFolder + testName + ".png");
	}
	
	public void onTestSkipped(ITestResult result) {
		logger.info("Test skipped : " + result.getName());	
		extentTest.log(testStatus(result), "Test skipped : " + result.getMethod().getMethodName());
		extentTest.log(testStatus(result), result.getSkipCausedBy().toString());
		extentTest.log(testStatus(result), result.getThrowable().getMessage());
		String testName = result.getMethod().getMethodName();
		screenshot(testName);
		extentTest.addScreenCaptureFromPath(screenshotsFolder + testName + ".png");
	}
	
	public void onFinish(ITestContext context) {
		logger.info("Completed test execution : " + context.getName());
		//close Extent Report
		extent.flush();
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
 
	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
	
	public Status testStatus(ITestResult result)
	{
		Status status = null;
		if(result.getStatus() == 1)
		{
			status = Status.PASS;
		}
		else if(result.getStatus() == 2)
		{
			status = Status.FAIL;					
		}
		else if(result.getStatus() == 3)
		{
			status = Status.SKIP;					
		}
		else
		{
			status = Status.WARNING;
		}		
		return status;
	}
	
}
