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
	TestQuestionsPage questions = new TestQuestionsPage();
	
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
	
	public WebElement questionsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(@href, '/questions')]"));					
		} catch (Exception e) {			
			logger.error("Error : Questions button for table entry not found in tests table.");
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
		WebElement emptyRecords = driver.findElement(By.xpath("//td[@class='dataTables_empty']"));
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
		//cleanup
		navigateToPage();
		return status;
	}
	
	public Boolean searchSpecimenSource(String testname, String source) throws Exception
	{
		Boolean status = true;
		//search specimen source using testname
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys(testname);
		WebElement ssTable = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody"));
		List<WebElement> ssTableRows = ssTable.findElements(By.tagName("tr"));
		int rows = ssTableRows.size();
		for(int i=1; i<=rows; i++)
		{
			String testEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr["+i+"]/td[1]")).getText();
			String ssEntry = driver.findElement(By.xpath("//*[@id=\"user-table\"]/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(testEntry);
			System.out.println(ssEntry);
			if(!testEntry.equals(testname) && !ssEntry.equals(source))
			{
				status = false;
				break;
			}
		}
		return status;
	}
	
	public Boolean verifySearchSpecimenSource(String testname, String testcode, String dxcode, String source) throws Exception
	{
		Boolean status = null;
		Boolean validSearch = true;
		Boolean invalidSearch = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//navigate to manage specimen sources page
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		//create new specimen source
		createSpecimenSource(testname, source);
		//verify valid string search
		if(searchSpecimenSource(testname, source).equals(true))
		{
			validSearch = true;
		}
		else
		{
			validSearch = false;
			logger.error("Error : Search functionality not working for valid search string.");
		}
		//verify invalid string search
		//search specimen source using testname
		specimenSrc.searchBox().clear();
		specimenSrc.searchBox().sendKeys("error");
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
		deleteSpecimenSource(testname);
		Thread.sleep(2000);
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean clickReturnToTestSettingBtn() throws Exception
	{
		Boolean status = null;
		//navigate to manage specimen sources page
		util.clickAfterExplicitWait(4000, "//*[@href='/lab/specimensource/index']");
		specimenSrc.returnToTestSettingsBtn().click();
		if(util.getPageUrl().contains(util.manageTestsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Manage Tests page on clicking Return to Test Settings button.");
		}
		//cleanup
		navigateToPage();
		return status;
	}
	
	public Boolean clickQuestionsBtn(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//verify user navigates to questions page
		if(util.getPageUrl().contains("/questions") && questions.questionsPageTitle().isDisplayed())
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Questions page on clicking Questions button.");
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyPageElementsRenderedQuestions(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean addQuestionBtnStatus = null;
		Boolean returnToTestBtnStatus = null;
		Boolean questionTableStatus = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//verify UI elements
		if(questions.addQuestionBtn().isDisplayed() && questions.addQuestionBtn().isEnabled())
		{
			addQuestionBtnStatus = true;
		}
		else
		{
			addQuestionBtnStatus = false;
			logger.error("Error : Add Question button not displayed or not enabled.");
		}
		if(questions.returnToTestBtn().isDisplayed() && questions.returnToTestBtn().isEnabled())
		{
			returnToTestBtnStatus = true;
		}
		else
		{
			returnToTestBtnStatus = false;
			logger.error("Error : Return to Test button not displayed or not enabled.");
		}
		if(questions.questionsTable().isDisplayed() && questions.questionsTable().isEnabled())
		{
			questionTableStatus = true;
		}
		else
		{
			questionTableStatus = false;
			logger.error("Error : Questions table not displayed or not enabled.");
		}
		if(addQuestionBtnStatus.equals(true) && returnToTestBtnStatus.equals(true)
				&& questionTableStatus.equals(true))
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
	
	public Boolean clickReturnToTestBtn(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//click return to test btn
		questions.returnToTestBtn().click();
		//verify user navigates to questions page
		if(util.getPageUrl().contains(util.manageTestsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to Manage Tests page on clicking Return to Test button.");
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean clickAddQuestionBtn(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//click add qn btn
		questions.addQuestionBtn().click();
		//verify user navigates to new question page
		if(util.getPageUrl().contains("/questions/new"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to new question page on clicking add question button.");
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyPageElementsRenderedNewQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean questionEditboxStatus = null;
		Boolean typeDropdownStatus = null;
		Boolean saveBtnStatus = null;
		Boolean backToQuestionsBtnStatus = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//click add questions btn in questions page
		questions.addQuestionBtn().click();
		//verify UI elements
		if(questions.questionEditbox().isDisplayed() && questions.questionEditbox().isEnabled())
		{
			questionEditboxStatus = true;
		}
		else
		{
			questionEditboxStatus = false;
			logger.error("Error : Question edit box not displayed or not enabled.");
		}
		if(questions.questionTypeDropdown().isDisplayed() && questions.questionTypeDropdown().isEnabled())
		{
			typeDropdownStatus = true;
		}
		else
		{
			typeDropdownStatus = false;
			logger.error("Error : Type dropdown not displayed or not enabled.");
		}
		if(questions.saveBtn().isDisplayed() && questions.saveBtn().isEnabled())
		{
			saveBtnStatus = true;
		}
		else
		{
			saveBtnStatus = false;
			logger.error("Error : Save btn not displayed or not enabled.");
		}
		if(questions.backToQuestionsBtn().isDisplayed() && questions.backToQuestionsBtn().isEnabled())
		{
			backToQuestionsBtnStatus = true;
		}
		else
		{
			backToQuestionsBtnStatus = false;
			logger.error("Error : Back To Questions btn not displayed or not enabled.");
		}
		if(questionEditboxStatus.equals(true) && typeDropdownStatus.equals(true)
				&& saveBtnStatus.equals(true) && backToQuestionsBtnStatus.equals(true))
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
	
	public Boolean typeDropdownOptionsNewQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//click add questions btn in questions page
		questions.addQuestionBtn().click();		
		ArrayList<String> options = new ArrayList<String>();
		ArrayList<String> exp_options = new ArrayList<String>();
		exp_options.add("text");
		exp_options.add("multi-line text");
		exp_options.add("single-choice");
		exp_options.add("multi-choice");
		exp_options.add("date");
		Select dropdown = new Select(questions.questionTypeDropdown());		
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
      		logger.error("Error : options missing in type dropdown in new questions page.");
      	}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean clickBackToQuestionsBtn(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//click add qn btn
		questions.addQuestionBtn().click();
		//click back to qns btn
		questions.backToQuestionsBtn().click();
		//verify user navigates to questions page
		if(util.getPageUrl().contains("/questions"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to questions page on clicking back to question button.");
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyCreateQuestionsForTest(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add questions of types - text, multi line text, date
		ArrayList<String> qns = new ArrayList<String>();
		qns.add("Auto Question 1");
		qns.add("Auto Question 2");
		qns.add("Auto Question 3");
		ArrayList<String> types = new ArrayList<String>();
		types.add("text");
		types.add("multi-line text");
		types.add("date");
		addNewQuestion(qns.get(0), types.get(0));
		addNewQuestion(qns.get(1), types.get(1));
		addNewQuestion(qns.get(2), types.get(2));
		//get questions and types added to questions table
		ArrayList<String> exp_qns = new ArrayList<String>();
		ArrayList<String> exp_types = new ArrayList<String>();
		WebElement qnsTable = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table/tbody"));
		List<WebElement> qnsTableRows = qnsTable.findElements(By.tagName("tr"));
		int rows = qnsTableRows.size();
		for(int i=1; i<=rows; i++)
		{
			String qnEntered = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table/tbody/tr["+i+"]/td[1]")).getText();
			exp_qns.add(qnEntered);
			String typeEntered = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table/tbody/tr["+i+"]/td[2]")).getText();
			exp_types.add(typeEntered);
		}
		//verify questions added properly
		if(qns.equals(exp_qns) && types.equals(exp_types))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : User unable to create questions for test.");
		}		
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public void addNewQuestion(String question, String type) throws Exception
	{
		//click add qn btn
		questions.addQuestionBtn().click();
		//enter question
		questions.questionEditbox().clear();
		questions.questionEditbox().sendKeys(question);
		//choose question type
		util.selectByVisibleTextFromDropdown(type, questions.questionTypeDropdown());
		//click save btn
		questions.saveBtn().click();
	}
	
	public Boolean clickEditBtnForQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add qn
		addNewQuestion("Auto Question", "text");
		//click edit qn btn
		driver.findElement(By.xpath("//*[contains(text(), \"Edit\")]")).click();
		WebElement pageHeading = driver.findElement(By.xpath("//h1[contains(text(), 'Update a Question')]"));
		//verify user navigates to update question page
		if(pageHeading.isDisplayed())
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Unable to navigate to update question page on clicking edit button against question.");
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyPageElementsRenderedUpdateQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean questionEditboxStatus = null;
		Boolean typeDropdownStatus = null;
		Boolean updateBtnStatus = null;
		Boolean backToQuestionsBtnStatus = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add qn
		addNewQuestion("Auto Question", "text");
		//click edit qn btn
		driver.findElement(By.xpath("//*[contains(text(), \"Edit\")]")).click();
		//verify UI elements
		if(questions.questionEditbox().isDisplayed() && questions.questionEditbox().isEnabled())
		{
			questionEditboxStatus = true;
		}
		else
		{
			questionEditboxStatus = false;
			logger.error("Error : Question edit box not displayed or not enabled.");
		}
		if(questions.questionTypeDropdown().isDisplayed() && questions.questionTypeDropdown().isEnabled())
		{
			typeDropdownStatus = true;
		}
		else
		{
			typeDropdownStatus = false;
			logger.error("Error : Type dropdown not displayed or not enabled.");
		}
		if(questions.updateBtn().isDisplayed() && questions.updateBtn().isEnabled())
		{
			updateBtnStatus = true;
		}
		else
		{
			updateBtnStatus = false;
			logger.error("Error : Update btn not displayed or not enabled.");
		}
		if(questions.backToQuestionsBtn().isDisplayed() && questions.backToQuestionsBtn().isEnabled())
		{
			backToQuestionsBtnStatus = true;
		}
		else
		{
			backToQuestionsBtnStatus = false;
			logger.error("Error : Back To Questions btn not displayed or not enabled.");
		}
		if(questionEditboxStatus.equals(true) && typeDropdownStatus.equals(true)
				&& updateBtnStatus.equals(true) && backToQuestionsBtnStatus.equals(true))
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
	
	public Boolean editQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add qn
		addNewQuestion("Auto Question", "text");
		//click edit qn btn
		driver.findElement(By.xpath("//*[contains(text(), \"Edit\")]")).click();
		//edit qn and type
		questions.questionEditbox().clear();
		questions.questionEditbox().sendKeys("Edited Auto Question");
		util.selectByVisibleTextFromDropdown("date", questions.questionTypeDropdown());
		questions.updateBtn().click();
		//verify changes are updated
		String qnEntered = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table/tbody/tr/td[1]")).getText();
		String typeEntered = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table/tbody/tr/td[2]")).getText();
		if(qnEntered.equals("Edited Auto Question") && typeEntered.equals("date"))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : User unable to edit question associated with test.");
		}
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyDeleteQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean alertDisplayed = null;
		Boolean clickCancel = null;
		Boolean clickOk = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add qn
		addNewQuestion("Auto Question", "text");
		//click delete btn
		driver.findElement(By.xpath("//*[contains(text(), \"Delete\")]")).click();		
		Alert alert = driver.switchTo().alert();
		String str_alert = alert.getText();
		String exp_alert = "Are you sure you wish to delete this question?";
		if(str_alert.equals(exp_alert))
		{
			alertDisplayed = true;
		}
		else
		{
			alertDisplayed = false;
			logger.error("Error : Alert not displayed on clicking delete button against question.");
		}
		//dismiss alert
		alert.dismiss();
		//verify question retained
		String qnEntered = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table/tbody/tr/td[1]")).getText();
		if(qnEntered.equals("Auto Question"))
		{
			clickCancel = true;
		}
		else
		{
			clickCancel = false;
			logger.error("Error : Question not retained on delete question alert dismissal.");
		}
		//click delete btn
		driver.findElement(By.xpath("//*[contains(text(), \"Delete\")]")).click();		
		//accept alert
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		//verify question deleted
		List<WebElement> emptyQnTable = driver.findElements(By.xpath("//*[@id=\"content\"]/..//table/tbody/tr"));
		if(emptyQnTable.size()==0)
		{
			clickOk = true;
		}
		else
		{
			clickOk = false;
			logger.error("Error : Record not deleted on accepting delete question alert.");
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
	
	public Boolean verifyChoicePaneDisplayedForQuestion(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean paneDisplayedForSingleChoice = null;
		Boolean paneDisplayedForMultipleChoice = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add single choice qn
		questions.addQuestionBtn().click();
		//enter question
		questions.questionEditbox().clear();
		questions.questionEditbox().sendKeys("Auto Question");
		//choose question type
		util.selectByVisibleTextFromDropdown("single-choice", questions.questionTypeDropdown());
		//verify choices pane displayed
		if(questions.choicesPane().isDisplayed())
		{
			paneDisplayedForSingleChoice = true;
		}
		else
		{
			paneDisplayedForSingleChoice = false;
			logger.error("Error : Choice pane not displayed for single-choice question.");
		}
		questions.backToQuestionsBtn().click();
		//add multi choice qn
		questions.addQuestionBtn().click();
		//enter question
		questions.questionEditbox().clear();
		questions.questionEditbox().sendKeys("Auto Question");
		//choose question type
		util.selectByVisibleTextFromDropdown("multi-choice", questions.questionTypeDropdown());
		//verify choices pane displayed
		if(questions.choicesPane().isDisplayed())
		{
			paneDisplayedForMultipleChoice = true;
		}
		else
		{
			paneDisplayedForMultipleChoice = false;
			logger.error("Error : Choice pane not displayed for multi-choice question.");
		}
		if(paneDisplayedForSingleChoice.equals(true)
				&& paneDisplayedForMultipleChoice.equals(true))
		{
			status = true;
		}
		else
		{
			status=false;
		}	
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
	
	public Boolean verifyUIElementsChoicesPane(String testname, String testcode, String dxcode) throws Exception
	{
		Boolean status = null;
		Boolean UIElementsDisplayedSingleChoice = null;
		Boolean UIElementsDisplayedMultiChoice = null;
		//create new test
		createTest(testname, testcode, dxcode);
		//search test
		searchBox().clear();
		searchBox().sendKeys(testcode);
		//click questions btn
		questionsBtn().click();
		//add single choice qn
		questions.addQuestionBtn().click();
		//enter question
		questions.questionEditbox().clear();
		questions.questionEditbox().sendKeys("Auto Question");
		//choose question type
		util.selectByVisibleTextFromDropdown("single-choice", questions.questionTypeDropdown());
		//verify choices pane UI Elements displayed
		if(questions.optionsTextBoxChoicesPane().isDisplayed()
				&& questions.addBtnChoicesPane().isDisplayed()
				&& questions.addSubQnLinkChoicesPane().isDisplayed())
		{
			questions.addBtnChoicesPane().click();
			if(questions.removeBtnChoicesPane().isDisplayed())
			{
				UIElementsDisplayedSingleChoice = true;
			}
		}
		else
		{
			UIElementsDisplayedSingleChoice = false;
			logger.error("Error : Choice pane UI elements not displayed for single-choice question.");
		}
		questions.backToQuestionsBtn().click();
		//add multi choice qn
		questions.addQuestionBtn().click();
		//enter question
		questions.questionEditbox().clear();
		questions.questionEditbox().sendKeys("Auto Question");
		//choose question type
		util.selectByVisibleTextFromDropdown("multi-choice", questions.questionTypeDropdown());
		//verify choices pane displayed
		if(questions.optionsTextBoxChoicesPane().isDisplayed()
				&& questions.addBtnChoicesPane().isDisplayed()
				&& questions.addSubQnLinkChoicesPane().isDisplayed())
		{
			questions.addBtnChoicesPane().click();
			if(questions.removeBtnChoicesPane().isDisplayed())
			{
				UIElementsDisplayedMultiChoice = true;
			}
		}
		else
		{
			UIElementsDisplayedMultiChoice = false;
			logger.error("Error : Choice pane UI elements not displayed for multi-choice question.");
		}
		if(UIElementsDisplayedSingleChoice.equals(true)
				&& UIElementsDisplayedMultiChoice.equals(true))
		{
			status = true;
		}
		else
		{
			status=false;
		}	
		//cleanup
		navigateToPage();
		deleteTest(testcode);
		return status;
	}
}
