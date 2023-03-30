package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.NewOrderPage;
import com.ls.java.util.TestUtil;

public class NewOrderPageTest  extends TestBase{

	LoginPage login;
	AdminDashboardPage adminDashboard;
	TestUtil util = new TestUtil();
	NewOrderPage newOrder;

	public NewOrderPageTest()
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
		newOrder = new NewOrderPage();
		login.userLogin(username, password);
		adminDashboard.labViewCard().click();
		newOrder.navigateToPage();
	}
	
	@Test(priority = 1,
			description = "Verify page URL for New Order page.")
	public void pageUrl() throws Exception
	{
		Boolean status = newOrder.verifyPageUrl();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 2,
			description = "Verify page title for New Order page.")
	public void pageTitle() throws Exception
	{
		Boolean status = newOrder.verifyPageTitle();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 3,
			description = "Verify page elements are rendered peoperly on the new order page.")
	public void pageElementsRenderedNewOrder() throws Exception
	{
		Boolean status = newOrder.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 4,
			description = "Verify UI elements rendered properly on the location pane in new order page.")
	public void UIElementsLocationPane() throws Exception
	{
		Boolean status = newOrder.verifyUIElementsLocationPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5,
			description = "Verify UI elements rendered properly on the Demographics pane in new order page.")
	public void UIElementsDemographicsPane() throws Exception
	{
		Boolean status = newOrder.verifyUIElementsDemographicsPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 6,
			description = "Verify UI elements rendered properly on the Specimen Information pane in new order page.")
	public void UIElementsSpecimenInformationPane() throws Exception
	{
		Boolean status = newOrder.verifyUIElementsSpecimenInformationPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 7,
			description = "Verify UI elements rendered properly on the Result Information pane in new order page.")
	public void UIElementsResultInformationPane() throws Exception
	{
		Boolean status = newOrder.verifyUIElementsResultInformationPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 8,
			description = "Verify UI elements rendered properly on the Payment Method pane in new order page.")
	public void UIElementsPaymentMethodPane() throws Exception
	{
		Boolean status = newOrder.verifyUIElementsPaymentMethodPane();
		Assert.assertEquals(true, status);
	}
	

	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
	
}
