package com.Outlook.Page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Outlook.Test.Utilities;

public class OutlookObjects {
	
	static WebDriver driver;
	static Utilities util = new Utilities();
	
	
	//By txtUser = By.xpath("//div[@class='placeholder']");
	static	By txtUser = By.xpath("//div[@data-bind='text: hintText, css: hintCss']");
	
	static	By txtPswrd = By.xpath("//div[@class='placeholder']");
	static	By btnNext = By.xpath("//input[@type='submit']");
	static	By btnYes = By.xpath("//input[@id='idSIButton9']");
	static	By btnNo = By.xpath("//input[@id='idBtn_Back']");
	
	static	By inputUser = By.id("userNameInput");
	static	By inputPwd = By.id("passwordInput");
	static  By btnSign = By.id("submitButton");
	static	By linkOutlook = By.xpath("//a[@id='ShellMail_link']");
	
	static By btnNewEmail = By.xpath("//button[@title='Write a new message (N)']");
	static By btnMoreComm =By.xpath("//button[@title='More new commands']");
	
	
	static By txtToOld = By.xpath("//div[@autoid='_mcp_9']");
	static By txtTo = By.xpath("//INPUT[@autoid='_fp_5'][1]");
	
	static By txtSubjctOld = By.xpath("//INPUT[@autoid='_mcp_c']");
	static By txtSubjct = By.xpath("//INPUT[@autoid='_mcp_c']");
	
	static By btnSend = By.xpath("//button[@title='Send'][@autoid='_fce_0']");
	static By btnContent = By.xpath("//div[@aria-label='Message body']");
	
	static By btnSearchEmail = By.xpath("//button[@aria-label='Activate Search Textbox']");	
	static By inputSearchEmail = By.xpath("//input[@autoid='_is_3']");
	static	By btnDelete = By.xpath("//button[@title='Delete (Del)']");
	static	By btnSearchSymbol = By.xpath("//button[@class='_is_w o365button']");
	static	By txtClearSearch = By.xpath("//input[@autoid='_is_3']");
	static	By btnExitSearch = By.xpath("//button[@class='_is_9 o365button'][2]");
	
	
	//button[@class='_is_w o365button']
	//button[@aria-labelledby='_ariaId_130']
	
	static	By firstEmailDel = By.xpath("//*[text()='TestEmail']");
	
	static	By btnSingBAS = By.id("O365_MeFlexPane_ButtonID");
	static	By LinkSignoutOld = By.id("O365_SubLink_ShellSignout");
	static	By LinkSignout = By.linkText("Sign out");
	static	By txtSignout = By.linkText("//div[@id='login_workload_logo_text']");
	
	
	static	By inboxCount =By.xpath("//div[@id='_ariaId_103']//span[@autoid='_n_T']");
	
	
	 
	static  String emailSubjct1="TestEmail 1";
	static  String emailSubjct2="TestEmail 2";
	static  String emailSubjct3="TestEmail 3";
	  
	public OutlookObjects(WebDriver driver){
		this.driver=driver;		
	}
	
	public  void SignInOffice(){
		
		util.Mywait(3000);
		driver.findElement(inputUser).sendKeys("JY397216@wipro.com");	
		util.Mywait(2000);
		driver.findElement(inputPwd).sendKeys("Jan2018#");	
		driver.findElement(btnSign).click();
		util.Mywait(3000);
		driver.findElement(btnYes).click();	
		
	}
	
	  
	
