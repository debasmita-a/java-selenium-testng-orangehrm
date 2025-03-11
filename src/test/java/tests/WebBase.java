package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.Driver;

public class WebBase {

    @BeforeMethod
    public void setup(){
        Driver.initDriver();
    }

    @AfterMethod
    public void teardown(){
      //  Driver.quitDriver();
    }
}
