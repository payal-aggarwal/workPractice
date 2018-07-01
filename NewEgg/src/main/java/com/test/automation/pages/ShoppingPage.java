package com.test.automation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.base.TestBase;

public class ShoppingPage extends TestBase {
	
	@FindBy(xpath="//a[@title='Secure Checkout']")
	WebElement checkOut;
	
	@FindBy(xpath="//*[@id=\"ITEM.9SIA12K65X1656.1.0.0\"]")
	WebElement editQuantitytextbox;
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/div[10]/form[1]/table[1]/tbody/tr[2]/td[2]/a")
	WebElement editQuantityBtn;
	
	@FindBy(xpath="//*[@id=\"SelectedAlert\"]")
	WebElement removeItem;
	
	@FindBy(xpath="//*[@id=\"9SIA12K65X1656.1.0.0\"]")
	WebElement itemCheckbox;
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/div[10]/form[1]/table[2]/tfoot/tr[1]/td/span[2]")
	WebElement totalcost;
	
	
	public ShoppingPage(){
		PageFactory.initElements(driver, this);
	}
	

	
	public void editQuantity()
	{
		editQuantitytextbox.clear();
		editQuantitytextbox.sendKeys("4");
		editQuantityBtn.click();
	}
	
	public void removeItem() {
		itemCheckbox.click();
		removeItem.click();
	}
	
	public CheckOut goShoppingCart()
	{
		checkOut.click();
		return new CheckOut();	
		
	}
}
