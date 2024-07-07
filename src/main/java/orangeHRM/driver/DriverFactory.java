package orangeHRM.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {

	private DriverFactory() {

	}

	public static void initDriver() {
		
		if(Objects.isNull(DriverManager.getDriver())) { 

			System.out.println("Launching chrome browser..");
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get("https://google.com");
		}
		
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) { 
			DriverManager.getDriver().quit();
			DriverManager.unloadDriver();
		}
	}
}
