package driver;

import org.openqa.selenium.WebDriver;

import config.ConfigFactory;
import enums.RemoteModeType;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){
        RemoteModeType remotemode = ConfigFactory.getConfig().remotemode();
        if(remotemode == RemoteModeType.SELENIUMGRID){

        }else if(remotemode == RemoteModeType.SELENOID){

        }else if(remotemode == RemoteModeType.BROWSERSTACK){

        }
        return null;
    }
}
