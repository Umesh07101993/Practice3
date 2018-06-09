package com.acttime.genericlib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdrivercommonUtils {
	
	public void waitForPageToLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElemnet(WebElement elemnet) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(elemnet));
		
	}
	
	public void waitForElemnetToVisible(WebElement elemnet) {
		int count=0;
		while(count<20) {
			try {
			elemnet.isEnabled();
			break;
			}catch (Throwable e) {
				count++;
			}
		}
		
	}
	public void waitForElemnetAndClick(WebElement elemnet) {
		int count=0;
		while(count<20) {
			try {
			elemnet.click();
			break;
			}catch (Throwable e) {
				count++;
			}
		}
		
	}
	
	public void select(WebElement elemnet ,String data) {
		Select sel = new Select(elemnet);
		sel.selectByVisibleText(data);
	}
	
	
	
	
	
	
	

}
