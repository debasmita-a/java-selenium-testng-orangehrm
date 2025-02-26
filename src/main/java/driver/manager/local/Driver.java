package driver.manager.local;

import org.openqa.selenium.WebDriver;
import config.ConfigFactory;

public class Driver {

    private Driver(){}
//local, remote 
    public static void initDriver() { //LocalDriverFactory
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get(ConfigFactory.getConfig().url());
    }

    public static void quitDriver() {
/*
 * 
 */
    }
}
