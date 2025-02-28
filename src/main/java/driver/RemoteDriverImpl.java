package driver;

import org.openqa.selenium.WebDriver;

import driver.entity.DriverData;
import driver.manager.remote.RemoteDriverFactory;

public class RemoteDriverImpl implements IDriver{

    @Override
    public WebDriver getDriver(DriverData driverData) {
       return RemoteDriverFactory.getDriver(driverData.getRemoteModeType(), driverData.getBrowserType());
    }

}
