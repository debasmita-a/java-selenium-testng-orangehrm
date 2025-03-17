package pages.components;

import org.openqa.selenium.By;

import pages.entity.UserData;
import utils.PageActionUtil;

public class AddUsersComponent {

    private static final By ADD_BUTTON = By.xpath("//button[contains(@class,'oxd-button')]//i");
    private static final By USER_ROLE_DROPDOWN = By.className("oxd-select-text-input");
    private static final By EMPLOYEE_NAME = By.xpath("//input[@placeholder='Type for hints...']");
    private static final By STATUS = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
    private static final By USERNAME = By.xpath("//label[text()='Username']/parent::div/following-sibling::div/input");
    private static final By PASSWORD = By.xpath("(//input[@type='password'])[1]");
    private static final By CONFIRM_PASSWORD = By.xpath("(//input[@type='password'])[2]");
    private static final By SAVE_BUTTON = By.xpath("//button[@type='submit']");

    public AddUsersComponent clickAddUserBtn(){
        PageActionUtil.waitAndClick(ADD_BUTTON);
        return this;
    }

    public AddUsersComponent selectUserRole(String role){
        PageActionUtil.select(USER_ROLE_DROPDOWN, e->e.selectByVisibleText(role));
        return this;
    }

    public AddUsersComponent enterEmployeeName(String name){
        PageActionUtil.waitAndSend(EMPLOYEE_NAME, name);
        return this;
    }

    public AddUsersComponent selectStatus(String status){
        PageActionUtil.select(STATUS, e->e.selectByVisibleText(status));
        return this;
    }

    public AddUsersComponent enterUserName(String username){
        PageActionUtil.waitAndSend(USERNAME, username);
        return this;
    }

    public AddUsersComponent enterPassword(String password){
        PageActionUtil.waitAndSend(PASSWORD, password);
        return this;
    }

    public AddUsersComponent confirmPassword(String password){
        PageActionUtil.waitAndSend(CONFIRM_PASSWORD, password);
        return this;
    }

    public boolean isSuccessMessageDisplayed(){
        //TODO
        return true;
    }

    public AddUsersComponent fillDetails(UserData userData){
        selectUserRole(userData.getUserRole())
        .enterEmployeeName(userData.getEmployeeName())
        .selectStatus(userData.getStatus())
        .enterUserName(userData.getUserName())
        .enterPassword(userData.getPassword())
        .confirmPassword(userData.getPassword());
        
        return this;
    }
}
