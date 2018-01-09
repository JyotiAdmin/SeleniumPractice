package com.Outlook.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Outlook.Page.OutlookObjects;

public class MyOutlookTest {

	/**
	 * @param args
	 */
	//WebDriver driver;
	static Utilities util = new Utilities();
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutlookObjects obj = new OutlookObjects();
		obj.launchBrowser();
		obj.SignOutlook();
	}*/
	//----------------------------------------------------------------------
	
	OutlookObjects obj;
	static ChromeDriver driver;
	
	@BeforeMethod
    public static void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://outlook.com/owa/wipro.com");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
	}
	
	@Test(priority=1)
	public void ComposeEmailTest(){
	
		obj = new OutlookObjects(driver);
		obj.SignInOffice();	
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("jyoti.kumari20@wipro.com")); 
		OutlookObjects.ComposeEmail();
	    OutlookObjects.SignOutEmail();
	      
	}
	//---------------------------------------------------------------------- 
	
	@Test(priority=2)
	public void DeleteEmailTest(){
		
	    obj = new OutlookObjects(driver);
		obj.SignInOffice();
	    OutlookObjects.DeleteEmail(); 	    
	    OutlookObjects.SignOutEmail();
	    
	}
	
	@AfterMethod
    public static void closeBrowser(){		
		driver.close();
		
	}
	
	 
}
