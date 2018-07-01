package com.test.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.automation.base.TestBase;

public class ProductList extends TestBase{
	
	
	@FindBy(xpath="//div[@class='item-container'][1]")
	WebElement item;
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/div[1]/a/img")
	WebElement firstItem;
	
	public ProductPage mouseOverOnProduct(int number){
		String fPart = "//*[@id=\\\"bodyArea\\\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/div[";
		String sPart = "]/a/img";
		Actions action = new Actions(driver);
		WebElement item = driver.findElement(By.xpath(fPart+number+sPart));
		action.moveToElement(item).build().perform();
		item.click();	
		return new ProductPage();		
	}
	
	

}
