package com.test.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.HomePage;
import com.test.automation.pages.LoginPage;
import com.test.automation.pages.ProductList;
import com.test.automation.pages.ProductPage;
import com.test.automation.util.TestUtil;

public class ProductPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ProductList productList;
	ProductPage productPage;
	
	public ProductPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		start();
		loginPage = new LoginPage();
		
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		productList = homePage.searchItem(TestBase.GetSearchData());
		productPage =productList.mouseOverOnProduct(1);
	}
	
	@Test
		public void AddToCartTest() {
		productPage.AddToCart();
		String ExpectedURl="https://secure.newegg.com/Shopping/ShoppingCart.aspx?Submit=view";
		Assert.assertEquals(driver.getCurrentUrl(), ExpectedURl, "not reaching Cart");
	}

	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	
}
