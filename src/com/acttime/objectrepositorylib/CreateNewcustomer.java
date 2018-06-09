package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdrivercommonUtils;

public class CreateNewcustomer extends WebdrivercommonUtils{
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameEdt;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDesciptionEdt;
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	public void createCustomer(String customerName) {
		customerNameEdt.sendKeys(customerName);
		
		waitForElemnetAndClick(createCustomerBtn);
	}
	public void createCustomer(String customerName, String customerDecp) {
		customerNameEdt.sendKeys(customerName);
		customerDesciptionEdt.sendKeys(customerDecp);
		waitForElemnetAndClick(createCustomerBtn);
	}

}
