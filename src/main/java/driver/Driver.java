package driver;

import org.openqa.selenium.WebDriver;
import config.ConfigFactory;

public class Driver {

    static WebDriver driver = null;

    public static void initDriver() { //LocalDriverFactory
        
        driver.get(ConfigFactory.getConfig().url());
    }

    public static void quitDriver() {

    }
}
