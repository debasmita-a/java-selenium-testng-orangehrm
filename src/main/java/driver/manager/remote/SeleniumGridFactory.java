package driver.manager.remote;

import org.openqa.selenium.WebDriver;

import enums.BrowserType;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
               ? SeleniumGridChromeManager.getDriver()
               : SeleniumGridEdgeManager.getDriver();
    }
}
