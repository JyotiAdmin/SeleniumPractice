package com.CartOpen.TestCart;

import com.Opencart.PageObjects.*;
import com.Outlook.Page.OutlookObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {

	
	/**
	 * 
	 * @param args
	 */
	public static  ObjectsOpenCart obj;	
	static ChromeDriver driver;
	
	@BeforeTest
    public static void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.207.182.108:81/opencart/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		obj = new ObjectsOpenCart(driver);
	}
	
	/*@Test(priority=1)	
	public static void CreateUserAccount(){
		
		//********************************************************************************
				@SuppressWarnings("unchecked")
				ArrayList accnt = new ArrayList(obj.inputDetails());
				//obj.CreateAccount(accnt);				
				if(obj.CreateAccount(accnt)){
	            obj.getProductDetails();}
			    //obj.addToCartImg();
			    obj.remvfrmCartImg();
			    obj.logOut();
	}*/

	@Test(priority=2)	
	public static void LoginUserAccount(){		
		
		obj.loginOpenCart();		
		obj.getFeatureItem();
		obj.editShopCart();
		obj.checkOutCart();
		obj.gotoMyAccount();
		//obj.verifyCheckout();
		obj.logOut();
		
	}
	
	@AfterTest
	public static void CloseOpenCart(){
		driver.close();
		System.out.println("Close Open Cart Browser : ");
	}
	
}// end class
