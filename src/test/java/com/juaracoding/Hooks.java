package com.juaracoding;

import com.juaracoding.drivers.DriverSingleleton;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;

public class Hooks {

    static WebDriver driver;

    @Before
    public static void setUp() {
        DriverSingleleton.getInstance("chrome");
        driver = DriverSingleleton.getDriver();
        // extend report
    }

    @AfterAll
    public static void finish() {
        DriverSingleleton.delay(3);
        DriverSingleleton.closeObjectInstance();
    }

}
