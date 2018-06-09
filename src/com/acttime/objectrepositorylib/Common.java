package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebdrivercommonUtils;

public class Common extends WebdrivercommonUtils{

	
	@FindBy(linkText="Logout")
	private WebElement logoutLnk;
	
	
	public void logout() {
		WebdrivercommonUtils wLib = new WebdrivercommonUtils();
        waitForElemnetAndClick(logoutLnk);		
	}
}
