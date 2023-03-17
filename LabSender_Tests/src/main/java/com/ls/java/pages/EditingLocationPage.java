package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class EditingLocationPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	private static final Logger logger = LogManager.getLogger(EditingLocationPage.class);

	public EditingLocationPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String editingLocationPageTitle() throws Exception
	{
		String pageTitle = "Editing Location";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Editing Location')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	//Editing Location pane elements
	public WebElement locationNameEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name=\"location_name\"]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Location name edit box not found on Editing Location pane.");
		}
		return element;	
	}
	
	public WebElement updateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(), \"Update\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Update btn not found on Editing Location pane.");
		}
		return element;	
	}
	
	//Add Client to Location pane elements
	public WebElement clientDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"client_id\"]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : client dropdown not found on Add Client to Location pane.");
		}
		return element;	
	}
	
	public WebElement submitBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(), \"SUBMIT\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : submit btn not found on Add Client to Location pane.");
		}
		return element;	
	}

}
