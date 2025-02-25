package driver;

import org.openqa.selenium.WebDriver;
import enums.BrowserType;
import enums.RemoteModeType;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

    public static WebDriver getDriver(RemoteModeType remotemode, BrowserType browserType){

        if(remotemode == RemoteModeType.SELENIUMGRID){
            return SeleniumGridFactory.getDriver(browserType);
        }else if(remotemode == RemoteModeType.SELENOID){
            return SelenoidFactory.getDriver(browserType);
        }else if(remotemode == RemoteModeType.BROWSERSTACK){
            return BrowserstackFactory.getDriver(browserType);
        }
        return null;
    }
}
