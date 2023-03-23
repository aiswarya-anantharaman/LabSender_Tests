package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class TestQuestionsPage extends TestBase{

	WebElement element;
	TestUtil util = new TestUtil();
	private static final Logger logger = LogManager.getLogger(TestQuestionsPage.class);

	public TestQuestionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//questions page
	public WebElement questionsPageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Questions')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	public WebElement addQuestionBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Add Question')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add Question button not found on Questions page.");
		}
		return element;	
	}
	
	public WebElement returnToTestBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(),'Return to Test')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Return to test button not found on Questions page.");
		}
		return element;	
	}
	
	public WebElement questionsTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//*[@id=\"content\"]/..//table"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Questions Table not found on Questions page.");
		}
		return element;	
	}
	
	//new question page
	public WebElement questionEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name=\"question\"]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Question edit box not found on new/update question page.");
		}
		return element;	
	}
	
	public WebElement questionTypeDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='type']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Question type dropdown not found on new/update question page.");
		}
		return element;	
	}
	
	public WebElement saveBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Save button not found on new question page.");
		}
		return element;	
	}
	
	public WebElement backToQuestionsBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(), 'Back to Questions')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Back To Questions button not found on new/update question page.");
		}
		return element;	
	}
	
	//update question page
	public WebElement updateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type = 'submit' and contains(text(), 'Update')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Update button not found on update question page.");
		}
		return element;	
	}
	
	//choices pane elements for single-choice and multi-choice qns
	public WebElement choicesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[@id='question-choices']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Choices pane not found for single-choice and multi-choice qns.");
		}
		return element;	
	}
	
	public WebElement optionsTextBoxChoicesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//table[@id='optionsTable']//input[@name='choices-text[]']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Options textbox not found in choices pane.");
		}
		return element;	
	}
	
	public WebElement addBtnChoicesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value='Add']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add button not found in choices pane.");
		}
		return element;	
	}
	
	public WebElement removeBtnChoicesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='button' and contains(text(), 'Remove')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Remove button not found in choices pane.");
		}
		return element;	
	}

	public WebElement addSubQnLinkChoicesPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[@id='add-sub-question']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add sub question link not found in choices pane.");
		}
		return element;	
	}
}
