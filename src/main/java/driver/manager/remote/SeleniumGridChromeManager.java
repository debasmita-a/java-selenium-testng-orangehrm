package driver.manager.remote;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import config.ConfigFactory;

public class SeleniumGridChromeManager {

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("CHROME");
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URI(ConfigFactory.getConfig().seleniumGridURL()).toURL(), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
