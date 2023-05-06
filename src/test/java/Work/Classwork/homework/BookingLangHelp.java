package Work.Classwork.homework;

import objects.Booking.BookingLocators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BookingLangHelp {

    public static BookingLocators bookingLocators;
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);

    @Before
    public void beforeTests() {
        bookingLocators = new BookingLocators(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                 }

    @Test
    public void currencyTest() {
        driver.get("https://booking.com");
        bookingLocators.HideLoginClick();
        actions.moveToElement(driver.findElement(By.cssSelector("[data-testid='header-currency-picker-trigger']")));
        actions.perform();
        String tooltip = driver.findElement(By.xpath("//*[@id=':R2cl:']/div")).getText();
        Assert.assertEquals("Incorrect tooltip", "Выберите валюту", tooltip);
    }

    @Test
    public void languageTest() {
        actions.moveToElement(driver.findElement(By.cssSelector("[data-testid='header-language-picker-trigger']")));
        actions.perform();
        String tooltip = driver.findElement(By.xpath("//*[@id=':R2kl:']/div")).getText();
        Assert.assertEquals("Incorrect tooltip", "Выберите язык", tooltip);
    }

    @After
    public void afterTests() {
        driver.quit();
    }


}
