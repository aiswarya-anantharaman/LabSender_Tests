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
	public final String orderSummaryPageUrl = "labsender.com/lab/order_summary/";
	public final String newOrderPageUrl = "labsender.com/lab/order";
	public final String viewOrdersPageUrl = "labsender.com/lab/orders";
	
	//constants
	public final String providerFirstName = "Automated";
	public final String providerLastName = "AutoProvider";
	public final String providerNPI = "9999999999";
	public final String providerId = "99";
	public final String clientName = "Automated Client";
	public final String clientId = "Auto";
	public final String locationName = "Automated Location";
	public final String testName = "Automated Test";
	public final String testId = "Auto";
	public final String dxCode = "Auto";
	public final String patientLastname = "Automated";
	public final String patientFirstname = "AutoPatient";
	public final String patientDOB = "01/01/2023";
	public final String patientAddress = "AutoAddress";
	public final String patientCity = "AutoCity";
	public final String patientState = "Alaska";
	public final String patientZipCode = "99999";
	public final String patientEmail = "automation@gmail.com";
	public final String patientMobile = "9999999999";
	public final String patientSex = "Male";
	public final String patientRace = "Prefers not to share";
	public final String patientEthnicity = "Prefers not to share";
	public final String abnormal = "Abnormal";
	public final String paymentMode = "Self Pay";
	
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
