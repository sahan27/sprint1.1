package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author sahan This class will contain all methods for generic utilities.
 *
 */

public class coreutil implements coremethods {
	WebDriver driver;
	String webapp = "https://www.thebay.com/";

	public void openBrowser() {
		driver = new ChromeDriver();
		// 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void goToWebApp() {
		driver.get(webapp);

	}

	public void closeBrowser() {
		
		if(driver !=null) {
			driver.close();//closes the tab
			driver.quit();//close the browser session/ browser instance
		}
		

	}

	/*
	 * We are implimenting the interface coremethods in this class
	 */

}