      public static void ComposeEmail(){    	  
    	     	  
    	 // compose  Email-1
    	  util.MyExplicitwait(btnNewEmail,driver);
    	  driver.findElement(btnNewEmail).click();
    	  util.Mywait(2000);
    	  driver.findElement(txtTo).sendKeys("Jyoti.Kumari20@wipro.com");
    	  util.Mywait(2000);
    	  driver.findElement(txtSubjct).sendKeys(emailSubjct1);
    	  util.Mywait(2000);
    	  driver.findElement(btnContent).sendKeys("Hi Jyoti_1");
    	  util.Mywait(2000);
    	  driver.findElement(btnSend).click();
    	  util.Mywait(2000);
    	  
    	// compose  Email-2
    	  util.MyExplicitwait(btnNewEmail,driver);
	      driver.findElement(btnNewEmail).click();
	 	  util.Mywait(2000);
    	  WebDriverWait wait = new WebDriverWait(driver, 10);    	  
    	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtTo));
   	  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
    	  driver.findElement(txtTo).sendKeys("Jyoti.Kumari20@wipro.com");
    	  util.Mywait(2000);
    	  driver.findElement(txtSubjct).sendKeys(emailSubjct2);
    	  util.Mywait(2000);
    	  driver.findElement(btnContent).sendKeys("Hi Jyoti_2");
    	  util.Mywait(2000);
    	  driver.findElement(btnSend).click();
    	  util.Mywait(2000);
    	  
    	  // compose  Email-3
    	  util.MyExplicitwait(btnNewEmail,driver);
    	  driver.findElement(btnNewEmail).click();
 		  util.Mywait(2000);
    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	    	 
    	  driver.findElement(txtTo).sendKeys("Jyoti.Kumari20@wipro.com");
    	  util.Mywait(2000);
    	  driver.findElement(txtSubjct).sendKeys(emailSubjct3);
    	  util.Mywait(2000);
    	  driver.findElement(btnContent).sendKeys("Hi Jyoti_3");
    	  util.Mywait(2000);
    	  driver.findElement(btnSend).click();
    	  util.Mywait(2000);
			 
      }
	
      public static void DeleteEmail(){  
    	  
    	  // Delete Email-1
    	  util.MyExplicitwait(btnSearchEmail,driver);
    	  driver.findElement(btnSearchEmail).click();
    	  util.Mywait(2000);
    	  System.out.println(emailSubjct1);
    	  driver.findElement(inputSearchEmail).sendKeys(emailSubjct1);
    	  util.Mywait(1000);
    	  driver.findElement(btnSearchSymbol).click();
    	  util.Mywait(1000);
    	  driver.findElement(firstEmailDel).click();
    	  util.Mywait(2000);
    	  driver.findElement(btnDelete).click();
    	  
    	  
    	// Delete Email-2
    	  
    	  //driver.findElement(txtClearSearch).click();
    	  //driver.findElement(txtClearSearch).clear();    	  
    	  //util.MyExplicitwait(btnSearchEmail,driver);
    	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  util.Mywait(1000);
          driver.findElement(btnExitSearch).click();    	  
    	  util.Mywait(1000);
    	  driver.findElement(btnSearchEmail).click();
    	  driver.findElement(inputSearchEmail).sendKeys(emailSubjct2);    	  
    	  //String del2="//input[@aria-label='Search mail and people, type your search term then press enter to search.']";
    	  //driver.findElement(By.xpath(del2)).sendKeys(emailSubjct2);
    	  driver.findElement(btnSearchSymbol).click();
    	  util.Mywait(2000);
    	  driver.findElement(firstEmailDel).click();
    	  util.Mywait(1000);    	  
    	  driver.findElement(btnDelete).click();
    	  
    	  
    	// Delete Email-3
    	  //driver.findElement(txtClearSearch).click();
    	 // driver.findElement(txtClearSearch).clear();
    	  //util.MyExplicitwait(btnSearchEmail,driver);
    	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
    	  
    	  util.Mywait(1000);
          driver.findElement(btnExitSearch).click();    	  
    	  util.Mywait(1000);
    	  driver.findElement(btnSearchEmail).click();
    	  driver.findElement(inputSearchEmail).sendKeys(emailSubjct3);
    	 // String del3="//input[@aria-label='Search mail and people, type your search term then press enter to search.']";
    	  //driver.findElement(By.xpath(del3)).sendKeys(emailSubjct3);
    	 
    	  driver.findElement(btnSearchSymbol).click();
    	  util.Mywait(2000);    	  
    	  driver.findElement(firstEmailDel).click();
    	  util.Mywait(2000);
    	  driver.findElement(btnDelete).click();
    	  util.Mywait(2000);
	
      }
      
      public static void SignOutEmail(){  
    	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    	  driver.findElement(btnSingBAS).click();
    	  util.Mywait(2);
    	  driver.findElement(LinkSignout).click();
    	  util.Mywait(3000);
    	 /*
    	  String logOutTitle=driver.findElement(txtSignout).getText(); 
    	  System.out.println("logout title"+logOutTitle);
    	  String loginPageTitle = driver.getTitle();
  		  System.out.println("loginPageTitle"+loginPageTitle);
  	      Assert.assertTrue(loginPageTitle.toLowerCase().contains("jyoti.kumari20@wipro.com")); 
  		*/
      }
      
      
      public static void verifyInbox(){
    	String numS =  driver.findElement(inboxCount).getText();
    	int numInt = Integer.valueOf(numS);
    	System.out.println("Inbox Count"+numInt);    	
    	
      }

}
