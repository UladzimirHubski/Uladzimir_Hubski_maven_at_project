package Work.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Booking {

    WebDriver driver = new ChromeDriver();


    @Before
    public void beforeTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Test
    public void BookingTest() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://www.booking.com/");

        driver.findElement(By.xpath("//*[@role ='dialog']//*[@type = \"button\"]")).click();
        driver.findElement(By.xpath("//div[@data-testid ='destination-container']//input[@name = 'ss']")).sendKeys("Париж");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//*[@data-testid='searchbox-dates-container']")).click();
        driver.findElement(By.cssSelector("[data-date='2023-04-18']")).click();
        driver.findElement(By.cssSelector("[data-date='2023-04-25']")).click();

        driver.findElement(By.xpath("//button[@data-testid = 'occupancy-config']")).click();
        WebElement adults = driver.findElement(By.xpath("//input[@id = 'group_adults']/..//following-sibling::div/button[2]"));
        adults.click();
        adults.click();
        WebElement rooms = driver.findElement(By.xpath("//input[@id = 'no_rooms']/..//following-sibling::div/button[2]"));
        rooms.click();

        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

    }

    @After
    public void afterTests() {
        driver.quit();
    }


}
