package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.ViewOrdersPage;
import com.ls.java.util.TestUtil;

public class ViewOrdersPageTest extends TestBase{

	LoginPage login;
	AdminDashboardPage adminDashboard;
	TestUtil util = new TestUtil();
	ViewOrdersPage viewOrders;

	public ViewOrdersPageTest()
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
		viewOrders = new ViewOrdersPage();
		login.userLogin(username, password);
		//switch to lab view - lab user
		if(adminDashboard.pageTitle().isDisplayed())
		{
			adminDashboard.labViewCard().click();
		}
		viewOrders.navigateToPage();
	}
	
	@Test(priority = 1,
			description = "Verify page URL for View Orders page.")
	public void pageUrl() throws Exception
	{
		Boolean status = viewOrders.verifyPageUrl();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 2,
			description = "Verify page title for View Orders page.")
	public void pageTitle() throws Exception
	{
		Boolean status = viewOrders.verifyPageTitle();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3, 
			description = "Verify page elements are rendered peoperly on the View Orders page.")
	public void pageElementsRenderedViewOrders() throws Exception
	{
		Boolean status = viewOrders.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 4, 
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = viewOrders.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
