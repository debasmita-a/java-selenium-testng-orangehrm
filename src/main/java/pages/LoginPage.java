package pages;

import org.openqa.selenium.By;

import static utils.PageActionUtil.waitAndClick;
import static utils.PageActionUtil.waitAndSend;

public class LoginPage {

    private static final By USER_NAME_TEXTBOX = By.name("username");
    private static final By PASSWORD_TEXTBOX = By.name("password");
    private static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    private LoginPage setUserNameTextBox(String username) {
        waitAndSend(USER_NAME_TEXTBOX, username);
        return this;
    }

    private LoginPage setPasswordTextBox(String password) {
        waitAndSend(PASSWORD_TEXTBOX, password);
        return this;
    }

    private HomePage clickLoginBtn() {
        waitAndClick(LOGIN_BUTTON);
        return new HomePage();
    }

    public HomePage loginToApplication(String username, String password){
        return setUserNameTextBox(username).setPasswordTextBox(password).clickLoginBtn();
    }

}
