package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.base.TestBase;

public class ProductPage  extends TestBase {
	
	@FindBy(xpath="///*[@id=\"landingpage-cart\"]/div/div[2]/button/span")
	WebElement addtoCartBtn;
	
	public ViewShoppingCartPage AddToCart()
	{
		addtoCartBtn.click();
		return new ViewShoppingCartPage();
	}

}
