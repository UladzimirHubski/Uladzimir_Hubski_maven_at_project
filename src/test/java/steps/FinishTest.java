package steps;

import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import work.classwork.day19.L4JLogging;

public class FinishTest {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    WebDriver driver = Driver.getWebDriver();

    public void finishQuitTest() {
        driver.quit();
        LOGGER.trace("Test finished");
    }

    public void finishCloseTest() {
        driver.close();
        LOGGER.trace("Test finished");
    }
}
