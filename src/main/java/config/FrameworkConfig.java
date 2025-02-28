package config;

import org.aeonbits.owner.Config;

import converters.StringToBrowserType;
import converters.StringToRemoteModeType;
import converters.StringToRunModeType;
import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunModeType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources ({"file:${user.dir}/src/test/resources/dev-config.properties",
                 "file:${user.dir}/src/test/resources/staging-config.properties"})

public interface FrameworkConfig extends Config{

	@DefaultValue("dev")
	String env();

	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserType.class)
	BrowserType browser();
	
	@Key("${env}.url")
	String url();

	@Key("runmode")
	@ConverterClass(StringToRunModeType.class)
	RunModeType runmode();

	@ConverterClass(StringToRemoteModeType.class)
	@Key("remotemode")
	RemoteModeType remotemode();

	String seleniumGridURL();

	String selenoidURL();
	
}
