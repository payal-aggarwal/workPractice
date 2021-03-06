package com.test.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.automation.base.TestBase;
import com.test.automation.pages.CheckOut;
import com.test.automation.pages.HomePage;
import com.test.automation.pages.LoginPage;
import com.test.automation.pages.ProductList;
import com.test.automation.pages.ShoppingPage;
import com.test.automation.util.TestUtil;

public class ShoppingPageTest extends TestBase {
		LoginPage loginPage;
		HomePage homePage;
		TestUtil testUtil;
		ProductList productList;
		ShoppingPage shoppingPage;
		CheckOut checkOut;

		
		public ShoppingPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			start();
			loginPage = new LoginPage();
			testUtil = new TestUtil();
			//productList = new ProductList();
			homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
			shoppingPage=homePage.goCart(); 
		}
		
		@Test
		public void goShoppingCartTest()
		{
			 checkOut=shoppingPage.goShoppingCart();			 
		}	
		
				
		@Test
		public void  removeItemTest() {
			float updatedCost=shoppingPage.removeItem();
			float expectedTotalCost = shoppingPage.getTotalCost();
			Assert.assertEquals(updatedCost, expectedTotalCost);
		}
		
		@Test
		public void editQuantityTest() {
			float updatedcartTotal=shoppingPage.editQuantity();
			float expectedTotalCost=shoppingPage.getTotalCost();
			Assert.assertEquals(updatedcartTotal, expectedTotalCost);
		}
			
		
		@AfterMethod
		public void closeBrowser(){
			driver.quit();
		}
}
