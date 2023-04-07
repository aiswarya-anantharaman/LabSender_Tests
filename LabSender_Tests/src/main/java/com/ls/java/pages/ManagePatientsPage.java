package com.ls.java.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class ManagePatientsPage extends TestBase{

	WebElement element;
	TestUtil util = new TestUtil();
	LabDashboardPage labDashboard = new LabDashboardPage();

	private static final Logger logger = LogManager.getLogger(ManagePatientsPage.class);

	public ManagePatientsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String managePatientsPageTitle() throws Exception
	{
		String pageTitle = "Patients";
		return pageTitle;
	}

	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(), \"Patients\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	//manage patients page elements
	public WebElement patientsPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"show-entries\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Patients pane not found in manage patients page.");
		}
		return element;	
	}
	
	public WebElement createPatientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"show-entries\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Create Patient pane not found in manage patients page.");
		}
		return element;	
	}
	
	//patients pane elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"show-entries\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in patients pane.");
		}
		return element;	
	}	

	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in patients pane.");
		}
		return element;	
	}

	public WebElement patientsTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//table[@id=\"patient-table\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Patients table not found in patients pane.");
		}
		return element;	
	}

	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//ul[@class='pagination']"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for Orders table not found in patients pane.");
		}
		return element;	
	}

	public WebElement advancedFilteringBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[@id=\"result-toggle-filter\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Advanced Filtering/Hide Filters option for patients table not found in patients pane.");
		}
		return element;	
	}

	public WebElement registeredFromDate() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"filter-from-date\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Registered From Date field not found in Advanced Filtering for patients table in patients pane.");
		}
		return element;	
	}

	public WebElement registeredToDate() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"filter-to-date\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Registered To Date field not found in Advanced Filtering for patients table in patients pane.");
		}
		return element;	
	}

	public WebElement filterByLocationDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"filter_results_by_location\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Filter By Location dropdown not found in Advanced Filtering for patients table in patients pane.");
		}
		return element;	
	}
	
	//create patient pane elements
	public WebElement patientId() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='patient_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Id field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientLastName() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='last_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Last name field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientFirstName() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='first_name']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient First name field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientPhone() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='phone']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Phone field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientEmail() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='patient_email']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Email field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientDOB() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='datefield']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient DOB field not found in create patient pane.");
		}
		return element;	
	} 
	
	public WebElement patientAddress() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='address']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Address field not found in create patient pane.");
		}
		return element;	
	} 
	
	public WebElement patientAddressLine2() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='address2']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Address Line 2 field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientCity() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='city']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient City field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientState() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name='state']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient State field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientZip() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='zip']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Zip field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientDLNumber() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='drivers_license_number']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Drivers License Number field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientIdCard() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='idCard']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Id Card field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement patientResultsFile() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@name='resultsFile']"));					
		} catch (Exception e) {			
			logger.error("Error : Patient Results File field not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement clientDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@name='client_id']"));					
		} catch (Exception e) {			
			logger.error("Error : Client Dropdown not found in create patient pane.");
		}
		return element;	
	}
	
	public WebElement createBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));					
		} catch (Exception e) {			
			logger.error("Error : Create button not found in create patient pane.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.managePatientsBtnSideNav().click();
		logger.info("Navigating to Manage Patients page.");
	}
	
	public Boolean verifyPageUrl() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		if(util.getPageUrl().contains(util.managePatientsPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.info("Error : Unable to verify Manage Patients page URL.");
		}
		return status;
	}

	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(managePatientsPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.info("Error : Unable to verify Manage Patients page title.");
		}
		return status;
	}
	
	public Boolean pageElementsRenderedManagePatients() throws Exception
	{
		Boolean status = null;
		Boolean patientsPaneStatus = null;
		Boolean createPatientPaneStatus = null;
		if(patientsPane().isDisplayed() && patientsPane().isEnabled())
		{
			patientsPaneStatus = true;
		}
		else
		{
			patientsPaneStatus = false;
			logger.error("Error : patients pane not displayed or not enabled.");
		}
		if(createPatientPane().isDisplayed() && createPatientPane().isEnabled())
		{
			createPatientPaneStatus = true;
		}
		else
		{
			createPatientPaneStatus = false;
			logger.error("Error : create patient not displayed or not enabled.");
		}
		if(patientsPaneStatus.equals(true) && createPatientPaneStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsRenderedPatientsPane() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchBoxStatus = null;
		Boolean patientsTableStatus = null;
		Boolean advancedFilteringBtnStatus = null;
		Boolean registeredFromDateStatus = null;
		Boolean registeredToDateStatus = null;
		Boolean filterByLocationDropdownStatus = null;
		Boolean paginationStatus = null;
		navigateToPage();
		if(showEntriesDropdown().isDisplayed() && showEntriesDropdown().isEnabled())
		{
			showEntriesDropdownStatus = true;
		}
		else
		{
			showEntriesDropdownStatus = false;
			logger.error("Error : show entries dropdown not displayed or not enabled.");
		}
		if(searchBox().isDisplayed() && searchBox().isEnabled())
		{
			searchBoxStatus = true;
		}
		else
		{
			searchBoxStatus = false;
			logger.error("Error : search box not displayed or not enabled.");
		}
		if(patientsTable().isDisplayed() && patientsTable().isEnabled())
		{
			patientsTableStatus = true;
		}
		else
		{
			patientsTableStatus = false;
			logger.error("Error : patients table not displayed or not enabled.");
		}
		if(advancedFilteringBtn().isDisplayed() && advancedFilteringBtn().isEnabled())
		{
			advancedFilteringBtnStatus = true;
		}
		else
		{
			advancedFilteringBtnStatus = false;
			logger.error("Error : Advanced Filtering/Hide Filters option not displayed or not enabled.");
		}
		//click advanced filtering btn to display registered from date, registered to date and filter by location drop down
		advancedFilteringBtn().click();
		if(registeredFromDate().isDisplayed() && registeredFromDate().isEnabled())
		{
			registeredFromDateStatus = true;
		}
		else
		{
			registeredFromDateStatus = false;
			logger.error("Error : Registered From Date field not displayed or not enabled.");
		}
		if(registeredToDate().isDisplayed() && registeredToDate().isEnabled())
		{
			registeredToDateStatus = true;
		}
		else
		{
			registeredToDateStatus = false;
			logger.error("Error : Registered To Date field not displayed or not enabled.");
		}
		if(filterByLocationDropdown().isDisplayed() && filterByLocationDropdown().isEnabled())
		{
			filterByLocationDropdownStatus = true;
		}
		else
		{
			filterByLocationDropdownStatus = false;
			logger.error("Error : Filter By Location dropdown not displayed or not enabled.");
		}
		if(pagination().isDisplayed() && pagination().isEnabled())
		{
			paginationStatus = true;
		}
		else
		{
			paginationStatus = false;
			logger.error("Error : pagination for current clients table not displayed or not enabled.");
		}
		if(showEntriesDropdownStatus.equals(true) && searchBoxStatus.equals(true)
				&& patientsTableStatus.equals(true) && advancedFilteringBtnStatus.equals(true)
				&& registeredFromDateStatus.equals(true) && registeredToDateStatus.equals(true)
				&& filterByLocationDropdownStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}
	
	public Boolean verifyUIElementsRenderedCreatePatientPane() throws Exception
	{
		Boolean status = null;
		Boolean patientIdFieldStatus = null; 
		Boolean patientLastnameFieldStatus = null; 
		Boolean patientFirstnameFieldStatus = null; 
		Boolean patientPhoneFieldStatus = null;
		Boolean patientEmailFieldStatus = null; 
		Boolean patientDOBFieldStatus = null;
		Boolean patientAddressFieldStatus = null;
		Boolean patientAddressLine2FieldStatus = null;
		Boolean patientCityFieldStatus = null; 
		Boolean patientStateFieldStatus = null;
		Boolean patientZipFieldStatus = null;
		Boolean patientDLNumberFieldStatus = null; 
		Boolean patientIdCardStatus = null; 
		Boolean patientResultsFileStatus = null; 
		Boolean clientDropdownStatus = null;
		Boolean createBtnStatus = null;
		if(patientId().isDisplayed() && patientId().isEnabled())
		{
			patientIdFieldStatus = true;
		}
		else
		{
			patientIdFieldStatus = false;
			logger.error("Error : patient id field not displayed or not enabled.");
		}
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
		if(patientPhone().isDisplayed() && patientPhone().isEnabled())
		{
			patientPhoneFieldStatus = true;
		}
		else
		{
			patientPhoneFieldStatus = false;
			logger.error("Error : patient phone field not displayed or not enabled.");
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
		if(patientZip().isDisplayed() && patientZip().isEnabled())
		{
			patientZipFieldStatus = true;
		}
		else
		{
			patientZipFieldStatus = false;
			logger.error("Error : patient zip code field not displayed or not enabled.");
		}
		if(patientDLNumber().isDisplayed() && patientDLNumber().isEnabled())
		{
			patientDLNumberFieldStatus = true;
		}
		else
		{
			patientDLNumberFieldStatus = false;
			logger.error("Error : patient DL number field not displayed or not enabled.");
		}
		if(patientIdCard().isDisplayed() && patientIdCard().isEnabled())
		{
			patientIdCardStatus = true;
		}
		else
		{
			patientIdCardStatus = false;
			logger.error("Error : patient Id card field not displayed or not enabled.");
		}
		if(patientResultsFile().isDisplayed() && patientResultsFile().isEnabled())
		{
			patientResultsFileStatus = true;
		}
		else
		{
			patientResultsFileStatus = false;
			logger.error("Error : patient results file field not displayed or not enabled.");
		}
		if(clientDropdown().isDisplayed() && clientDropdown().isEnabled())
		{
			clientDropdownStatus = true;
		}
		else
		{
			clientDropdownStatus = false;
			logger.error("Error : client dropdown not displayed or not enabled.");
		}
		if(createBtn().isDisplayed() && createBtn().isEnabled())
		{
			createBtnStatus = true;
		}
		else
		{
			createBtnStatus = false;
			logger.error("Error : create button not displayed or not enabled.");
		}
		if(patientIdFieldStatus.equals(true) && patientLastnameFieldStatus.equals(true)
				&& patientFirstnameFieldStatus.equals(true) && patientPhoneFieldStatus.equals(true)
				&& patientEmailFieldStatus.equals(true) && patientDOBFieldStatus.equals(true)
				&& patientAddressFieldStatus.equals(true) && patientAddressLine2FieldStatus.equals(true)
				&& patientCityFieldStatus.equals(true) && patientStateFieldStatus.equals(true)
				&& patientZipFieldStatus.equals(true) && patientDLNumberFieldStatus.equals(true)
				&& patientIdCardStatus.equals(true) && patientResultsFileStatus.equals(true)
				&& clientDropdownStatus.equals(true) && createBtnStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}

	public Boolean verifyShowEntriesDropdownOptions() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		ArrayList<String> options = new ArrayList<String>();
		ArrayList<String> exp_options = new ArrayList<String>();
		exp_options.add("10");
		exp_options.add("25");
		exp_options.add("50");
		exp_options.add("100");
		Select dropdown = new Select(showEntriesDropdown());		
		List <WebElement> option = dropdown.getOptions();	      
		for(int i =0; i<option.size() ; i++)
		{
			options.add(option.get(i).getText());
		}
		if(options.equals(exp_options))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Error : options missing in show entries dropdown in patients pane.");
		}
		return status;
	}
	
}
	
