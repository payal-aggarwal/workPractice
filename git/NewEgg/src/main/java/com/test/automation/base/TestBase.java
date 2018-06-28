/**
 * 
 */
package com.test.automation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src/main/java/com/test/automation/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public static void start() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("ff")) {
			System.setProperty("WebDriver.gecko.driver", "C:/Users/admin/Downloads/geckodriver");
			driver = new FirefoxDriver();
			}
		if(browsername.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver");
			driver = new ChromeDriver();
			}
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
		}
		
	}
	

