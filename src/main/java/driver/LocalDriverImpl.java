package driver;

import org.openqa.selenium.WebDriver;

import driver.entity.DriverData;
import driver.manager.local.LocalDriverFactory;

public class LocalDriverImpl implements IDriver {

    @Override
    public WebDriver getDriver(DriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }

}
