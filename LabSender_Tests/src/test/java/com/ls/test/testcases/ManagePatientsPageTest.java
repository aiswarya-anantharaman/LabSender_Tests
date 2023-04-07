package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.AdminDashboardPage;
import com.ls.java.pages.LoginPage;
import com.ls.java.pages.ManagePatientsPage;
import com.ls.java.pages.ViewOrdersPage;
import com.ls.java.util.TestUtil;

public class ManagePatientsPageTest extends TestBase{

	LoginPage login;
	AdminDashboardPage adminDashboard;
	TestUtil util = new TestUtil();
	ManagePatientsPage managePatients;

	public ManagePatientsPageTest()
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
		managePatients = new ManagePatientsPage();
		login.userLogin(username, password);
		//switch to lab view - lab user
		if(adminDashboard.pageTitle().isDisplayed())
		{
			adminDashboard.labViewCard().click();
		}
		managePatients.navigateToPage();
	}

	@Test(priority = 1,
			description = "Verify page URL for Manage Patients page.")
	public void pageUrl() throws Exception
	{
		Boolean status = managePatients.verifyPageUrl();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 2,
			description = "Verify page title for Manage Patients page.")
	public void pageTitle() throws Exception
	{
		Boolean status = managePatients.verifyPageTitle();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 3, 
			description = "Verify page elements are rendered peoperly on the Manage Patients page.")
	public void verifyPageElementsRenderedManagePatients() throws Exception
	{
		Boolean status = managePatients.pageElementsRenderedManagePatients();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 4, 
			description = "Verify page elements are rendered peoperly on the Patients pane.")
	public void verifyUIElementsRenderedPatientsPane() throws Exception
	{
		Boolean status = managePatients.verifyUIElementsRenderedPatientsPane();
		Assert.assertEquals(true, status);
	}
	
	@Test(priority = 5, 
			description = "Verify page elements are rendered peoperly on the Create Patient pane.")
	public void verifyUIElementsRenderedCreatePatientPane() throws Exception
	{
		Boolean status = managePatients.verifyUIElementsRenderedCreatePatientPane();
		Assert.assertEquals(true, status);
	}

	@Test(priority = 6, 
			description = "Verify options listed under show entries dropdown.")
	public void showEntriesDropdownOptions() throws Exception
	{
		Boolean status = managePatients.verifyShowEntriesDropdownOptions();
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
