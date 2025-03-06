package pages.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import pages.entity.UserData;;

public class AddUserTemplate implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(UserData.class).addTemplate("valid", new Rule() {
            {
                add("userRole", random("ESS", "Admin"));
                add("employeeName", uniqueRandom("Curran K", "Kate L"));
                add("userName", random("test123"));
                add("status", random("Enabled", "Disabled"));
                add("password", random("qwe45rty"));
            }
        });

        Fixture.of(UserData.class).addTemplate("just_username", new Rule() {
            {
                add("userName", random("Lennert"));
            }
        });
    }

}