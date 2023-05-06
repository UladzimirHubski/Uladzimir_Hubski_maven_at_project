package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BookingCreateTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions make = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://trashmail.com/");


        driver.get("https://trashmail.com/");
        driver.findElement(By.xpath("//input[@id='fe-name']")).clear();
        make.doubleClick(driver.findElement(By.xpath("//input[@id='fe-name']"))).sendKeys("oleg_book2").perform();
        driver.findElement(By.xpath("//input[@id='fe-forward']")).sendKeys("19vova93@mail.ru");
        driver.findElement(By.xpath("//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']")).click();
        driver.findElement(By.xpath("//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']//li[@role='presentation'][4]")).click();
        driver.findElement(By.xpath("//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']")).click();
        driver.findElement(By.xpath("//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']//li[@role='presentation'][1]")).click();
        driver.findElement(By.xpath("//button[@id=\"fe-submit\"]")).click();

        driver.get("https://account.booking.com/sign-in");
        driver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys("oleg_book2@trashmail.fr");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@name =\"new_password\"]")).click();
        driver.findElement(By.xpath("//input[@name =\"new_password\"]")).sendKeys("!Olegbook2");
        driver.findElement(By.xpath("//input[@name =\"confirmed_password\"]")).click();
        driver.findElement(By.xpath("//input[@name =\"confirmed_password\"]")).sendKeys("!Olegbook2");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.get("https://account.mail.ru/login");
        driver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys("19vova93");
        driver.findElement(By.xpath("//button[@data-test-id='next-button']")).click();
        driver.findElement(By.xpath("//input[@name =\"password\"]")).sendKeys("Amberg01!");
        driver.findElement(By.xpath("//button[@data-test-id='submit-button']")).click();
        driver.findElement(By.xpath("//a[@data-folder-link-id='2']")).click();
        driver.findElement(By.xpath("//a[1][@class='llc llc_normal llc_first llc_new llc_new-selection js-letter-list-item js-tooltip-direction_letter-bottom']//div[@class='llc__container']")).click();
        driver.findElement(By.xpath("//div[@class='letter__body']//a[@class='button_mr_css_attr']")).click();


    }
}
