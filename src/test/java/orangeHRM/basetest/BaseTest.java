package orangeHRM.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import orangeHRM.driver.DriverFactory;

public class BaseTest {

	protected BaseTest() {
		
	}
	
	@BeforeMethod
	public void setup() {
		DriverFactory.initDriver();
	}
	
	@AfterMethod
	public void teardown() {
		DriverFactory.quitDriver();
	}
	
}
