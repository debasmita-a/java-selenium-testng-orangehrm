package orangeHRM.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import orangeHRM.driver.DriverManager;

public class BasePage {

	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by, String keys) {
		DriverManager.getDriver().findElement(by).sendKeys(keys);
	}

	protected String getTitle() {
		return DriverManager.getDriver().getTitle();
	}

	protected String getURL() {
		return DriverManager.getDriver().getCurrentUrl();
	}
	
	protected void clickWithWait(By by, int timeout) {
		WebDriverWait  wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}
	
	protected void sendKeysWithWait(By by, String keys, int timeout) {
		WebDriverWait  wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(keys);
	}
	
	protected String getText(By by) {
		return DriverManager.getDriver().findElement(by).getText();
	}
	
	protected String getTextWithWait(By by, int timeout) {
		WebDriverWait  wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
	}
	
	protected boolean isElementDisplayed(By by) {
		return DriverManager.getDriver().findElement(by).isDisplayed();
	}
	
	protected boolean isElementDisplayedWithWait(By by, int timeout) {
		WebDriverWait  wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(by)).isDisplayed();
	}
}
