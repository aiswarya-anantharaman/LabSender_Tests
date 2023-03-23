package com.ls.java.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class EditingClientPage extends TestBase{
	
	WebElement element;
	TestUtil util = new TestUtil();
	private static final Logger logger = LogManager.getLogger(EditingClientPage.class);

	public EditingClientPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String editingClientPageTitle() throws Exception
	{
		String pageTitle = "Editing Client";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h1[contains(text(),'Editing Client')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	//Editing Client Page panes
	public WebElement editingClientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[2]/form/descendant::div[3]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Editing Client Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	public WebElement providersAssignedToClientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), 'Providers Assigned to Client')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Providers Assigned to Client Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	public WebElement assignNewProvidersToClientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), 'Assign New Providers to Client')]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Assign New Providers to Client Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	public WebElement addSubClientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[4]/form/descendant::div[3]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add SubClient Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	public WebElement manageTestsForThisClientPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[5]/descendant::div[3]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Manage Tests For This Client Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	public WebElement uploadProviderSignaturePane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[6]/descendant::div[3]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Upload Provider Signature Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	public WebElement clientUsersPane() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[8]/descendant::div[3]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Users Pane not found on Editing Client page.");
		}
		return element;	
	}
	
	//Editing Client: pane elements
	public WebElement ec_clientNameEditBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[2]//input[@id='client_name']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Name edit box not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_clientNumberEditBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[2]//input[@id='client_number']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Number edit box not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_defaultProviderDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[2]//select[@id='provider_id']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Default/Primary Provider dropdown not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_defaultTestDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='default_test']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Default test dropdown not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_defaultSpecimenSourceDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='default_source']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Default Specimen Source dropdown not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_resultNotificationsCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='result_notifications']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Result Notifications checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_emailAddressBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='notify_email_address']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Email Address edit box not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_notificationFreqDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id='notify_frequency_hours']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Notification frequency dropdown not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_orderingProviderCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='ordering_provider']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Include Ordering Provider checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_displayInsuranceImageCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='display_ins_images']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Display Patient Insurance Card Photos on Order Requisition checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_insuranceCardImageReqdCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='ins_card_photo_required']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Insurance Card Image Required checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_insuranceOrDLReqdCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='ins_driversid_required']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Insurance or Drivers ID Required checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_sendResultToProviderCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='pat_res_notify_prov']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Send Patient Result Notification To Provider checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_sendOrderConfirmationCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='confirmation']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Send Order Confirmation Emails checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_enableConsentCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='consent']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Enable Parent/Guardian Minor Consent checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_brandedReportCheckbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='branded_report']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Brand Result Report/PDF with Client Info checkbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_clientPhoneEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='client_phone']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Phone Number editbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_clientEmailEditbox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='client_email']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Email editbox not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement ec_clientLogobox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='client_logo']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Logo box not found on Editing Client pane.");
		}
		return element;	
	}
	
	public WebElement updateBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(), \"Update\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Update btn not found on Editing Client pane.");
		}
		return element;	
	}
	
	//Assign New Providers to Client pane elements
	
	
	
	
	//Upload Provider Signature pane elements
	public WebElement clickHereToUploadSignatureBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(@href, \"signature\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Click Here To Upload Signature btn not found on Upload Provider Signature pane.");
		}
		return element;	
	}
	
	//Manage Tests For This Client pane elements
	public WebElement testsActivated() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Tests Activated\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Tests Activated For Client not found on Manage Tests For This Client pane.");
		}
		return element;	
	}
	
	public WebElement testsAvailable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"Tests Available\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Tests Activated For Client not found on Manage Tests For This Client pane.");
		}
		return element;	
	}
	
	public WebElement addTestBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(text(), \"Test\")]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add Test button not found on Manage Tests For This Client pane.");
		}
		return element;	
	}
	
	//Add SubClient pane elements
	public WebElement asc_clientNameEditBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[4]//input[@id='client_name']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Name edit box not found on Add SubClient Pane.");
		}
		return element;	
	}
	
	public WebElement asc_clientIdEditBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[4]//input[@id='client_number']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Client Id edit box not found on Add SubClient Pane.");
		}
		return element;	
	}
	
	public WebElement asc_providerIdDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[4]//select[@id='provider_id']"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Provider Id dropdown not found on Add SubClient Pane.");
		}
		return element;	
	}
	
	public WebElement asc_addBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(@class, 'welcome')]/child::div[4]//button[@type=\"submit\"]"));					
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error : Add button not found on Add SubClient Pane.");
		}
		return element;	
	}
	
	
}
