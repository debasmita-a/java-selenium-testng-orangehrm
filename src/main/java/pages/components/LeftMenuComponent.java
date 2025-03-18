package pages.components;

import org.openqa.selenium.By;

import pages.MenuType;
import pages.SubMenuType;
import utils.PageActionUtil;

public class LeftMenuComponent {

    private static final String MENU = "//span[text()='%s']";
    private static final String SUB_MENU = "//a[text()='%s ']";

    public LeftMenuComponent clickMenuItem(MenuType menuName){
        String xpath = String.format(MENU, menuName.getName());
        PageActionUtil.waitAndClick(By.xpath(xpath));
        return this;
    }

    public LeftMenuComponent clickSubMenuItem(SubMenuType users){
        String xpath = String.format(SUB_MENU, users.getName());
        PageActionUtil.waitAndClick(By.xpath(xpath));
        return this;
    }
}
