package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.Driver;

public class WebBase {

    @BeforeTest
    public void setup() {
       Driver.initDriver();	
    }

    @Test
    public void demoTest(){
        System.out.println("debugging before test.");
    }
}
