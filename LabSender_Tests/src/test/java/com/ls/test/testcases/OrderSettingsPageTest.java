package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.OrderSettingsPage;

public class OrderSettingsPageTest extends TestBase{
	
	OrderSettingsPage orderSettings;
	LoginPage login;
	AdminDashboardPage adminDashboard = new AdminDashboardPage();
	
	public OrderSettingsPageTest()
	{
		super();
	}
	
	@Parameters({ "url", "username", "password" })
	@BeforeClass
	public void setUp(String url, String username, String password) throws Exception
	{
		initialization(url);
		login = new LoginPage();
		orderSettings = new OrderSettingsPage();
		login.userLogin(username, password);
		//switch to lab view - lab user
		if(adminDashboard.pageTitle().isDisplayed())
		{
			adminDashboard.labViewCard().click();
		}
		orderSettings.navigateToPage();
	}
	
	//Order Settings tests
	@Test(priority = 1,
			description = "Verify Order Settings page url.")
	public void pageUrl() throws Exception
	{
		Boolean status = orderSettings.verifyPageUrl();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 2,
			description = "Verify Order Settings page title.")
	public void pageTitle() throws Exception
	{
		Boolean status = orderSettings.verifyPageTitle();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3,
			description = "Verify page elements rendered properly in Order Settings page.")
	public void pageElementsRendered() throws Exception
	{
		Boolean status = orderSettings.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	//Providers
	@Test(priority = 4,
			description = "Verify user navigates to Manage Providers page on "
					+ "clicking providers card in Order Settings page.")
	public void clickProvidersCard() throws Exception
	{
		Boolean status = orderSettings.clickProvidersCard();
		Assert.assertEquals(true, status);
	}	
	
	@Test(priority = 5,
			description = "Verify user navigates to Manage Clients page on "
					+ "clicking clients card in Order Settings page.")
	public void clickClientsCard() throws Exception
	{
		Boolean status = orderSettings.clickClientsCard();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6,
			description = "Verify user navigates to Manage Locations page on "
					+ "clicking locations card in Order Settings page.")
	public void clickLocationsCard() throws Exception
	{
		Boolean status = orderSettings.clickLocationsCard();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7,
			description = "Verify user navigates to Manage Tests page on "
					+ "clicking tests card in Order Settings page.")
	public void clickTestsCard() throws Exception
	{
		Boolean status = orderSettings.clickTestsCard();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
