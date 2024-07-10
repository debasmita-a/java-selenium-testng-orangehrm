package orangeHRM.testcases;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;
import orangeHRM.driver.DriverManager;

public final class HomePageTest extends BaseTest{

	private HomePageTest() {
		
	}
	
	@Test
	public void test3() {	
		//DriverFactory.initDriver(); 
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation Testing",Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		System.out.println(title);
		Assert.assertTrue(Objects.nonNull(title));
		Assert.assertTrue(title.contains("Google Search"));
	//	Assert.assertTrue(title.toLowerCase().matches("\\w.*" + "Google Search")); //[a-z A-Z]
		Assert.assertTrue(title.length()> 15 && title.length()<100);
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));	
		Assert.assertEquals(elements.size(), 14);
		boolean isElementPresent = false;
		for(WebElement e : elements) {
			if(e.getText().equals("What is Automated Testing?")) {
				isElementPresent = true;
			}
			Assert.assertTrue(isElementPresent, "Title not available");
		}
	}
}
