package utils;

import java.time.Duration;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.manager.DriverManager;

public class PageActionUtil {

    private PageActionUtil(){}

    public static void waitAndClick(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public static void waitAndSend(By by, String data){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(data);
    }

    public static void waitAndSelect(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    public static void select(By by, Consumer<Select> consumer){
        consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
    }

    public static String getElementText(By by){
        return DriverManager.getDriver().findElement(by).getText();
    }
    
}
