package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources ({"file:${user.dir}/src/test/resources/config.properties"})
public interface FrameworkConfig extends Config{

	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserType.class)
	BrowserType browser();
	
}
