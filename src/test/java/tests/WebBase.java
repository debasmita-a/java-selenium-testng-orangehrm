package tests;

import org.testng.annotations.BeforeMethod;

import driver.manager.local.Driver;

public class WebBase {

    @BeforeMethod
    public void setup() {
        Driver.initDriver();
    }
}
