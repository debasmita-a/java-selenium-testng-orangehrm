package driver;

import org.openqa.selenium.WebDriver;
import static config.ConfigFactory.*;
import driver.entity.DriverData;

public class Driver {

    private Driver(){}
//local, remote 
    public static void initDriver() { //LocalDriverFactory
        DriverData driverData = DriverData.builder().browserType(getConfig().browser())
        .remoteModeType(getConfig().remotemode())
        .runModeType(getConfig().runmode()).build();
        WebDriver driver = DriverFactory.getDriver(driverData);
        driver.get(getConfig().url());
       // driver.quit();
    }

    public static void quitDriver() {
/*
 * 
 */
    }
}
