package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources ({"file:${user.dir}/src/test/resources/browser-stack.properties"})
public interface BrowserStackConfig extends Config{
    
    String username();
    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    String browserStackURL();
}
