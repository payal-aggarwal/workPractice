package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.base.TestBase;

public class ResetPassword extends TestBase {
	
	LoginPage loginPage;
	
	@FindBy(xpath = "//a[contains(text(), 'Log in')]")
	WebElement Loginlink;
	
	@FindBy(id="UserName")
	WebElement username;
	
	@FindBy(partialLinkText="Forgot your")
	WebElement forgotpswd;
	
	//@FindBy(xpath = "//a[contains(text(), 'Forgot your password')]")
	//WebElement forgotpswd;
	
	public ResetPassword(){
		PageFactory.initElements(driver, this);
	}
		
		public PswdAssistance forgotPassword(String un) {
			username.sendKeys(un);
			forgotpswd.click();
			
			return new PswdAssistance();
		
	}

}
