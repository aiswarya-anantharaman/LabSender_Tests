package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;

public class AdminDashboardPage extends TestBase{
	
	WebElement element;
	private static final Logger logger = LogManager.getLogger(AdminDashboardPage.class);

	public AdminDashboardPage()
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement labViewCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/dashboard\"]"));
					
		} catch (Exception e) {
			logger.error("Error : Unable to locate lab view card.");
		}
		return element;	
	}
	
	public String adminDashboardPageUrl() throws Exception
	{
		String pageUrl = "labsender.com/admin/dashboard";
		return pageUrl;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(), \"Admin Dashboard\")]"));
					
		} catch (Exception e) {
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
}
