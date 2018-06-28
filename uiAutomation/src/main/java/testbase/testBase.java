package testbase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class testBase {
	public WebDriver driver;
	String URL = "http://automationpractice.com/index.php";
	String browser = "firefox";
	
	public void init() {
		selectBrowser(browser);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

	private void selectBrowser(String browser) {
		// TODO Auto-generated method stub
		if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "C:\\Payal\\geckodriver.exe");
		}
	}
	
	public void geturl(String url) {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	}
}
