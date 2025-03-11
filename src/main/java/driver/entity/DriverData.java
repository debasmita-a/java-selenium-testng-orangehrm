package driver.entity;

import enums.BrowserType;
import enums.RemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class DriverData {

    private BrowserType browserType;
    private RemoteModeType remoteModeType;
}
