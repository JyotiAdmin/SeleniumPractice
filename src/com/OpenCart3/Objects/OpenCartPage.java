package com.OpenCart3.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPage {
	
	WebDriver driver;

	By loginCart = By.xpath("//div[@id='welcome']/a[contains(@href,'login')]");
	By loginEmail = By.xpath("//input[@name='email']");	
	By loginPwrd = By.xpath("//input[@name='password']");
	By logOut = By.xpath("//div[@id='welcome']/a[contains(@href,'logout')]");
	
	OpenCartPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	
}
