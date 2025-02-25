package driver;

import org.openqa.selenium.WebDriver;

import config.ConfigFactory;
import enums.BrowserType;

public final class LocalDriverFactory {

    private LocalDriverFactory() {}

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (isBrowserChrome()) {
            driver = ChromeManager.getDriver();
        } else if (isBrowserEdge()) {
            driver = EdgeManager.getDriver();
        } else {
          
        }
        return driver;
    }

    private static boolean isBrowserEdge() {
        return ConfigFactory.getConfig().browser() == BrowserType.EDGE;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}