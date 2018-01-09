package com.Outlook.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	public static void Mywait(int time){
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}		

	public static void MyExplicitwait(By webObject,WebDriver driver){
	WebElement myDynamicElement = (new WebDriverWait(driver, 10))
			  .until(ExpectedConditions.presenceOfElementLocated(webObject));
	}
}
