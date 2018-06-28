package com.test.automation.uiAutoation.Login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_loginwithinvalid {
	@BeforeTest
	public void setup()
	{
		WebDriver driver;
	System.setProperty("webdriver.gecko.driver","C:\\Payal\\geckodriver.exe");
	driver.get("")
	}
	@Test
public void loginwithInvalid ()
{
	
}

	@AfterTest
public void endTest()
{
	
}
}
