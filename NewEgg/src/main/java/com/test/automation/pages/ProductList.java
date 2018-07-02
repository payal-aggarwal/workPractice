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
	
	@FindBy(xpath="//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/div[1]/div/a")
	WebElement firstItem;
	
	
	public ProductPage mouseOverOnProduct(String itemName){
		String fPart = "//*[@id=\"bodyArea\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/div[";

		String sPart = "]/div/a";
		List <WebElement> items = driver.findElements(By.xpath("//*[@id=\\\"bodyArea\\\"]/section/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[2]/div"));
		int itemCount=items.size();
		for (int i=1;i<=itemCount;i++) {
			String actualXpath=fPart+ i+ sPart;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			if (element.getText().equals(itemName)) {
				Actions action = new Actions(driver);
				action.moveToElement(element).build().perform();
				element.click();
				break;
			}
		}
				return new ProductPage();	
			}
		}
		
			
	
	
	


