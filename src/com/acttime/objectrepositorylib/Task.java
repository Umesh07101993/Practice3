package com.acttime.objectrepositorylib;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addNewCustomerBtn;
	
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement addNewProjectBtn;
	
	public void naviagteToCustomerPage() {
		addNewBtn.click();
		addNewCustomerBtn.click();
	}
	
	public void naviagteToProjectPage() {
		addNewBtn.click();
		addNewProjectBtn.click();
	}
}
