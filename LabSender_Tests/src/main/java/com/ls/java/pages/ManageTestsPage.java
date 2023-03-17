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

public class ManageTestsPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	OrderSettingsPage orderSettings = new OrderSettingsPage();
	LabDashboardPage labDashboard = new LabDashboardPage();
	EditTestPage editTest = new EditTestPage();
	SpecimenSourceManagementPage specimenSrc = new SpecimenSourceManagementPage();

	private static final Logger logger = LogManager.getLogger(ManageTestsPage.class);

	public ManageTestsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String manageTestsPageTitle() throws Exception
	{
		String pageTitle = "Manage Tests";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Manage Tests')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}

	public WebElement testsPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Tests\")]"));
		} catch (Exception e) {			
			logger.error("Error : Tests pane not found in manage tests page.");
		}
		return element;	
	}
	
	public WebElement specimenSourceManagementPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@href='/lab/specimensource/index']"));
		} catch (Exception e) {			
			logger.error("Error : Specimen Source Management pane not found in manage tests page.");
		}
		return element;	
	}
	
	public WebElement createNewTestPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[starts-with(text(), \"Create New Test\")]"));
		} catch (Exception e) {			
			logger.error("Error : Create New Test pane not found in manage tests page.");
		}
		return element;	
	}
	
	public WebElement uploadCSVPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),\"Upload CSV\")]"));
		} catch (Exception e) {			
			logger.error("Error : Upload CSV to Create New Tests pane pane not found in manage tests page.");
		}
		return element;	
	}
	
	public WebElement returnToOrderSettingsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Return to Order Settings')]"));					
		} catch (Exception e) {			
			logger.error("Error : Return to Order Settings button not found in Manage tests page.");
		}
		return element;	
	}
	
	public WebElement panelManagementBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Panel Management')]"));					
		} catch (Exception e) {			
			logger.error("Error : Panel Management button not found in Manage tests page.");
		}
		return element;	
	}	
	
	//tests pane elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name=\"user-table_length\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in tests pane.");
		}
		return element;	
	}	
	
	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in tests pane.");
		}
		return element;	
	}
	
	public WebElement testsTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"user-table\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Tests table not found in tests pane.");
		}
		return element;	
	}
	
	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"user-table_paginate\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for tests table not found in tests pane.");
		}
		return element;	
	}
	
	//create new test pane elements
	public WebElement testNameEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='test_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Test Name editbox not found in create new test pane.");
		}
		return element;	
	}
	
	public WebElement testCodeEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='test_code']"));					
		} catch (Exception e) {			
			logger.error("Error : Test Code editbox not found in create new test pane.");
		}
		return element;	
	}
	
	public WebElement dxCodesEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='dx_codes']"));					
		} catch (Exception e) {			
			logger.error("Error : DX Codes editbox not found in create new test pane.");
		}
		return element;	
	}
	
	public WebElement createBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Create button not found in create new test pane.");
		}
		return element;	
	}
	
	//Upload CSV to Create New Tests pane elements
	public WebElement downloadCSVTemplateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[contains(text(), \"Download CSV Template\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Download CSV template button not found in Upload CSV to Create New Tests pane.");
		}
		return element;	
	}
	
	public WebElement chooseFileBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name=\"new_tests_upload_csv\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Choose File button not found in Upload CSV to Create New Tests pane.");
		}
		return element;	
	}
	
	public WebElement uploadBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value=\"Upload\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Upload button not found in Upload CSV to Create New Tests pane.");
		}
		return element;	
	}	
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.orderSettingsSideNav().click();
		orderSettings.testsCard().click();
		logger.info("Navigating to Manage Tests page.");
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(manageTestsPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.info("Error : Unable to verify manage tests page title.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean testsPaneStatus = null;
		Boolean SpecimenSrcMgmtPaneStatus = null;
		Boolean createNewTestPaneStatus = null;
		Boolean uploadCSVPaneStatus = null;
		Boolean returnToOSBtnStatus = null;
		Boolean panelMgmtBtnStatus = null;
		if(testsPane().isDisplayed() && testsPane().isEnabled())
		{
			testsPaneStatus = true;
		}
		else
		{
			testsPaneStatus = false;
			logger.error("Error : Tests pane not displayed or not enabled.");
		}
		if(specimenSourceManagementPane().isDisplayed() && specimenSourceManagementPane().isEnabled())
		{
			SpecimenSrcMgmtPaneStatus = true;
		}
		else
		{
			SpecimenSrcMgmtPaneStatus = false;
			logger.error("Error : Specimen Source Management pane not displayed or not enabled.");
		}
		if(createNewTestPane().isDisplayed() && createNewTestPane().isEnabled())
		{
			createNewTestPaneStatus = true;
		}
		else
		{
			createNewTestPaneStatus = false;
			logger.error("Error : Create new test pane not displayed or not enabled.");
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
		if(panelManagementBtn().isDisplayed() && panelManagementBtn().isEnabled())
		{
			panelMgmtBtnStatus = true;
		}
		else
		{
			panelMgmtBtnStatus = false;
			logger.error("Error : panel management button not displayed or not enabled.");
		}
		if(testsPaneStatus.equals(true) && SpecimenSrcMgmtPaneStatus.equals(true)
				&& createNewTestPaneStatus.equals(true) && uploadCSVPaneStatus.equals(true)
				&& returnToOSBtnStatus.equals(true) && panelMgmtBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsTestsPane() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchboxStatus = null;
		Boolean testsTableStatus = null;
		Boolean paginationStatus = null;
		if(showEntriesDropdown().isDisplayed() && showEntriesDropdown().isEnabled())
		{
			showEntriesDropdownStatus = true;
		}
		else
		{
			showEntriesDropdownStatus = false;
			logger.error("Error : Show Entries Dropdown not displayed or not enabled.");
		}
		if(searchBox().isDisplayed() && searchBox().isEnabled())
		{
			searchboxStatus = true;
		}
		else
		{
			searchboxStatus = false;
			logger.error("Error : Searchbox not displayed or not enabled.");
		}
		if(testsTable().isDisplayed() && testsTable().isEnabled())
		{
			testsTableStatus = true;
		}
		else
		{
			testsTableStatus = false;
			logger.error("Error : Tests table not displayed or not enabled.");
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
		if(showEntriesDropdownStatus.equals(true) && searchboxStatus.equals(true)
				&& testsTableStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		

		return status;
	}
	
	public Boolean verifyUIElementsCreateNewTestPane() throws Exception
	{
		Boolean status = null;
		Boolean testNameEditboxStatus = null;
		Boolean testCodeEditboxStatus = null;
		Boolean dxCodeEditboxStatus = null;
		Boolean createBtnStatus = null;
		if(testNameEditbox().isDisplayed() && testNameEditbox().isEnabled())
		{
			testNameEditboxStatus = true;
		}
		else
		{
			testNameEditboxStatus = false;
			logger.error("Error : Test name editbox not displayed or not enabled.");
		}
		if(testCodeEditbox().isDisplayed() && testCodeEditbox().isEnabled())
		{
			testCodeEditboxStatus = true;
		}
		else
		{
			testCodeEditboxStatus = false;
			logger.error("Error : Test code editbox not displayed or not enabled.");
		}
		if(dxCodesEditbox().isDisplayed() && dxCodesEditbox().isEnabled())
		{
			dxCodeEditboxStatus = true;
		}
		else
		{
			dxCodeEditboxStatus = false;
			logger.error("Error : DX codes editbox not displayed or not enabled.");
		}
		if(createBtn().isDisplayed() && createBtn().isEnabled())
		{
			createBtnStatus = true;
		}
		else
		{
			createBtnStatus = false;
			logger.error("Error : Create button not displayed or not enabled.");
		}		
		if(testNameEditboxStatus.equals(true) && testCodeEditboxStatus.equals(true)
				&& dxCodeEditboxStatus.equals(true) && createBtnStatus.equals(true))
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
      		logger.error("Error : options missing in show entries dropdown in tests pane.");
      	}
		return status;
	}
	
	public Boolean clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = null;
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
	
	public Boolean clickPanelManagementBtn() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		panelManagementBtn().click();
		if(util.getPageUrl().contains("lab/panels"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Manage Panels page on clicking Panel Management button.");
		}
		return status;
	}
	
	public void createTest(String testname, String testcode, String dxcode) throws Exception
	{
		//enter details for new test
		testNameEditbox().clear();
		testNameEditbox().sendKeys(testname);
		testCodeEditbox().clear();
		testCodeEditbox().sendKeys(testcode);
		dxCodesEditbox().clear();
		dxCodesEditbox().sendKeys(dxcode);
		//click create btn
		util.clickAfterExplicitWait(4000, "//button[@type='submit']");
	}
	
	public Boolean verifyCreateNewTest(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create test
		createTest(testname, testcode, dxcode);
		//verify new test added
		searchBox().clear();
		searchBox().sendKeys(testcode);
		String testTableEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr/td[2]")).getText();
		if(testTableEntry.equals(testcode))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to create new test.");
		}		
		//cleanup
		deleteTest(testcode);
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
	
	public void deleteTest(String testcode) throws Exception
	{
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click delete btn
		util.clickAfterExplicitWait(4000, "//i[contains(@class, 'trash')]");
		//accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		logger.info("Test with test code " + testcode + " deleted.");
	}
	
	public Boolean verifyDeleteTest(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean alertDisplayed = null;
		Boolean clickCancel = null;
		Boolean clickOk = null;
		//create test
		createTest(testname, testcode, dxcode);
		//search test using test code
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click delete test btn
		util.clickAfterExplicitWait(4000, "//i[contains(@class,'trash')]");
		//verify alert displayed
		Alert alert = driver.switchTo().alert();
		String str_alert = alert.getText();
		String exp_alert = "Are you sure you wish to delete this Test?";
		if(str_alert.equals(exp_alert))
		{
			alertDisplayed = true;
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on clicking delete icon against test.");
		}
		//dismiss alert
		alert.dismiss();
		//verify record retained on tests table
		searchBox().clear();
		searchBox().sendKeys(testcode);
		Thread.sleep(2000);
		String testCodeEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr/td[2]")).getText();
		if(testCodeEntry.equals(testcode))
		{
			clickCancel = true;
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Record not retained on delete test alert dismissal.");
		}
		//click delete test btn
		util.clickAfterExplicitWait(4000, "//a[contains(@href,\"/delete\")]");
		//accept alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//verify record deleted from tests table
		searchBox().clear();
		searchBox().sendKeys(testcode);
		if(emptyRecords().equals(true))
		{
			clickOk = true;
		}
		else
		{
			clickOk = false;
			logger.error("Error : Record not deleted on accepting delete test alert.");
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
	
	public Boolean searchTest(String testcode) throws Exception
	{
		Boolean status = true;
		searchBox().clear();
		searchBox().sendKeys(testcode);
		WebElement testsTable = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody"));
		List<WebElement> testsTableRows = testsTable.findElements(By.tagName("tr"));
		int rows = testsTableRows.size();
		for(int i=1; i<=rows; i++)
		{
			String testEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody//tr["+i+"]/td[2]")).getText();
			if(!testEntry.equals(testcode))
			{
				status = false;
				break;
			}
		}
		return status;
	}
	
	public Boolean verifySearchFunctionality(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean validSearch = true;
		Boolean invalidSearch = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//valid string search
		if(searchTest(testcode).equals(true))
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
		deleteTest(testcode);
		return status;
	}
	
	public Boolean clickEditBtn(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click edit btn
		driver.findElement(By.xpath("//i[contains(@class,'pencil')]")).click();
		if(util.getPageUrl().contains(util.editTestPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//navigate back to manage tests page
		navigateToPage();
		//cleanup
		deleteTest(testcode);
		return status;
	}

	public Boolean verifyPageElementsRenderedEditTest(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean testNameEditboxStatus = null;
		Boolean testCodeEditboxStatus = null;
		Boolean dxCodeEditboxStatus = null;
		Boolean allowManualResultsCheckboxStatus = null;
		Boolean defaultPriceFieldStatus = null;
		Boolean submitBtnStatus = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click edit btn
		driver.findElement(By.xpath("//i[contains(@class,'pencil')]")).click();
		//verify UI elements displayed
		if(editTest.testNameEditbox().isDisplayed() && editTest.testNameEditbox().isEnabled())
		{
			testNameEditboxStatus = true;
		}
		else
		{
			testNameEditboxStatus = false;
			logger.error("Error : Test name edit box not displayed or not enabled.");
		}
		if(editTest.testCodeEditbox().isDisplayed() && editTest.testCodeEditbox().isEnabled())
		{
			testCodeEditboxStatus = true;
		}
		else
		{
			testCodeEditboxStatus = false;
			logger.error("Error : Test code edit box not displayed or not enabled.");
		}
		if(editTest.dxCodeEditbox().isDisplayed() && editTest.dxCodeEditbox().isEnabled())
		{
			dxCodeEditboxStatus = true;
		}
		else
		{
			dxCodeEditboxStatus = false;
			logger.error("Error : DX Codes edit box not displayed or not enabled.");
		}
		if(editTest.allowManualResultsCheckbox().isDisplayed() && editTest.allowManualResultsCheckbox().isEnabled())
		{
			allowManualResultsCheckboxStatus = true;
		}
		else
		{
			allowManualResultsCheckboxStatus = false;
			logger.error("Error : Allow Manual Results checkbox not displayed or not enabled.");
		}
		if(editTest.defaultPriceField().isDisplayed() && editTest.defaultPriceField().isEnabled())
		{
			defaultPriceFieldStatus = true;
		}
		else
		{
			defaultPriceFieldStatus = false;
			logger.error("Error : Default Price field not displayed or not enabled.");
		}
		if(editTest.submitBtn().isDisplayed() && editTest.submitBtn().isEnabled())
		{
			submitBtnStatus = true;
		}
		else
		{
			submitBtnStatus = false;
			logger.error("Error : Submit button not displayed or not enabled.");
		}
		if(testNameEditboxStatus.equals(true) && testCodeEditboxStatus.equals(true)
				&& dxCodeEditboxStatus.equals(true) && allowManualResultsCheckboxStatus.equals(true)
				&& defaultPriceFieldStatus.equals(true) && submitBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}	
		//navigate to manage tests page
		navigateToPage();
		//cleanup
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyEditTest(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click edit btn
		driver.findElement(By.xpath("//i[contains(@class,'pencil')]")).click();
		//edit test
		String newTestName = "Edited " + testname;
		editTest.testNameEditbox().clear();
		editTest.testNameEditbox().sendKeys(newTestName);
		//enter default price
		editTest.defaultPriceField().clear();
		editTest.defaultPriceField().sendKeys("1000");
		//click Submit btn
		util.clickAfterExplicitWait(4000, "//button[@type='submit']");
		//verify changes updated
		searchBox().clear();
		searchBox().sendKeys(testcode);
		String testNameEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr/td[1]")).getText();
		if(testNameEntry.equals(newTestName))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to edit test.");
		}	
		//cleanup
		deleteTest(testcode);
		return status;
	}
		
	public Boolean verifyTestWithoutDefaultPriceError(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click edit btn
		driver.findElement(By.xpath("//i[contains(@class,'pencil')]")).click();
		//edit test
		String newTestName = "Edited " + testname;
		editTest.testNameEditbox().clear();
		editTest.testNameEditbox().sendKeys(newTestName);
		//click Submit btn
		util.clickAfterExplicitWait(4000, "//button[@type='submit']");
		String exp_Error = "The default price field is required.";
		String errorMessage = editTest.missingDefaultPriceErrorMsg().getText();
		if(errorMessage.equals(exp_Error))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to edit test.");
		}	
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean clickSpecimenSourceManagementBtn() throws Exception
	{
		Boolean status = null;
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		if(util.getPageUrl().contains(util.specimenSourceMgmtUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Manage Specimen Sources page.");
		}	
		//cleanup
		navigateToPage();
		return status;
	}
	
	public Boolean verifyPageElementsRenderedSpecimenSourceManagement() throws Exception
	{
		Boolean status = null;
		Boolean currentSpecimenSourcesPaneStatus = null;
		Boolean createNewSpecimenSourcePaneStatus = null;
		Boolean returnToTestSettingsBtnStatus = null;
		//click specimen source management pane
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		//verify UI elements
		if(specimenSrc.currentSpecimenSourcesPane().isDisplayed() && specimenSrc.currentSpecimenSourcesPane().isEnabled())
		{
			currentSpecimenSourcesPaneStatus = true;
		}
		else
		{
			currentSpecimenSourcesPaneStatus = false;
			logger.error("Error : Current Specimen Sources pane not displayed or not enabled.");
		}
		if(specimenSrc.createNewSpecimenSourcePane().isDisplayed() && specimenSrc.createNewSpecimenSourcePane().isEnabled())
		{
			createNewSpecimenSourcePaneStatus = true;
		}
		else
		{
			createNewSpecimenSourcePaneStatus = false;
			logger.error("Error : Create New Specimen Source pane not displayed or not enabled.");
		}
		if(specimenSrc.returnToTestSettingsBtn().isDisplayed() && specimenSrc.returnToTestSettingsBtn().isEnabled())
		{
			returnToTestSettingsBtnStatus = true;
		}
		else
		{
			returnToTestSettingsBtnStatus = false;
			logger.error("Error : Return To Test Settings Button not displayed or not enabled.");
		}
		if(currentSpecimenSourcesPaneStatus.equals(true) && createNewSpecimenSourcePaneStatus.equals(true)
				&& returnToTestSettingsBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}	
		//cleanup
		navigateToPage();
		return status;
	}
	
	public Boolean verifyUIElementsCurrentSpecimenSourcesPane() throws Exception
	{
		Boolean status = null;
		Boolean specimenSourceTableStatus = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchboxStatus = null;
		Boolean paginationStatus = null;
		//click specimen source management pane
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		//verify UI elements
		if(specimenSrc.specimenSourcesTable().isDisplayed() && specimenSrc.specimenSourcesTable().isEnabled())
		{
			specimenSourceTableStatus = true;
		}
		else
		{
			specimenSourceTableStatus = false;
			logger.error("Error : Specimen Sources table not displayed or not enabled.");
		}
		if(specimenSrc.showEntriesDropdown().isDisplayed() && specimenSrc.showEntriesDropdown().isEnabled())
		{
			showEntriesDropdownStatus = true;
		}
		else
		{
			showEntriesDropdownStatus = false;
			logger.error("Error : Show entries dropdown not displayed or not enabled.");
		}
		if(specimenSrc.searchBox().isDisplayed() && specimenSrc.searchBox().isEnabled())
		{
			searchboxStatus = true;
		}
		else
		{
			searchboxStatus = false;
			logger.error("Error : Search box not displayed or not enabled.");
		}
		if(specimenSrc.pagination().isDisplayed() && specimenSrc.pagination().isEnabled())
		{
			paginationStatus = true;
		}
		else
		{
			paginationStatus = false;
			logger.error("Error : Pagination for specimen sources table not displayed or not enabled.");
		}
		if(specimenSourceTableStatus.equals(true) && showEntriesDropdownStatus.equals(true)
				&& searchboxStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}	
		//cleanup
		navigateToPage();
		return status;
	}
	
	public Boolean UIElementsCreateNewSpecimenSourcePane() throws Exception
	{
		Boolean status = null;
		Boolean testNameDropdownStatus = null;
		Boolean sourceTypeEditboxStatus = null;
		Boolean createBtnStatus = null;
		//click specimen source management pane
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		//verify UI elements
		if(specimenSrc.testNameDropdown().isDisplayed() && specimenSrc.testNameDropdown().isEnabled())
		{
			testNameDropdownStatus = true;
		}
		else
		{
			testNameDropdownStatus = false;
			logger.error("Error : Test Name Dropdown not displayed or not enabled.");
		}
		if(specimenSrc.sourceTypeEditbox().isDisplayed() && specimenSrc.sourceTypeEditbox().isEnabled())
		{
			sourceTypeEditboxStatus = true;
		}
		else
		{
			sourceTypeEditboxStatus = false;
			logger.error("Error : Source Type Editbox not displayed or not enabled.");
		}
		if(specimenSrc.createBtn().isDisplayed() && specimenSrc.createBtn().isEnabled())
		{
			createBtnStatus = true;
		}
		else
		{
			createBtnStatus = false;
			logger.error("Error : create button not displayed or not enabled.");
		}
		if(testNameDropdownStatus.equals(true) && sourceTypeEditboxStatus.equals(true)
				&& createBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}	
		//cleanup
		navigateToPage();
		return status;
	}
	
	public void createSpecimenSource(String testname, String source) throws Exception
	{
		//select test from dropdown
		util.selectByVisibleTextFromDropdown(testname, specimenSrc.testNameDropdown());
		//enter source type
		specimenSrc.sourceTypeEditbox().clear();
		specimenSrc.sourceTypeEditbox().sendKeys(source);
		//click create btn
		util.clickAfterExplicitWait(4000, "//button[@type='submit']");
	}
	
	public Boolean verifyCreateNewSpecimenSource(String testname, String testcode, String dxcode, String source) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//navigate to manage specimen sources page
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		//create new specimen source
		createSpecimenSource(testname, source);
		//search specimen source using testname
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys(testname);
		String sourceEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr/td[2]")).getText();	
		if(sourceEntry.equals(source))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to create new specimen source.");
		}	
		//cleanup
		Thread.sleep(2000);
		deleteSpecimenSource(testname);
		Thread.sleep(2000);
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public void deleteSpecimenSource(String testname) throws Exception
	{
		//search testname
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys(testname);
		//click delete btn
		util.clickAfterExplicitWait(4000, "//i[contains(@class, \"trash\")]");
		//accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		logger.info("Specimen Source delete successfully.");
	}
	
	public Boolean verifyDeleteSpecimenSource(String testname, String testcode, String dxcode, String source) throws Exception
	{
		Boolean status = null;
		Boolean alertDisplayed = null;
		Boolean clickCancel = null;
		Boolean clickOk = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//navigate to manage specimen sources page
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		//create new specimen source
		createSpecimenSource(testname, source);
		//search specimen source using testname
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys(testname);
		//click delete btn
		util.clickAfterExplicitWait(4000, "//i[contains(@class, \"trash\")]");
		//verify alert displayed
		Alert alert = driver.switchTo().alert();
		String str_alert = alert.getText();
		String exp_alert = "Are you sure you wish to delete this Specimen Source?";
		if(str_alert.equals(exp_alert))
		{
			alertDisplayed = true;
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on clicking delete icon against specimen source.");
		}
		//dismiss alert
		alert.dismiss();
		//verify record retained on specimen sources table
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys(testname);
		String sourceEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr/td[2]")).getText();	
		if(sourceEntry.equals(source))
		{
			clickCancel = true;
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Record not retained on delete specimen source alert dismissal.");
		}
		//click delete btn
		util.clickAfterExplicitWait(4000, "//i[contains(@class, \"trash\")]");
		//accept alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//verify record deleted from specimen sources table
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys(testname);
		if(emptyRecords().equals(true))
		{
			clickOk = true;
		}
		else
		{
			clickOk = false;
			logger.error("Error : Record not deleted on accepting delete specimen source alert.");
		}		
		if(alertDisplayed.equals(true) && clickCancel.equals(true) && clickOk.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean showEntriesDropdownOptionsSpecimenSource() throws Exception
	{
		Boolean status = null;
		//navigate to specimen source management source page
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		ArrayList<String> options = new ArrayList<String>();
		ArrayList<String> exp_options = new ArrayList<String>();
		exp_options.add("10");
		exp_options.add("25");
		exp_options.add("50");
		exp_options.add("100");
		Select dropdown = new Select(specimenSrc.showEntriesDropdown());		
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
      		logger.error("Error : options missing in show entries dropdown in Current Specimen Sources pane.");
      	}
		return status;
	}
	
}
