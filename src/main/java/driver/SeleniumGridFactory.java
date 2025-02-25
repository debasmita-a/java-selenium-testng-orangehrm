package driver;

import org.openqa.selenium.WebDriver;

import driver.manager.SeleniumGridChromeManager;
import driver.manager.SeleniumGridEdgeManager;
import enums.BrowserType;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
               ? SeleniumGridChromeManager.getDriver()
               : SeleniumGridEdgeManager.getDriver();
    }
}
