package orangeHRM.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangeHRM.enums.ConfigProperties;
import orangeHRM.utilities.ReadJSONFile;
import orangeHRM.utilities.ReadPropertyFile;

public final class DriverFactory {

	private DriverFactory() {

	}

	public static void initDriver() throws Exception {
		
		if(Objects.isNull(DriverManager.getDriver())) { 

			System.out.println("Launching chrome browser..");
			WebDriver driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			//DriverManager.getDriver().get(ReadPropertyFile.get(ConfigProperties.URL));
			DriverManager.getDriver().get(ReadJSONFile.get(ConfigProperties.URL));
		}
		
	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) { 
			DriverManager.getDriver().quit();
			DriverManager.unloadDriver();
		}
	}
}
