package com.test.automation.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.HomePage;
import com.test.automation.pages.LoginPage;
import com.test.automation.pages.ProductList;
import com.test.automation.pages.ProductPage;
import com.test.automation.util.TestUtil;

public class ProductListTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ProductList productList;
	ProductPage productPage;
	
	
	public ProductListTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		start();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		productList = homePage.searchItem(TestBase.GetSearchData());
		
	}
	
	@Test
	public void mouseOverOnProductTest() {
		productPage = productList.mouseOverOnProduct(1); //passing first search result index	
		
	}

	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	
}
