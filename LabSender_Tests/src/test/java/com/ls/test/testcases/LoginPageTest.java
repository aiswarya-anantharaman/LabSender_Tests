package com.ls.test.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ls.java.base.TestBase;
import com.ls.java.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	
	public LoginPageTest()
	{
		super();
	}
	
	@Parameters({ "url" })
	@BeforeClass
	public void setUp(String url) throws Exception
	{
		initialization(url);
		login = new LoginPage();
	}
	
	@Test(priority = 1,
			description = "Verify page elements rendered properly in Login page.")
	public void pageElementsRendered() throws Exception
	{
		Boolean status = login.verifyPageElementsRendered();
		Assert.assertEquals(true, status);
	}

	@Parameters({ "username", "password" })
	@Test(priority = 2,
			description = "Verify user able to login using valid credentials.")
	public void validUserLogin(String username, String password) throws Exception
	{
		Boolean status = login.verifyValidUserLogin(username, password);
		Assert.assertEquals(true, status);
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
}
