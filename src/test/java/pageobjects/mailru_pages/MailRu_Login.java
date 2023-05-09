package pageobjects.mailru_pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import settings.BookingInputR;


public class MailRu_Login {
    WebDriver driver = new ChromeDriver();

    private final static String LOGINPAGE = BookingInputR.MainEmail;
    private final static String PASSWORD = "//input[@placeholder=\"Password\"]";
    private final static String LOGIN = "//input[@name =\"username\"]";
    private final static String NEXTBUTTON = "//button[@data-test-id='next-button']";
    private final static String SUBMITBUTTON = "//button[@data-test-id='submit-button']";


    public void OpenLogin() {
        driver.get(LOGINPAGE);
    }

    public void InputLogin() {
        driver.findElement(By.xpath(LOGIN)).sendKeys(BookingInputR.MainEmailLogin);
        driver.findElement(By.xpath(NEXTBUTTON)).click();
    }


    public void InputPassword() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(PASSWORD)).sendKeys(BookingInputR.MainEmailPassword);
        driver.findElement(By.xpath(SUBMITBUTTON)).click();
    }

}
