package orangeHRM.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;
import orangeHRM.driver.DriverFactory;
import orangeHRM.driver.DriverManager;

public final class HomePageTest extends BaseTest{

	private HomePageTest() {
		
	}
	
	@Test
	public void test3() {	
		//DriverFactory.initDriver(); 
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation Testing",Keys.ENTER);
	}
}
