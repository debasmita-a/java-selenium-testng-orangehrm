package config;

import org.aeonbits.owner.Config;

import converters.StringToBrowserType;
import converters.StringToRemoteModeType;
import converters.StringToRunModeType;
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
	@ConverterClass(StringToRunModeType.class)
	RunModeType runmode();

	@ConverterClass(StringToRemoteModeType.class)
	@Key("remotemode")
	RemoteModeType remotemode();

	String seleniumGridURL();

	String selenoidURL();
	
}
