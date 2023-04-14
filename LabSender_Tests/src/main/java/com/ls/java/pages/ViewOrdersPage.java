package com.ls.java.pages;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ls.java.base.TestBase;
import com.ls.java.util.TestUtil;

public class ViewOrdersPage extends TestBase{

	WebElement element;
	TestUtil util = new TestUtil();
	LabDashboardPage labDashboard = new LabDashboardPage();
	
	private static final Logger logger = LogManager.getLogger(ViewOrdersPage.class);

	public ViewOrdersPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String viewOrdersPageTitle() throws Exception
	{
		String pageTitle = "Orders";
		return pageTitle;
	}
	
	public WebElement pageTitle() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//h6[contains(text(), \"Orders\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Incorrect page.");
		}
		return element;	
	}
	
	//view orders page elements
	public WebElement showEntriesDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"show-entries\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Show entries dropdown not found in View Orders page.");
		}
		return element;	
	}	
	
	public WebElement searchBox() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='search']"));					
		} catch (Exception e) {			
			logger.error("Error : Search box not found in View Orders page.");
		}
		return element;	
	}
	
	public WebElement ordersTable() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//table[@id='orders-table']"));					
		} catch (Exception e) {			
			logger.error("Error : Orders table not found in View Orders page.");
		}
		return element;	
	}
	
	public WebElement pagination() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//ul[@class='pagination']"));					
		} catch (Exception e) {			
			logger.error("Error : Pagination for Orders table not found in View Orders page.");
		}
		return element;	
	}
	
	public WebElement countOfRecordsText() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), 'Showing')]"));					
		} catch (Exception e) {			
			logger.error("Error : Count of records text for Orders table not found in View Orders page.");
		}
		return element;	
	}

	public WebElement advancedFilteringBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[@id=\"result-toggle-filter\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Advanced Filtering/Hide Filters option for Orders table not found in View Orders page.");
		}
		return element;	
	}
	
	public WebElement orderFromDate() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"filter-from-date\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Order From Date field not found in Advanced Filtering for Orders table in View Orders page.");
		}
		return element;	
	}
	
	public WebElement orderToDate() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//input[@id=\"filter-to-date\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Order To Date field not found in Advanced Filtering for Orders table in View Orders page.");
		}
		return element;	
	}
	
	public WebElement filterByClientDropdown() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//select[@id=\"filter_results_by_name\"]"));					
		} catch (Exception e) {			
			logger.error("Error : Filter By Client dropdown not found in Advanced Filtering for Orders table in View Orders page.");
		}
		return element;	
	}

	public WebElement editOrderBtn() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//a[contains(text(), \"Edit Order\")]"));					
		} catch (Exception e) {			
			logger.error("Error : Edit Order button not found for the order.");
		}
		return element;	
	}
	
	public void navigateToPage() throws Exception
	{
		labDashboard.ordersBtnSideNav().click();
		labDashboard.viewOrdersSideNav().click();
		logger.info("Navigating to View Orders page.");
	}
	
	public Boolean verifyPageUrl() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		if(util.getPageUrl().contains(util.viewOrdersPageUrl))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page URL: " + util.getPageUrl());
			logger.error("Error : Unable to verify view orders page URL.");
		}
		return status;
	}
	
	public Boolean verifyPageTitle() throws Exception
	{
		Boolean status = null;
		navigateToPage();
		String currentPageTitle = pageTitle().getText();
		if(currentPageTitle.contains(viewOrdersPageTitle()))
		{
			status = true;
		}
		else
		{
			status = false;
			logger.error("Current page title: " + currentPageTitle);
			logger.error("Error : Unable to verify view orders page title.");
		}
		return status;
	}
	
	public Boolean verifyPageElementsRendered() throws Exception
	{
		Boolean status = null;
		Boolean showEntriesDropdownStatus = null;
		Boolean searchBoxStatus = null;
		Boolean ordersTableStatus = null;
		Boolean advancedFilteringBtnStatus = null;
		Boolean orderFromDateStatus = null;
		Boolean orderToDateStatus = null;
		Boolean filterByClientDropdownStatus = null;
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
		if(ordersTable().isDisplayed() && ordersTable().isEnabled())
		{
			ordersTableStatus = true;
		}
		else
		{
			ordersTableStatus = false;
			logger.error("Error : orders table not displayed or not enabled.");
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
		//click advanced filtering btn to display order from date, order to date and filter by client dropdown
		advancedFilteringBtn().click();
		if(orderFromDate().isDisplayed() && orderFromDate().isEnabled())
		{
			orderFromDateStatus = true;
		}
		else
		{
			orderFromDateStatus = false;
			logger.error("Error : Order From Date field not displayed or not enabled.");
		}
		if(orderToDate().isDisplayed() && orderToDate().isEnabled())
		{
			orderToDateStatus = true;
		}
		else
		{
			orderToDateStatus = false;
			logger.error("Error : Order To Date field not displayed or not enabled.");
		}
		if(filterByClientDropdown().isDisplayed() && filterByClientDropdown().isEnabled())
		{
			filterByClientDropdownStatus = true;
		}
		else
		{
			filterByClientDropdownStatus = false;
			logger.error("Error : Filter By Client dropdown not displayed or not enabled.");
		}
		if(shouldPaginationBeDisplayed())
		{
			if(pagination().isDisplayed() && pagination().isEnabled())
			{
				paginationStatus = true;
			}
			else
			{
				paginationStatus = false;
				logger.error("Error : pagination for orders table not displayed or not enabled.");
			}
		}
		else
		{
			paginationStatus = true;
		}
		if(showEntriesDropdownStatus.equals(true) && searchBoxStatus.equals(true)
				&& ordersTableStatus.equals(true) && advancedFilteringBtnStatus.equals(true)
				&& orderFromDateStatus.equals(true) && orderToDateStatus.equals(true)
				&& filterByClientDropdownStatus.equals(true) && paginationStatus.equals(true))
		{
			status = true;
		}
		else
		{
			status = false;
		}		
		return status;
	}

	public Boolean shouldPaginationBeDisplayed() throws Exception
	{
		Boolean paginationBeDisplayed = null;
		ArrayList<String> textArrayList = new ArrayList<String>();
		for(String word : countOfRecordsText().getText().split(" ")) 
		{
			textArrayList.add(word);
		}
		int currentNoOfRecords = Integer.parseInt(textArrayList.get(6));
		if(currentNoOfRecords < util.getOptionSelectedInDropdown(showEntriesDropdown()))
		{
			paginationBeDisplayed = false;
		}
		else
		{
			paginationBeDisplayed = true;
		}
		return paginationBeDisplayed;
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
      		logger.error("Error : options missing in show entries dropdown in tests pane.");
      	}
		return status;
	}

	public Boolean searchOrder(String searchString) throws Exception
	{
		Boolean status = true;
		//search for string
		searchBox().clear();
		searchBox().sendKeys(searchString);
		util.sleep(3000);
		//verify
		List<WebElement> ordersTable = driver.findElements(By.xpath("//table[@id='orders-table']/tbody/tr"));
		for(int i=1; i<=ordersTable.size(); i++)
		{
			List<String> ordersTableColValues = new ArrayList<String>();
			WebElement ordersTableRow = driver.findElement(By.xpath("//table[@id='orders-table']/tbody/tr["+i+"]"));
			List<WebElement> ordersTableCols = ordersTableRow.findElements(By.tagName("td"));
			for(int j=1; j<=ordersTableCols.size(); j++)
			{
				WebElement ordersTableCol = driver.findElement(By.xpath("//table[@id='orders-table']/tbody/tr["+i+"]/td["+j+"]"));
				String colValue = ordersTableCol.getText();
				ordersTableColValues.add(colValue);
			}
			if(!ordersTableColValues.contains(searchString))
			{
				status = false;
				break;
			}
		}		
		return status;	
	}

	public Boolean emptyTable() throws Exception
	{
		Boolean status = null;
		List<WebElement> ordersTable = driver.findElements(By.xpath("//table[@id='orders-table']/tbody/tr"));
		if(ordersTable.size() == 0)
		{
			status = true;
			logger.info("Empty orders table.");
		}
		else
		{
			status = false;
			logger.error("Error : Orders table not empty");
		}
		return status;	
	}
	
	public WebElement zeroEntries() throws Exception
	{
		try {
			element = driver.findElement(By.xpath("//div[contains(text(), \"0 entries\")]"));					
		} catch (Exception e) {			
			logger.error("Error : \"Showing total 0 entries\" not displayed in Orders table.");
		}
		return element;	
	}

	public Boolean verifyFilterOrdersUsingDates() throws Exception
	{
		Boolean status = true;
		navigateToPage();
		//click advanced filtering button
		advancedFilteringBtn().click();
		util.sleep(3000);
		
		Date pastDate = util.setDate(-30);
		String past_formatted = util.str_formattedDate(pastDate, "MM/dd/yyyy");
		Date currentDate = util.getCurrentDate();
		String current_formatted = util.str_formattedDate(currentDate, "MM/dd/yyyy");
		
		//enter order from and to dates
		util.jsRemoveReadOnlyAttribute(orderFromDate());
		orderFromDate().clear();
		orderFromDate().sendKeys(past_formatted);
		util.sleep(2000);
		util.jsRemoveReadOnlyAttribute(orderToDate());
		orderToDate().clear();
		orderToDate().sendKeys(current_formatted);
		util.sleep(2000);
		pageTitle().click();
		util.selectByVisibleTextFromDropdown("All", filterByClientDropdown());
		util.sleep(2000);
		
		logger.info("Order From Date: " + past_formatted);
		logger.info("Order To Date: " + current_formatted);
		
		//verify order records displayed are between given dates
		List<WebElement> ordersTable = driver.findElements(By.xpath("//table[@id='orders-table']/tbody/tr"));
		for(int i=1; i<=ordersTable.size(); i++)
		{
			String orderDate = driver.findElement(By.xpath("//table[@id='orders-table']/tbody/tr["+i+"]/td[2]")).getText();
			
			String date = orderDate.substring(8, 10);
			String month = orderDate.substring(5, 7);
			String year = orderDate.substring(0, 4);
			String str_dateTime = month + "/" + date + "/" + year;
			
			Date dateEntry = util.convertDateToString(str_dateTime, "MM/dd/yyyy");
			
			if(dateEntry.after(pastDate) && dateEntry.before(currentDate))
			{
				logger.info("Date entry in orders table: " + str_dateTime);
				logger.info("User able to filter orders using from and to dates in Orders table.");
			}
			else
			{
				status = false;
				logger.info("Date entry in orders table: " + str_dateTime);
				logger.error("Error : Unable to filter orders using from and to dates in Orders table.");
				break;
			}		
		}	
		return status;	
	}

	public Boolean verifyfilterOrdersUsingInvalidDates() throws Exception
	{
		Boolean status = true;
		navigateToPage();
		//click advanced filtering button
		advancedFilteringBtn().click();
		util.sleep(3000);

		Date fromDate = util.getCurrentDate();
		String fromDate_formatted = util.str_formattedDate(fromDate, "MM/dd/yyyy");
		Date toDate = util.setDate(7);
		String toDate_formatted = util.str_formattedDate(toDate, "MM/dd/yyyy");
		
		//enter order from and to dates
		util.jsRemoveReadOnlyAttribute(orderFromDate());
		orderFromDate().clear();
		orderFromDate().sendKeys(fromDate_formatted);
		util.sleep(2000);
		util.jsRemoveReadOnlyAttribute(orderToDate());
		orderToDate().clear();
		orderToDate().sendKeys(toDate_formatted);
		util.sleep(2000);
		pageTitle().click();
		util.selectByVisibleTextFromDropdown("All", filterByClientDropdown());
		util.sleep(2000);
		
		logger.info("Order From Date: " + fromDate_formatted);
		logger.info("Order To Date: " + toDate_formatted);
		
		//verify orders table is empty
		if (zeroEntries().isDisplayed())
		{
			status = true;
			logger.info("Orders table is empty for invalid order from and order to dates.");
		}
		else
		{
			status = false;
			logger.error("Error : orders table not empty for invalid order from and order to dates.");
		}		
		return status;	
	}
}
