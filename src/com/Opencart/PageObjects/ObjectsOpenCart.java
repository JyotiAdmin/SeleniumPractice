package com.Opencart.PageObjects;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class ObjectsOpenCart {
	
	WebDriver driver;
	//*******************************************************************************8
	// 1st Page
	By regAccount = By.xpath("//a[contains(@href,'register')]");
	By fName = By.xpath("//input[contains(@name,'firstname')]");
	By lName = By.xpath("//input[contains(@name,'lastname')]");
	By email = By.xpath("//input[contains(@name,'email')]");
	By phone = By.xpath("//input[contains(@name,'telephone')]");
	By compny = By.xpath("//input[contains(@name,'company')]");
	By address = By.xpath("//input[contains(@name,'address_1')]");
	By city = By.xpath("//input[contains(@name,'city')]");
	By postcode = By.xpath("//input[contains(@name,'postcode')]");
	By coutry = By.xpath("//select[contains(@name,'country_id')]");
	By zoneId = By.xpath("//select[contains(@name,'zone_id')]");
	By pwrd = By.xpath("//input[contains(@name,'password')]");
	By cpwrd = By.xpath("//input[contains(@name,'confirm')]");
	By chkbox = By.xpath("//input[contains(@type,'checkbox')]");
	By submit = By.xpath("//input[@type='submit']");
	By warn = By.xpath("//div[@class='warning']");	
	//*******************************************************************************
	By loginCart = By.xpath("//div[@id='welcome']/a[contains(@href,'login')]");
	By loginEmail = By.xpath("//input[@name='email']");	
	By loginPwrd = By.xpath("//input[@name='password']");
	By logOut = By.xpath("//div[@id='welcome']/a[contains(@href,'logout')]");
	// 2nd Page
	By msg = By.xpath("//div[@id='content']/h1");
	By button = By.xpath("//a[@class='button']");
	By homelnk = By.xpath("//div[@class='links']/a[contains(@href,'home')]");
	By samImg = By.xpath("//a[contains(@class,'nivo-imageLink')]");
	By reviwTab = By.xpath("//a[contains(@href,'#tab-review')]");
	
	By myAccountlnk = By.linkText("My Account");
	By wishLink = By.linkText("Add to Wish List");
	By wishList = By.xpath("//a[@id='wishlist-total']");
	By itemPrice = By.xpath("//div[@class='price']");
	By priceEuro = By.xpath("//a[@title='Euro']");
	By pricePound = By.xpath("//a[@title='Pound Sterling']");
	By priceDollar = By.xpath("//a[@title='US Dollar']");
	
	By addToCartImg = By.xpath("//img[@title='Add to Cart']");
	By removeCartImg = By.xpath("//*[@id='wishlist-row49']//td[@class='action']//img[@title='Remove']");
	By removeCartImg2 = By.xpath("//img[@title='Remove']");
	By shopcart = By.xpath("//div[@class='links']/a[contains(@href,'route=checkout/cart')]");
	
	//------------------------------------------------------------------------------
	By selectItem = By.xpath("//td[@class='name']/a[contains(@href,'product&product_id=43')]");
	//By selectItem_Choose = By.xpath("//td[@class='name']/a[contains(@href,'product&product_id="+itemcode+"')]");
	
	By iPhone = By.linkText("iPhone");
	By apple30 = By.linkText("Apple Cinema 30\"");
	
	By relatedTab = By.xpath("//a[contains(@href,'#tab-related')]");
	By Tab = By.xpath("");
	By relItem = By.linkText("Apple Cinema 30\"");
	By availOptns = By.xpath("//select[@name='option[217]']");
	By radio1 = By.xpath("//input[@id='option-value-5']");
	By chbox1 = By.xpath("//input[@id='option-value-8']");
	By txTest = By.xpath("//input[@value='test']");
	By txtArea = By.xpath("//textarea[@name='option[209]']");
	By btnUpload = By.xpath("//input[@id='button-option-222']");
	By calDate = By.xpath("//input[@name='option[219]']");
	By infoProd = By.xpath("//div[@class='product-info']");  //2011-02-02
	By calTime = By.xpath("//input[@name='option[221]']");// 22:25
	By calDateTime = By.xpath("//input[@name='option[220]']");// 2017-11-30 22:25

	By linkAddToCart = By.linkText("Add to Cart");
	By buttonCart = By.xpath("//input[@id='button-cart']");
	By msgSuccess = By.xpath("//div[@class='success']");

	
	//***********************************************************************************
	By addItem = By.xpath("//input[@onclick="+"\"addToCart"+"('40')"+";\""+"]");
	String itemcode="40";
	By addItem_Choose = By.xpath("//input[@onclick="+"addToCart"+"('"+itemcode+"')"+";"+"]");
	
	By addCartIphone = By.xpath("//a[@onclick="+"\"addToCart"+"('40')"+";\""+"]");
	By addCartIMac = By.xpath("//a[@onclick="+"\"addToCart"+"('41')"+";\""+"]");
	
	By editItemCnt = By.xpath("//input[@type='text'][@name='quantity[40::]']");	
	By updateRefresh = By.xpath("//input[@type='image'][@title='Update']");
	
	By chkOut = By.linkText("Checkout");
	By contnuBtton =  By.xpath("//input[@value='Continue']");
	By contnuBtton1 =  By.xpath("//input[@id='button-payment-address']");
	By contnuBtton2 =  By.xpath("//input[@id='button-shipping-address']");
	By contnuBtton3 =  By.xpath("//input[@id='button-shipping-method']");
	By contnuBtton4 =  By.xpath("//input[@id='button-payment-method']");
	//By contnuBtton5 =  By.xpath("//input[@id='button-payment-method");
	
	By chkboxTerms =  By.xpath("//input[@type='checkbox'][@name='agree']");
	//By chkoutName = By.xpath("//div[@class='checkout-product']/table/tbody//td[@class='name']");
	By chkoutName = By.xpath("//div[@class='checkout-product']/table/tbody/tr/td[1]/a");
	By chkoutModel = By.xpath("//div[@class='checkout-product']/table/tbody//td[@class='model']");
	By chkoutQuant = By.xpath("//div[@class='checkout-product']/table/tbody//td[@class='quantity']");
	
	By confirmBtn =  By.xpath("//input[@id='button-confirm']");
	
	//--------------------------------------------------------------------------------
	public ObjectsOpenCart(WebDriver driver){
		this.driver=driver;
	}
   //***********************************************************************************

	static String setfname ;
	static String setlname;
	static String setemail;
	static String setphone;
	static String setcompny;
	static String setaddress;
	static String setcity;
	static String setpostcode;
	static String setcoutry;
	static String setzoneId;	

	static Boolean status = false;
	
	public static Collection inputDetails(){
		System.out.println("--inputDetails--");
	     ArrayList<String> accnt = new ArrayList<String>();
	     setfname ="Jyoti";
	     setlname ="Kapoor" ;
	     setemail ="jyoti.kumary@gmail.com" ;
	     setphone = "8897941084";
	     setcompny = "Wipro";
	     setaddress=" Gopanpally";
	     setcity = "Hyderabad";
	     setpostcode = "500046";
	     setcoutry = "India";
	     setzoneId ="Andhra Pradesh" ;
		
		 accnt.add(setfname);
		 accnt.add(setlname);
		 accnt.add(setemail);
		 accnt.add(setphone);
		 accnt.add(setcompny);
		 accnt.add(setaddress);
		 accnt.add(setcity);
		 accnt.add(setpostcode);
		 accnt.add(setcoutry);
		 accnt.add(setzoneId);	 
				
		return accnt;
	}
	
	
	public boolean CreateAccount(ArrayList accnt) {
		// TODO Auto-generated method stub
		System.out.println("--CreateAccount--");
		driver.findElement(regAccount).click();	
		
		String strfname = (String) accnt.get(0);
		String strlname = (String) accnt.get(1);
		String stremail = (String) accnt.get(2);
		String strphone = (String) accnt.get(3);
		String strcompny = (String) accnt.get(4);
		String straddress = (String) accnt.get(5);
		String strcity = (String) accnt.get(6);
		String strpostcode = (String) accnt.get(7);
		String strcoutry = (String) accnt.get(8);
		String strzoneId = (String) accnt.get(9);
		
		System.out.println(strfname);
		
		driver.findElement(fName).sendKeys(strfname);
		driver.findElement(lName).sendKeys(strlname);
		driver.findElement(email).sendKeys(stremail);
		driver.findElement(phone).sendKeys(strphone);
		driver.findElement(compny).sendKeys(strcompny);
		driver.findElement(address).sendKeys(straddress);
		driver.findElement(city).sendKeys(strcity);
		driver.findElement(postcode).sendKeys(strpostcode);		
		
		Select slctContry = new Select((driver.findElement(coutry)));
		slctContry.selectByVisibleText(strcoutry);
		
		Select slctZone = new Select((driver.findElement(zoneId)));
		slctZone.selectByVisibleText(strzoneId);
		
		driver.findElement(pwrd).sendKeys("Jyoti@123");		
		driver.findElement(cpwrd).sendKeys("Jyoti@123");	
		
		driver.findElement(chkbox).click();
		driver.findElement(submit).click();	
		
		return getAccMsg();
		
	}
	
	public boolean getAccMsg(){
		System.out.println("--getAccMsg--");
		String strMsg=driver.findElement(msg).getText();
		String strWarn=driver.findElement(warn).getText();
		String passMsg ="Your Account Has Been Created!";
		boolean flag =false;
		
		//Assert.assertEquals(strMsg, passMsg,"Input New Email or Login Again with Existing Email:");
		//flag =true;		
			if(strMsg.contains(passMsg)){
				System.out.println(driver.findElement(msg).getText());
				flag = true;
				driver.findElement(button).click();
				System.out.println("Email Id Registered and Account Created : ");
				
			  }else{
				System.out.println(driver.findElement(warn).getText());
				flag = true;
				System.out.println("Input New Email or Login Again with existing Email:");
				loginOpenCart();
			  }
		return flag;
	}
	
	public void loginOpenCart() {
		// TODO Auto-generated method stub
		System.out.println("--loginOpenCart--");
		driver.findElement(loginCart).click();	
		driver.findElement(loginEmail).sendKeys("Jyoti.Kumari@gmail.com");	
		driver.findElement(loginPwrd).sendKeys("Jyoti@123");
		driver.findElement(submit).click();	
		
	    String	actMsg = driver.findElement(msg).getText();	
	    String	expMsg = "My Account";	    
	    Assert.assertEquals(actMsg, expMsg,"LogIn Error :");
	    
		/*if (actMsg.equalsIgnoreCase(expMsg)){
		  System.out.println("Login Successfull");
			}
		else{
			 System.out.println("Login failed");
		}*/
	}
	
	public void getProductDetails(){
		 System.out.println("--Inside getProductDetails--");
		 
		driver.findElement(homelnk).click();		
		driver.findElement(samImg).click();	
		driver.findElement(wishLink).click();	
		driver.findElement(wishList).click();		
		//System.out.println("Product Selected :"+prodct );
			
		driver.findElement(priceEuro).click();
		String itemcostE = driver.findElement(itemPrice).getText();	
		System.out.println("Price in Euro: "+itemcostE );
		driver.findElement(pricePound).click();
		String itemcostP = driver.findElement(itemPrice).getText();
		System.out.println("Price in Pound: "+itemcostP );
		driver.findElement(priceDollar).click();
		String itemcostD = driver.findElement(itemPrice).getText();
		System.out.println("Price in Dollar: "+itemcostD );		
		
	}
	
	public void addToCartImg()
	 {	    System.out.println("--Inside Add cart--");	 
		    driver.findElement(addToCartImg).click();	 
			clickContinue();
			shopCart();
			//logOut();			
		  // CloseOpenCart(driver);
		

	 }
	public void remvfrmCartImg()
	 {  System.out.println("--Inside Delete Cart--");
	    //clickContinue();
	   // driver.findElement(wishList).click(); 
	    waitTime();
		driver.findElement(removeCartImg).click();		
		//clickContinue();   
	        // logOut();	
	 }
	public void clickContinue()
	{		driver.findElement(button).click();
	}
	
	public void logOut(){
		System.out.println("--Inside logout--");	
		driver.findElement(logOut).click();
		String strMsg;
		String passMsg ="Account Logout";
		strMsg = driver.findElement(msg).getText();
		Assert.assertEquals(strMsg, passMsg,"Logout Error :");
		driver.findElement(button).click();	
		
	}
	public void waitTime(){
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void shopCart(){
			System.out.println("Inside Shopping Cart");
			waitTime();
			driver.findElement(shopcart).click();		
	}
	
	public void closeMsg(){
		Actions action = new Actions(driver);
		// To click on the element
		WebElement closeBar = driver.findElement(By.xpath("//img[@src='catalog/view/theme/default/image/close.png'])"));
		action.moveToElement(closeBar).build().perform();
		
		// Switching to Alert        
        Alert alert = driver.switchTo().alert();       		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();        		
        // Displaying alert message		
        System.out.println(alertMessage);
	}
	public void addItemToCart()
	{		driver.findElement(addItem).click();		
	}
	
	public void getFeatureItem(){
		System.out.println("--Inside getFeatureItem --");
		driver.findElement(homelnk).click();
		driver.findElement(apple30).click();
		scrollDown();
		waitTime();
		driver.findElement(relatedTab).click();
		System.out.println("Related Products Count :"+driver.findElement(relatedTab).getText());
		scrollDown();
		//ArrayList<String> list = new ArrayList<String>();
		//list.add(arg0)
		driver.findElement(addCartIphone).click();	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String msg = driver.findElement(msgSuccess).getText();
		System.out.println(msg);
		//----
		//editShopCart();
		//checkOutCart();
	}
	
	public void selectFeatureItem(){		        
		
				driver.findElement(iPhone).click();	
				//driver.findElement(apple30).click();					
				System.out.println("Feature Item clicked --");
				driver.findElement(relatedTab).click();	
				System.out.println("RelatedTab clicked --");
				
				scrollDown();
				driver.findElement(relItem).click();
				//scrollDown();
				driver.findElement(relatedTab).click();	
				driver.findElement(iPhone).click();	
				driver.findElement(buttonCart).click();
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				String msg = driver.findElement(msgSuccess).getText();
				System.out.println(msg);
				
				//** pending file upload
					//getRelItemDetails();
				
	}
	
	public void getRelItemDetails() throws AWTException{
		//addItemToCart();
		driver.findElement(radio1).click();
		
		Select dropbox= new Select(driver.findElement(availOptns));
		dropbox.selectByValue("4");	
		driver.findElement(radio1).click();
		driver.findElement(chbox1).click();
		
	    driver.findElement(txTest).sendKeys("TestIphone");
		driver.findElement(txtArea).sendKeys("Iphone TextArea");
		driver.findElement(btnUpload).click();
		driver.findElement(btnUpload).sendKeys("D:\\eclipse-error.png");
		 UploadFile(driver);
		driver.findElement(calDate).sendKeys("2011-02-02");
		driver.findElement(infoProd).click();
		driver.findElement(calTime).sendKeys("22:25");
		driver.findElement(infoProd).click();
		driver.findElement(calTime).sendKeys("2017-11-30 22:25");
		driver.findElement(infoProd).click();
		driver.findElement(buttonCart).click();
			
		
	}
	
	public void scrollDown(){
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("window.scrollBy(0,200)", "");		
		System.out.println("Scroll Down--");
	}
	
	public static void UploadFile(WebDriver driver) throws AWTException {
		
			Robot robot = new Robot();  
			//String imagesrc ="D:\\eclipse-error.png";
			//driver.findElement(By.id(imagesrc)).click();
	 
	        robot.setAutoDelay(2000); 
	        StringSelection selection = new StringSelection("D:\\eclipse-error.png");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	 
	        robot.setAutoDelay(1000);
	 
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	 
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_V);
	 
	        robot.setAutoDelay(1000);
	 
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);	
		}

	
	public void editShopCart(){
		System.out.println("Inside Edit Cart : ");		
		//closeMsg();
		shopCart();		
		driver.findElement(editItemCnt).click();	
		waitTime();
		String oldCnt = driver.findElement(editItemCnt).getAttribute("value");
		driver.findElement(editItemCnt).clear();
		String upCnt ="3";
		driver.findElement(editItemCnt).sendKeys(upCnt);
		driver.findElement(updateRefresh).click();	
		String newcnt =  driver.findElement(editItemCnt).getAttribute("value");
		System.out.println("Item old Quantity : "+oldCnt);
		System.out.println("Item new Quantity : "+newcnt);
		Assert.assertEquals(newcnt, upCnt,"Unable to update Item Quantity");
		
		/*if(upCnt.equals(newcnt)) {
			System.out.println("Item old Quantity : "+oldCnt);
			System.out.println("Item new Quantity : "+newcnt);
		}
		else{
			System.out.println("Unable to update Item Quantity");
		}	*/	
	}
	
	public void checkOutCart(){	
		
		System.out.println(" Inside Checkout Cart : ");		
		driver.findElement(chkOut).click();	
		waitTime();
		driver.findElement(contnuBtton1).click();
		waitTime();
		driver.findElement(contnuBtton2).click();
		waitTime();
		driver.findElement(contnuBtton3).click();
		waitTime();
		driver.findElement(By.name("agree")).click();
		driver.findElement(contnuBtton4).click();
		waitTime();
		//scrollDown();
		driver.findElement(confirmBtn).click();
		waitTime();	
     	String msg1 = driver.findElement(msg).getText();
     	System.out.println(msg1);
     	Assert.assertEquals(msg1, "Your Order Has Been Processed!","Unable to Process Order :");
		}
	public void verifyCheckout(){
		
		String prodName = driver.findElement(chkoutName).getText();
		String prodModel = driver.findElement(chkoutModel).getText();
		String prodQuant = driver.findElement(chkoutQuant).getText();
		
		System.out.println("prodName : "+prodName);	
		System.out.println("prodModel : "+prodModel);
		System.out.println("prodQuant : "+prodQuant);
		
		/*if(prodName.contains("iPhone")){
			if(prodModel.contains("product 11")){
				if(prodQuant.contains("2")){
			System.out.println("ChekOut Prduct validated : True ");		
		}}}
		else{
			System.out.println("ChekOut Prduct validated : False ");		
		}*/
	}
	
	public void gotoMyAccount(){
		//verifyCheckout();
		System.out.println(" Inside My Account : ");		
		waitTime();
		driver.findElement(myAccountlnk).click();
		waitTime();
		driver.findElement(By.linkText("Order History")).click();
		waitTime();
		driver.findElement(By.xpath("//div[@class='order-info']/a[1]")).click();
		System.out.println("Click on View : ");		
		driver.findElement(By.xpath("//img[@title='Return']")).click();
		System.out.println("Click on Return : ");	
		driver.findElement(By.xpath("//input[@id='return-reason-id3']")).click();
		waitTime();
		driver.findElement(contnuBtton).click();
		String msg1 = driver.findElement(msg).getText();
     	System.out.println("--"+msg1+"--");
     	Assert.assertEquals(msg1, "Product Returns","Unable to Return :");
	}
	
	/*			
	public void shopCartVerify(){
		shopCart();
		// logic to verify Wish Product equalto shoCart product
		//div[@class='cart-info']/table/tbody/tr[1]/td[@class='name']
		//div[@class='cart-info']/table/tbody/tr[1]/td[@class='model']
		//div[@class='cart-info']/table/tbody/tr[1]/td[@class='quantity']
		//div[@class='cart-info']/table/tbody/tr[1]/td[@class='price']
		//div[@class='cart-info']/table/tbody/tr[1]/td[@class='total']
	}*/


}// end class

