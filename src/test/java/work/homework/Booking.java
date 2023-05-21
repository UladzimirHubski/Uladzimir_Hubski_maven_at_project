package work.homework;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import work.classwork.day19.L4JLogging;

import java.time.Duration;

public class Booking {

    WebDriver driver = new ChromeDriver();
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());


    @Before
    public void beforeTest() {
        LOGGER.info("Test started");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Test
    public void BookingTest() {
        LOGGER.debug("Test going");
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
        LOGGER.debug("Test finished");
    }


}
