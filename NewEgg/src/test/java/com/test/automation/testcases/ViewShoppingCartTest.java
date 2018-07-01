package com.test.automation.testcases;

import org.testng.annotations.BeforeMethod;

import com.test.automation.base.TestBase;
import com.test.automation.pages.CheckOut;
import com.test.automation.pages.HomePage;
import com.test.automation.pages.LoginPage;
import com.test.automation.pages.ProductList;
import com.test.automation.pages.ShoppingPage;
import com.test.automation.util.TestUtil;

public class ViewShoppingCartTest extends TestBase  {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ProductList productList;
	ShoppingPage shoppingPage;
	CheckOut checkOut;
	
	public ViewShoppingCartTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		start();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		productList = new ProductList();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		shoppingPage=homePage.goCart(); 
	}

}
