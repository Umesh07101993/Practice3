package com.acttime.usertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.FileDataUtiles;
import com.acttime.objectrepositorylib.CreateNewUser;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.Users;

public class UserTest extends BaseClass
{
	FileDataUtiles file = new FileDataUtiles();
	@Test
	public void createUserTest() throws Throwable 
	{
		Home hp2 = PageFactory.initElements(driver, Home.class);
		hp2.navigateToUserPage();
		Users up = PageFactory.initElements(driver, Users.class);
		up.navToUserCreationPage();
		
		String firstName = file.getExcelData("Sheet2", 1, 0);
		String LastName = file.getExcelData("Sheet2", 1, 1);
		String Email = file.getExcelData("Sheet2", 1, 2);
		String Username = file.getExcelData("Sheet2", 1, 3);
		String Password = file.getExcelData("Sheet2", 1, 4);

		CreateNewUser CreateUser = PageFactory.initElements(driver, CreateNewUser.class);
		CreateUser.createUser(firstName, LastName, Email, Username, Password);		
	}
	
	@Test
	public void modifyUserTest() throws Throwable {
		Home hp2 = PageFactory.initElements(driver, Home.class);
		hp2.navigateToUserPage();
		String ExistingName = file.getExcelData("Sheet2", 1, 0);
		
		Users up = PageFactory.initElements(driver, Users.class);
		up.SearchMtd(ExistingName);
		up.clickOnSearched();
		
		CreateNewUser CreateUser = PageFactory.initElements(driver, CreateNewUser.class);
		String firstName = file.getExcelData("Sheet2", 2, 0);
		String LastName = file.getExcelData("Sheet2", 2, 1);
		String Email = file.getExcelData("Sheet2", 2, 2);
		String Username = file.getExcelData("Sheet2", 2, 3);
		String Password = file.getExcelData("Sheet2", 2, 4);
		
		CreateUser.firstName().sendKeys(firstName);
		CreateUser.LastName().sendKeys(LastName);
		CreateUser.Email().sendKeys(Email);
		CreateUser.username().sendKeys(Username);
		CreateUser.password().sendKeys(Password);
		CreateUser.retypePwd().sendKeys(Password);
		
		CreateUser.Save(); 
	}
	
	@Test
	public void searchUserTest() {
		System.out.println("search Customet");
	}

}
