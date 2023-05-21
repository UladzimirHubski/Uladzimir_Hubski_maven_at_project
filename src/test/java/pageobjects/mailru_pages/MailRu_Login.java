package pageobjects.mailru_pages;

import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.BookingInput;
import work.classwork.day19.L4JLogging;


public class MailRu_Login {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    WebDriver driver = Driver.getWebDriver();

    private final static String LOGINPAGE = BookingInput.MainEmail;
    private final static String PASSWORD = "//input[ @placeholder= \"Password\" or @placeholder= \"Пароль\"]";
    private final static String LOGIN = "//input[@name =\"username\"]";
    private final static String NEXTBUTTON = "//button[@data-test-id='next-button']";
    private final static String SUBMITBUTTON = "//button[@data-test-id='submit-button']";


    public void OpenLogin() {
        driver.get(LOGINPAGE);
        LOGGER.trace("Open Page: " + LOGINPAGE);
    }

    public void InputLogin() {
        driver.findElement(By.xpath(LOGIN)).sendKeys(BookingInput.MainEmailLogin);
        LOGGER.trace("Find field: " + LOGIN + " and send Login");
        driver.findElement(By.xpath(NEXTBUTTON)).click();
        LOGGER.trace("Click on button " + NEXTBUTTON);
    }

    public void InputPassword() throws InterruptedException {
        //Thread.sleep(1000);
        driver.findElement(By.xpath(PASSWORD)).sendKeys(BookingInput.MainEmailPassword);
        LOGGER.trace("Find field: " + PASSWORD + " and send Login");
        driver.findElement(By.xpath(SUBMITBUTTON)).click();
        LOGGER.trace("Click on button " + SUBMITBUTTON);
    }
}
