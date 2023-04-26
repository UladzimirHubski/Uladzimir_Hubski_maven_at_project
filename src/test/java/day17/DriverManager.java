package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver getDriver(Config config) {

        return switch (config) {
            case CHROME -> getChromeDriver();
            case FF -> getFirefoxDriver();
            case EDGE -> getEdgeDriver();
            default -> getChromeDriver();
        };
    }

    private static WebDriver getChromeDriver() {


        return new ChromeDriver();
    }

    public static WebDriver getFirefoxDriver() {
        return null;
    }

    public static WebDriver getEdgeDriver() {
        return null;
    }
}
