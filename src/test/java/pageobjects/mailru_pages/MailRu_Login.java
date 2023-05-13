package pageobjects.mailru_pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import settings.BookingInput;


public class MailRu_Login {

    WebDriver driver = Driver.getWebDriver();

    private final static String LOGINPAGE = BookingInput.MainEmail;
    private final static String PASSWORD = "//input[ @placeholder= \"Password\" or @placeholder= \"Пароль\"]";
    private final static String LOGIN = "//input[@name =\"username\"]";
    private final static String NEXTBUTTON = "//button[@data-test-id='next-button']";
    private final static String SUBMITBUTTON = "//button[@data-test-id='submit-button']";


    public void OpenLogin() {
        driver.get(LOGINPAGE);
    }

    public void InputLogin() {
        driver.findElement(By.xpath(LOGIN)).sendKeys(BookingInput.MainEmailLogin);
        driver.findElement(By.xpath(NEXTBUTTON)).click();
    }

    public void InputPassword() throws InterruptedException {
        //Thread.sleep(1000);
        driver.findElement(By.xpath(PASSWORD)).sendKeys(BookingInput.MainEmailPassword);
        driver.findElement(By.xpath(SUBMITBUTTON)).click();
    }

}
