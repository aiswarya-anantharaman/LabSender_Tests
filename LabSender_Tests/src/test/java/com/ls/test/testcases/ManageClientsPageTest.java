package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.ManageClientsPage;
import com.ls.java.util.TestUtil;

public class ManageClientsPageTest extends TestBase{
	
	ManageClientsPage manageClients;
	LoginPage login;
	TestUtil util = new TestUtil();
	AdminDashboardPage adminDashboard = new AdminDashboardPage();
	
	public ManageClientsPageTest()
	{
		super();
	}
	
	@Parameters({ "url", "username", "password" })
	@BeforeClass
	public void setUp(String url, String username, String password) throws Exception
	{
		initialization(url);
		login = new LoginPage();
		manageClients = new ManageClientsPage();
		login.userLogin(username, password);
		adminDashboard.labViewCard().click();
		manageClients.navigateToPage();			
	}
	
	@Test(priority = 1, 
			description = "Verify page title for Manage Clients page.")
	public void pageTitle() throws Exception
	{
		Boolean status = manageClients.verifyPageTitle();
		Assert.assertEquals(true, status);
	}	
	
	@Test(priority = 2, 
			description = "Verify page elements are rendered peoperly on the manage Clients page.")
	public void pageElementsRenderedManageClients() throws Exception
	{
		Boolean status = manageClients.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3, 
			description = "Verify UI elements rendered properly on the Current Clients pane in Manage Clients page.")
	public void UIElementsCurrentClientsPane() throws Exception
	{
		Boolean status = manageClients.verifyUIElementsCurrentClientsPane();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 4, 
			description = "Verify UI elements rendered properly on the Create New Client pane in Manage Clients page.")
	public void UIElementsCreateNewClientPane() throws Exception
	{
		Boolean status = manageClients.verifyUIElementsCreateNewClientPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5, 
			description = "Verify UI elements rendered properly on Upload CSV to Create New Clients pane in Manage Clients page.")
	public void UIElementsUploadCSVPane() throws Exception
	{
		Boolean status = manageClients.verifyUIElementsUploadCSVPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6, 
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = manageClients.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7, 
			description = "Verify new client can be created.")
	public void createNewClient() throws Exception
	{
		String testID = util.randomID();
		Boolean status = manageClients.verifyCreateNewClient("Automated Test Client", testID);
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8, 
			description = "Verify valid and invalid client search on Manage Clients page.")
	public void verifySearchFunctionality() throws Exception
	{
		String testID = util.randomID();
		Boolean status = manageClients.verifySearchFunctionality("Automated Test Client", testID);
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 9, 
			description = "Verify client can be deleted from records.")
	public void verifyDeleteClientFunctionality() throws Exception
	{
		String testID = util.randomID();
		Boolean status = manageClients.verifyDeleteClientFunctionality("Automated Test Client", testID);
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 10, 
			description = "Verify user navigates to Editing Client page on clicking Edit Client button.")
	public void clickEditClient() throws Exception
	{
		String testID = util.randomID();
		Boolean status = manageClients.clickEditClient("Automated Test Client", testID);
		Assert.assertEquals(true, status);		
	}
	
	@Test(priority = 11, 
			description = "Verify client details are edited and rendered peoperly on Current Clients pane.")
	public void editClientDetails() throws Exception
	{
		String testID = util.randomID();
		Boolean status = manageClients.editClientDetails("Automated Test Client", testID);
		Assert.assertEquals(true, status);		
	}
	
	@Test(priority = 17, 
			description = "Verify user navigates to Order Settings page on clicking Return to Order Settings button.")
	public void clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = manageClients.clickReturnToOrderSettingBtn();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
