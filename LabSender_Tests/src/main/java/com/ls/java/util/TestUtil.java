package com.ls.java.util;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ls.java.base.TestBase;

public class TestUtil extends TestBase{

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	//urls
	public final String orderSettingsPageUrl = "labsender.com/lab/order_settings";
	public final String manageProvidersPageUrl = "labsender.com/lab/providers";
	public final String manageLocationsPageUrl = "labsender.com/lab/locations";
	public final String manageClientsPageUrl = "labsender.com/lab/clients";
	public final String providerEditPageUrl = "labsender.com/lab/provider";
	public final String editingClientPageUrl = "labsender.com/lab/clients";
	public final String manageTestsPageUrl = "labsender.com/lab/tests";
	public final String editingLocationPageUrl = "labsender.com/lab/locations";
	public final String editTestPageUrl = "labsender.com/lab/test/";
	public final String specimenSourceMgmtUrl = "labsender.com/lab/specimensource/index";
	
	Random random = new Random();  
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void clickAfterExplicitWait(long timeout, String xpath) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))); 
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		Thread.sleep(2000);
	}
	
	public void selectByVisibleTextFromDropdown(String text, WebElement element) throws Exception
	{
		Select dropdown = new Select(element);		
		dropdown.selectByVisibleText(text);
	}
	
	public String randomNPI()
	{
		String srandom_no = String.valueOf(generateRandomNumber());
		String npi = srandom_no+srandom_no+srandom_no+srandom_no+srandom_no;
		return npi;
	}
	
	public String randomID()
	{
		String srandom_no = String.valueOf(generateRandomNumber());
		String id = srandom_no+srandom_no;
		return id;
	}
	
	public int generateRandomNumber()
	{
		int min = 10;
		int max = 99;
		int random_no = (int) (Math.random()*(max-min+1)+min);
		return random_no;
	}
}
