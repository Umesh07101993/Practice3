package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUser 
{
	
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement 	FirstName;
	
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement LastName;
	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement Email;
	
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement username;
	
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement password;
	
	
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement retypePwd;
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement CreateUser;
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement Save;
	
	public void createUser(String FName,String LName,String mail,String Usn,String pwd)
	{
		FirstName.sendKeys(FName);
		LastName.sendKeys(LName);
		Email.sendKeys(mail);
		username.sendKeys(Usn);
		password.sendKeys(pwd);
		retypePwd.sendKeys(pwd);
		CreateUser.click();
	}
	
	public WebElement firstName()
	{
		return FirstName;
	}
	public WebElement LastName()
	{
		return LastName;
	}
	public WebElement Email()
	{
		return Email;
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement retypePwd()
	{
		return retypePwd;
	}
	public void Save()
	{
		Save.click();
	}

}
