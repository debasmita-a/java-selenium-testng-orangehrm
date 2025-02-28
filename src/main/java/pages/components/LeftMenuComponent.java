package pages.components;

import org.openqa.selenium.By;

import pages.MenuType;
import utils.PageActionUtil;

public class LeftMenuComponent {

    private static final String MENU = "//span[text()='%s']";

    public void clickMenuItem(MenuType menuName){
        String xpath = String.format(MENU, menuName.getName());
        PageActionUtil.waitAndClick(By.xpath(xpath));
    }
}
