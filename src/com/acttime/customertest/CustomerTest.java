package com.acttime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileDataUtiles;
import com.acttime.genericlib.WebdrivercommonUtils;
import com.acttime.objectrepositorylib.CreateNewcustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.Task;

public class CustomerTest extends BaseClass{
	
	FileDataUtiles file = new FileDataUtiles();
    WebdrivercommonUtils wLib = new WebdrivercommonUtils();

	@Test
	public void createCustomerTest() throws Throwable {
		//read the data
		String customerName = file.getExcelData("Sheet1", 2, 2);
		//step2 : navigate to Task Page
		Home hp = PageFactory.initElements(driver,Home.class);
		//wLib.waitForElemnetToVisible(hp.getTaskImg());
		hp.navigateToTaskPage();
		//step 3 : navigate to create customer Page
		Task tp= PageFactory.initElements(driver, Task.class);
		tp.naviagteToCustomerPage();
		//step 4 : create customer
		CreateNewcustomer cp = PageFactory.initElements(driver, CreateNewcustomer.class);
		cp.createCustomer(customerName);
	}
	
	@Test
	public void createCustomerWitDecTest() throws Throwable {
		//read the data
		String customerName = file.getExcelData("Sheet1", 5, 2);
		String customerNameDesp = file.getExcelData("Sheet1", 5, 3);
		//step2 : navigate to Task Page
		Home hp = PageFactory.initElements(driver,Home.class);
		//wLib.waitForElemnetToVisible(hp.getTaskImg());
		hp.navigateToTaskPage();
		//step 3 : navigate to create customer Page
		Task tp= PageFactory.initElements(driver, Task.class);
		tp.naviagteToCustomerPage();
		//step 4 : create cuatomer
		CreateNewcustomer cp = PageFactory.initElements(driver, CreateNewcustomer.class);
		cp.createCustomer(customerName, customerNameDesp);
	}
	
	
	

}






