package utils;

import org.openqa.selenium.By;

import driver.manager.DriverManager;

public class PageActionUtil {

    private PageActionUtil(){}

    public static void waitAndClick(By by){
        DriverManager.getDriver().findElement(by).click();
    }

    public static void waitAndSend(By by, String data){
        DriverManager.getDriver().findElement(by).sendKeys(data);
    }
}
