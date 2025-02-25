package driver;

import org.openqa.selenium.WebDriver;

import driver.manager.ChromeManager;
import driver.manager.EdgeManager;
import enums.BrowserType;

public final class LocalDriverFactory {

    private LocalDriverFactory() {}

    public static WebDriver getDriver(BrowserType browserType) {
        return isBrowserChrome(browserType) ? ChromeManager.getDriver()
                                            : EdgeManager.getDriver();
    }

    private static boolean isBrowserChrome(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }
}