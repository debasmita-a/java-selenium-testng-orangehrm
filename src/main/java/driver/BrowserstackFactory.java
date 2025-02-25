package driver;

import org.openqa.selenium.WebDriver;

import driver.manager.BrowserstackChromeManager;
import driver.manager.BrowserstackEdgeManager;
import enums.BrowserType;

public final class BrowserstackFactory {

    private BrowserstackFactory(){}

    public static WebDriver getDriver(BrowserType browserType) {
    return browserType == BrowserType.CHROME
               ? BrowserstackChromeManager.getDriver()
               : BrowserstackEdgeManager.getDriver();
    }

}
