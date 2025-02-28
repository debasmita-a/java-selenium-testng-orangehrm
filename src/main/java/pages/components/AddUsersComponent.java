package pages.components;

import org.openqa.selenium.By;

import utils.PageActionUtil;

public class AddUsersComponent {

    private static final By ADD_BUTTON = By.xpath("//button[contains(@class,'oxd-button')]//i");

    public AddUsersComponent clickAddUserBtn(){
        PageActionUtil.waitAndClick(ADD_BUTTON);
        return this;
    }
}
