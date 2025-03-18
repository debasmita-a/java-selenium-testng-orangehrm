package tests;

import java.util.List;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import io.github.sskorol.core.DataSupplier;
import io.reactivex.rxjava3.functions.BiPredicate;
import pages.LoginPage;
import pages.components.AddUsersComponent;
import pages.entity.UserData;

public class AddUserTest extends WebBase{

    BiPredicate<UserData, AddUsersComponent> justEmployeeNamePredicate = (userData, addUserComponent)->{
        addUserComponent.enterEmployeeName(userData.getEmployeeName());
        return addUserComponent.getErrorMessage();
        
    };

    @BeforeSuite
    public void setupUserFixture(){
        FixtureFactoryLoader.loadTemplates("pages.templates");
    }

    @DataProvider
    public static Object[][] getUserData(){
        return new Object[][]{};
    }

    @DataSupplier
    public Stream<UserData> getData(){
        UserData userData = new UserData("Admin", "test", "test", "Enabled", "test");
        return Stream.of(userData);
    }

    @DataSupplier(runInParallel = true)
    public List<UserData> getData1(){
        List<UserData> valid = Fixture.from(UserData.class).gimme(1, "valid");
        return valid;
    }

    @Test(dataProvider = "getData1")
    public void addUserTest(UserData userData){
        boolean isSuccessMesgDisplayed = new LoginPage().loginToApplication("Admin", "admin123")
        .navigateToAddUsersPage()
        .getAddUsersComponent()
        .clickAddUserBtn()
        .fillDetails(userData)
        .isSuccessMessageDisplayed();

        Assertions.assertThat(isSuccessMesgDisplayed)
                  .withFailMessage(()->"Success message in the field is nto displayed")
                  .isTrue();
     
    }
}
