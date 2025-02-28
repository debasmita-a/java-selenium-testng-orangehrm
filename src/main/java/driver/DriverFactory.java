package driver;

import org.openqa.selenium.WebDriver;

import driver.entity.DriverData;
import driver.manager.local.LocalDriverFactory;
import driver.manager.remote.RemoteDriverFactory;
import enums.RunModeType;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriver(DriverData driverData){
        if(driverData.getRunModeType() == RunModeType.LOCAL){
            return LocalDriverFactory.getDriver(driverData.getBrowserType());
        }else {
            return RemoteDriverFactory.getDriver(driverData.getRemoteModeType(), driverData.getBrowserType());
        }
    }
}
