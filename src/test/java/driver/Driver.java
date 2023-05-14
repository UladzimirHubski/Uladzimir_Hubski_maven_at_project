package driver;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

//simple WebDriver singelton

public class Driver {

    private static WebDriver webDriver;
    private static Config config;

    public static void setConfig(Config config) {
        Driver.config = null == config ? Config.valueOf(System.getProperty("CONFIG")) : config;
    }

    public static WebDriver getWebDriver() throws NullPointerException {
        if (webDriver == null) {
            webDriver = DriverManager.getDriver(config);
            setTimeouts(30, 30, 50);
        }
        return webDriver;
    }

    public static void setTimeouts(int scriptTimeOut, int implicityWait, int pageLoadTimeOut) {
        webDriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(scriptTimeOut));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicityWait));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeOut));
    }
}

