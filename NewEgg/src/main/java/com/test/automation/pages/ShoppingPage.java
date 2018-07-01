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
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/div[10]/form[1]/table[2]/tfoot/tr[1]/td/span[2]")
	WebElement subTotal;
	
	
	public ShoppingPage(){
		PageFactory.initElements(driver, this);
	}
	

	
	public float editQuantity()
	{
		float initialCost=Float.parseFloat(subTotal.getText());
		float cartTotal = Float.parseFloat(totalcost.getText());
		int initialQty = Integer.parseInt(editQuantitytextbox.getText());
		editQuantitytextbox.clear();		
		editQuantitytextbox.sendKeys("4");
		editQuantityBtn.click();
		float newCost = (initialCost/initialQty) * 4;
		float Total = newCost+cartTotal;
		return Total;
	}
	
	public float removeItem() {
		itemCheckbox.click();
		float cartTotal = Float.parseFloat(totalcost.getText());
		float itemCost = Float.parseFloat(subTotal.getText());
		float Total = cartTotal-itemCost;
		removeItem.click();
		return Total;
	}
	
	public float getTotalCost()
	{
		float cartTotal = Float.parseFloat(totalcost.getText());
		return cartTotal;
	}
	
	public CheckOut goShoppingCart()
	{
		checkOut.click();
		return new CheckOut();	
		
	}
}
