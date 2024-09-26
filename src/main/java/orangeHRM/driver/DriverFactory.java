package orangeHRM.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import orangeHRM.enums.ConfigProperties;
import orangeHRM.utilities.ReadJSONFile;
import orangeHRM.utilities.ReadPropertyFile;

public final class DriverFactory {

	private DriverFactory() {}

	public static void initDriver(String browser){

		if (Objects.isNull(DriverManager.getDriver())) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.out.println("Launching chrome browser..");
				DriverManager.setDriver(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.out.println("Launching firefox browser..");
				DriverManager.setDriver(new FirefoxDriver());
			} else if (browser.equalsIgnoreCase("edge")) {
				System.out.println("Launching edge browser..");
				DriverManager.setDriver(new EdgeDriver());
			}else {
				System.out.println("Provide a valid browser name.");
			}

			DriverManager.getDriver().get(ReadPropertyFile.get(ConfigProperties.URL));
			//DriverManager.getDriver().get(ReadJSONFile.get(ConfigProperties.URL));
		}

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unloadDriver();
		}
	}
}
