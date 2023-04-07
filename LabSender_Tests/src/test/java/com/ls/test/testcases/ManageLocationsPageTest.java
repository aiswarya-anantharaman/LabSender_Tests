package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.ManageLocationsPage;
import com.ls.java.util.TestUtil;

public class ManageLocationsPageTest extends TestBase{
	
	LoginPage login;
	ManageLocationsPage manageLocations;
	AdminDashboardPage adminDashboard;
	TestUtil util = new TestUtil();

	public ManageLocationsPageTest()
	{
		super();
	}
	
	@Parameters({ "url", "username", "password" })
	@BeforeClass
	public void setUp(String url, String username, String password) throws Exception
	{
		initialization(url);
		login = new LoginPage();
		manageLocations = new ManageLocationsPage();
		adminDashboard = new AdminDashboardPage();
		login.userLogin(username, password);
		//switch to lab view - lab user
		if(adminDashboard.pageTitle().isDisplayed())
		{
			adminDashboard.labViewCard().click();
		}
		manageLocations.navigateToPage();			
	}
	
	@Test(priority = 1,
			description = "Verify page title for Manage Locations page.")
	public void pageTitle() throws Exception
	{
		Boolean status = manageLocations.verifyPageTitle();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 2,
			description = "Verify page elements are rendered peoperly on the manage locations page.")
	public void pageElementsRenderedManageLocations() throws Exception
	{
		Boolean status = manageLocations.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3,
			description = "Verify UI elements rendered properly on the Current Locations pane in Manage Locations page.")
	public void UIElementsCurrentLocationsPane() throws Exception
	{
		Boolean status = manageLocations.verifyUIElementsCurrentLocationsPane();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 4,
			description = "Verify UI elements rendered properly on the Create New Location pane in Manage Locations page.")
	public void UIElementsCreateNewLocationPane() throws Exception
	{
		Boolean status = manageLocations.verifyUIElementsCreateNewLocationPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5,
			description = "Verify UI elements rendered properly on Upload CSV to Create New Locations pane in Manage Locations page.")
	public void UIElementsUploadCSVPane() throws Exception
	{
		Boolean status = manageLocations.verifyUIElementsUploadCSVPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6,
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = manageLocations.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7,
			description = "Verify new location can be created.")
	public void createNewLocation() throws Exception
	{
		Boolean status = manageLocations.verifyCreateNewLocation("Automated Test Location");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8,
			description = "Verify page elements are rendered peoperly on the Editing Locations page.")
	public void pageElementsRenderedEditingLocation() throws Exception
	{
		Boolean status = manageLocations.verifyPageElementsRenderedEditingLocation("Automated Test Location");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 9,
			description = "Verify user navigates to Editing Location page on clicking the edit location button.")
	public void clickEditLocation() throws Exception
	{
		Boolean status = manageLocations.clickEditLocation("Automated Test Location");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 10,
			description = "Verify existing location can be edited.")
	public void editLocation() throws Exception
	{
		Boolean status = manageLocations.verifyEditLocation("Automated Test Location");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 11,
			description = "Verify location can be deleted.")
	public void verifyDeleteLocation() throws Exception
	{
		Boolean status = manageLocations.verifyDeleteLocation("Automated Test Location");
		Assert.assertEquals(true, status);
	}

	@Test(priority = 13,
			description = "Verify location can be searched from locations table.")
	public void searchLocation() throws Exception
	{
		Boolean status = manageLocations.verifySearchFunctionality("Automated Test Location");
		Assert.assertEquals(true, status);
	}
		
	@Test(priority = 14,
			description = "Verify user navigates to Order Settings page on clicking Return to Order Settings button.")
	public void clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = manageLocations.clickReturnToOrderSettingBtn();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
