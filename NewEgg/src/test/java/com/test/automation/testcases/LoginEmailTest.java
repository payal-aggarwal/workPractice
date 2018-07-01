package com.test.automation.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.EmailInbox;
import com.test.automation.pages.LoginEmail;


public class LoginEmailTest extends TestBase {
	LoginEmail loginEmail;
	EmailInbox emailInbox;
	
	public LoginEmailTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		startGmail();
		loginEmail = new LoginEmail();
	}
	
	@Test(priority=1)
	public void loginTest() {
		emailInbox=loginEmail.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
}
