package com.test.automation.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.PswdAssistance;
import com.test.automation.pages.ResetPassword;

public class ResetPasswordTest extends TestBase {
	ResetPassword resetPassword;
	PswdAssistance pswdAssistance;
	
	
	@BeforeMethod
	public void setup() {
		start();
		resetPassword = new ResetPassword();
	}
	
	
	
	@Test
	public void resetPasswordTest() {
		pswdAssistance = resetPassword.forgotPassword(prop.getProperty("username"));
	}
	
	/*@Test
	public void verifyTitle()
	{
		
	}
	*/
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	

}
