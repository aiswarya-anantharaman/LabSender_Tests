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

public class ManageLocationsPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	OrderSettingsPage orderSettings = new OrderSettingsPage();
	
	LabDashboardPage labDashboard = new LabDashboardPage();
	EditingLocationPage editLocation = new EditingLocationPage();
	ManageClientsPage manageClient = new ManageClientsPage();

	private static final Logger logger = LogManager.getLogger(ManageLocationsPage.class);

	public ManageLocationsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String manageLocationsPageTitle() throws Exception
	{
		String pageTitle = "Manage Locations";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Manage Locations')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}

	public WebElement currentLocationsPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Current Locations\")]"));
		} catch (Exception e) {			
			logger.error("Error : Current Locations pane not found in manage locations page.");
		}
		return element;	
	}
	
	public WebElement createNewLocationPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[starts-with(text(), \"Create New Location\")]"));
		} catch (Exception e) {			
			logger.error("Error : Create New Location pane not found in manage locations page.");
		}
		return element;	
	}
	
	public WebElement uploadCSVPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),\"Upload CSV\")]"));
		} catch (Exception e) {			
			logger.error("Error : Upload CSV to Create New Locations pane pane not found in manage locations page.");
		}
		return element;	
	}
	
	public WebElement returnToOrderSettingsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Return to Order Settings')]"));					
		} catch (Exception e) {			
			logger.error("Error : Return to Order Settings button not found in Manage locations page.");
		}
		return element;	
	}
	
	//current locations pane elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name=\"table_length\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in Manage locations page.");
		}
		return element;	
	}	
	
	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in Manage locations page.");
		}
		return element;	
	}
	
	public WebElement currentLocationsTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"table\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Current locations table not found in Manage locations page.");
		}
		return element;	
	}
	
	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"table_paginate\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for Current locations table not found in Manage locations page.");
		}
		return element;	
	}
	
	//Create New Location pane elements
	public WebElement locationNameEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"location_name\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Location Name edit box not found in Create New Location pane.");
		}
		return element;	
	}
	
	public WebElement clientNameDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"client_id\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Client Name dropdown not found in Create New Location pane.");
		}
		return element;	
	}
	
	public WebElement submitBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Submit Btn not found in Create New Location pane.");
		}
		return element;	
	}
	
	//Upload CSV to Create New Locations pane elements
	public WebElement downloadCSVTemplateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[contains(text(), \"Download CSV Template\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Download CSV template button not found in Upload CSV to Create New Locations pane.");
		}
		return element;	
	}
	
	public WebElement chooseFileBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name=\"new_locations_upload_csv\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Choose File button not found in Upload CSV to Create New Locations pane.");
		}
		return element;	
	}
	
	public WebElement uploadBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value=\"Upload\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Upload button not found in Upload CSV to Create New Locations pane.");
		}
		return element;	
	}	
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.orderSettingsSideNav().click();
		orderSettings.locationsCard().click();
		logger.info("Navigating to Manage Locations page.");
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(manageLocationsPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.info("Error : Unable to verify manage locations page title.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean currentLocationsPaneStatus = null;
		Boolean createNewLocationPaneStatus = null;
		Boolean uploadCSVPaneStatus = null;
		Boolean returnToOSBtnStatus = null;
		if(currentLocationsPane().isDisplayed() && currentLocationsPane().isEnabled())
		{
			currentLocationsPaneStatus = true;
		}
		else
		{
			currentLocationsPaneStatus = false;
			logger.error("Error : Current Locations pane not displayed or not enabled.");
		}
		if(createNewLocationPane().isDisplayed() && createNewLocationPane().isEnabled())
		{
			createNewLocationPaneStatus = true;
		}
		else
		{
			createNewLocationPaneStatus = false;
			logger.error("Error : Create New Location pane not displayed or not enabled.");
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
		if(currentLocationsPaneStatus.equals(true) && createNewLocationPaneStatus.equals(true)
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
	
	public Boolean verifyUIElementsCurrentLocationsPane() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchBoxStatus = null;
		Boolean currentLocationsTableStatus = null;
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
		if(currentLocationsTable().isDisplayed() && currentLocationsTable().isEnabled())
		{
			currentLocationsTableStatus = true;
		}
		else
		{
			currentLocationsTableStatus = false;
			logger.error("Error : current locations table not displayed or not enabled.");
		}
		if(pagination().isDisplayed() && pagination().isEnabled())
		{
			paginationStatus = true;
		}
		else
		{
			paginationStatus = false;
			logger.error("Error : pagination for current locations table not displayed or not enabled.");
		}
		if(showEntriesDropdownStatus.equals(true) && searchBoxStatus.equals(true)
				&& currentLocationsTableStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsCreateNewLocationPane() throws Exception
	{
		Boolean status = null;
		Boolean locationNameEditboxStatus = null;
		Boolean clientNameDropdownStatus = null;
		Boolean submitBtnStatus = null;
		if(locationNameEditbox().isDisplayed() && locationNameEditbox().isEnabled())
		{
			locationNameEditboxStatus = true;
		}
		else
		{
			locationNameEditboxStatus = false;
			logger.error("Error : location name edit box for current locations table not displayed or not enabled.");
		}
		if(clientNameDropdown().isDisplayed() && clientNameDropdown().isEnabled())
		{
			clientNameDropdownStatus = true;
		}
		else
		{
			clientNameDropdownStatus = false;
			logger.error("Error : client name dropdown for current locations table not displayed or not enabled.");
		}
		if(submitBtn().isDisplayed() && submitBtn().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : submit btn for current locations table not displayed or not enabled.");
		}		
		if(locationNameEditboxStatus.equals(true) && clientNameDropdownStatus.equals(true)
				&& submitBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
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
      		logger.error("Error : options missing in show entries dropdown in current locations pane.");
      	}
		return status;
	}
	
	public Boolean clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = null;
		//navigate to page
		navigateToPage();
		//click return to OS btn
		returnToOrderSettingsBtn().click();
		if(util.getPageUrl().contains("lab/order_settings"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Order Settings page on clicking Return to Order Settings button.");
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
	
	public Boolean verifyCreateNewLocation(String location) throws Exception
	{
		Boolean status = null;
		//create location
		createNewLocation(location);
		//verify new location added
		searchBox().clear();
		searchBox().sendKeys(location);
		String locTableEntry = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).getText();
		if(locTableEntry.equals(location))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to create new location.");
		}		
		//cleanup
		deleteLocation(location);
		return status;
	}
	
	public void createNewLocation(String location) throws Exception
	{
		//create new location
		locationNameEditbox().clear();
		locationNameEditbox().sendKeys(location);
		//click submit btn
		util.clickAfterExplicitWait(4000, "//button[@type=\"submit\"]");
		logger.info("New location created : " + location);		
	}
	
	public void deleteLocation(String location) throws Exception
	{
		//search location
		searchBox().clear();
		searchBox().sendKeys(location);
		//click delete btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		logger.info("Location " + location + " deleted.");
	}
	
	public Boolean clickEditLocation(String location) throws Exception
	{
		Boolean status = null;
		//create location
		createNewLocation(location);
		//search location
		locationNameEditbox().clear();
		locationNameEditbox().sendKeys(location);
		//click edit location btn
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Location\")]");
		if(util.getPageUrl().contains(util.editingLocationPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Editing Location page on clicking Edit Location button.");
		}	
		//navigating from editing location to manage locations page
		navigateToPage();
		//cleanup
		deleteLocation(location);		
		return status;
	}
	
	public Boolean verifyEditLocation(String location) throws Exception
	{
		Boolean status = null;
		//create location
		createNewLocation(location);
		//search location
		locationNameEditbox().clear();
		locationNameEditbox().sendKeys(location);
		//click edit location btn
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Location\")]");
		//edit location
		String new_location = "Edited Automated Test Location";
		editLocation.locationNameEditbox().clear();
		editLocation.locationNameEditbox().sendKeys(new_location);
		editLocation.updateBtn().click();
		//navigating from editing location to manage locations page
		navigateToPage();
		//search edited location
		searchBox().clear();
		searchBox().sendKeys(new_location);		
		String locTableEntry = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).getText();
		if(locTableEntry.equals(new_location))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to edit location details.");
		}	
		//cleanup
		deleteLocation(location);		
		return status;
	}
	
	public Boolean verifyPageElementsRenderedEditingLocation(String location) throws Exception
	{
		Boolean status = null;
		//create location
		createNewLocation(location);
		//search location
		locationNameEditbox().clear();
		locationNameEditbox().sendKeys(location);
		//click edit location btn, navigate to editing location page
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Location\")]");
		//verify page elements rendered
		Boolean locationNameEditboxStatus = null;
		Boolean updateBtnStatus = null;
		Boolean clientDropdownStatus = null;
		Boolean submitBtnStatus = null;
		if(editLocation.locationNameEditbox().isDisplayed() && editLocation.locationNameEditbox().isEnabled())
		{
			locationNameEditboxStatus = true;
		}
		else
		{
			locationNameEditboxStatus = false;
			logger.error("Error : Location Name Editbox not displayed or not enabled.");
		}
		if(editLocation.updateBtn().isDisplayed() && editLocation.updateBtn().isEnabled())
		{
			updateBtnStatus = true;
		}
		else
		{
			updateBtnStatus = false;
			logger.error("Error : Update Btn not displayed or not enabled.");
		}
		if(editLocation.clientDropdown().isDisplayed() && editLocation.clientDropdown().isEnabled())
		{
			clientDropdownStatus = true;
		}
		else
		{
			clientDropdownStatus = false;
			logger.error("Error : Client Dropdown not displayed or not enabled.");
		}
		if(editLocation.submitBtn().isDisplayed() && editLocation.submitBtn().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : submit button not displayed or not enabled.");
		}
		if(locationNameEditboxStatus.equals(true) && updateBtnStatus.equals(true)
				&& clientDropdownStatus.equals(true) && submitBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//navigating from editing location to manage locations page
		navigateToPage();
		//cleanup
		deleteLocation(location);
		return status;
	}
	
	public Boolean clientsAssociatedWithLocation(String clientName, String clientId, String location) throws Exception
	{
		Boolean status = null;
		Boolean addClient = null;
		Boolean deleteClient = null;
		manageClient.navigateToPage();
		//create new client
		manageClient.createNewClient(clientName, clientId);
		//navigate to locations page
		navigateToPage();
		//create location
		createNewLocation(location);
		//search location
		locationNameEditbox().clear();
		locationNameEditbox().sendKeys(location);
		//click edit location btn, navigate to editing location page
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Location\")]");
		//select client to add
		Select dropdown = new Select(editLocation.clientDropdown());		
		dropdown.selectByVisibleText(clientName);
		Thread.sleep(2000);
		//click submit btn in editing location page
		util.clickAfterExplicitWait(4000, "//button[@type=\"submit\" and contains(text(), \"SUBMIT\")]");
		List<WebElement> assoClients = driver.findElements(By.xpath("//td[contains(text(), '"+clientName+"')]"));
		if(!assoClients.isEmpty() && assoClients.get(0).getText().equals(clientName))
		{
			addClient = true;
		}
		else
		{
			addClient = false;
			logger.error("Error : Unable to add client to location");
		}
		//delete client
		driver.findElement(By.xpath("//i[contains(@class,\"trash\")]")).click();
		List<WebElement> assoClients1 = driver.findElements(By.xpath("//td[contains(text(), '"+clientName+"')]"));
		if(assoClients1.isEmpty())
		{
			deleteClient = true;
		}
		else
		{
			deleteClient = false;
			logger.error("Error : Unable to delete client added to location");
		}
		if(addClient.equals(true) && deleteClient.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		//navigating from editing location to manage locations page
		navigateToPage();
		//delete location
		deleteLocation(location);
		//navigating to clients page
		manageClient.navigateToPage();
		//delete client
		manageClient.deleteClient(clientId);
		//navigate back to manage locations page
		navigateToPage();
		return status;
	}
	
	public Boolean verifyDeleteLocation(String location) throws Exception
	{
		Boolean status = null;
		Boolean alertDisplayed = null;
		Boolean clickCancel = null;
		Boolean clickOk = null;
		//create location
		createNewLocation(location);
		//search location
		locationNameEditbox().clear();
		locationNameEditbox().sendKeys(location);
		//click delete location btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//verify alert displayed
		Alert alert = driver.switchTo().alert();
		String str_alert = alert.getText();
		String exp_alert = "Are you sure you wish to delete this location?";
		if(str_alert.equals(exp_alert))
		{
			alertDisplayed = true;
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on delete location button click");
		}
		//dismiss alert
		alert.dismiss();
		//verify record retained on current locations table
		searchBox().clear();
		searchBox().sendKeys(location);
		Thread.sleep(2000);
		String locationEntry = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).getText();
		if(locationEntry.equals(location))
		{
			clickCancel = true;
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Record not retained on delete location alert dismissal.");
		}
		//click delete location btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//verify record deleted from current locations table
		searchBox().clear();
		searchBox().sendKeys(location);
		if(emptyRecords().equals(true))
		{
			clickOk = true;
		}
		else
		{
			clickOk = false;
			logger.error("Error : Record not deleted on accepting delete location alert.");
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
	
	public Boolean searchLocation(String location) throws Exception
	{
		Boolean status = true;
		searchBox().clear();
		searchBox().sendKeys(location);
		WebElement locationsTable = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody"));
		List<WebElement> locationsTableRows = locationsTable.findElements(By.tagName("tr"));
		int rows = locationsTableRows.size();
		for(int i=1; i<=rows; i++)
		{
			String locationEntry = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr["+i+"]/td[1]")).getText();
			if(!locationEntry.equals(location))
			{
				status = false;
				break;
			}
		}
		return status;
	}
	
	public Boolean verifySearchFunctionality(String location) throws Exception
	{
		Boolean status = null;
		Boolean validSearch = true;
		Boolean invalidSearch = null;
		//create new location
		createNewLocation(location);
		//valid string search
		if(searchLocation(location).equals(true))
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
		deleteLocation(location);
		return status;
	}
	

}
