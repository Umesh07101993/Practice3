package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdrivercommonUtils;

public class Users 
{
	String exstng;
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser;
	
	
	@FindBy(xpath="//input[@placeholder='Start typing name']")
	private WebElement Search;
	
	
	@FindBy(xpath="//span[text()='umesh']")
	private WebElement SearchTerm;
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement CreateUser;
	WebdrivercommonUtils wlib = new WebdrivercommonUtils();
	
	public void navToUserCreationPage()
	{
		wlib.waitForElemnetAndClick(addUser);
	}
	
	public void SearchMtd(String existingName)
	{
		Search.sendKeys(existingName);
	}
	
	public void clickOnSearched()
	{
		SearchTerm.click();
	}
	
}
