package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.base.TestBase;

public class ProductPage  extends TestBase {
	
	@FindBy(xpath="//*[@id=\"landingpage-cart\"]/div/div[2]/button")
	WebElement item;
	
	public ViewShoppingCartPage AddToCart()
	{
		item.click();
		return new ViewShoppingCartPage();
	}

}
