package com.test.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.test.automation.base.TestBase;

public class LoginEmail extends TestBase{
	
	
	public EmailInbox login(String un, String pwd){
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys(un);
		driver.findElement(By.id("identifierNext")).click();
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		driver.findElement(By.id("passwordnext")).click();
		    	    
		return new EmailInbox();
	}

}
