package orangeHRM.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;
import orangeHRM.driver.DriverManager;

public final class LoginPageTest extends BaseTest{
	
	private LoginPageTest() {
		
	}


	@Test
	public void test1() {	
		//DriverFactory.initDriver(); 
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
	
	@Test
	public void test2() {	
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}
	

}
