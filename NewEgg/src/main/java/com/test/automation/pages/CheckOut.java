package com.test.automation.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.base.TestBase;


public class CheckOut extends TestBase {
	
	@FindBy(xpath="//*[text()='Continue To  Billing']")
	WebElement Billingbtn;
		
	@FindBy(xpath="//label[@for='SAddress1']")
	WebElement address;
	
	@FindBy(xpath="//label[@for='SLastName']")
	WebElement lname;
	
	@FindBy(xpath="//label[@for='SFirstName']")
	WebElement fname;
	
	@FindBy(xpath="//label[@for='SCity']")
	WebElement cityerror;
	
	@FindBy(xpath="//label[@for='SZip']")
	WebElement ziperror;
	
	@FindBy(xpath="//label[@for='ShippingPhone']")
	WebElement phoneerror;
	
	@FindBy(xpath="//label[@for='SAddress']")
	WebElement addresserror;
	


	//Initializing the Page Objects:
		public CheckOut(){
				PageFactory.initElements(driver, this);
			}
	
	public List<String> ValidateAllErrorMessages()
	{
		Billingbtn.click();	
		List<String> listAllErrorMessages = new ArrayList<String>();
		listAllErrorMessages.add(fname.getText());
		listAllErrorMessages.add(lname.getText());
		listAllErrorMessages.add(cityerror.getText());
		listAllErrorMessages.add(ziperror.getText());
		listAllErrorMessages.add(phoneerror.getText());
		
	  return listAllErrorMessages;
	}
	
	public String ValidateFname()
	{
		Billingbtn.click();	
		return fname.getText();		
	}
	
	public String ValidateLname()
	{
		Billingbtn.click();	
		return lname.getText();		
	}
	
	public String ValidateCity()
	{
		Billingbtn.click();	
		return cityerror.getText();		
	}
	
	public String ValidateZip()
	{
		Billingbtn.click();	
		return ziperror.getText();		
	}
	
	public String ValidateAddress()
	{
		Billingbtn.click();	
		return addresserror.getText();		
	}
}
