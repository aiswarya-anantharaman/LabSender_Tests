package com.ls.java.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ls.java.base.TestBase;

public class ExtentSetup extends TestBase{

	public static ExtentReports setupExtentReport()
	{
		//create a new file in the path specified after each test execution
		String reportPath = System.getProperty("user.dir") 
				+ "/test-output/Report_spark.html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		sparkReport.config().setDocumentTitle("Test Execution - LabSender");
		sparkReport.config().setTheme(Theme.STANDARD);
		sparkReport.config().setReportName("AUTOMATED TEST EXECUTION - LABSENDER");
		return extent;
	}

}
