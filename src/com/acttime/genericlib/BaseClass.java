package com.acttime.genericlib;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.acttime.objectrepositorylib.Common;
import com.acttime.objectrepositorylib.Login;

public class BaseClass {
	public static WebDriver driver; //global driver Object declaration 
	FileDataUtiles file = new FileDataUtiles();
	WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("=========launch browser======");
		Properties pObj = file.getPropertiesFileObj();
		String browserName  = pObj.getProperty("browser");
		if(browserName.equals("firefox")) {
		   driver = new FirefoxDriver();
		}else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./resource/IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		}

	}	

	@BeforeMethod
	public void configBm() throws Throwable {
		Properties pObj = file.getPropertiesFileObj();
		System.out.println("login");

        wLib.waitForPageToLoad();
        String url =pObj.getProperty("url");
        driver.get(url);
        Login lp = PageFactory.initElements(driver, Login.class);
        String username =pObj.getProperty("username");
        String password = pObj.getProperty("password");
        lp.login(username, password);
        
	}
	@AfterMethod
	public void configBM() {
		System.out.println("logout");
	  Common cPage = PageFactory.initElements(driver, Common.class);
	  cPage.logout();
	}
	@AfterClass
	public void configAC() {
		System.out.println("=====close browser========");
		driver.close();
	}
}
