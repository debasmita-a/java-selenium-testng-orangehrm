package orangeHRM.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		return tlDriver.get();
	}

	public static void setDriver(WebDriver tlDriverRef) {
		tlDriver.set(tlDriverRef);
	}
	
	public static void unloadDriver() {
		tlDriver.remove();
	}

	public static void initDriver() {
		if(Objects.isNull(driver)) { // if(driver == null)
			System.out.println("Launching chrome browser..");
			driver = new ChromeDriver();
			setDriver(driver);
			getDriver().get("https://google.com");
		}	
		
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(driver)){ // if(driver != null) 
			driver.quit();
			driver = null;
		}

	}
}
