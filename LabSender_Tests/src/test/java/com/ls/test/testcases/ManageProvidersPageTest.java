package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.ManageProvidersPage;
import com.ls.java.util.TestUtil;

public class ManageProvidersPageTest extends TestBase{
	
	ManageProvidersPage manageProviders;
	LoginPage login;
	TestUtil util = new TestUtil();
	AdminDashboardPage adminDashboard = new AdminDashboardPage();
	
	public ManageProvidersPageTest()
	{
		super();
	}
	
	@Parameters({ "url", "username", "password" })
	@BeforeClass
	public void setUp(String url, String username, String password) throws Exception
	{
		initialization(url);
		login = new LoginPage();
		manageProviders = new ManageProvidersPage();
		login.userLogin(username, password);
		//switch to lab view - lab user
		if(adminDashboard.pageTitle().isDisplayed())
		{
			adminDashboard.labViewCard().click();
		}
		manageProviders.navigateToPage();			
	}
	
	@Test(priority = 1,
			description = "Verify page title for Manage Providers page.")
	public void pageTitle() throws Exception
	{
		Boolean status = manageProviders.verifyPageTitle();
		Assert.assertEquals(true, status);
	}	
	
	@Test(priority = 2,
			description = "Verify page elements are rendered peoperly on the manage providers page.")
	public void pageElementsRenderedManageProviders() throws Exception
	{
		Boolean status = manageProviders.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3,
			description = "Verify UI elements rendered properly on the Current Providers pane in Manage Providers page.")
	public void UIElementsCurrentProvidersPane() throws Exception
	{
		Boolean status = manageProviders.verifyUIElementsCurrentProvidersPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 4,
			description = "Verify UI elements rendered properly on the Create New Provider pane in Manage Providers page.")
	public void UIElementsCreateNewProvidersPane() throws Exception
	{
		Boolean status = manageProviders.verifyUIElementsCreateNewProvidersPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5,
			description = "Verify new provider can be created.")
	public void createNewProvider() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.verifyCreateNewProvider(testID, testNPI , "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6,
			description = "Verify valid and invalid provider search on Manage Providers page.")
	public void verifySearchFunctionality() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.verifySearchFunctionality(testID, testNPI , "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7,
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = manageProviders.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8,
			description = "Verify user navigates to Provider Edit page on clicking Edit Provider button.")
	public void clickEditProvider() throws Exception
	{
		Boolean status = manageProviders.clickEditProvider();
		Assert.assertEquals(true, status);		
	}
	
	@Test(priority = 9,
			description = "Verify UI elements rendered properly on Upload CSV to Create New Providers pane in Manage Providers page.")
	public void UIElementsUploadCSVPane() throws Exception
	{
		Boolean status = manageProviders.verifyUIElementsUploadCSVPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 10,
			description = "Verify provider details are edited and rendered peoperly on Current Providers pane.")
	public void updateProviderDetails() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.updateProviderDetails(testID, testNPI, "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}	
	
	@Test(priority = 11,
			description = "Verify provider can be deleted from records.")
	public void verifyRemoveProvider() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.verifyRemoveProvider(testID, testNPI, "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}	
	
	@Test(priority = 12,
			description = "Verify page elements rendered properly on Provider Edit page.")
	public void pageElementsRenderedProviderEdit() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.verifypageElementsRenderedProviderEdit(testID, testNPI, "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 13,
			description = "Verify UI elements rendered properly on Provider Info pane in Manage Providers page.")
	public void UIElementsProviderInfoPane() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.verifyUIElementsProviderInfoPane(testID, testNPI, "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 15,
			description = "Verify UI elements rendered properly on Upload Provider Signature pane in Manage Providers page.")
	public void UIElementsUploadProviderSignPane() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.verifyUIElementsUploadProviderSignPane(testID, testNPI, "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 17,
			description = "Verify new provider cannot be created using duplicate NPI.")
	public void createProviderWithDuplicateNPI() throws Exception
	{
		String testID = util.randomID();
		String testNPI = util.randomNPI();
		Boolean status = manageProviders.createProviderWithDuplicateNPI(testID, testNPI, "Provider", "Automated Test");
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 18,
			description = "Verify user navigates to Order Settings page"
					+ " on clicking Return to Order Settings button.")
	public void clickReturnToOrderSettingBtn() throws Exception
	{
		Boolean status = manageProviders.clickReturnToOrderSettingBtn();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
