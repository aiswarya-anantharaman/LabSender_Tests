package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.PreRegistrationPage;
import com.ls.java.util.TestUtil;

public class PreRegistrationPageTest extends TestBase{

	LoginPage login;
	AdminDashboardPage adminDashboard;
	TestUtil util = new TestUtil();
	PreRegistrationPage preRegPage;

	public PreRegistrationPageTest()
	{
		super();
	}

	@Parameters({ "url", "username", "password" })
	@BeforeClass
	public void setUp(String url, String username, String password) throws Exception
	{
		initialization(url);
		login = new LoginPage();
		adminDashboard = new AdminDashboardPage();
		preRegPage = new PreRegistrationPage();
		login.userLogin(username, password);
		//switch to lab view - lab user
		if(adminDashboard.pageTitle().isDisplayed())
		{
			adminDashboard.labViewCard().click();
		}
		preRegPage.navigateToPage();
	}

	@Test(priority = 1,
			description = "Verify page URL for Pre Registration page.")
	public void pageUrl() throws Exception
	{
		Boolean status = preRegPage.verifyPageUrl();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 2,
			description = "Verify UI elements rendered properly in the Pre-Registration Page page.")
	public void verifyPageElementsRenderedPreRegPage() throws Exception
	{
		Boolean status = preRegPage.pageElementsRenderedPreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3, 
			description = "Verify UI elements rendered properly in the Pre-Registration Pages pane.")
	public void verifyUIElementsRenderedPreRegPagesPane() throws Exception
	{
		Boolean status = preRegPage.verifyUIElementsRenderedPreRegPagesPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 4, 
			description = "Verify UI elements rendered properly in the New Pre-Registration Page pane")
	public void verifyUIElementsRenderedNewPreRegPagePane() throws Exception
	{
		Boolean status = preRegPage.verifyUIElementsRenderedNewPreRegPagePane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5, 
			description = "Verify new pre-reg page can be created.")
	public void verifyCreateNewPreRegPage() throws Exception
	{
		Boolean status = preRegPage.verifyCreateNewPreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6, 
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = preRegPage.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7, 
			description = "Verify search functionality for pre-reg pages.")
	public void verifySearchPreRegPage() throws Exception
	{
		Boolean status = preRegPage.verifySearchPreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8, 
	description = "Verify error displayed when a pre-reg page with same client mnemonic is created.")
	public void verifyCreateDuplicatePreRegPage() throws Exception
	{
		Boolean status = preRegPage.verifyCreateDuplicatePreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8, 
			description = "Verify pre-reg page can be viewed.",
			enabled = false)
	public void verifyViewPreRegPage() throws Exception
	{
		Boolean status = preRegPage.verifyViewPreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 9, 
			description = "Verify user is navigated to Editing Pre-Registration Page on clicking Edit Page button.")
	public void clickEditPreRegPage() throws Exception
	{
		Boolean status = preRegPage.clickEditPreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 10, 
			description = "Verify UI elements rendered properly in the Editing Pre-Registration Page.")
	public void verifyPageElementsRenderedEditPreRegPage() throws Exception
	{
		Boolean status = preRegPage.pageElementsRenderedEditPreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 11, 
			description = "Verify user is navigated to Pre-Registration Page on clicking Manage Pages button.")
	public void clickBackToManagePagesBtn() throws Exception
	{
		Boolean status = preRegPage.clickBackToManagePagesBtn();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 12, 
	description = "Verify pre-reg page can be edited.")
	public void verifyEditPreRegPage() throws Exception
	{
		Boolean status = preRegPage.verifyEditPreRegPage();
		Assert.assertEquals(true, status);
	}
		
	@Test(priority = 15, 
			description = "Verify pre-reg page can be deleted.")
	public void verifyDeletePreRegPage() throws Exception
	{
		Boolean status = preRegPage.verifyDeletePreRegPage();
		Assert.assertEquals(true, status);
	}
	
	@AfterMethod
	public void afterMethod() throws Exception
	{
		util.sleep(3000);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
