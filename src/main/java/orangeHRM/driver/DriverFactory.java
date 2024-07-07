package orangeHRM.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {
		
	}

	public static void initDriver() {
		if(Objects.isNull(DriverManager.getDriver())) { // if(driver == null)
			System.out.println("Launching chrome browser..");
			driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get("https://google.com");
		}	
		
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())){ // if(driver != null) 
			DriverManager.getDriver().quit();
			DriverManager.unloadDriver();
		}
	}
}
