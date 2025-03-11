package driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import static config.ConfigFactory.getConfig;
import driver.entity.DriverData;
import driver.manager.DriverManager;

public class Driver {

    private Driver() {
    }

    // local, remote
    public static void initDriver() { // LocalDriverFactory
        if(Objects.isNull(DriverManager.getDriver())){
            DriverData driverData = new DriverData(getConfig().browser(), getConfig().remotemode());
            WebDriver driver = DriverFactory
                    .getDriver(getConfig().runmode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(getConfig().url());
        }
    }

    public static void quitDriver() {
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
