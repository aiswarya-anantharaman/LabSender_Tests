package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;

public class LoginPage extends TestBase{
	
	WebElement element;
	private static final Logger logger = LogManager.getLogger(LoginPage.class);

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement emailAddressField() throws Exception
	{
		try {
			element = driver.findElement(By.id("email"));					
		} catch (Exception e) {
			
			logger.error("Error : Unable to locate email address field.");		}
		return element;	
	}
	
	public WebElement passwordField() throws Exception
	{
		try {
			element = driver.findElement(By.id("password"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate password field.");
		}
		return element;	
	}
	
	public WebElement loginBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate login button.");
		}
		return element;	
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean emailAddressStatus = null;
		Boolean passwordStatus = null;
		Boolean loginBtnStatus = null;
		if(emailAddressField().isDisplayed() && emailAddressField().isEnabled())
		{
			emailAddressStatus = true;
		}
		else
		{
			emailAddressStatus = false;
			logger.error("Error : email address field not displayed or not enabled.");
		}
		if(passwordField().isDisplayed() && passwordField().isEnabled())
		{
			passwordStatus = true;
		}
		else
		{
			passwordStatus = false;
			logger.error("Error : password field not displayed or not enabled.");
		}
		if(loginBtn().isDisplayed() && loginBtn().isEnabled())
		{
			loginBtnStatus = true;
		}
		else
		{
			loginBtnStatus = false;
			logger.error("Error : login button not displayed or not enabled.");
		}
		if(emailAddressStatus.equals(true) && passwordStatus.equals(true) && loginBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public void userLogin(String username, String password) throws Exception
	{
		logger.info("User Login");
		emailAddressField().clear();
		emailAddressField().sendKeys(username);
		passwordField().clear();
		passwordField().sendKeys(password);
		loginBtn().click();
	}
	
	public Boolean verifyValidUserLogin(String username, String password) throws Exception
	{
		Boolean status = null;
		userLogin(username, password);
		String currentPageUrl = driver.getCurrentUrl();
		if(currentPageUrl.contains("labsender.com/admin/dashboard"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page URL: " + currentPageUrl);
      		logger.error("Error : unable to login.");
		}
		return status;
	}
}
