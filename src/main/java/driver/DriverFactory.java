package driver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import driver.entity.DriverData;
import enums.RunModeType;

public final class DriverFactory {

    private DriverFactory() {
    }

    private static final Map<RunModeType, Supplier<IDriver>> DRIVER = new EnumMap<>(RunModeType.class);

    static {
        DRIVER.put(RunModeType.LOCAL, LocalDriverImpl::new);
        DRIVER.put(RunModeType.REMOTE, RemoteDriverImpl::new);
    }

    public static IDriver getDriver(RunModeType runModeType) {
        return DRIVER.get(runModeType).get();
      /*   return driverData.getRunModeType() == RunModeType.LOCAL
                ? new LocalDriverImpl().getDriver(driverData)
                : new RemoteDriverImpl().getDriver(driverData); */
    }
}
