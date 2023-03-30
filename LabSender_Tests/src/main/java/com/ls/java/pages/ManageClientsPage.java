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

public class ManageClientsPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	OrderSettingsPage orderSettings = new OrderSettingsPage();
	LabDashboardPage labDashboard = new LabDashboardPage();
	EditingClientPage editClient = new EditingClientPage();

	private static final Logger logger = LogManager.getLogger(ManageClientsPage.class);

	public ManageClientsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String manageClientsPageTitle() throws Exception
	{
		String pageTitle = "Manage Clients";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Manage Clients')]"));
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	//manage clients page
	public WebElement additionalClientFeaturesInfo() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[contains(text(), \"Additional Client Features!\")]"));
		} catch (Exception e) {			
			logger.error("Error : Additional Client Features info not found in manage clients page.");
		}
		return element;	
	}
	
	public WebElement currentClientsPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Current Clients\")]"));
		} catch (Exception e) {			
			logger.error("Error : Current Clients pane not found in manage clients page.");
		}
		return element;	
	}
	
	public WebElement createNewClientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[starts-with(text(), \"Create New Client\")]"));
		} catch (Exception e) {			
			logger.error("Error : Create New Client pane not found in manage clients page.");
		}
		return element;	
	}
	
	public WebElement uploadCSVPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),\"Upload CSV\")]"));
		} catch (Exception e) {			
			logger.error("Error : Upload CSV to Create New Clients pane pane not found in manage clients page.");
		}
		return element;	
	}
	
	public WebElement returnToOrderSettingsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Return to Order Settings')]"));					
		} catch (Exception e) {			
			logger.error("Error : Return to Order Settings button not found in Manage clients page.");
		}
		return element;	
	}
	
	//current clients pane elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name=\"table_length\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in Manage clients page.");
		}
		return element;	
	}	
	
	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in Manage clients page.");
		}
		return element;	
	}
	
	public WebElement currentClientsTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"table\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Current clients table not found in Manage clients page.");
		}
		return element;	
	}
	
	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"table_paginate\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for Current clients table not found in Manage clients page.");
		}
		return element;	
	}
	
	//Create New Client pane elements
	public WebElement clientNameEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"client_name\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Client Name edit box not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement clientIdEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"client_number\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Client Id edit box not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement defaultProviderDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"provider_id\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Default Provider dropdown not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement manageProvidersBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[@href = \"/lab/providers\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Manage Providers button not found in Create New Client pane.");
		}
		return element;	
	}
	
	//order form settings check boxes in create new client pane
	public WebElement showOrderingProviderCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"ordering_provider\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show Ordering Provider checkbox not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement guardianConsentCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name=\"guardian_consent\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Guardian Consent checkbox not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement insuranceCardPhotoReqCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"ins_card_photo_required\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Insurance Card photo required checkbox not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement insuranceDriverIdReqCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"ins_driversid_required\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Insurance or Drivers ID required checkbox not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement sendResultNotificationProviderCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"pat_res_notify_prov\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Send Patient Result Notification To Provider checkbox not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement sendOrderConfirmationEmailsCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"allow_order_confirmation_emails\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Send Order Confirmation Emails checkbox not found in Create New Client pane.");
		}
		return element;	
	}
	
	public WebElement displayInsuranceCardImagesCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"display_ins_images\"]"));					
		} catch (Exception e) {			
			logger.error("Error : SDisplay Insurance Card images checkbox not found in Create New Client pane.");
		}
		return element;	
	}

	public WebElement submitBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Submit btn not found in Create New Client pane.");
		}
		return element;	
	}
	
	//Upload CSV to Create New Clients pane elements
	public WebElement downloadCSVTemplateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[contains(text(), \"Download CSV Template\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Download CSV template button not found in Upload CSV to Create New Clients pane.");
		}
		return element;	
	}
	
	public WebElement chooseFileBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name=\"new_clients_upload_csv\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Choose File button not found in Upload CSV to Create New Clients pane.");
		}
		return element;	
	}
	
	public WebElement uploadBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value=\"Upload\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Upload button not found in Upload CSV to Create New Clients pane.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.orderSettingsSideNav().click();
		orderSettings.clientsCard().click();
		logger.info("Navigating to Manage Clients page.");
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(manageClientsPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to verify manage clients page title.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean additionalClientFeaturesInfoStatus = null;
		Boolean currentClientsPaneStatus = null;
		Boolean createNewClientPaneStatus = null;
		Boolean uploadCSVPaneStatus = null;
		Boolean returnToOSBtnStatus = null;
		if(additionalClientFeaturesInfo().isDisplayed() && additionalClientFeaturesInfo().isEnabled())
		{
			additionalClientFeaturesInfoStatus = true;
		}
		else
		{
			additionalClientFeaturesInfoStatus = false;
			logger.error("Error : Additional Client Features Info box not displayed or not enabled.");
		}
		if(currentClientsPane().isDisplayed() && currentClientsPane().isEnabled())
		{
			currentClientsPaneStatus = true;
		}
		else
		{
			currentClientsPaneStatus = false;
			logger.error("Error : Current Clients pane not displayed or not enabled.");
		}
		if(createNewClientPane().isDisplayed() && createNewClientPane().isEnabled())
		{
			createNewClientPaneStatus = true;
		}
		else
		{
			createNewClientPaneStatus = false;
			logger.error("Error : Create New Client pane not displayed or not enabled.");
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
		if(additionalClientFeaturesInfoStatus.equals(true) && currentClientsPaneStatus.equals(true)
				&& createNewClientPaneStatus.equals(true) && uploadCSVPaneStatus.equals(true) 
				&& returnToOSBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsCurrentClientsPane() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchBoxStatus = null;
		Boolean currentClientsTableStatus = null;
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
		if(currentClientsTable().isDisplayed() && currentClientsTable().isEnabled())
		{
			currentClientsTableStatus = true;
		}
		else
		{
			currentClientsTableStatus = false;
			logger.error("Error : current clients table not displayed or not enabled.");
		}
		if(pagination().isDisplayed() && pagination().isEnabled())
		{
			paginationStatus = true;
		}
		else
		{
			paginationStatus = false;
			logger.error("Error : pagination for current clients table not displayed or not enabled.");
		}
		if(showEntriesDropdownStatus.equals(true) && searchBoxStatus.equals(true)
				&& currentClientsTableStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsCreateNewClientPane() throws Exception
	{
		Boolean status = null;
		Boolean clientNameEditboxStatus = null;
		Boolean clientIdEditboxStatus = null;
		Boolean defaultProviderDropdownStatus = null;
		Boolean manageProvidersBtnStatus = null;		
		Boolean showOrderingProviderCheckboxStatus = null;
		Boolean guardianConsentCheckboxStatus = null;
		Boolean insuranceCardPhotoReqCheckboxStatus = null;
		Boolean insuranceDriverIdReqCheckboxStatus = null;
		Boolean sendResultNotificationProviderCheckboxStatus = null;
		Boolean sendOrderConfirmationEmailsCheckboxStatus = null;
		Boolean displayInsuranceCardImagesCheckboxStatus = null;
		Boolean submitBtnStatus = null;		
		if(clientNameEditbox().isDisplayed() && clientNameEditbox().isEnabled())
		{
			clientNameEditboxStatus = true;
		}
		else
		{
			clientNameEditboxStatus = false;
			logger.error("Error : Client Name Editbox not displayed or not enabled.");
		}
		if(clientIdEditbox().isDisplayed() && clientIdEditbox().isEnabled())
		{
			clientIdEditboxStatus = true;
		}
		else
		{
			clientIdEditboxStatus = false;
			logger.error("Error : Client Id Editbox not displayed or not enabled.");
		}
		if(defaultProviderDropdown().isDisplayed() && defaultProviderDropdown().isEnabled())
		{
			defaultProviderDropdownStatus = true;
		}
		else
		{
			defaultProviderDropdownStatus = false;
			logger.error("Error : Default provider dropdown not displayed or not enabled.");
		}
		if(manageProvidersBtn().isDisplayed() && manageProvidersBtn().isEnabled())
		{
			manageProvidersBtnStatus = true;
		}
		else
		{
			manageProvidersBtnStatus = false;
			logger.error("Error : Manage providers btn not displayed or not enabled.");
		}
		if(showOrderingProviderCheckbox().isDisplayed() && showOrderingProviderCheckbox().isEnabled())
		{
			showOrderingProviderCheckboxStatus = true;
		}
		else
		{
			showOrderingProviderCheckboxStatus = false;
			logger.error("Error : Show Ordering Provider Checkbox not displayed or not enabled.");
		}
		if(guardianConsentCheckbox().isDisplayed() && guardianConsentCheckbox().isEnabled())
		{
			guardianConsentCheckboxStatus = true;
		}
		else
		{
			guardianConsentCheckboxStatus = false;
			logger.error("Error : Enable Parent/Guardian Minor Consent Checkbox not displayed or not enabled.");
		}
		if(insuranceCardPhotoReqCheckbox().isDisplayed() && insuranceCardPhotoReqCheckbox().isEnabled())
		{
			insuranceCardPhotoReqCheckboxStatus = true;
		}
		else
		{
			insuranceCardPhotoReqCheckboxStatus = false;
			logger.error("Error : Insurance Card Image Required Checkbox not displayed or not enabled.");
		}
		if(insuranceDriverIdReqCheckbox().isDisplayed() && insuranceDriverIdReqCheckbox().isEnabled())
		{
			insuranceDriverIdReqCheckboxStatus = true;
		}
		else
		{
			insuranceDriverIdReqCheckboxStatus = false;
			logger.error("Error : Insurance or Drivers ID Required Checkbox not displayed or not enabled.");
		}
		if(sendResultNotificationProviderCheckbox().isDisplayed() && sendResultNotificationProviderCheckbox().isEnabled())
		{
			sendResultNotificationProviderCheckboxStatus = true;
		}
		else
		{
			sendResultNotificationProviderCheckboxStatus = false;
			logger.error("Error : Send Patient Result Notification To Provider Checkbox not displayed or not enabled.");
		}
		if(sendOrderConfirmationEmailsCheckbox().isDisplayed() && sendOrderConfirmationEmailsCheckbox().isEnabled())
		{
			sendOrderConfirmationEmailsCheckboxStatus = true;
		}
		else
		{
			sendOrderConfirmationEmailsCheckboxStatus = false;
			logger.error("Error : Send Order Confirmation Emails Checkbox not displayed or not enabled.");
		}
		if(displayInsuranceCardImagesCheckbox().isDisplayed() && displayInsuranceCardImagesCheckbox().isEnabled())
		{
			displayInsuranceCardImagesCheckboxStatus = true;
		}
		else
		{
			displayInsuranceCardImagesCheckboxStatus = false;
			logger.error("Error : Display Patient Insurance Card Photos on Order Requisition Checkbox not displayed or not enabled.");
		}
		if(submitBtn().isDisplayed() && submitBtn().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : Submit Btn not displayed or not enabled.");
		}
		if(clientNameEditboxStatus.equals(true) && clientIdEditboxStatus.equals(true) &&
				defaultProviderDropdownStatus.equals(true) && manageProvidersBtnStatus.equals(true) &&
				showOrderingProviderCheckboxStatus.equals(true) && guardianConsentCheckboxStatus.equals(true) &&
				insuranceCardPhotoReqCheckboxStatus.equals(true) && insuranceDriverIdReqCheckboxStatus.equals(true) &&
				sendResultNotificationProviderCheckboxStatus.equals(true) && 
				sendOrderConfirmationEmailsCheckboxStatus.equals(true) && 
				displayInsuranceCardImagesCheckboxStatus.equals(true) && submitBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public Boolean clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = null;
		//navigating from editing client to manage clients page
		navigateToPage();
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
      		logger.error("Error : options missing in show entries dropdown in current clients pane.");
      	}
		return status;
	}
	
	public void createNewClient(String clientName, String clientId) throws Exception
	{
		//create new client
		clientNameEditbox().clear();
		clientNameEditbox().sendKeys(clientName);
		clientIdEditbox().clear();
		clientIdEditbox().sendKeys(clientId);
		//click submit btn
		util.clickAfterExplicitWait(4000, "//button[@type=\"submit\"]");
		logger.info("New client created : " + clientName + "," + clientId);		
	}
	
	public void createNewClient(String clientName, String clientId, String provider) throws Exception
	{
		//create new client
		clientNameEditbox().clear();
		clientNameEditbox().sendKeys(clientName);
		clientIdEditbox().clear();
		clientIdEditbox().sendKeys(clientId);
		//select provider
		util.selectByVisibleTextFromDropdown(provider, defaultProviderDropdown());
		//click submit btn
		util.clickAfterExplicitWait(4000, "//button[@type=\"submit\"]");
		logger.info("New client created : " + clientName + "," + clientId);		
	}
	
	public void deleteClient(String clientId) throws Exception
	{
		//search client using unique client Id
		searchBox().clear();
		searchBox().sendKeys(clientId);
		//click delete btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		logger.info("Client with Client ID " + clientId + " deleted.");
	}
	
	public Boolean verifyCreateNewClient(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		//create
		createNewClient(clientName, clientId);
		//verify
		searchBox().clear();
		searchBox().sendKeys(clientId);
		String idTableEntry = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[2]")).getText();
		if(idTableEntry.equals(clientId))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to create new client.");
		}
		//cleanup
		deleteClient(clientId);
		return status;
	}
	
	public Boolean searchClient(String clientId) throws Exception
	{
		Boolean status = true;
		searchBox().clear();
		searchBox().sendKeys(clientId);
		WebElement clientTable = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody"));
		List<WebElement> clientTableRows = clientTable.findElements(By.tagName("tr"));
		int rows = clientTableRows.size();
		for(int i=1; i<=rows; i++)
		{
			String Id = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr["+i+"]/td[2]")).getText();
			if(!Id.equals(clientId))
			{
				status = false;
				break;
			}
		}
		return status;
	}
	
	public Boolean verifySearchFunctionality(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		Boolean validSearch = null;
		Boolean invalidSearch = null;
		//crate new client
		createNewClient(clientName, clientId);
		//valid string search
		if(searchClient(clientId).equals(true))
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
		deleteClient(clientId);
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
	
	public Boolean verifyDeleteClientFunctionality(String clientName, String clientId) throws Exception
	{
		Boolean status = null;	
		Boolean alertDisplayed = null;
		Boolean clickCancel = null;
		Boolean clickOk = null;
		//create new client
		createNewClient(clientName, clientId);
		//search client using unique client ID
		searchBox().clear();
		searchBox().sendKeys(clientId);
		//click delete client btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//verify alert displayed
		Alert alert = driver.switchTo().alert();
		String str_alert = alert.getText();
		String exp_alert = "Are you sure you wish to delete this client?";
		if(str_alert.equals(exp_alert))
		{
			alertDisplayed = true;
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on delete client button click");
		}
		//dismiss alert
		alert.dismiss();
		searchBox().clear();
		searchBox().sendKeys(clientId);
		Thread.sleep(2000);
		String Id = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr[1]/td[2]")).getText();
		if(Id.equals(clientId))
		{
			clickCancel = true;
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Record not retained on delete client alert dismissal.");
		}
		//click delete client btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//verify record deleted from current clients table
		searchBox().clear();
		searchBox().sendKeys(clientId);
		if(emptyRecords().equals(true))
		{
			clickOk = true;
		}
		else
		{
			clickOk = false;
			logger.error("Error : Record not deleted on accepting delete client alert.");
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
	
	public Boolean clickEditClient(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		//create new client
		createNewClient(clientName, clientId);
		//search client using unique client ID
		searchBox().clear();
		searchBox().sendKeys(clientId);
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Client\")]");
		if(util.getPageUrl().contains(util.editingClientPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Editing Client page on clicking Edit Client button.");
		}	
		//navigating from editing client to manage clients page
		navigateToPage();
		//cleanup
		deleteClient(clientId);
		return status;
	}
	
	public Boolean editClientDetails(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		//create new client
		createNewClient(clientName, clientId);
		//search client using unique client ID
		searchBox().clear();
		searchBox().sendKeys(clientId);
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Client\")]");
		//edit client name
		editClient.ec_clientNameEditBox().clear();
		String editedClientName = "Edited " + clientName;
		editClient.ec_clientNameEditBox().sendKeys(editedClientName);
		//click update btn
		util.clickAfterExplicitWait(4000, "//button[@type=\"submit\" and contains(text(), \"Update\")]");
		//verify edit
		searchBox().clear();
		searchBox().sendKeys(clientId);
		String name = driver.findElement(By.xpath("//*[@id=\"table\"]/tbody/tr/td[1]")).getText();
		if(name.equals(editedClientName))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to edit client details.");
		}		
		//cleanup
		deleteClient(clientId);
		return status;
	}
	
	public Boolean verifyPageElementsRenderedEditingClient(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		Boolean editingClientPaneStatus = null;
		Boolean providersAssignedToClientPaneStatus = null;
		Boolean assignNewProvidersToClientPaneStatus = null;
		Boolean addSubClientPaneStatus = null;
		Boolean manageTestsForThisClientPaneStatus = null;
		Boolean uploadProviderSignaturePaneStatus = null;
		Boolean clientUsersPaneStatus = null;
		//create new client
		createNewClient(clientName, clientId);
		//search client using unique client ID
		searchBox().clear();
		searchBox().sendKeys(clientId);
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Client\")]");
		//verify UI elements displayed
		if(editClient.editingClientPane().isDisplayed() && editClient.editingClientPane().isEnabled())
		{
			editingClientPaneStatus = true;
		}
		else
		{
			editingClientPaneStatus = false;
			logger.error("Error : Editing Client Pane not displayed or not enabled.");
		}
		if(editClient.providersAssignedToClientPane().isDisplayed() && editClient.providersAssignedToClientPane().isEnabled())
		{
			providersAssignedToClientPaneStatus = true;
		}
		else
		{
			providersAssignedToClientPaneStatus = false;
			logger.error("Error : Providers Assigned to Client Pane not displayed or not enabled.");
		}
		if(editClient.assignNewProvidersToClientPane().isDisplayed() && editClient.assignNewProvidersToClientPane().isEnabled())
		{
			assignNewProvidersToClientPaneStatus = true;
		}
		else
		{
			assignNewProvidersToClientPaneStatus = false;
			logger.error("Error : Assign New Providers to Client Pane not displayed or not enabled.");
		}		
		if(editClient.addSubClientPane().isDisplayed() && editClient.addSubClientPane().isEnabled())
		{
			addSubClientPaneStatus = true;
		}
		else
		{
			addSubClientPaneStatus = false;
			logger.error("Error : Add SubClient Pane not displayed or not enabled.");
		}
		if(editClient.manageTestsForThisClientPane().isDisplayed() && editClient.manageTestsForThisClientPane().isEnabled())
		{
			manageTestsForThisClientPaneStatus = true;
		}
		else
		{
			manageTestsForThisClientPaneStatus = false;
			logger.error("Error : Manage Tests For This Client Pane not displayed or not enabled.");
		}		
		if(editClient.uploadProviderSignaturePane().isDisplayed() && editClient.uploadProviderSignaturePane().isEnabled())
		{
			uploadProviderSignaturePaneStatus = true;
		}
		else
		{
			uploadProviderSignaturePaneStatus = false;
			logger.error("Error : Upload Provider Signature Pane not displayed or not enabled.");
		}
		if(editClient.clientUsersPane().isDisplayed() && editClient.clientUsersPane().isEnabled())
		{
			clientUsersPaneStatus = true;
		}
		else
		{
			clientUsersPaneStatus = false;
			logger.error("Error : Client Users Pane not displayed or not enabled.");
		}
		if(editingClientPaneStatus.equals(true) && providersAssignedToClientPaneStatus.equals(true)
				&& assignNewProvidersToClientPaneStatus.equals(true) && addSubClientPaneStatus.equals(true)
				&& manageTestsForThisClientPaneStatus.equals(true) && uploadProviderSignaturePaneStatus.equals(true)
				&& clientUsersPaneStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		//cleanup
		navigateToPage();
		deleteClient(clientId);
		return status;
	}
	
	public Boolean verifyUIElementsEditingClientPane(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		Boolean clientNameEditBoxStatus = null;
		Boolean clientNumberEditBoxStatus = null;
		Boolean defaultProviderDropdownStatus = null;
		Boolean defaultTestDropdownStatus = null;
		Boolean defaultSpecimenSourceDropdownStatus = null;
		Boolean resultNotificationsCheckboxStatus = null;
		Boolean emailAddressBoxStatus = null;
		Boolean notificationFreqDropdownStatus = null;
		Boolean orderingProviderCheckboxStatus = null;
		Boolean displayInsuranceImageCheckboxStatus = null;
		Boolean insuranceCardImageReqdCheckboxStatus = null;
		Boolean insuranceOrDLReqdCheckboxStatus = null;
		Boolean sendResultToProviderCheckboxStatus = null;
		Boolean sendOrderConfirmationCheckboxStatus = null;
		Boolean enableConsentCheckboxStatus = null;
		Boolean brandedReportCheckboxStatus = null;
		Boolean clientPhoneEditboxStatus = null;
		Boolean clientEmailEditboxStatus = null;
		Boolean clientLogoboxStatus = null;
		Boolean updateBtnStatus = null;
		//create new client
		createNewClient(clientName, clientId);
		//search client using unique client ID
		searchBox().clear();
		searchBox().sendKeys(clientId);
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Client\")]");
		//verify UI elements displayed
		if(editClient.ec_clientNameEditBox().isDisplayed() && editClient.ec_clientNameEditBox().isEnabled())
		{
			clientNameEditBoxStatus = true;
		}
		else
		{
			clientNameEditBoxStatus = false;
			logger.error("Error : Client Name edit box not displayed or not enabled.");
		}
		if(editClient.ec_clientNumberEditBox().isDisplayed() && editClient.ec_clientNumberEditBox().isEnabled())
		{
			clientNumberEditBoxStatus = true;
		}
		else
		{
			clientNumberEditBoxStatus = false;
			logger.error("Error : Client Number edit box not displayed or not enabled.");
		}
		if(editClient.ec_defaultProviderDropdown().isDisplayed() && editClient.ec_defaultProviderDropdown().isEnabled())
		{
			defaultProviderDropdownStatus = true;
		}
		else
		{
			defaultProviderDropdownStatus = false;
			logger.error("Error : Default/Primary Provider dropdown not displayed or not enabled.");
		}
		if(editClient.ec_defaultTestDropdown().isDisplayed() && editClient.ec_defaultTestDropdown().isEnabled())
		{
			defaultTestDropdownStatus = true;
		}
		else
		{
			defaultTestDropdownStatus = false;
			logger.error("Error : Default Test dropdown not displayed or not enabled.");
		}
		if(editClient.ec_defaultSpecimenSourceDropdown().isDisplayed() && editClient.ec_defaultSpecimenSourceDropdown().isEnabled())
		{
			defaultSpecimenSourceDropdownStatus = true;
		}
		else
		{
			defaultSpecimenSourceDropdownStatus = false;
			logger.error("Error : Default Specimen Source dropdown not displayed or not enabled.");
		}
		if(editClient.ec_resultNotificationsCheckbox().isDisplayed() && editClient.ec_resultNotificationsCheckbox().isEnabled())
		{
			resultNotificationsCheckboxStatus = true;
		}
		else
		{
			resultNotificationsCheckboxStatus = false;
			logger.error("Error : Result Notifications checkbox not displayed or not enabled.");
		}
		if(editClient.ec_emailAddressBox().isDisplayed() && editClient.ec_emailAddressBox().isEnabled())
		{
			emailAddressBoxStatus = true;
		}
		else
		{
			emailAddressBoxStatus = false;
			logger.error("Error : Email Address edit box not displayed or not enabled.");
		}
		if(editClient.ec_notificationFreqDropdown().isDisplayed() && editClient.ec_notificationFreqDropdown().isEnabled())
		{
			notificationFreqDropdownStatus = true;
		}
		else
		{
			notificationFreqDropdownStatus = false;
			logger.error("Error : Notification frequency dropdown not displayed or not enabled.");
		}
		if(editClient.ec_orderingProviderCheckbox().isDisplayed() && editClient.ec_orderingProviderCheckbox().isEnabled())
		{
			orderingProviderCheckboxStatus = true;
		}
		else
		{
			orderingProviderCheckboxStatus = false;
			logger.error("Error : Include Ordering Provider checkbox not displayed or not enabled.");
		}
		if(editClient.ec_displayInsuranceImageCheckbox().isDisplayed() && editClient.ec_displayInsuranceImageCheckbox().isEnabled())
		{
			displayInsuranceImageCheckboxStatus = true;
		}
		else
		{
			displayInsuranceImageCheckboxStatus = false;
			logger.error("Error : Display Patient Insurance Card Photos on Order Requisition checkbox not displayed or not enabled.");
		}
		if(editClient.ec_insuranceCardImageReqdCheckbox().isDisplayed() && editClient.ec_insuranceCardImageReqdCheckbox().isEnabled())
		{
			insuranceCardImageReqdCheckboxStatus = true;
		}
		else
		{
			insuranceCardImageReqdCheckboxStatus = false;
			logger.error("Error : Insurance Card Image Required checkbox not displayed or not enabled.");
		}
		if(editClient.ec_insuranceOrDLReqdCheckbox().isDisplayed() && editClient.ec_insuranceOrDLReqdCheckbox().isEnabled())
		{
			insuranceOrDLReqdCheckboxStatus = true;
		}
		else
		{
			insuranceOrDLReqdCheckboxStatus = false;
			logger.error("Error : Insurance or Drivers ID Required checkbox not displayed or not enabled.");
		}
		if(editClient.ec_sendResultToProviderCheckbox().isDisplayed() && editClient.ec_sendResultToProviderCheckbox().isEnabled())
		{
			sendResultToProviderCheckboxStatus = true;
		}
		else
		{
			sendResultToProviderCheckboxStatus = false;
			logger.error("Error : Send Patient Result Notification To Provider checkbox not displayed or not enabled.");
		}
		if(editClient.ec_sendOrderConfirmationCheckbox().isDisplayed() && editClient.ec_sendOrderConfirmationCheckbox().isEnabled())
		{
			sendOrderConfirmationCheckboxStatus = true;
		}
		else
		{
			sendOrderConfirmationCheckboxStatus = false;
			logger.error("Error : Send Order Confirmation Emails checkbox not displayed or not enabled.");
		}
		if(editClient.ec_enableConsentCheckbox().isDisplayed() && editClient.ec_enableConsentCheckbox().isEnabled())
		{
			enableConsentCheckboxStatus = true;
		}
		else
		{
			enableConsentCheckboxStatus = false;
			logger.error("Error : Enable Parent/Guardian Minor Consent checkbox not displayed or not enabled.");
		}
		if(editClient.ec_brandedReportCheckbox().isDisplayed() && editClient.ec_brandedReportCheckbox().isEnabled())
		{
			brandedReportCheckboxStatus = true;
		}
		else
		{
			brandedReportCheckboxStatus = false;
			logger.error("Error : Brand Result Report/PDF with Client Info checkbox not displayed or not enabled.");
		}
		if(editClient.ec_clientPhoneEditbox().isDisplayed() && editClient.ec_clientPhoneEditbox().isEnabled())
		{
			clientPhoneEditboxStatus = true;
		}
		else
		{
			clientPhoneEditboxStatus = false;
			logger.error("Error : Client Phone Number editbox not displayed or not enabled.");
		}
		if(editClient.ec_clientEmailEditbox().isDisplayed() && editClient.ec_clientEmailEditbox().isEnabled())
		{
			clientEmailEditboxStatus = true;
		}
		else
		{
			clientEmailEditboxStatus = false;
			logger.error("Error : Client Email editbox not displayed or not enabled.");
		}
		if(editClient.ec_clientLogobox().isDisplayed() && editClient.ec_clientLogobox().isEnabled())
		{
			clientLogoboxStatus = true;
		}
		else
		{
			clientLogoboxStatus = false;
			logger.error("Error : Client Logo box not displayed or not enabled.");
		}
		if(editClient.updateBtn().isDisplayed() && editClient.updateBtn().isEnabled())
		{
			updateBtnStatus = true;
		}
		else
		{
			updateBtnStatus = false;
			logger.error("Error : Update btn not displayed or not enabled.");
		}
		if(clientNameEditBoxStatus.equals(true) && clientNumberEditBoxStatus.equals(true)
				&& defaultProviderDropdownStatus.equals(true) && defaultTestDropdownStatus.equals(true)
				&& defaultSpecimenSourceDropdownStatus.equals(true) && resultNotificationsCheckboxStatus.equals(true)
				&& emailAddressBoxStatus.equals(true) && notificationFreqDropdownStatus.equals(true)
				&& orderingProviderCheckboxStatus.equals(true) && displayInsuranceImageCheckboxStatus.equals(true)
				&& insuranceCardImageReqdCheckboxStatus.equals(true) && insuranceOrDLReqdCheckboxStatus.equals(true)
				&& sendResultToProviderCheckboxStatus.equals(true) && sendOrderConfirmationCheckboxStatus.equals(true)
				&& enableConsentCheckboxStatus.equals(true) && brandedReportCheckboxStatus.equals(true)
				&& clientPhoneEditboxStatus.equals(true) && clientEmailEditboxStatus.equals(true)
				&& clientLogoboxStatus.equals(true) && updateBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		//cleanup
		navigateToPage();
		deleteClient(clientId);
		return status;
	}
	
	public Boolean verifyUIElementsAddSubClientClientPane(String clientName, String clientId) throws Exception
	{
		Boolean status = null;
		Boolean clientNameEditBoxStatus = null;
		Boolean clientIdEditBoxStatus = null;
		Boolean providerIDDropdownStatus = null;
		Boolean addBtnStatus = null;
		//create new client
		createNewClient(clientName, clientId);
		//search client using unique client ID
		searchBox().clear();
		searchBox().sendKeys(clientId);
		util.clickAfterExplicitWait(4000, "//*[contains(text(),\"Edit Client\")]");
		//verify UI elements displayed
		if(editClient.asc_clientNameEditBox().isDisplayed() && editClient.asc_clientNameEditBox().isEnabled())
		{
			clientNameEditBoxStatus = true;
		}
		else
		{
			clientNameEditBoxStatus = false;
			logger.error("Error : Client Name edit box not displayed or not enabled.");
		}
		if(editClient.asc_clientIdEditBox().isDisplayed() && editClient.asc_clientIdEditBox().isEnabled())
		{
			clientIdEditBoxStatus = true;
		}
		else
		{
			clientIdEditBoxStatus = false;
			logger.error("Error : Client ID edit box not displayed or not enabled.");
		}		
		if(editClient.asc_providerIdDropdown().isDisplayed() && editClient.asc_providerIdDropdown().isEnabled())
		{
			providerIDDropdownStatus = true;
		}
		else
		{
			providerIDDropdownStatus = false;
			logger.error("Error : Provider ID dropdown not displayed or not enabled.");
		}
		if(editClient.asc_addBtn().isDisplayed() && editClient.asc_addBtn().isEnabled())
		{
			addBtnStatus = true;
		}
		else
		{
			addBtnStatus = false;
			logger.error("Error : Add button not displayed or not enabled.");
		}		
		if(clientNameEditBoxStatus.equals(true) && clientIdEditBoxStatus.equals(true)
				&& providerIDDropdownStatus.equals(true) && addBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		//cleanup
		navigateToPage();
		deleteClient(clientId);
		return status;
	}
}
