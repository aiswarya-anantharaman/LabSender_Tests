package com.ls.java.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class PreRegistrationPage extends TestBase{

	WebElement element;
	TestUtil util = new TestUtil();
	LabDashboardPage labDashboard = new LabDashboardPage();
	ManageClientsPage manageClient = new ManageClientsPage();

	private static final Logger logger = LogManager.getLogger(PreRegistrationPage.class);

	public PreRegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Pre-Registration Page elements
	public WebElement PreRegPagesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), 'Pre-Registration Pages')]"));					
		} catch (Exception e) {			
			logger.error("Error : Pre-Registration Pages pane not found in Pre-Registration Page.");
		}
		return element;	
	}

	public WebElement NewPreRegPagePane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), 'New Pre-Registration Page')]"));					
		} catch (Exception e) {			
			logger.error("Error : New Pre-Registration Page pane not found in Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement preRegPageAlert() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[@id='content']//div[contains(@class, 'alert')]"));					
		} catch (Exception e) {			
			logger.error("Error : Alert not found on Pre-Registration Page.");
		}
		return element;	
	}
		
	public String deletedAlert = "Pre-Registration page deleted!";
	public String addedAlert = "New Pre-Registration page added!";
	public String updatedAlert = "Pre-Registration page updated!";
	public String duplicateMnemonicError = "Sorry, this client name is already in use! Please pick a different name.";
		
	//Pre Reg Pages Pane elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name='table_length']"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in Pre-Registration Pages pane.");
		}
		return element;	
	}	

	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in Pre-Registration Pages pane.");
		}
		return element;	
	}

	public WebElement preRegPagesTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//table[@id='table']"));					
		} catch (Exception e) {			
			logger.error("Error : Pre Reg Pages table not found in Pre-Registration Pages pane.");
		}
		return element;	
	}

	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//ul[@class='pagination']"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for Pre-Registration Pages table not found in Pre-Registration Pages pane.");
		}
		return element;	
	}
	
	//New Pre-Registration Page Pane elements
	public WebElement clientMnemonicField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='client']"));					
		} catch (Exception e) {			
			logger.error("Error : Client Mnemonic field not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement logoField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='file']"));					
		} catch (Exception e) {			
			logger.error("Error : Logo field not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement clientDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='client_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Client dropdown not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement locationDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='location_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Location dropdown not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement includeOrderFormCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='has_order_form']"));					
		} catch (Exception e) {			
			logger.error("Error : Include Order Form checkbox not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement includeInsuranceFormCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='show_insurance_section']"));					
		} catch (Exception e) {			
			logger.error("Error : Include Insurance Form checkbox not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement submitBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Submit button not found in New Pre-Registration Page pane.");
		}
		return element;	
	}
	
	public WebElement emptyTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@class='dataTables_empty']"));					
		} catch (Exception e) {			
			logger.error("Error : Pre-Registration Pages table is not empty.");
		}
		return element;	
	}
	
	//Editing Pre-Registration Page elements
	public WebElement editPreRegPageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), 'Editing Pre-Registration Page')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page - Editing Pre-Registration Page not found.");
		}
		return element;	
	}
	
	public WebElement backToManagePagesBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(), 'Back to Manage Pages')]"));					
		} catch (Exception e) {			
			logger.error("Error : Back To Manage Pages button not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement currentLogoField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//td/img"));					
		} catch (Exception e) {			
			logger.error("Error : Current logo field not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement newLogoField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='file']"));					
		} catch (Exception e) {			
			logger.error("Error : New logo field not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement topCustomContentField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//iframe[@id='tinymce_instance_ifr']"));					
		} catch (Exception e) {			
			logger.error("Error : Top custom content field not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement bottomCustomContentField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//iframe[@id='tinymce_instance2_ifr']"));					
		} catch (Exception e) {			
			logger.error("Error : Bottom custom content field not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement requireInsuranceField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='require_insurance']"));					
		} catch (Exception e) {			
			logger.error("Error : Require Insurance on page checkbox not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public WebElement updateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Update button not found on Editing Pre-Registration Page.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.preRegPagesBtnSideNav().click();
		logger.info("Navigating to Pre-Registration page.");
	}
	
	public Boolean verifyPageUrl() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		if(util.getPageUrl().contains(util.PreRegPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page URL: " + util.getPageUrl());
			logger.error("Error : Unable to verify Pre-Registration page URL.");
		}
		return status;
	}
	
	public Boolean pageElementsRenderedPreRegPage() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		Boolean preRegPagesPaneStatus = null;
		Boolean newPreRegPagePaneStatus = null;
		if(PreRegPagesPane().isDisplayed() && PreRegPagesPane().isEnabled())
		{
			preRegPagesPaneStatus = true;
		}
		else
		{
			preRegPagesPaneStatus = false;
			logger.error("Error : Pre-Registration Pages pane not displayed or not enabled.");
		}
		if(NewPreRegPagePane().isDisplayed() && NewPreRegPagePane().isEnabled())
		{
			newPreRegPagePaneStatus = true;
		}
		else
		{
			newPreRegPagePaneStatus = false;
			logger.error("Error : New Pre-Registration Page pane not displayed or not enabled.");
		}
		if(preRegPagesPaneStatus.equals(true) && newPreRegPagePaneStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsRenderedPreRegPagesPane() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchBoxStatus = null;
		Boolean preregPagesTableStatus = null;
		Boolean paginationStatus = null;
		navigateToPage();
		if(showEntriesDropdown().isDisplayed() && showEntriesDropdown().isEnabled())
		{
			showEntriesDropdownStatus = true;
		}
		else
		{
			showEntriesDropdownStatus = false;
			logger.error("Error : Show entries dropdown not displayed or not enabled.");
		}
		if(searchBox().isDisplayed() && searchBox().isEnabled())
		{
			searchBoxStatus = true;
		}
		else
		{
			searchBoxStatus = false;
			logger.error("Error : Search box not displayed or not enabled.");
		}
		if(preRegPagesTable().isDisplayed() && preRegPagesTable().isEnabled())
		{
			preregPagesTableStatus = true;
		}
		else
		{
			preregPagesTableStatus = false;
			logger.error("Error : Pre Reg Pages table not displayed or not enabled.");
		}
		if(pagination().isDisplayed() && pagination().isEnabled())
		{
			paginationStatus = true;
		}
		else
		{
			paginationStatus = false;
			logger.error("Error : Pagination not displayed or not enabled.");
		}
		if(showEntriesDropdownStatus.equals(true) && searchBoxStatus.equals(true)
				&& preregPagesTableStatus.equals(true)&& paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsRenderedNewPreRegPagePane() throws Exception
	{
		Boolean status = null;
		Boolean clientMnemonicFieldStatus = null;
		Boolean logoFieldStatus = null;
		Boolean clientDropdownStatus = null;
		Boolean locationDropdownStatus = null;
		Boolean includeOrderFormCheckboxStatus = null;
		Boolean includeInsuranceFormCheckboxStatus = null;
		Boolean submitBtnStatus = null;
		navigateToPage();
		if(clientMnemonicField().isDisplayed() && clientMnemonicField().isEnabled())
		{
			clientMnemonicFieldStatus = true;
		}
		else
		{
			clientMnemonicFieldStatus = false;
			logger.error("Error : Client Mnemonic field not displayed or not enabled.");
		}
		if(logoField().isDisplayed() && logoField().isEnabled())
		{
			logoFieldStatus = true;
		}
		else
		{
			logoFieldStatus = false;
			logger.error("Error : Logo field not displayed or not enabled.");
		}
		if(clientDropdown().isDisplayed() && clientDropdown().isEnabled())
		{
			clientDropdownStatus = true;
		}
		else
		{
			clientDropdownStatus = false;
			logger.error("Error : Client dropdown not displayed or not enabled.");
		}
		if(locationDropdown().isDisplayed() && locationDropdown().isEnabled())
		{
			locationDropdownStatus = true;
		}
		else
		{
			locationDropdownStatus = false;
			logger.error("Error : Location dropdown not displayed or not enabled.");
		}
		if(includeOrderFormCheckbox().isDisplayed() && includeOrderFormCheckbox().isEnabled())
		{
			includeOrderFormCheckboxStatus = true;
		}
		else
		{
			includeOrderFormCheckboxStatus = false;
			logger.error("Error : Include Order Form checkbox not displayed or not enabled.");
		}
		if(includeInsuranceFormCheckbox().isDisplayed() && includeInsuranceFormCheckbox().isEnabled())
		{
			includeInsuranceFormCheckboxStatus = true;
		}
		else
		{
			includeInsuranceFormCheckboxStatus = false;
			logger.error("Error : Include Insurance Form checkbox not displayed or not enabled.");
		}
		if(submitBtn().isDisplayed() && submitBtn().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : Submit button not displayed or not enabled.");
		}
		if(clientMnemonicFieldStatus.equals(true) && logoFieldStatus.equals(true)
				&& clientDropdownStatus.equals(true)&& locationDropdownStatus.equals(true)
				&& includeOrderFormCheckboxStatus.equals(true)&& includeInsuranceFormCheckboxStatus.equals(true)
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
	
	public Boolean verifyShowEntriesDropdownOptions() throws Exception
	{
		Boolean status = null;
		navigateToPage();
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
			logger.error("Error : options missing in show entries dropdown in pre-registration pages pane.");
		}
		return status;
	}
	
	public void createnewPreRegPage(String preRegPage, String clientName) throws Exception
	{
		clientMnemonicField().sendKeys(preRegPage);
		util.sleep(1000);
		logoField().sendKeys(util.clientLogoPath1);
		util.selectByVisibleTextFromDropdown(clientName, clientDropdown());
		util.clickAfterExplicitWait(3000, "//button[@type='submit']");
		logger.info("New pre-registration page created : " + preRegPage);
	}
	
	public Boolean verifyCreateNewPreRegPage() throws Exception
	{
		Boolean status = null;
		Boolean alertDisplayed = null;
		Boolean preRegPageAdded = null;
		//create client for pre-reg page
		manageClient.navigateToPage();
		manageClient.createNewClient("PreReg Client", "PreReg");
		//navigate to pre reg page
		navigateToPage();
		//create new pre-reg page
		createnewPreRegPage("AutoPage", "PreReg Client");
		//verify
		String alert = preRegPageAlert().getText();
		if(alert.equals(addedAlert))
		{
			alertDisplayed = true;
			logger.info("Alert displayed on adding a new pre-registration page.");
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on adding a new pre-registration page.");
		}
		if(searchPreRegPage("AutoPage").equals(true))
		{
			preRegPageAdded = true;
			logger.info("User able to add new pre-registration page.");
		}
		else
		{
			preRegPageAdded = false;
			logger.error("Error : Unable to add new pre-registration page.");
		}
		if(alertDisplayed.equals(true) && preRegPageAdded.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public Boolean searchPreRegPage(String preRegPage) throws Exception
	{
		Boolean status = null;
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys(preRegPage);
		//verify
		String pageMnemonic = driver.findElement(By.xpath("//table[@id='table']/tbody//td[1]")).getText();
		if(pageMnemonic.equals(preRegPage))
		{
			status = true;
			logger.info(preRegPage + " found on Pre-Registration Pages table.");
		}
		else
		{
			status = false;
			logger.error("Error : Unable to find " + preRegPage + " on Pre-Registration Pages table.");
		}
		return status;
	}
	
	public void deletePreRegPage(String preRegPage) throws Exception
	{
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys(preRegPage);
		WebElement deletePageBtn = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'Delete Page')]"));
		deletePageBtn.click();
		Alert deleteAlert = driver.switchTo().alert();
		deleteAlert.accept();
		logger.info(preRegPage + " deleted.");
	}
	
	public Boolean verifySearchPreRegPage() throws Exception
	{
		Boolean status = null;
		Boolean validSearch = null; 
		Boolean invalidSearch = null;
		//navigate to pre reg page
		navigateToPage();
		//search valid entry
		if(searchPreRegPage("AutoPage").equals(true))
		{
			validSearch = true;
			logger.info("Search functionality for valid search working as expected.");
		}
		else
		{
			validSearch = false;
			logger.error("Error : Search functionality for valid search not working as expected.");
		}
		//search invalid entry
		searchBox().clear();
		searchBox().sendKeys("Error");
		if(emptyTable().isDisplayed())
		{
			invalidSearch = true;
			logger.info("Search functionality for invalid search working as expected.");
		}
		else
		{
			invalidSearch = false;
			logger.error("Error : Search functionality for invalid search not working as expected.");
		}
		if(validSearch.equals(true) && invalidSearch.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public Boolean verifyCreateDuplicatePreRegPage() throws Exception
	{
		Boolean status = null;
		//navigate to pre reg page
		navigateToPage();
		//create another pre reg page with same client mnemonic
		createnewPreRegPage("AutoPage", "PreReg Client");
		if(preRegPageAlert().getText().equals(duplicateMnemonicError))
		{
			status = true;
			logger.info("Error message displayed when pre-reg page with duplicate client mnemonic is created.");
		}
		else
		{
			status = false;
			logger.error("Error : Error message not displayed when pre-reg page with duplicate client mnemonic is created.");
		}		
		return status;
	}
	
	public Boolean verifyViewPreRegPage() throws Exception
	{
		Boolean status = null;
		//navigate to pre reg page
		navigateToPage();
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		//click view pre reg page
		WebElement viewPage = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'View Registration Page')]"));
		viewPage.click();
		util.sleep(5000);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		
		String parent = it.next();
		System.out.println("parentWindow " + parent);
		String child = it.next();
		System.out.println("childWindow " + child);
		util.sleep(3000);
				
		driver.switchTo().window(child);
		util.sleep(3000);
		
		String exp_pageHeading = "Patient Pre-Registration";
		System.out.println(exp_pageHeading);
		String act_pageHeading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println(act_pageHeading);
		if(act_pageHeading.equals(exp_pageHeading))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		driver.close();
		util.sleep(3000);
		driver.switchTo().window(parent);
		util.sleep(3000);
		
		return status;
	}
	
	public Boolean verifyDeletePreRegPage() throws Exception
	{
		Boolean status = null;		
		Boolean isAlertPopupDisplayed = null;
		Boolean clickCancel = null;
		Boolean isDeletedAlertDisplayed = null;
		Boolean clickOk = null;
		//navigate to pre reg page
		navigateToPage();
		//create pre reg page
		createnewPreRegPage("AutoPage", "PreReg Client");
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		//click delete btn
		WebElement deletePageBtn = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'Delete Page')]"));
		deletePageBtn.click();
		//check if alert popup is displayed
		Alert deleteAlert = driver.switchTo().alert();
		String act_text = deleteAlert.getText();
		String exp_text = "Are you sure you wish to delete this page?";
		if(act_text.equals(exp_text))
		{
			isAlertPopupDisplayed = true;
			logger.info("Popup confirmation alert displayed on clicking delete page button.");
		}
		else
		{
			isAlertPopupDisplayed = false;
			logger.error("Error : Popup confirmation alert not displayed on clicking delete page button.");
		}
		//click cancel
		deleteAlert.dismiss();
		//verify using search pre reg page
		if(searchPreRegPage("AutoPage").equals(true))
		{
			clickCancel = true;
			logger.info("Pre-reg page retained on dismissing delete confirmation alert.");
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Pre-reg page not retained on dismissing delete confirmation alert.");
		}
		//click delete btn
		deletePageBtn.click();
		//click Ok
		deleteAlert.accept();
		util.sleep(2000);
		//verify using search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		if(emptyTable().isDisplayed())
		{
			clickOk = true;
			logger.info("Pre-reg page deleted on accepting delete confirmation alert.");
		}
		else
		{
			clickOk = false;
			logger.error("Error : Pre-reg page not deleted on accepting delete confirmation alert.");
		}
		if(preRegPageAlert().getText().equals(deletedAlert))
		{
			isDeletedAlertDisplayed = true;
			logger.info("Alert displayed on deleting pre-reg page.");
		}
		else
		{
			isDeletedAlertDisplayed = false;
			logger.error("Error : Alert not displayed on deleting pre-reg page.");
		}
		
		if(isAlertPopupDisplayed.equals(true) && clickCancel.equals(true)
				&& clickOk.equals(true) && isDeletedAlertDisplayed.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		manageClient.navigateToPage();
		manageClient.deleteClient("PreReg");
		return status;
	}
	
	public Boolean clickEditPreRegPage() throws Exception
	{
		Boolean status = null;		
		//navigate to pre reg page
		navigateToPage();
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		//click edit btn
		WebElement editPageBtn = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'Edit Page')]"));
		editPageBtn.click();
		if(editPreRegPageTitle().isDisplayed())
		{
			status = true;
			logger.info("User is navigated to Editing Pre-Registration Page on clicking Edit Page button.");
		}
		else
		{
			status = false;
			logger.error("Error : User not navigated to Editing Pre-Registration Page on clicking Edit Page button.");
		}	
		//navigate to pre reg page
		navigateToPage();
		return status;
	}
	
	public Boolean clickBackToManagePagesBtn() throws Exception
	{
		Boolean status = null;		
		//navigate to pre reg page
		navigateToPage();
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		//click edit btn
		WebElement editPageBtn = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'Edit Page')]"));
		editPageBtn.click();
		util.waitUntilElementVisible(3000, editPreRegPageTitle());
		//click back to manage pages btn
		backToManagePagesBtn().click();
		if(util.getPageUrl().contains(util.PreRegPageUrl))
		{
			status = true;
			logger.info("User is navigated to Pre-Registration Page on clicking Manage Pages button.");
		}
		else
		{
			status = false;
			logger.error("Error : User not navigated to Pre-Registration Page on clicking Manage Pages button.");
		}
		return status;
	}
	
	public Boolean pageElementsRenderedEditPreRegPage() throws Exception
	{
		Boolean status = null;		
		Boolean clientMnemonicFieldStatus = null;	
		Boolean clientDropdownStatus = null;
		Boolean locationDropdownStatus = null;
		Boolean currentLogoFieldStatus = null;
		Boolean newLogoFieldStatus = null;
		Boolean topCustomContentStatus = null;
		Boolean bottomCustomContentStatus = null;
		Boolean includeOrderFormCheckboxStatus = null;
		Boolean includeInsuranceFormCheckboxStatus = null;
		Boolean requireInsuranceOnPageStatus = null;
		Boolean updatePageBtnStatus = null;
		Boolean backToManagePagesBtnStatus = null;
		//navigate to pre reg page
		navigateToPage();
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		//click edit btn
		WebElement editPageBtn = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'Edit Page')]"));
		editPageBtn.click();
		util.waitUntilElementVisible(3000, editPreRegPageTitle());
		//verify page elements displayed
		if(clientMnemonicField().isDisplayed() && clientMnemonicField().isEnabled())
		{
			clientMnemonicFieldStatus = true;
		}
		else
		{
			clientMnemonicFieldStatus = false;
			logger.error("Error : Client Mnemonic field not displayed or not enabled.");
		}
		if(clientDropdown().isDisplayed() && clientDropdown().isEnabled())
		{
			clientDropdownStatus = true;
		}
		else
		{
			clientDropdownStatus = false;
			logger.error("Error : Client dropdown not displayed or not enabled.");
		}
		if(locationDropdown().isDisplayed() && locationDropdown().isEnabled())
		{
			locationDropdownStatus = true;
		}
		else
		{
			locationDropdownStatus = false;
			logger.error("Error : Location dropdown not displayed or not enabled.");
		}
		if(currentLogoField().isDisplayed() && currentLogoField().isEnabled())
		{
			currentLogoFieldStatus = true;
		}
		else
		{
			currentLogoFieldStatus = false;
			logger.error("Error : Current logo field not displayed or not enabled.");
		}
		if(newLogoField().isDisplayed() && newLogoField().isEnabled())
		{
			newLogoFieldStatus = true;
		}
		else
		{
			newLogoFieldStatus = false;
			logger.error("Error : New logo field not displayed or not enabled.");
		}
		if(topCustomContentField().isDisplayed() && topCustomContentField().isEnabled())
		{
			topCustomContentStatus = true;
		}
		else
		{
			topCustomContentStatus = false;
			logger.error("Error : Top custom content field not displayed or not enabled.");
		}
		if(bottomCustomContentField().isDisplayed() && bottomCustomContentField().isEnabled())
		{
			bottomCustomContentStatus = true;
		}
		else
		{
			bottomCustomContentStatus = false;
			logger.error("Error : Bottom custom content field not displayed or not enabled.");
		}
		if(includeOrderFormCheckbox().isDisplayed() && includeOrderFormCheckbox().isEnabled())
		{
			includeOrderFormCheckboxStatus = true;
		}
		else
		{
			includeOrderFormCheckboxStatus = false;
			logger.error("Error : Include Order Form checkbox not displayed or not enabled.");
		}
		if(includeInsuranceFormCheckbox().isDisplayed() && includeInsuranceFormCheckbox().isEnabled())
		{
			includeInsuranceFormCheckboxStatus = true;
		}
		else
		{
			includeInsuranceFormCheckboxStatus = false;
			logger.error("Error : Include Insurance Form checkbox not displayed or not enabled.");
		}
		if(requireInsuranceField().isDisplayed() && requireInsuranceField().isEnabled())
		{
			requireInsuranceOnPageStatus = true;
		}
		else
		{
			requireInsuranceOnPageStatus = false;
			logger.error("Error : Require Insurance on page checkbox not displayed or not enabled.");
		}
		if(updateBtn().isDisplayed() && updateBtn().isEnabled())
		{
			updatePageBtnStatus = true;
		}
		else
		{
			updatePageBtnStatus = false;
			logger.error("Error : Update button not displayed or not enabled.");
		}
		if(backToManagePagesBtn().isDisplayed() && backToManagePagesBtn().isEnabled())
		{
			backToManagePagesBtnStatus = true;
		}
		else
		{
			backToManagePagesBtnStatus = false;
			logger.error("Error : Back to Manage Pages button not displayed or not enabled.");
		}
		if(clientMnemonicFieldStatus.equals(true) && clientDropdownStatus.equals(true)&& locationDropdownStatus.equals(true)
				&& currentLogoFieldStatus.equals(true) && newLogoFieldStatus.equals(true)
				&& topCustomContentStatus.equals(true) && bottomCustomContentStatus.equals(true)
				&& includeOrderFormCheckboxStatus.equals(true)&& includeInsuranceFormCheckboxStatus.equals(true)
				&& requireInsuranceOnPageStatus.equals(true)&& updatePageBtnStatus.equals(true)
				&& backToManagePagesBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}	
		backToManagePagesBtn().click();
		return status;
	}
	
	public Boolean verifyEditPreRegPage() throws Exception
	{
		Boolean status = null;	
		Boolean editedAlert = null;	
		Boolean entryModified = null;	
		//navigate to pre reg page
		navigateToPage();
		//search pre reg page
		searchBox().clear();
		searchBox().sendKeys("AutoPage");
		//click edit btn
		WebElement editPageBtn = driver.findElement(By.xpath("//table[@id='table']/tbody//a[contains(text(), 'Edit Page')]"));
		editPageBtn.click();
		//modify client mnemonic
		clientMnemonicField().clear();
		clientMnemonicField().sendKeys("Edited AutoPage");
		util.clickAfterExplicitWait(2000, "//button[@type='submit']");
		//verify alert displayed
		if(preRegPageAlert().getText().equals(updatedAlert))
		{
			editedAlert = true;
			logger.info("Alert displayed on editing pre-registration page.");
		}
		else
		{
			editedAlert = false;
			logger.error("Error : Alert not displayed on editing pre-registration page.");
		}
		backToManagePagesBtn().click();
		//verify record updated
		if(searchPreRegPage("Edited AutoPage").equals(true))
		{
			entryModified = true;
			logger.info("Pre-registration page table entry updated.");
		}
		else
		{
			entryModified = false;
			logger.error("Error : Pre-registration page table entry not updated.");
		}
		if(editedAlert.equals(true) && entryModified.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
			
		}
		//cleanup
		deletePreRegPage("Edited AutoPage");
		return status;
	}
}
