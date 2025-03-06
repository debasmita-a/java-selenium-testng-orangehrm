package utils;

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import driver.manager.DriverManager;

public class PageActionUtil {

    private PageActionUtil(){}

    public static void waitAndClick(By by){
        DriverManager.getDriver().findElement(by).click();
    }

    public static void waitAndSend(By by, String data){
        DriverManager.getDriver().findElement(by).sendKeys(data);
    }

    public static void select(By by, Consumer<Select> consumer){
        consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
    }
    
}
