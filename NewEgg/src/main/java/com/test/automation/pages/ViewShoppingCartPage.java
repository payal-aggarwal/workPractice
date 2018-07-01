package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.base.TestBase;

public class ViewShoppingCartPage {
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/section/div/div/div[1]/div/div[3]/div[3]/div/button[2]]")
	WebElement checkOut;
	
	public ShoppingPage GoToViewShoppingCart()
	{
		checkOut.click();
		return new ShoppingPage();
	}
	
}
