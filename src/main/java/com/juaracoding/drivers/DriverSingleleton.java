package com.juaracoding.drivers;

import com.juaracoding.drivers.strategies.DriverStrategy;
import com.juaracoding.drivers.strategies.DriverStrategyImplementer;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleleton {

    public static DriverSingleleton instance = null;
    private static WebDriver driver;

    public DriverSingleleton(String driver) {
        instantiate(driver);
    }

    public WebDriver instantiate (String strategy) {
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static DriverSingleleton getInstance(String driver) {
        if(instance == null) {
            instance = new DriverSingleleton(driver);
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }

}
