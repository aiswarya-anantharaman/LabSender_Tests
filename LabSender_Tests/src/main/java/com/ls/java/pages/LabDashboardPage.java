package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;

public class LabDashboardPage extends TestBase{
	
	WebElement element;
	private static final Logger logger = LogManager.getLogger(LabDashboardPage.class);

	public LabDashboardPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String labDashboardPageUrl() throws Exception
	{
		String pageUrl = "labsender.com/lab/dashboard";
		return pageUrl;
	}
	
	public WebElement ordersBtnSideNav() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id='wrapper']/ul/li[5]/a"));					
		} catch (Exception e) {
			logger.error("Error : Unable to locate Orders button in side nav.");
		}
		return element;	
	}
	
	public WebElement orderSettingsSideNav() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href='/lab/order_settings']"));					
		} catch (Exception e) {
			logger.error("Error : Unable to locate Order Settings under order button in side nav.");
		}
		return element;	
	}
	
	public WebElement newOrderSideNav() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href='/lab/order']"));					
		} catch (Exception e) {
			logger.error("Error : Unable to locate New Order under order button in side nav.");
		}
		return element;	
	}
	
	public WebElement viewOrdersSideNav() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href='/lab/orders']"));					
		} catch (Exception e) {
			logger.error("Error : Unable to locate View Orders under order button in side nav.");
		}
		return element;	
	}
	
	public WebElement managePatientsBtnSideNav() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href='/lab/patients']"));					
		} catch (Exception e) {
			logger.error("Error : Unable to locate Manage Patients in side nav.");
		}
		return element;	
	}
	
	public WebElement preRegPagesBtnSideNav() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href='/lab/pages']"));					
		} catch (Exception e) {
			logger.error("Error : Unable to locate Manage Patients in side nav.");
		}
		return element;	
	}
}
