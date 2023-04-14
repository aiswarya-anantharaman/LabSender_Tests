package com.ls.test.testlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.ls.java.base.TestBase;
import com.ls.java.util.ExtentSetup;


public class Listeners extends TestBase implements ITestListener{

	String projectPath = System.getProperty("user.dir");
	String screenshotsFolder = projectPath + "/test-output/Screenshots/";
	
	public Listeners() {

	}
	
	public void onStart(ITestContext context) {
		System.out.println("Started test execution : " + context.getName());
		//setup Extent Report
		extent = ExtentSetup.setupExtentReport();
	}
	
	public void onTestStart(ITestResult result) {
		extentTest = extent.createTest(result.getMethod().getMethodName());
		extentTest.info(result.getMethod().getDescription());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed : " + result.getName());
		extentTest.log(testStatus(result), "Test passed : " + result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed : " + result.getName());
		extentTest.log(testStatus(result), "Test failed : " + result.getMethod().getMethodName());
		extentTest.log(testStatus(result),result.getThrowable().getMessage());
		screenshot(result.getName());
		extentTest.addScreenCaptureFromPath(screenshotsFolder + "testName" + ".png");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped : " + result.getName());	
		extentTest.log(testStatus(result), "Test skipped : " + result.getMethod().getMethodName());
		extentTest.log(testStatus(result), result.getSkipCausedBy().toString());
		extentTest.log(testStatus(result), result.getThrowable().getMessage());
		screenshot(result.getName());
		extentTest.addScreenCaptureFromPath(screenshotsFolder + "testName" + ".png");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Completed test execution : " + context.getName());
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
