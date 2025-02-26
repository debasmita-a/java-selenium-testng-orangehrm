package driver.manager.remote;

import org.openqa.selenium.WebDriver;

import enums.BrowserType;

public final class BrowserstackFactory {

    private BrowserstackFactory(){}

    public static WebDriver getDriver(BrowserType browserType) {
    return browserType == BrowserType.CHROME
               ? BrowserstackChromeManager.getDriver()
               : BrowserstackEdgeManager.getDriver();
    }

}
