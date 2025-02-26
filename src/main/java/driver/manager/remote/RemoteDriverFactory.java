package driver.manager.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import enums.BrowserType;
import enums.RemoteModeType;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){}

    private static final Map<RemoteModeType, Function<BrowserType,WebDriver>> MAP
                                   = new EnumMap<>(RemoteModeType.class);

    static{
        MAP.put(RemoteModeType.SELENIUMGRID, SeleniumGridFactory::getDriver);
        MAP.put(RemoteModeType.SELENOID, SelenoidFactory::getDriver);
        MAP.put(RemoteModeType.BROWSERSTACK, BrowserstackFactory::getDriver);
    }
    public static WebDriver getDriver(RemoteModeType remotemode, BrowserType browserType){
        return MAP.get(remotemode).apply(browserType);
    }
}
