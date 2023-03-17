package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class SpecimenSourceManagementPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	private static final Logger logger = LogManager.getLogger(SpecimenSourceManagementPage.class);

	public SpecimenSourceManagementPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Manage Specimen Sources')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	public WebElement currentSpecimenSourcesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(),'Current Specimen Sources')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Current Specimen Sources pane not found in Manage Specimen Sources page.");
		}
		return element;	
	}
	
	public WebElement createNewSpecimenSourcePane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(),'Create New Specimen Source')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Create New Specimen Source pane not found in Manage Specimen Sources page.");
		}
		return element;	
	}
	
	public WebElement returnToTestSettingsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[@href='/lab/tests']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Return To Test Settings Button not found in Manage Specimen Sources page.");
		}
		return element;	
	}
	
	//Current Specimen Sources pane elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name=\"user-table_length\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in Current Specimen Sources pane.");
		}
		return element;	
	}	
	
	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@type='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in Current Specimen Sources pane.");
		}
		return element;	
	}
	
	public WebElement specimenSourcesTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"user-table\"]"));					
		} catch (Exception e) {			
			logger.error("Error : specimen sources table not found in Current Specimen Sources pane.");
		}
		return element;	
	}
	
	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"user-table_paginate\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for specimen sources table not found in Current Specimen Sources pane.");
		}
		return element;	
	}
	
	//Create New Specimen Source pane elements
	public WebElement testNameDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name=\"test_id\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Test Name Dropdown not found in Create New Specimen Source pane.");
		}
		return element;	
	}
	
	public WebElement sourceTypeEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='text']"));					
		} catch (Exception e) {			
			logger.error("Error : Source Type Editbox not found in Create New Specimen Source pane.");
		}
		return element;	
	}
	
	public WebElement createBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Create button not found in Create New Specimen Source pane.");
		}
		return element;	
	}

}
