package com.test.automation.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.HomePage;
import com.test.automation.pages.LoginPage;
import com.test.automation.pages.ResetPassword;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ResetPassword resetPage;
	
public LoginPageTest() {
	super();
}

@BeforeMethod()
public void setup() {
	start();
	loginPage = new LoginPage();
}

@Test
public void loginTest() {
	homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
}

@Test(enabled=false)
public void resetPasswordTest() {
	resetPage = loginPage.forgotPassword(prop.getProperty("username"));
}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	
}




