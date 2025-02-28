package driver;

import org.openqa.selenium.WebDriver;

import driver.entity.DriverData;

public interface IDriver {

    WebDriver getDriver(DriverData driverData);
}
