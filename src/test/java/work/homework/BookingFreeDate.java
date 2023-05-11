package work.homework;

import trash.BookingLocators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookingFreeDate {

    WebDriver driver = new ChromeDriver();
    public static BookingLocators bookingLocators;

    @Before
    public void beforeTests() {
        bookingLocators = new BookingLocators(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void hotelAvailabilityTest() {
        driver.get("https://booking.com");
        bookingLocators.HideLoginClick();
        bookingLocators.CitySelect();
        bookingLocators.DataBeforeClick();
        bookingLocators.DataAfterClick();
        bookingLocators.ConfirmBooking();
        Assert.assertTrue("no hotels", driver.findElements(By.cssSelector("[data-testid='property-card']")).size() > 0);
    }

    @After
    public void afterTests() {
        driver.quit();
    }

}
