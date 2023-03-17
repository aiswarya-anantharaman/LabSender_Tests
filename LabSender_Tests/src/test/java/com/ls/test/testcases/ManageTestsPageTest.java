package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.ManageTestsPage;

public class ManageTestsPageTest extends TestBase{
	
	LoginPage login;
	ManageTestsPage manageTests;
	AdminDashboardPage adminDashboard = new AdminDashboardPage();

	public ManageTestsPageTest()
	{
		super();
	}
	
	@Parameters({ "url", "username", "password" })
	@BeforeClass
	public void setUp(String url, String username, String password) throws Exception
	{
		initialization(url);
		login = new LoginPage();
		manageTests = new ManageTestsPage();
		login.userLogin(username, password);
		adminDashboard.labViewCard().click();
		manageTests.navigateToPage();			
	}
	
	@Test(priority = 1, 
			description = "Verify page title for Manage Tests page.")
	public void pageTitle() throws Exception
	{
		Boolean status = manageTests.verifyPageTitle();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 2, 
			description = "Verify page elements are rendered peoperly on the manage tests page.")
	public void pageElementsRenderedManageTests() throws Exception
	{
		Boolean status = manageTests.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3, 
			description = "Verify UI elements rendered properly on the Tests pane in Manage Tests page.")
	public void UIElementsTestsPane() throws Exception
	{
		Boolean status = manageTests.verifyUIElementsTestsPane();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 4, 
			description = "Verify UI elements rendered properly on the Create New Test pane in Manage Tests page.")
	public void UIElementsCreateNewTestPane() throws Exception
	{
		Boolean status = manageTests.verifyUIElementsCreateNewTestPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5, 
			description = "Verify UI elements rendered properly on Upload CSV to Create New Tests pane in Manage Tests page.")
	public void UIElementsUploadCSVPane() throws Exception
	{
		Boolean status = manageTests.verifyUIElementsUploadCSVPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6, 
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = manageTests.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7, 
			description = "Verify new test can be created.")
	public void createNewTest() throws Exception
	{
		Boolean status = manageTests.verifyCreateNewTest("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8, 
			description = "Verify test can be deleted.")
	public void deleteTest() throws Exception
	{
		Boolean status = manageTests.verifyDeleteTest("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 9, 
			description = "Verify test can be searched from tests table.")
	public void searchTest() throws Exception
	{
		Boolean status = manageTests.verifySearchFunctionality("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 10, 
			description = "Verify user navigates to edit test page on clicking edit button against the test.")
	public void clickEditBtn() throws Exception
	{
		Boolean status = manageTests.clickEditBtn("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 11, 
			description = "Verify UI elements rendered properly in Edit test page.")
	public void pageElementsRenderedEditTest() throws Exception
	{
		Boolean status = manageTests.verifyPageElementsRenderedEditTest("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 12, 
			description = "Verify test details can be edited.")
	public void verifyEditTest() throws Exception
	{
		Boolean status = manageTests.verifyEditTest("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 13, 
			description = "Verify error message displayed when default price is not entered for test.")
	public void verifyTestWithoutDefaultPriceError() throws Exception
	{
		Boolean status = manageTests.verifyTestWithoutDefaultPriceError("Automated Test", "Auto", "Auto");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 14, 
			description = "Verify user navigates to Manage Specimen Sources page"
					+ "on clicking Specimen Source Management button.")
	public void clickSpecimenSourceManagementBtn() throws Exception
	{
		Boolean status = manageTests.clickSpecimenSourceManagementBtn();
		Assert.assertEquals(true, status);
	}
		
	@Test(priority = 15, 
			description = "Verify UI elements rendered properly in Specimen Source Management page.")
	public void pageElementsRenderedSpecimenSourceManagement() throws Exception
	{
		Boolean status = manageTests.verifyPageElementsRenderedSpecimenSourceManagement();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 16, 
			description = "Verify UI elements rendered properly in Current Specimen Sources pane.")
	public void UIElementsCurrentSpecimenSourcesPane() throws Exception
	{
		Boolean status = manageTests.verifyUIElementsCurrentSpecimenSourcesPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 17, 
			description = "Verify UI elements rendered properly in Create New Specimen Source pane.")
	public void UIElementsCreateNewSpecimenSourcePane() throws Exception
	{
		Boolean status = manageTests.UIElementsCreateNewSpecimenSourcePane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 18, 
			description = "Verify new specimen source can be created.")
	public void verifyCreateNewSpecimenSource() throws Exception
	{
		Boolean status = manageTests.verifyCreateNewSpecimenSource("Automated Test", "Auto", "Auto", "Automated Source");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 19, 
			description = "Verify specimen source can be deleted.")
	public void verifyDeleteSpecimenSource() throws Exception
	{
		Boolean status = manageTests.verifyDeleteSpecimenSource("Automated Test", "Auto", "Auto", "Automated Source");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 20, 
			description = "Verify options in Show Entries dropdown in Current Specimen Sources pane.")
	public void showEntriesDropdownOptionsSpecimenSource() throws Exception
	{
		Boolean status = manageTests.showEntriesDropdownOptionsSpecimenSource();
		Assert.assertEquals(true, status);
	}
	
	
	
	
	
	@Test(priority = 24, 
			description = "Verify user navigates to Order Settings page on clicking Return to Order Settings button.")
	public void clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = manageTests.clickReturnToOrderSettingBtn();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 25, 
			description = "Verify user navigates to Manage Panels page on clicking Panel Management button.")
	public void clickPanelManagementBtn() throws Exception
	{
		Boolean status = manageTests.clickPanelManagementBtn();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
