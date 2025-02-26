package config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
	
	private ConfigFactory() {}
	
	public static FrameworkConfig getConfig() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

	public static BrowserStackConfig getBrowserStackConfig(){
		return ConfigCache.getOrCreate(BrowserStackConfig.class);
	}

}
