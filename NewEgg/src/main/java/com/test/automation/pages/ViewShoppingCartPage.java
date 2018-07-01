package com.test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.automation.base.TestBase;

public class ViewShoppingCartPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/section/div/div/div[1]/div/div[3]/div[3]/div/button[2]]")
	WebElement viewCartBtn;
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/section/div/div/div[1]/div/div[3]/div[3]/div/button[1]")
	WebElement continueShoppingBtn;
	
	public ShoppingPage GoToViewShoppingCart()
	{
		viewCartBtn.click();
		return new ShoppingPage();
	}
	
	public HomePage continueShopping() {
		continueShoppingBtn.click();
		return new HomePage();
	}
	
}
