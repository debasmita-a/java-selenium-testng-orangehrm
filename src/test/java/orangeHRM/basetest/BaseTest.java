package orangeHRM.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import orangeHRM.driver.DriverFactory;

public class BaseTest {

	protected BaseTest() {
		
	}
	
	@BeforeMethod
	protected void setup() throws Exception {
		DriverFactory.initDriver();
	}
	
	@AfterMethod
	protected void teardown() {
		DriverFactory.quitDriver();
	}
	
}
