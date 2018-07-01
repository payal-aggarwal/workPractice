package com.test.automation.testcases;

import java.util.List;

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

public class CheckOutTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ProductList productList;
	ShoppingPage shoppingPage;
	CheckOut checkOut;
	String expectedErrorMessage = "This field is required.";
	
	public CheckOutTest() {
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
		checkOut = shoppingPage.goShoppingCart();
		
	}
	
	@Test
	public void ValidateFname()
	{
		Assert.assertEquals(checkOut.ValidateFname(), expectedErrorMessage);		
	}
	
	@Test
	public void ValidateLname()
	{
		Assert.assertEquals(checkOut.ValidateLname(), expectedErrorMessage);		
	}
	
	@Test
	public void ValidateCity()
	{
		Assert.assertEquals(checkOut.ValidateCity(), expectedErrorMessage);		
	}
	
	@Test
	public void ValidateZip()
	{
		Assert.assertEquals(checkOut.ValidateZip(), expectedErrorMessage);		
	}
	
	@Test
	public void ValidateAddress()
	{
		Assert.assertEquals(checkOut.ValidateAddress(), expectedErrorMessage);		
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
}
