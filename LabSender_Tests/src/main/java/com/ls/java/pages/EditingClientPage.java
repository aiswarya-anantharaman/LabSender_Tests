package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class EditingClientPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	private static final Logger logger = LogManager.getLogger(EditingClientPage.class);

	public EditingClientPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String editingClientPageTitle() throws Exception
	{
		String pageTitle = "Editing Client";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Editing Client')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	public WebElement updateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(), \"Update\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Update btn not found on Editing Client pane.");
		}
		return element;	
	}
	
	//Upload Provider Signature pane elements
	public WebElement clickHereToUploadSignatureBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(@href, \"signature\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Click Here To Upload Signature btn not found on Upload Provider Signature pane.");
		}
		return element;	
	}
	
	//Manage Tests For This Client pane elements
	public WebElement testsActivated() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Tests Activated\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Tests Activated For Client not found on Manage Tests For This Client pane.");
		}
		return element;	
	}
	
	public WebElement testsAvailable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Tests Available\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Tests Activated For Client not found on Manage Tests For This Client pane.");
		}
		return element;	
	}
	
	public WebElement addTestBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(), \"Test\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add Test button not found on Manage Tests For This Client pane.");
		}
		return element;	
	}
	
}
