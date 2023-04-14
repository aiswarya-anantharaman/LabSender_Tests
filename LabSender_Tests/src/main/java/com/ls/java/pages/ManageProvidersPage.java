package com.ls.java.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class ManageProvidersPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	OrderSettingsPage orderSettings = new OrderSettingsPage();
	LabDashboardPage labDashboard = new LabDashboardPage();
	ProviderEditPage providerEdit = new ProviderEditPage();

	private static final Logger logger = LogManager.getLogger(ManageProvidersPage.class);

	public ManageProvidersPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String manageProvidersPageTitle() throws Exception
	{
		String pageTitle = "Manage Providers";
		return pageTitle;
	}
	
	//manage providers page
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Manage Providers')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	public WebElement currentProvidersPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div/h6[contains(text(),'Current Providers')]"));					
		} catch (Exception e) {			
			logger.error("Error : Current providers pane not found in Manage Providers page.");
		}
		return element;	
	}
	
	public WebElement createNewProviderPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div/h6[contains(text(),'Create New Provider')]"));					
		} catch (Exception e) {			
			logger.error("Error : Create new provider pane not found in Manage Providers page.");
		}
		return element;	
	}
	
	public WebElement uploadCSVPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Upload CSV to Create\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Upload CSV to Create New Providers pane not found in Manage Providers page.");
		}
		return element;	
	}
	
	public WebElement returnToOrderSettingsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Return to Order Settings')]"));					
		} catch (Exception e) {			
			logger.error("Error : Return to Order Settings button not found in Manage Providers page.");
		}
		return element;	
	}
	
	//current providers pane
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name=\"patient-table_length\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in Manage Providers page.");
		}
		return element;	
	}	
	
	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in Manage Providers page.");
		}
		return element;	
	}
	
	public WebElement currentProvidersTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"patient-table\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Current providers table not found in Manage Providers page.");
		}
		return element;	
	}
	
	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"patient-table_paginate\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for Current providers table not found in Manage Providers page.");
		}
		return element;	
	}
	
	//create new provider pane
	public WebElement providerIdBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider Id edit box not found in Create new Provider pane.");
		}
		return element;	
	}
	
	public WebElement providerNPIBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='provider_npi']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider NPI edit box not found in Create new Provider pane.");
		}
		return element;	
	}
	
	public WebElement providerLastNameBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='last_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider Last name edit box not found in Create new Provider pane.");
		}
		return element;	
	}
	
	public WebElement providerFirstNameBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='first_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider First name edit box not found in Create new Provider pane.");
		}
		return element;	
	}
	
	public WebElement providerPhoneBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='phone']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider phone edit box not found in Create new Provider pane.");
		}
		return element;	
	}
	
	public WebElement providerEmailBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name='email']"));					
		} catch (Exception e) {			
			logger.error("Error : Provider email edit box not found in Create new Provider pane.");
		}
		return element;	
	}
	
	public WebElement createBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Create button not found in Create new Provider pane.");
		}
		return element;	
	}
	
	//Upload CSV to Create New Providers pane
	public WebElement downloadCSVTemplateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[contains(text(), \"Download CSV Template\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Download CSV template button not found in Upload CSV to Create New Providers pane.");
		}
		return element;	
	}
	
	public WebElement chooseFileBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@name=\"new_providers_upload_csv\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Choose File button not found in Upload CSV to Create New Providers pane.");
		}
		return element;	
	}
	
	public WebElement uploadBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath(" //input[@value=\"Upload\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Upload button not found in Upload CSV to Create New Providers pane.");
		}
		return element;	
	}
	
	public WebElement duplicateNPIError() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), 'The provider npi has already been taken.')]"));					
		} catch (Exception e) {			
			logger.error("Error : Error message not displayed for duplicate NPI.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.orderSettingsSideNav().click();
		orderSettings.providersCard().click();
		logger.info("Navigating to Manage Providers page.");
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(manageProvidersPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page title: " + currentPageTitle);
			logger.info("Error : Unable to verify manage providers page title.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean currentProvidersPaneStatus = null;
		Boolean createNewProviderPaneStatus = null;
		Boolean uploadCSVPaneStatus = null;
		Boolean returnToOSBtnStatus = null;
		if(currentProvidersPane().isDisplayed() && currentProvidersPane().isEnabled())
		{
			currentProvidersPaneStatus = true;
		}
		else
		{
			currentProvidersPaneStatus = false;
			logger.error("Error : current providers pane not displayed or not enabled.");
		}
		if(createNewProviderPane().isDisplayed() && createNewProviderPane().isEnabled())
		{
			createNewProviderPaneStatus = true;
		}
		else
		{
			createNewProviderPaneStatus = false;
			logger.error("Error : create new provider pane not displayed or not enabled.");
		}
		if(uploadCSVPane().isDisplayed() && uploadCSVPane().isEnabled())
		{
			uploadCSVPaneStatus = true;
		}
		else
		{
			uploadCSVPaneStatus = false;
			logger.error("Error : upload CSV pane not displayed or not enabled.");
		}
		if(returnToOrderSettingsBtn().isDisplayed() && returnToOrderSettingsBtn().isEnabled())
		{
			returnToOSBtnStatus = true;
		}
		else
		{
			returnToOSBtnStatus = false;
			logger.error("Error : return to order settings button not displayed or not enabled.");
		}
		if(currentProvidersPaneStatus.equals(true) && createNewProviderPaneStatus.equals(true)
				&& uploadCSVPaneStatus.equals(true) && returnToOSBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public Boolean verifyUIElementsCurrentProvidersPane() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchBoxStatus = null;
		Boolean currentProvidersTableStatus = null;
		Boolean paginationStatus = null;
		if(showEntriesDropdown().isDisplayed() && showEntriesDropdown().isEnabled())
		{
			showEntriesDropdownStatus = true;
		}
		else
		{
			showEntriesDropdownStatus = false;
			logger.error("Error : show entries dropdown not displayed or not enabled.");
		}
		if(searchBox().isDisplayed() && searchBox().isEnabled())
		{
			searchBoxStatus = true;
		}
		else
		{
			searchBoxStatus = false;
			logger.error("Error : search box not displayed or not enabled.");
		}
		if(currentProvidersTable().isDisplayed() && currentProvidersTable().isEnabled())
		{
			currentProvidersTableStatus = true;
		}
		else
		{
			currentProvidersTableStatus = false;
			logger.error("Error : current providers table not displayed or not enabled.");
		}
		if(pagination().isDisplayed() && pagination().isEnabled())
		{
			paginationStatus = true;
		}
		else
		{
			paginationStatus = false;
			logger.error("Error : pagination for current providers table not displayed or not enabled.");
		}
		if(showEntriesDropdownStatus.equals(true) && searchBoxStatus.equals(true)
				&& currentProvidersTableStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsCreateNewProvidersPane() throws Exception
	{
		Boolean status = null;
		Boolean IdStatus = null;
		Boolean NPIStatus = null;
		Boolean lastnameStatus = null;
		Boolean firstnameStatus = null;
		Boolean phoneStatus = null;
		Boolean emailStatus = null;
		Boolean createBtnStatus = null;
		if(providerIdBox().isDisplayed() && providerIdBox().isEnabled())
		{
			IdStatus = true;
		}
		else
		{
			IdStatus = false;
			logger.error("Error : provider id not displayed or not enabled.");
		}
		if(providerNPIBox().isDisplayed() && providerNPIBox().isEnabled())
		{
			NPIStatus = true;
		}
		else
		{
			NPIStatus = false;
			logger.error("Error : provider npi not displayed or not enabled.");
		}
		if(providerLastNameBox().isDisplayed() && providerLastNameBox().isEnabled())
		{
			lastnameStatus = true;
		}
		else
		{
			lastnameStatus = false;
			logger.error("Error : provider lastname not displayed or not enabled.");
		}
		if(providerFirstNameBox().isDisplayed() && providerFirstNameBox().isEnabled())
		{
			firstnameStatus = true;
		}
		else
		{
			firstnameStatus = false;
			logger.error("Error : provider firstname not displayed or not enabled.");
		}
		if(providerPhoneBox().isDisplayed() && providerPhoneBox().isEnabled())
		{
			phoneStatus = true;
		}
		else
		{
			phoneStatus = false;
			logger.error("Error : provider phone not displayed or not enabled.");
		}
		if(providerEmailBox().isDisplayed() && providerEmailBox().isEnabled())
		{
			emailStatus = true;
		}
		else
		{
			emailStatus = false;
			logger.error("Error : provider email not displayed or not enabled.");
		}
		if(createBtn().isDisplayed() && createBtn().isEnabled())
		{
			createBtnStatus = true;
		}
		else
		{
			createBtnStatus = false;
			logger.error("Error : create btn not displayed or not enabled.");
		}		
		if(IdStatus.equals(true) && NPIStatus.equals(true) && lastnameStatus.equals(true) && firstnameStatus.equals(true)
				&& phoneStatus.equals(true) && emailStatus.equals(true) && createBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public void createNewProvider(String testID, String testNPI , String lname, String fname) throws Exception
	{
		//create new provider
		providerIdBox().clear();
		providerIdBox().sendKeys(testID);
		providerNPIBox().clear();
		providerNPIBox().sendKeys(testNPI);
		providerLastNameBox().clear();
		providerLastNameBox().sendKeys(lname);
		providerFirstNameBox().clear();
		providerFirstNameBox().sendKeys(fname);
		//click create btn
		util.clickAfterExplicitWait(4000, "//button[@type='submit']");
		logger.info("Provider with NPI " + testNPI + " created.");
	}
	
	public Boolean verifyCreateNewProvider(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;
		//create
		createNewProvider(testID, testNPI, lname, fname);
		//verify
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		String NPItableEntry = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr/td[2]")).getText();
		if(NPItableEntry.equals(testNPI))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to create new provider.");
		}
		//cleanup
		deleteProvider(testNPI);
		return status;
	}
	
	public Boolean searchProvider(String testNPI) throws Exception
	{
		Boolean status = true;
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		WebElement providerTable = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody"));
		List<WebElement> providerTableRows = providerTable.findElements(By.tagName("tr"));
		int rows = providerTableRows.size();
		for(int i=1; i<=rows; i++)
		{
			String NPI = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr["+i+"]/td[2]")).getText();
			if(!NPI.equals(testNPI))
			{
				status = false;
				break;
			}
		}
		return status;
	}
	
	public Boolean verifySearchFunctionality(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;
		Boolean validSearch = true;
		Boolean invalidSearch = null;
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//valid string search
		if(searchProvider(testNPI).equals(true))
		{
			validSearch = true;
		}
		else
		{
			validSearch = false;
			logger.error("Error : Search functionality not working for valid search string.");
		}
		//invalid string search
		searchBox().clear();
		searchBox().sendKeys("error");
		if(emptyRecords())
		{
			invalidSearch = true;
		}
		else
		{
			invalidSearch = false;
			logger.error("Error : Search functionality not working for invalid search string.");
		}
		if(invalidSearch.equals(true) && validSearch.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		deleteProvider(testNPI);
		return status;
	}
	
	public Boolean clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = null;
		returnToOrderSettingsBtn().click();
		if(util.getPageUrl().contains("lab/order_settings"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page title: " + util.getPageUrl());
			logger.error("Error : Unable to navigate to Order Settings page on clicking Return to Order Settings button.");
		}
		return status;
	}
	
	public Boolean verifyShowEntriesDropdownOptions() throws Exception
	{
		Boolean status = null;
		ArrayList<String> options = new ArrayList<String>();
		ArrayList<String> exp_options = new ArrayList<String>();
		exp_options.add("10");
		exp_options.add("25");
		exp_options.add("50");
		exp_options.add("100");
		Select dropdown = new Select(showEntriesDropdown());		
		List <WebElement> option = dropdown.getOptions();	      
      	for(int i =0; i<option.size() ; i++)
      	{
	         options.add(option.get(i).getText());
        }
      	if(options.equals(exp_options))
      	{
      		status = true;
      	}
      	else
      	{
      		status = false;
      		logger.error("Error : options missing in show entries dropdown in current providers pane.");
      	}
		return status;
	}
	
	public Boolean clickEditProvider() throws Exception
	{
		Boolean status = null;		
		searchBox().clear();
		searchBox().sendKeys("Provider");
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		if(util.getPageUrl().contains(util.providerEditPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page title: " + util.getPageUrl());
			logger.error("Error : Unable to navigate to Provider Edit page on clicking Edit Provider button.");
		}	
		//navigating from provider edit to manage providers page
		navigateToPage();
		return status;
	}
	
	public Boolean verifyUIElementsUploadCSVPane() throws Exception
	{
		Boolean status = null;
		Boolean downloadTemplateBtnStatus = null;
		Boolean chooseFileBtnStatus = null;
		Boolean uploadBtnStatus = null;
		if(downloadCSVTemplateBtn().isDisplayed() && downloadCSVTemplateBtn().isEnabled())
		{
			downloadTemplateBtnStatus = true;
		}
		else
		{
			downloadTemplateBtnStatus = false;
			logger.error("Error : download CSV template button not displayed or not enabled.");
		}
		if(chooseFileBtn().isDisplayed() && chooseFileBtn().isEnabled())
		{
			chooseFileBtnStatus = true;
		}
		else
		{
			chooseFileBtnStatus = false;
			logger.error("Error : choose file button not displayed or not enabled.");
		}
		if(uploadBtn().isDisplayed() && uploadBtn().isEnabled())
		{
			uploadBtnStatus = true;
		}
		else
		{
			uploadBtnStatus = false;
			logger.error("Error : upload button not displayed or not enabled.");
		}
		if(downloadTemplateBtnStatus.equals(true) && chooseFileBtnStatus.equals(true) && uploadBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean updateProviderDetails(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;	
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//search provider using unique NPI
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		//click edit provider btn
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		//replace NPI with new value and click submit
		String newNPI = util.randomNPI();
		providerEdit.providerNPI().clear();
		providerEdit.providerNPI().sendKeys(newNPI);
		util.sleep(2000);
		//click submit btn
		util.clickAfterExplicitWait(4000, "//input[@value=\"Submit\"]");
		//search provider using unique NPI
		if(searchProvider(newNPI).equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : unable to update provider details");
		}
		//cleanup
		deleteProvider(newNPI);
		return status;
	}
	
	public Boolean verifyRemoveProvider(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;	
		Boolean alertDisplayed = null;
		Boolean clickCancel = null;
		Boolean clickOk = null;
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//search provider using unique NPI
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		//click edit provider btn
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		//click remove provider btn on the provider edit page
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//verify alert displayed
		Alert alert = driver.switchTo().alert();
		String str_alert = alert.getText();
		String exp_alert = "Are you sure you wish to remove this Provider?";
		if(str_alert.equals(exp_alert))
		{
			alertDisplayed = true;
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on remove provider button click");
		}
		//dismiss alert
		alert.dismiss();
		//verify record retained on current providers table
		navigateToPage();
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		util.sleep(2000);
		String NPI = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr/td[2]")).getText();
		if(NPI.equals(testNPI))
		{
			clickCancel = true;
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Record not retained on remove provider alert dismissal.");
		}
		//click edit provider btn
		WebElement editProviderBtn1 = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn1.click();
		//click remove provider btn on the provider edit page
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//verify record deleted from current providers table
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		if(emptyRecords().equals(true))
		{
			clickOk = true;
		}
		else
		{
			clickOk = false;
			logger.error("Error : Record not deleted on accepting remove provider alert.");
		}
		if(alertDisplayed.equals(true) && clickCancel.equals(true) && clickOk.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public Boolean emptyRecords() throws Exception
	{
		Boolean isEmpty = false;
		WebElement emptyRecords = driver.findElement(By.xpath("//td[contains(text(), \"No matching records found\")]"));
		if(emptyRecords.isDisplayed())
		{
			isEmpty = true;
		}
		return isEmpty;
	}
	
	public void deleteProvider(String testNPI) throws Exception
	{
		//search Provider using NPI
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		//click edit provider btn
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		//click remove provider btn on the provider edit page
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		util.sleep(2000);
		logger.info("Provider with NPI " + testNPI + " deleted.");
	}
	
	public Boolean verifypageElementsRenderedProviderEdit(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;
		Boolean providerInfoPaneStatus = null;
		Boolean clientsAssignedPaneStatus = null;
		Boolean uploadProviderSignPaneStatus = null;
		Boolean AssignNewClientsPaneStatus = null;
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//search provider using unique NPI
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		//click edit provider btn
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		//UI elements check
		if(providerEdit.providerInfoPane().isDisplayed() && providerEdit.providerInfoPane().isEnabled())
		{
			providerInfoPaneStatus = true;
		}
		else
		{
			providerInfoPaneStatus = false;
			logger.error("Error : Provider info pane not displayed or enabled");
		}
		if(providerEdit.clientsAssignedPane().isDisplayed() && providerEdit.clientsAssignedPane().isEnabled())
		{
			clientsAssignedPaneStatus = true;
		}
		else
		{
			clientsAssignedPaneStatus = false;
			logger.error("Error : Clients Assigned to Provider pane not displayed or enabled");
		}
		if(providerEdit.uploadProviderSignPane().isDisplayed() && providerEdit.uploadProviderSignPane().isEnabled())
		{
			uploadProviderSignPaneStatus = true;
		}
		else
		{
			uploadProviderSignPaneStatus = false;
			logger.error("Error : Upload Provider Signature pane not displayed or enabled");
		}
		if(providerEdit.AssignNewClientsPane().isDisplayed() && providerEdit.AssignNewClientsPane().isEnabled())
		{
			AssignNewClientsPaneStatus = true;
		}
		else
		{
			AssignNewClientsPaneStatus = false;
			logger.error("Error : Assign New Clients to Provider pane not displayed or enabled");
		}
		if(providerInfoPaneStatus.equals(true) && clientsAssignedPaneStatus.equals(true)
				&& uploadProviderSignPaneStatus.equals(true) && AssignNewClientsPaneStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		navigateToPage();
		deleteProvider(testNPI);
		return status;
	}
	
	public Boolean verifyUIElementsProviderInfoPane(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;
		Boolean IdStatus = null;
		Boolean NPIStatus = null;
		Boolean lastnameStatus = null;
		Boolean firstnameStatus = null;
		Boolean phoneStatus = null;
		Boolean emailStatus = null;
		Boolean addressStatus = null;
		Boolean address2Status = null;
		Boolean cityStatus = null;
		Boolean stateStatus = null;
		Boolean zipStatus = null;
		Boolean notifyProviderCheckboxStatus = null;
		Boolean submitBtnStatus = null;
		Boolean removeProviderStatus = null;
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//search provider using unique NPI
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		//click edit provider btn
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		//UI elements check
		if(providerEdit.providerIdBox().isDisplayed() && providerEdit.providerIdBox().isEnabled())
		{
			IdStatus = true;
		}
		else
		{
			IdStatus = false;
			logger.error("Error : provider id not displayed or not enabled.");
		}
		if(providerEdit.providerNPI().isDisplayed() && providerEdit.providerNPI().isEnabled())
		{
			NPIStatus = true;
		}
		else
		{
			NPIStatus = false;
			logger.error("Error : provider npi not displayed or not enabled.");
		}
		if(providerEdit.providerLastNameBox().isDisplayed() && providerEdit.providerLastNameBox().isEnabled())
		{
			lastnameStatus = true;
		}
		else
		{
			lastnameStatus = false;
			logger.error("Error : provider lastname not displayed or not enabled.");
		}
		if(providerEdit.providerFirstNameBox().isDisplayed() && providerEdit.providerFirstNameBox().isEnabled())
		{
			firstnameStatus = true;
		}
		else
		{
			firstnameStatus = false;
			logger.error("Error : provider firstname not displayed or not enabled.");
		}
		if(providerEdit.providerPhoneBox().isDisplayed() && providerEdit.providerPhoneBox().isEnabled())
		{
			phoneStatus = true;
		}
		else
		{
			phoneStatus = false;
			logger.error("Error : provider phone not displayed or not enabled.");
		}
		if(providerEdit.providerEmailBox().isDisplayed() && providerEdit.providerEmailBox().isEnabled())
		{
			emailStatus = true;
		}
		else
		{
			emailStatus = false;
			logger.error("Error : provider email not displayed or not enabled.");
		}
		if(providerEdit.providerAddressBox().isDisplayed() && providerEdit.providerAddressBox().isEnabled())
		{
			addressStatus = true;
		}
		else
		{
			addressStatus = false;
			logger.error("Error : provider address not displayed or not enabled.");
		}
		if(providerEdit.providerAddress2Box().isDisplayed() && providerEdit.providerAddress2Box().isEnabled())
		{
			address2Status = true;
		}
		else
		{
			address2Status = false;
			logger.error("Error : provider address - suite/apt# not displayed or not enabled.");
		}
		if(providerEdit.providerCityBox().isDisplayed() && providerEdit.providerCityBox().isEnabled())
		{
			cityStatus = true;
		}
		else
		{
			cityStatus = false;
			logger.error("Error : provider city not displayed or not enabled.");
		}
		if(providerEdit.providerStateBox().isDisplayed() && providerEdit.providerStateBox().isEnabled())
		{
			stateStatus = true;
		}
		else
		{
			stateStatus = false;
			logger.error("Error : provider state not displayed or not enabled.");
		}
		if(providerEdit.providerZipBox().isDisplayed() && providerEdit.providerZipBox().isEnabled())
		{
			zipStatus = true;
		}
		else
		{
			zipStatus = false;
			logger.error("Error : provider zip not displayed or not enabled.");
		}
		if(providerEdit.providerNotifyResultsCheckbox().isDisplayed() && providerEdit.providerNotifyResultsCheckbox().isEnabled())
		{
			notifyProviderCheckboxStatus = true;
		}
		else
		{
			notifyProviderCheckboxStatus = false;
			logger.error("Error : notify provider of results checkbox not displayed or not enabled.");
		}
		if(providerEdit.submitBtnProviderInfo().isDisplayed() && providerEdit.submitBtnProviderInfo().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : submit btn not displayed or not enabled.");
		}
		if(providerEdit.removeProviderBtn().isDisplayed() && providerEdit.removeProviderBtn().isEnabled())
		{
			removeProviderStatus = true;
		}
		else
		{
			removeProviderStatus = false;
			logger.error("Error : remove provider btn not displayed or not enabled.");
		}
		if(IdStatus.equals(true) && NPIStatus.equals(true) && lastnameStatus.equals(true) && 
				firstnameStatus.equals(true) && phoneStatus.equals(true) && 
				emailStatus.equals(true) && addressStatus.equals(true) &&
				address2Status.equals(true) && cityStatus.equals(true) &&
				stateStatus.equals(true) && zipStatus.equals(true) &&
				notifyProviderCheckboxStatus.equals(true) && submitBtnStatus.equals(true) &&
				removeProviderStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		navigateToPage();
		deleteProvider(testNPI);
		return status;
	}
	
	public Boolean verifyUIElementsUploadProviderSignPane(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;
		Boolean chooseFileBtnStatus = null;
		Boolean submitBtnStatus = null;
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//search provider using unique NPI
		searchBox().clear();
		searchBox().sendKeys(testNPI);
		//click edit provider btn
		WebElement editProviderBtn = driver.findElement(By.xpath("//*[@id=\"patient-table\"]/tbody/tr[1]/td[9]/a"));
		editProviderBtn.click();
		//UI elements check
		if(providerEdit.chooseFileBtn().isDisplayed() && providerEdit.chooseFileBtn().isEnabled())
		{
			chooseFileBtnStatus = true;
		}
		else
		{
			chooseFileBtnStatus = false;
			logger.error("Error : remove provider btn not displayed or not enabled.");
		}
		if(providerEdit.submitBtnUploadSignaturePane().isDisplayed() && providerEdit.submitBtnUploadSignaturePane().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : remove provider btn not displayed or not enabled.");
		}
		if(chooseFileBtnStatus.equals(true) && submitBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		navigateToPage();
		deleteProvider(testNPI);
		return status;
	}
	
	public Boolean createProviderWithDuplicateNPI(String testID, String testNPI , String lname, String fname) throws Exception
	{
		Boolean status = null;
		//create new provider
		createNewProvider(testID, testNPI, lname, fname);
		//create new provider with same NPI, but different data
		createNewProvider("11", testNPI, "Provider2", "Automated Test");
		if(duplicateNPIError().isDisplayed())
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Error message not displayed for duplicate NPI.");			
		}
		//cleanup
		deleteProvider(testNPI);
		return status;
	}
}
