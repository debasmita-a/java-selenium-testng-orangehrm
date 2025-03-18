package pages;

import org.openqa.selenium.By;

import pages.components.LeftMenuComponent;
import utils.PageActionUtil;

public class HomePage {

    private final LeftMenuComponent leftMenuComponent;

    public HomePage(){
        this.leftMenuComponent = new LeftMenuComponent();
    }

    public LeftMenuComponent getLeftMenuComponent(){
        return leftMenuComponent;
    }

    public UsersPage navigateToAddUsersPage(){
        PageActionUtil.waitAndClick(By.xpath("//span[text()='Admin']"));
        PageActionUtil.waitAndClick(By.xpath("//span[text()='User Management ']"));
        PageActionUtil.waitAndClick(By.xpath("//a[text()='Users']"));
        return new UsersPage();
    }

}
