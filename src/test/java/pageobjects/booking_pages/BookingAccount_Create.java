package pageobjects.booking_pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.BookingInput;

public class BookingAccount_Create {
    WebDriver driver = Driver.getWebDriver();
    private final static String LOGINPAGE = BookingInput.Booking;
    private final static String USERNAME_INPUT = "//input[@name =\"username\"]";
    private final static String USERNAMEEMAIL = String.format(BookingInput.TrashEmail + "%s", BookingInput.TrashEmailDomain);
    private final static String PSWD_INPUT = "//input[@name =\"new_password\"]";
    private final static String PSWD_CONFIRM = "//input[@name =\"confirmed_password\"]";
    private final static String SUBMIT_BTN = "//button[@type='submit']";


    public void OpenLoginPage() {
        driver.get(LOGINPAGE);
    }

    public void EnterLogin() {
        driver.findElement(By.xpath(USERNAME_INPUT)).sendKeys(USERNAMEEMAIL);
        driver.findElement(By.xpath(SUBMIT_BTN)).click();
    }

    public void EnterPassword() {
        driver.findElement(By.xpath(PSWD_INPUT)).sendKeys(BookingInput.Password);
        driver.findElement(By.xpath(PSWD_CONFIRM)).sendKeys(BookingInput.Password);
        driver.findElement(By.xpath(SUBMIT_BTN)).click();
    }
}
