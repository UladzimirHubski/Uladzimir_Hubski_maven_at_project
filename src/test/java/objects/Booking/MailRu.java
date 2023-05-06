package objects.Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MailRu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://account.mail.ru/login");
        driver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys("19vova93");
        driver.findElement(By.xpath("//button[@data-test-id='next-button']")).click();
        driver.findElement(By.xpath("//input[@name =\"password\"]")).sendKeys("-------");
        driver.findElement(By.xpath("//button[@data-test-id='submit-button']")).click();
        driver.findElement(By.xpath("//a[@data-folder-link-id='2']")).click();
        driver.findElement(By.xpath("//a[1][@class='llc llc_normal llc_first llc_new llc_new-selection js-letter-list-item js-tooltip-direction_letter-bottom']//div[@class='llc__container']")).click();
        driver.findElement(By.xpath("//div[@class='letter__body']//a[@class='button_mr_css_attr']")).click();
    }
}
