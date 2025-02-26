package driver.manager.remote;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import config.ConfigFactory;

public class SelenoidEdgeManager {

    public static WebDriver getDriver() {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "edge");
        capabilities.setCapability("browserVersion", "101");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        try {
            driver = new RemoteWebDriver(new URI(ConfigFactory.getConfig().selenoidURL()).toURL(), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
