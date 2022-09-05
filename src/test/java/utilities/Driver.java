package utilities;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
  		WebDriverManager.chromedriver().setup();
			
	//		 driver = new FirefoxDriver(); driver = new ChromeDriver(); driver = new InternetExplorerDriver(); 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); depricated already
			
			// Configuring the system properties of chrome driver
//			System.setProperty("webdriver.chrome.driver", "E:\\ChromeSetup.exe"); // location of chrome driver


			//Navigating through a particular website
			driver.get("https://www.google.com");

			System.out.println("Selenium Webdriver Script in Chrome");
			driver.close();
			System.out.println("first commit");
			System.out.println("checking my repo");
		}
		return driver;
	}
}
