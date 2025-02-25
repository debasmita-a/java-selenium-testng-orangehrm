package driver.manager;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import config.ConfigFactory;
import enums.BrowserType;

public class SeleniumGridEdgeManager {

       public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.EDGE.toString());
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
