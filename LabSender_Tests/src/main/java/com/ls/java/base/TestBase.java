package com.ls.java.base;

import java.time.Duration;

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
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
		driver.get(url);
	}
	
	//close browser
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
}
