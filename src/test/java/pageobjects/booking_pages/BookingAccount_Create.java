package pageobjects.booking_pages;

import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.BookingInput;
import work.Classwork.day19.L4JLogging;

public class BookingAccount_Create {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    WebDriver driver = Driver.getWebDriver();
    private final static String LOGINPAGE = BookingInput.Booking;
    private final static String USERNAME_INPUT = "//input[@name =\"username\"]";
    private final static String USERNAMEEMAIL = String.format(BookingInput.TrashEmail + "%s", BookingInput.TrashEmailDomain);
    private final static String PSWD_INPUT = "//input[@name =\"new_password\"]";
    private final static String PSWD_CONFIRM = "//input[@name =\"confirmed_password\"]";
    private final static String SUBMIT_BTN = "//button[@type='submit']";


    public void OpenLoginPage() {
        driver.get(LOGINPAGE);
        LOGGER.trace("Opened page: " + LOGINPAGE);
    }

    public void EnterLogin() {
        driver.findElement(By.xpath(USERNAME_INPUT)).sendKeys(USERNAMEEMAIL);
        driver.findElement(By.xpath(SUBMIT_BTN)).click();
        LOGGER.trace("Loginned as User: " + USERNAMEEMAIL + " / " + USERNAME_INPUT);
    }

    public void EnterPassword() {
        driver.findElement(By.xpath(PSWD_INPUT)).sendKeys(BookingInput.Password);
        LOGGER.trace("Find field: " + PSWD_INPUT + " and send Password");

        driver.findElement(By.xpath(PSWD_CONFIRM)).sendKeys(BookingInput.Password);
        LOGGER.trace("Find field: " + PSWD_CONFIRM + " and send Password");

        driver.findElement(By.xpath(SUBMIT_BTN)).click();
        LOGGER.trace("Click on Buttod " + SUBMIT_BTN);
        LOGGER.trace("Password inputted and confirmed: Used password: " + PSWD_INPUT);
    }
}
