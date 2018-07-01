package com.test.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.HomePage;
import com.test.automation.pages.LoginPage;
import com.test.automation.pages.ProductList;
import com.test.automation.pages.ShoppingPage;
import com.test.automation.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ProductList productList;
	ShoppingPage shoppingPage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		start();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		productList = new ProductList();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		ShoppingPage shoppingPage= new ShoppingPage();
	}
	

	
	@Test(priority = 1)
	public void searchItemTest() {
	String searchText = TestBase.GetSearchData();
	productList = homePage.searchItem(searchText);	
	}
	
	@Test(priority = 2)
	public void verifyTitle(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Computer Parts, Laptops, Electronics, and More - Newegg.com","Home page title not matched");
	}
	
	@Test(priority = 3)
	public void goToCartTest() {
		
	}
	
	@Test(priority = 4)
	public void LogOutTest() {
		String Actualmessage = homePage.logOut();
		String ExpectedMessage="You are successfully logged out.";
		Assert.assertEquals(Actualmessage, ExpectedMessage,"Message does not match");
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
}
