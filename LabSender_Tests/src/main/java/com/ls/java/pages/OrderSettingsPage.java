package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class OrderSettingsPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	LabDashboardPage labDashboard = new LabDashboardPage();

	private static final Logger logger = LogManager.getLogger(OrderSettingsPage.class);

	public OrderSettingsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String orderSettingsPageTitle() throws Exception
	{
		String pageTitle = "Order Settings";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Order Settings')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}

	public WebElement providersCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/providers\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate providers card.");
		}
		return element;	
	}
	
	public WebElement clientsCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/clients\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate clients card.");
		}
		return element;	
	}
	
	public WebElement locationsCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/locations\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate locations card.");
		}
		return element;	
	}
	
	public WebElement testsCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/tests\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate tests card.");
		}
		return element;	
	}
	
	public WebElement diagnosticCodesCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/dxcodes\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate diagnostic codes card.");
		}
		return element;	
	}
	
	public WebElement reqTextDisclaimerCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/reqdisclaimer\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate requisition text or disclaimer card.");
		}
		return element;	
	}
	
	public WebElement insuranceCompaniesCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/insurance\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate insurance companies card.");
		}
		return element;	
	}
	
	public WebElement paymentMethodsCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href=\"/lab/payment-methods\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Unable to locate payment methods card.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.orderSettingsSideNav().click();
		logger.info("Navigating to Order Settings page.");
	}
	
	public Boolean verifyPageUrl() throws Exception
	{
		Boolean status = null;
		String currentPageUrl = util.getPageUrl();;
		logger.error(currentPageUrl);
		if(currentPageUrl.contains(util.orderSettingsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to verify order settings page url.");
		}
		return status;
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.equals(orderSettingsPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to verify order settings page title.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean providersCardStatus = null;
		Boolean clientsCardStatus = null;
		Boolean locationsCardStatus = null;
		Boolean testsCardStatus = null;
		Boolean diagnosticCodesCardStatus = null;
		Boolean reqTextDisclaimerCardStatus = null;
		Boolean insuranceCompaniesCardStatus = null;
		Boolean paymentMethodsCardStatus = null;
		if(providersCard().isDisplayed() && providersCard().isEnabled())
		{
			providersCardStatus = true;
		}
		else
		{
			providersCardStatus = false;
			logger.error("Error : providers card not displayed or not enabled.");
		}
		if(clientsCard().isDisplayed() && clientsCard().isEnabled())
		{
			clientsCardStatus = true;
		}
		else
		{
			clientsCardStatus = false;
			logger.error("Error : clients card not displayed or not enabled.");
		}
		if(locationsCard().isDisplayed() && locationsCard().isEnabled())
		{
			locationsCardStatus = true;
		}
		else
		{
			locationsCardStatus = false;
			logger.error("Error : locations card not displayed or not enabled.");
		}		
		if(testsCard().isDisplayed() && testsCard().isEnabled())
		{
			testsCardStatus = true;
		}
		else
		{
			testsCardStatus = false;
			logger.error("Error : tests card not displayed or not enabled.");
		}
		if(diagnosticCodesCard().isDisplayed() && diagnosticCodesCard().isEnabled())
		{
			diagnosticCodesCardStatus = true;
		}
		else
		{
			diagnosticCodesCardStatus = false;
			logger.error("Error : diagnostic codes card not displayed or not enabled.");
		}
		if(reqTextDisclaimerCard().isDisplayed() && reqTextDisclaimerCard().isEnabled())
		{
			reqTextDisclaimerCardStatus = true;
		}
		else
		{
			reqTextDisclaimerCardStatus = false;
			logger.error("Error : requisition text or disclaimer card not displayed or not enabled.");
		}
		if(insuranceCompaniesCard().isDisplayed() && insuranceCompaniesCard().isEnabled())
		{
			insuranceCompaniesCardStatus = true;
		}
		else
		{
			insuranceCompaniesCardStatus = false;
			logger.error("Error : insurance companies card not displayed or not enabled.");
		}
		if(paymentMethodsCard().isDisplayed() && paymentMethodsCard().isEnabled())
		{
			paymentMethodsCardStatus = true;
		}
		else
		{
			paymentMethodsCardStatus = false;
			logger.error("Error : payment methods card not displayed or not enabled.");
		}		
		if(providersCardStatus.equals(true) && clientsCardStatus.equals(true) && locationsCardStatus.equals(true)
				&& testsCardStatus.equals(true) && diagnosticCodesCardStatus.equals(true) && reqTextDisclaimerCardStatus.equals(true)
				&& insuranceCompaniesCardStatus.equals(true) && paymentMethodsCardStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}	
	
	public Boolean clickProvidersCard() throws Exception
	{
		Boolean status = null;
		providersCard().click();
		String currentPageUrl = util.getPageUrl();
		if(currentPageUrl.contains("labsender.com/lab/providers"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : User could not navigate to Manage Providers page upon providers card click.");
		}
		navigateToPage();
		return status;
	}
	
	public Boolean clickClientsCard() throws Exception
	{
		Boolean status = null;
		clientsCard().click();
		String currentPageUrl = util.getPageUrl();
		if(currentPageUrl.contains(util.manageClientsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : User could not navigate to Manage Clients page upon clients card click.");
		}
		navigateToPage();
		return status;
	}
	
	public Boolean clickLocationsCard() throws Exception
	{
		Boolean status = null;
		locationsCard().click();
		String currentPageUrl = util.getPageUrl();
		if(currentPageUrl.contains(util.manageLocationsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : User could not navigate to Manage Locations page upon locations card click.");
		}
		navigateToPage();
		return status;
	}
	
	public Boolean clickTestsCard() throws Exception
	{
		Boolean status = null;
		testsCard().click();
		String currentPageUrl = util.getPageUrl();
		if(currentPageUrl.contains(util.manageTestsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : User could not navigate to Manage Tests page upon tests card click.");
		}
		navigateToPage();
		return status;
	}
}
