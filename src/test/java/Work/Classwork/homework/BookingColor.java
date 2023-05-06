package Work.Classwork.homework;

import objects.Booking.BookingLocators;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookingColor {
    WebDriver driver = new ChromeDriver();

    public static BookingLocators bookingLocators;


    @Before
    public void beforeTest() {
        bookingLocators = new BookingLocators(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Test
    public void JsTest() {

        driver.get("https://booking.com/");
        bookingLocators.HideLoginClick();
        bookingLocators.HideLoginClick();
        bookingLocators.CitySelect();
        bookingLocators.DataBeforeClick();
        bookingLocators.DataAfterClick();
        bookingLocators.ConfirmBooking();
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='property-card'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", driver.findElement(By.xpath("//*[@data-testid='property-card'][10]//descendant:: div[@data-testid='title']")));
        Assert.assertEquals("not red", "color: red;", driver.findElement(By.xpath("//*[@data-testid='property-card'][10]//div[@data-testid='title']")).getAttribute("style"));
    }

    @After
    public void afterTests() {
        driver.quit();
    }
}
