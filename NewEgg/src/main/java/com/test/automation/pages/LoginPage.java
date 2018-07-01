package com.test.automation.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.automation.pages.HomePage;
import com.test.automation.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(), 'Log in')]")
	WebElement Loginlink;
	
	@FindBy(id="UserName")
	WebElement username;
	
	@FindBy(id="UserPwd")
	WebElement password;
	
	@FindBy(id="submitLogin")
	WebElement loginButton;
	

	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}

	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginButton.click();
		
    	//WebDriverWait wait = new WebDriverWait(driver, 2000);
    	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-checkbox-checkmark")));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginButton); 
		
		return new HomePage();
	}
		
		
			
			
			
		}
	
	

