package GURU;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("profileToolsQA");
		 
		WebDriver driver = new FirefoxDriver((Capabilities) myprofile);
		System.setProperty("webdriver.gecko.driver","C:\\Payal\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String URL = "https://www.google.com/";
		driver.get(URL);
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign In")).click();
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("payal.aggarwal8");
		driver.findElement(By.className("CwaK9")).click();
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("Tweety119$");
driver.findElement(By.className("RveJvd snByac")).click();
	driver.close();
	
		
		


	}
}
