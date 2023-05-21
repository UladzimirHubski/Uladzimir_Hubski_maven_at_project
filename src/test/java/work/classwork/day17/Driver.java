package work.classwork.day17;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

//simple WebDriver singelton

public class Driver {

    private static WebDriver webDriver;
    private static Config config;

    public static void setConfig(Config config) {
        Driver.config = null == config ? Config.valueOf(System.getProperty("CONFIG")) : config;
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            //вызвать таймаут
            webDriver = DriverManager.getDriver(config);
            setTimeout(10);
        }

        return webDriver;
    }

    public static void setTimeout(int seconds) {
        if (webDriver != null) {
            webDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }
    }
}
