package com.test.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.PswdAssistance;


public class PswdAssistanceTest extends TestBase {
	PswdAssistance pswdAssistance;
	
	@BeforeMethod
	public void setup() {
		start();
		pswdAssistance = new PswdAssistance();
	}
	
	@Test
	public void pswdAssistanceTest() {
		//pswdAssistance.submitEmail(prop.getProperty("username"));
		
	}
	
	@Test
	public void validatePageUrlTest()
	{
		String Url = pswdAssistance.validatePageUrl();
		Assert.assertEquals(Url, "https://secure.newegg.com/NewMyAccount/LoginAssistance.aspx");
	}
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
}
