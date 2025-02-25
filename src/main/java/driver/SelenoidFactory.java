package driver;

import org.openqa.selenium.WebDriver;

import driver.manager.SelenoidChromeManager;
import driver.manager.SelenoidEdgeManager;
import enums.BrowserType;

public final class SelenoidFactory {

    private SelenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                   ? SelenoidChromeManager.getDriver()
                   : SelenoidEdgeManager.getDriver();
        }

}
