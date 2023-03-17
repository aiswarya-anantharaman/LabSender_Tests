package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;

public class ProviderEditPage extends TestBase{
	
	WebElement element;
	private static final Logger logger = LogManager.getLogger(ProviderEditPage.class);

	public ProviderEditPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String providerEditPageTitle() throws Exception
	{
		String pageTitle = "Provider Edit";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Provider Edit')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	//Provider info pane
	public WebElement providerInfoPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Provider Info\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Provider info pane not found in provider edit page.");
		}
		return element;	
	}
	
	//provider info pane elements
	public WebElement providerIdBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider Id edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerNPI() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name=\"provider_npi\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Provider NPI edit box not found in provider info pane.");
		}
		return element;	
	}

	public WebElement providerLastNameBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_last_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider Last name edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerFirstNameBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_first_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider First name edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerPhoneBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_phone']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider phone edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerEmailBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_email']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider email edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerAddressBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_address']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider address edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerAddress2Box() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_address2']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider address2 edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerCityBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_city']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider city edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerStateBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_state']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider state edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerZipBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_zip']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider zip edit box not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement providerNotifyResultsCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_notify_results']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider Notify Results Checkbox not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement submitBtnProviderInfo() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value=\"Submit\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Submit btn not found in provider info pane.");
		}
		return element;	
	}
	
	public WebElement removeProviderBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(@href,\"/delete\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Remove Provider btn not found in provider info pane.");
		}
		return element;	
	}
	
	//Clients Assigned to Provider pane
	public WebElement clientsAssignedPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Clients Assigned to Provider\")]"));	
		} catch (Exception e) {			
			logger.error("Error : Clients Assigned to Provider pane not found in provider edit page.");
		}
		return element;	
	}
	
	//Clients Assigned to Provider pane elements
	
	
	//Upload Provider Signature pane
	public WebElement uploadProviderSignPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Upload Provider Signature\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Upload Provider Signature pane not found in provider edit page.");
		}
		return element;	
	}

	//Upload Provider Signature pane elements
	public WebElement chooseFileBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"signature\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Choose file btn not found in Upload Provider Signature pane.");
		}
		return element;	
	}
	
	public WebElement submitBtnUploadSignaturePane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\"]"));					
		} catch (Exception e) {			
			logger.error("Error : submit btn not found in Upload Provider Signature pane.");
		}
		return element;	
	}
	
	//Assign New Clients to Provider pane
	public WebElement AssignNewClientsPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Assign New Clients to Provider\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Assign New Clients to Provider pane not found in provider edit page.");
		}
		return element;	
	}
}
