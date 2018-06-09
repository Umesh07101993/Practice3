package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	//Webelemnets locator    // initialization  
	@FindBy(id="username")
     private WebElement userEdt; 
	
	@FindBy(name="pwd")
    private WebElement passwordEdt; 

	@FindBy(id="loginButton")
    private WebElement loginBtn; 
	
	@FindBy(xpath="//span[contains(text(),'try')]")
	private WebElement errorMsg;
	
	//getters to provide single elements to test writter 
	public WebElement getErrorMsg() {
		return errorMsg;
		
		
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//business Libraries         // usage
	public void login() {
		userEdt.sendKeys("admin");
		passwordEdt.sendKeys("manager");
		loginBtn.click();
	}
	public void login(String username, String password) {
		userEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
}
