package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class EditTestPage extends TestBase{

	WebElement element;
	TestUtil util = new TestUtil();
	private static final Logger logger = LogManager.getLogger(EditTestPage.class);

	public EditTestPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Edit Test')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	public WebElement testNameEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='test_name']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Test name edit box not found in Edit Test page.");
		}
		return element;	
	}

	public WebElement testCodeEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='test_code']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Test code edit box not found in Edit Test page.");
		}
		return element;	
	}
	
	public WebElement dxCodeEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='dx_codes']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : DX codes edit box not found in Edit Test page.");
		}
		return element;	
	}
	
	public WebElement allowManualResultsCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='allow_manual_results']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Allow Manual Results checkbox not found in Edit Test page.");
		}
		return element;	
	}
	
	public WebElement defaultPriceField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='default_price']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Default Price field not found in Edit Test page.");
		}
		return element;	
	}
	
	public WebElement submitBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Submit button not found in Edit Test page.");
		}
		return element;	
	}
	
	public WebElement missingDefaultPriceErrorMsg() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//li[contains(text(), 'The default price field is required.')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : missing default price error message not found in Edit Test page.");
		}
		return element;	
	}
	
}
