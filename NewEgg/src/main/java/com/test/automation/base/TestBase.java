/**
 * 
 */
package com.test.automation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.test.automation.util.TestUtil;


/**
 * @author Payal
 *
 */

public class TestBase {
	

public static WebDriver driver;
public static Properties prop;

	public TestBase()  {
		prop = new Properties();
		try {
			System.out.println(System.getProperty("user.dir"));
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/test/automation/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	

	}
	
	public static void start() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Payal\\chromedriver.exe");
			driver = new ChromeDriver();
			
	
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get("https://www.newegg.com/");
			driver.findElement(By.partialLinkText("Log in")).click();
		}
		
	}
	

