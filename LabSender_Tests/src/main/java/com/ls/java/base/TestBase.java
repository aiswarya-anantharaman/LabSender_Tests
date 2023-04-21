package com.ls.java.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ls.java.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	public TestBase()
	{
		
	}
	
	//open browser and navigate to url
	public static void initialization(String url)
	{
		String projectPath = System.getProperty("user.dir");
		String downloadFilepath = projectPath + "downloads";
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/Drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-popup-blocking");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("autofill.profile_enabled", false);
		prefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.get(url);
	}
	
	public void screenshot(String testName)
	{
		String projectPath = System.getProperty("user.dir");
		String screenshotsFolder = projectPath + "/test-output/Screenshots/";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(scrFile, new File(screenshotsFolder + testName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//close browser
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
}
