package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class NewOrderPage extends TestBase{

	WebElement element;
	TestUtil util = new TestUtil();
	LabDashboardPage labDashboard = new LabDashboardPage();
	
	private static final Logger logger = LogManager.getLogger(NewOrderPage.class);

	public NewOrderPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String newOrderPageTitle() throws Exception
	{
		String pageTitle = "Order";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(), 'Order')]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}

	//order entry form panes
	public WebElement orderEntryFormPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Order Entry Form\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Order Entry Form pane not found in new order page.");
		}
		return element;	
	}
	
	public WebElement locationPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Location\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Location pane not found in new order page.");
		}
		return element;	
	}
	
	public WebElement demographicsPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Demographics\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Demographics pane not found in new order page.");
		}
		return element;	
	}
	
	public WebElement specimenInformationPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Specimen Information\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Specimen Information pane not found in new order page.");
		}
		return element;	
	}
	
	public WebElement resultInformationPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Result Information\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Result Information pane not found in new order page.");
		}
		return element;	
	}
	
	public WebElement paymentMethodPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Payment Method\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Payment Method pane not found in new order page.");
		}
		return element;	
	}
	
	//1. location pane elements
	public WebElement clientDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='client_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Client dropdown not found in location pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement locationDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='location_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Location dropdown not found in location pane in order entry form.");
		}
		return element;	
	}
	
	//2. Demographics pane elements
	public WebElement patientLastName() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='last_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Last name field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientFirstName() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='first_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient First name field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientMiddleInitial() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='middle_initial']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Middle Initial field not found in demographics pane in order entry form.");
		}
		return element;	
	} 

	public WebElement patientDOB() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='datefield']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient DOB field not found in demographics pane in order entry form.");
		}
		return element;	
	} 
	
	public WebElement patientAddress() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='address']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Address field not found in demographics pane in order entry form.");
		}
		return element;	
	} 
	
	public WebElement patientAddressLine2() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='address2']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Address Line 2 field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientCity() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='city']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient City field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientState() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='state']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient State field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientZipCode() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='zip']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Zip Code field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientEmail() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='email']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Email field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientMobileNumber() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='phone']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Mobile Number field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientSex() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='sex']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Sex field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientRace() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='race']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Race field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement patientEthnicity() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='ethnicity']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Ethnicity field not found in demographics pane in order entry form.");
		}
		return element;	
	}
	
	//3. Specimen information pane elements
	public WebElement testDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='sel_test']"));					
		} catch (Exception e) {			
			logger.error("Error : Test dropdown not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement collectionTimestamp() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='collection_dt[]']"));					
		} catch (Exception e) {			
			logger.error("Error : Collection date and time field not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement addAnotherTestBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value=\"Add Another Test\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Add another test btn not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement deleteTestBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@value=\"Delete Test\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Delete test btn not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	//4. Result information pane elements
	public WebElement resultField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[contains(@name,\"result[\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Result field not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement detectedBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//span[starts-with(text(), 'Detected')]"));					
		} catch (Exception e) {			
			logger.error("Error : Detected button not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement inconclusiveBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Inconclusive')]"));					
		} catch (Exception e) {			
			logger.error("Error : Inconclusive button not found in specimen information pane in order entry form.");
		}
		return element;	
	}

	public WebElement notDetectedBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//span[contains(text(), 'Not Detected')]"));					
		} catch (Exception e) {			
			logger.error("Error : Not Detected button not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement abnormalField() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='abnormal']"));					
		} catch (Exception e) {			
			logger.error("Error : Abnormal field not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement resultPhotoBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='result_photo']"));					
		} catch (Exception e) {			
			logger.error("Error : Result photo button not found in specimen information pane in order entry form.");
		}
		return element;	
	}
	
	//5. Payment method pane
	public WebElement paymentMethodDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='pay_type']"));					
		} catch (Exception e) {			
			logger.error("Error : Payment Method Dropdown not found in payment method pane in order entry form.");
		}
		return element;	
	}
	
	public WebElement nextBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Next button not found in order entry form.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.newOrderSideNav().click();
		logger.info("Navigating to New Order page.");
	}
	
	public void patientDemographicDetails
			(String patientLastname, String patientFirstname, String patientDOB,
			String patientAddress, String patientCity, String patientState,
			String patientZipCode, String patientEmail, String patientMobile,
			String patientSex, String patientRace, String patientEthnicity) throws Exception
	{
		logger.info("Entering patient demographics.");
		//fill last name
		patientLastName().clear();
		patientLastName().sendKeys(patientLastname);
		logger.info("Patient lastname entered.");
		//fill first name
		patientFirstName().clear();
		patientFirstName().sendKeys(patientFirstname);
		logger.info("Patient firstname entered.");
		//fill DOB
		patientDOB().clear();
		patientDOB().sendKeys(patientDOB);
		logger.info("Patient DOB entered.");
		//fill address
		patientAddress().clear();
		patientAddress().sendKeys(patientAddress);
		logger.info("Patient address entered.");
		//fill city
		patientCity().clear();
		patientCity().sendKeys(patientCity);
		logger.info("Patient city entered.");
		//select state
		util.selectByVisibleTextFromDropdown(patientState, patientState());
		logger.info("Patient state selected.");
		//fill zip code
		patientZipCode().clear();
		patientZipCode().sendKeys(patientZipCode);
		logger.info("Patient zipcode entered.");
		//fill email address
		patientEmail().clear();
		patientEmail().sendKeys(patientEmail);
		logger.info("Patient email entered.");
		//fill mobile number
		patientMobileNumber().clear();
		patientMobileNumber().sendKeys(patientMobile);
		logger.info("Patient mobile number entered.");
		//select sex
		util.selectByVisibleTextFromDropdown(patientSex, patientSex());
		logger.info("Patient sex selected.");
		//select race
		util.selectByVisibleTextFromDropdown(patientRace, patientRace());
		logger.info("Patient race selected.");
		//select ethnicity
		util.selectByVisibleTextFromDropdown(patientEthnicity, patientEthnicity());
		logger.info("Patient ethnicity selected.");
	}
	
	public String getPatientDOB() throws Exception
	{
		String dob = patientDOB().getAttribute("max").toString();
		return dob;
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(newOrderPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.info("Error : Unable to verify new order page title.");
		}
		return status;
	}
	
	public Boolean verifyPageUrl() throws Exception
	{
		Boolean status = null;
		if(util.getPageUrl().contains(util.newOrderPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.info("Error : Unable to verify new order page URL.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean orderEntryFormPaneStatus = null;
		Boolean locationPaneStatus = null;
		Boolean demographicsPaneStatus = null;
		Boolean specimenInformationPaneStatus = null;
		Boolean resultInformationPaneStatus = null;
		Boolean paymentMethodPaneStatus = null;
		if(orderEntryFormPane().isDisplayed() && orderEntryFormPane().isEnabled())
		{
			orderEntryFormPaneStatus = true;
		}
		else
		{
			orderEntryFormPaneStatus = false;
			logger.error("Error : Order Entry Form pane not displayed or not enabled.");
		}
		if(locationPane().isDisplayed() && locationPane().isEnabled())
		{
			locationPaneStatus = true;
		}
		else
		{
			locationPaneStatus = false;
			logger.error("Error : Location pane not displayed or not enabled.");
		}
		if(demographicsPane().isDisplayed() && demographicsPane().isEnabled())
		{
			demographicsPaneStatus = true;
		}
		else
		{
			demographicsPaneStatus = false;
			logger.error("Error : Demographics pane not displayed or not enabled.");
		}
		if(specimenInformationPane().isDisplayed() && specimenInformationPane().isEnabled())
		{
			specimenInformationPaneStatus = true;
		}
		else
		{
			specimenInformationPaneStatus = false;
			logger.error("Error : Specimen Information pane not displayed or not enabled.");
		}
		if(resultInformationPane().isDisplayed() && resultInformationPane().isEnabled())
		{
			resultInformationPaneStatus = true;
		}
		else
		{
			resultInformationPaneStatus = false;
			logger.error("Error : Result Information pane not displayed or not enabled.");
		}
		if(paymentMethodPane().isDisplayed() && paymentMethodPane().isEnabled())
		{
			paymentMethodPaneStatus = true;
		}
		else
		{
			paymentMethodPaneStatus = false;
			logger.error("Error : Specimen Information pane not displayed or not enabled.");
		}
		if(orderEntryFormPaneStatus.equals(true) && locationPaneStatus.equals(true)
				&& demographicsPaneStatus.equals(true) && specimenInformationPaneStatus.equals(true)
				&& resultInformationPaneStatus.equals(true) && paymentMethodPaneStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsLocationPane() throws Exception
	{
		Boolean status = null;
		Boolean clientDropdownStatus = null;
		Boolean locationDropdownStatus = null;
		if(clientDropdown().isDisplayed() && clientDropdown().isEnabled())
		{
			clientDropdownStatus = true;
		}
		else
		{
			clientDropdownStatus = false;
			logger.error("Error : Client Dropdown not displayed or not enabled.");
		}
		if(locationDropdown().isDisplayed() && locationDropdown().isEnabled())
		{
			locationDropdownStatus = true;
		}
		else
		{
			locationDropdownStatus = false;
			logger.error("Error : Location Dropdown not displayed or not enabled.");
		}	
		if(clientDropdownStatus.equals(true) && locationDropdownStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsSpecimenInformationPane() throws Exception
	{
		Boolean status = null;
		Boolean testDropdownStatus = null;
		Boolean collectionTimestampFieldStatus = null;
		Boolean addAnotherTestBtnStatus = null;
		Boolean deleteTestBtnStatus = null;
		if(testDropdown().isDisplayed() && testDropdown().isEnabled())
		{
			testDropdownStatus = true;
		}
		else
		{
			testDropdownStatus = false;
			logger.error("Error : Test Dropdown not displayed or not enabled.");
		}
		if(collectionTimestamp().isDisplayed() && collectionTimestamp().isEnabled())
		{
			collectionTimestampFieldStatus = true;
		}
		else
		{
			collectionTimestampFieldStatus = false;
			logger.error("Error : Collection Timestamp Field Dropdown not displayed or not enabled.");
		}
		if(addAnotherTestBtn().isDisplayed() && addAnotherTestBtn().isEnabled())
		{
			addAnotherTestBtnStatus = true;
		}
		else
		{
			addAnotherTestBtnStatus = false;
			logger.error("Error : Add another test btn not displayed or not enabled.");
		}
		if(deleteTestBtn().isDisplayed() && deleteTestBtn().isEnabled())
		{
			deleteTestBtnStatus = true;
		}
		else
		{
			deleteTestBtnStatus = false;
			logger.error("Error : Delete test btn not displayed or not enabled.");
		}
		if(testDropdownStatus.equals(true) && collectionTimestampFieldStatus.equals(true)
				&& addAnotherTestBtnStatus.equals(true) && deleteTestBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsResultInformationPane() throws Exception
	{
		Boolean status = null;
		Boolean resultFieldStatus = null;
		Boolean detectedBtnStatus = null;
		Boolean notDetectedBtnStatus = null;
		Boolean inconclusiveBtnStatus = null;
		Boolean abnormalFieldStatus = null;
		Boolean resultPhotoFieldStatus = null;
		if(resultField().isDisplayed() && resultField().isEnabled())
		{
			resultFieldStatus = true;
		}
		else
		{
			resultFieldStatus = false;
			logger.error("Error : Result field not displayed or not enabled.");
		}
		if(detectedBtn().isDisplayed() && detectedBtn().isEnabled())
		{
			detectedBtnStatus = true;
		}
		else
		{
			detectedBtnStatus = false;
			logger.error("Error : Detected btn not displayed or not enabled.");
		}
		if(notDetectedBtn().isDisplayed() && notDetectedBtn().isEnabled())
		{
			notDetectedBtnStatus = true;
		}
		else
		{
			notDetectedBtnStatus = false;
			logger.error("Error : Not detected btn not displayed or not enabled.");
		}
		if(inconclusiveBtn().isDisplayed() && inconclusiveBtn().isEnabled())
		{
			inconclusiveBtnStatus = true;
		}
		else
		{
			inconclusiveBtnStatus = false;
			logger.error("Error : Inconclusive btn not displayed or not enabled.");
		}
		if(abnormalField().isDisplayed() && abnormalField().isEnabled())
		{
			abnormalFieldStatus = true;
		}
		else
		{
			abnormalFieldStatus = false;
			logger.error("Error : Abnormal field not displayed or not enabled.");
		}
		if(resultPhotoBtn().isDisplayed() && resultPhotoBtn().isEnabled())
		{
			resultPhotoFieldStatus = true;
		}
		else
		{
			resultPhotoFieldStatus = false;
			logger.error("Error : Result photo field not displayed or not enabled.");
		}
		if(resultFieldStatus.equals(true) && detectedBtnStatus.equals(true)
				&& notDetectedBtnStatus.equals(true) && inconclusiveBtnStatus.equals(true)
				&& abnormalFieldStatus.equals(true) && resultPhotoFieldStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsPaymentMethodPane() throws Exception
	{
		Boolean status = null;
		if(paymentMethodDropdown().isDisplayed() && paymentMethodDropdown().isEnabled())
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : Payment Method dropdown not displayed or not enabled.");
		}		
		return status;
	}
	
	public Boolean verifyUIElementsDemographicsPane() throws Exception
	{
		Boolean status = null;
		Boolean patientLastnameFieldStatus = null; 
		Boolean patientFirstnameFieldStatus = null; 
		Boolean patientMiddlenameFieldStatus = null; 
		Boolean patientDOBFieldStatus = null;
		Boolean patientAddressFieldStatus = null;
		Boolean patientAddressLine2FieldStatus = null;
		Boolean patientCityFieldStatus = null; 
		Boolean patientStateFieldStatus = null;
		Boolean patientZipCodeFieldStatus = null; 
		Boolean patientEmailFieldStatus = null; 
		Boolean patientMobileFieldStatus = null;
		Boolean patientSexFieldStatus = null; 
		Boolean patientRaceFieldStatus = null; 
		Boolean patientEthnicityFieldStatus = null;
		if(patientLastName().isDisplayed() && patientLastName().isEnabled())
		{
			patientLastnameFieldStatus = true;
		}
		else
		{
			patientLastnameFieldStatus = false;
			logger.error("Error : patient last name field not displayed or not enabled.");
		}
		if(patientFirstName().isDisplayed() && patientFirstName().isEnabled())
		{
			patientFirstnameFieldStatus = true;
		}
		else
		{
			patientFirstnameFieldStatus = false;
			logger.error("Error : patient first name field not displayed or not enabled.");
		}
		if(patientFirstName().isDisplayed() && patientFirstName().isEnabled())
		{
			patientMiddlenameFieldStatus = true;
		}
		else
		{
			patientMiddlenameFieldStatus = false;
			logger.error("Error : patient middle name field not displayed or not enabled.");
		}
		if(patientDOB().isDisplayed() && patientDOB().isEnabled())
		{
			patientDOBFieldStatus = true;
		}
		else
		{
			patientDOBFieldStatus = false;
			logger.error("Error : patient DOB field not displayed or not enabled.");
		}
		if(patientAddress().isDisplayed() && patientAddress().isEnabled())
		{
			patientAddressFieldStatus = true;
		}
		else
		{
			patientAddressFieldStatus = false;
			logger.error("Error : patient address field not displayed or not enabled.");
		}
		if(patientAddressLine2().isDisplayed() && patientAddressLine2().isEnabled())
		{
			patientAddressLine2FieldStatus = true;
		}
		else
		{
			patientAddressLine2FieldStatus = false;
			logger.error("Error : patient address line 2 field not displayed or not enabled.");
		}
		if(patientCity().isDisplayed() && patientCity().isEnabled())
		{
			patientCityFieldStatus = true;
		}
		else
		{
			patientCityFieldStatus = false;
			logger.error("Error : patient city field not displayed or not enabled.");
		}
		if(patientState().isDisplayed() && patientState().isEnabled())
		{
			patientStateFieldStatus = true;
		}
		else
		{
			patientStateFieldStatus = false;
			logger.error("Error : patient state field not displayed or not enabled.");
		}
		if(patientZipCode().isDisplayed() && patientZipCode().isEnabled())
		{
			patientZipCodeFieldStatus = true;
		}
		else
		{
			patientZipCodeFieldStatus = false;
			logger.error("Error : patient zip code field not displayed or not enabled.");
		}
		if(patientEmail().isDisplayed() && patientEmail().isEnabled())
		{
			patientEmailFieldStatus = true;
		}
		else
		{
			patientEmailFieldStatus = false;
			logger.error("Error : patient email field not displayed or not enabled.");
		}
		if(patientMobileNumber().isDisplayed() && patientMobileNumber().isEnabled())
		{
			patientMobileFieldStatus = true;
		}
		else
		{
			patientMobileFieldStatus = false;
			logger.error("Error : patient mobile number field not displayed or not enabled.");
		}
		if(patientSex().isDisplayed() && patientSex().isEnabled())
		{
			patientSexFieldStatus = true;
		}
		else
		{
			patientSexFieldStatus = false;
			logger.error("Error : patient sex field not displayed or not enabled.");
		}
		if(patientRace().isDisplayed() && patientRace().isEnabled())
		{
			patientRaceFieldStatus = true;
		}
		else
		{
			patientRaceFieldStatus = false;
			logger.error("Error : patient race field not displayed or not enabled.");
		}
		if(patientEthnicity().isDisplayed() && patientEthnicity().isEnabled())
		{
			patientEthnicityFieldStatus = true;
		}
		else
		{
			patientEthnicityFieldStatus = false;
			logger.error("Error : patient ethnicity field not displayed or not enabled.");
		}
		if(patientLastnameFieldStatus.equals(true) && patientFirstnameFieldStatus.equals(true)
				&& patientMiddlenameFieldStatus.equals(true) && patientDOBFieldStatus.equals(true)
				&& patientAddressFieldStatus.equals(true) && patientAddressLine2FieldStatus.equals(true)
				&& patientCityFieldStatus.equals(true) && patientStateFieldStatus.equals(true)
				&& patientZipCodeFieldStatus.equals(true) && patientSexFieldStatus.equals(true)
				&& patientMobileFieldStatus.equals(true) && patientEmailFieldStatus.equals(true)
				&& patientRaceFieldStatus.equals(true) && patientEthnicityFieldStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	

}
