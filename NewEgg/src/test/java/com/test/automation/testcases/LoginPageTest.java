package com.test.automation.testcases;

import org.testng.Assert;
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
	
	
public LoginPageTest() {
	super();
}

@BeforeMethod()
public void setup() {
	start();
	loginPage = new LoginPage();
}

@Test(priority=1)
public void loginTest() {
	homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
}

@Test(priority=2)
public void loginPageTitleTest(){
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "Computer Parts, Laptops, Electronics, and More - Newegg.com");
}


	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	
}




