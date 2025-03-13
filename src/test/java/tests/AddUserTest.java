package tests;

import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import io.github.sskorol.core.DataSupplier;
import pages.LoginPage;
import pages.entity.UserData;

public class AddUserTest extends WebBase{

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
        new LoginPage().loginToApplication("Admin", "admin123")
        .navigateToAddUsersPage()
        .getAddUsersComponent()
        .clickAddUserBtn()
        .fillDetails(userData);
     
    }
}
