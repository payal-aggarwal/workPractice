package com.test.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='haQuickSearchBox']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-mini search-bar-btn']")
	WebElement searchbtn;
	
	@FindBy(xpath="//li[@id='liMiniCart']")
	WebElement cart;
	
	@FindBy(xpath="//a[@class='top-nav-tab-name']")
	WebElement myAccountlink;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;
	
	//Initializing the Page Objects:
			public HomePage(){
				PageFactory.initElements(driver, this);
			}

	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
public ProductList searchItem(String searchText) {
	searchbox.sendKeys(searchText); 
	searchbtn.click();
	return new ProductList();
	
}

public ShoppingPage goCart()
{
	cart.click();
	return new ShoppingPage();
}

public String logOut() {
	Actions act = new Actions(driver);
	act.moveToElement(myAccountlink).build().perform();
	Logout.click();
	String Actualmessage= driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged out.')]")).getText();
	return Actualmessage;
	
}
}
