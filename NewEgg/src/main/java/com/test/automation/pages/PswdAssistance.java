package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.base.TestBase;

public class PswdAssistance extends TestBase {
	
	
	@FindBy(name="loginname")
	WebElement loginname;
	
	@FindBy(className = "recaptcha-checkbox-checkmark")
	WebElement chkbox;
	
	@FindBy(id = "btn_forgot_pwd")
	WebElement submit;
	
	
	public PswdAssistance(){
		PageFactory.initElements(driver, this);
	}

	public void submitEmail(String un)
	{
		loginname.sendKeys(un);
		chkbox.click();
		submit.click();
		
	}
	
	
}
