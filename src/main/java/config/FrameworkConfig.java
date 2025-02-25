package config;

import org.aeonbits.owner.Config;

import converters.StringToBrowserType;
import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunModeType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources ({"file:${user.dir}/src/test/resources/config.properties"})

public interface FrameworkConfig extends Config{

	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserType.class)
	BrowserType browser();
	String url();
	@Key("runmode")
	RunModeType runmode();
	@Key("remotemode")
	RemoteModeType remotemode();
	
}
