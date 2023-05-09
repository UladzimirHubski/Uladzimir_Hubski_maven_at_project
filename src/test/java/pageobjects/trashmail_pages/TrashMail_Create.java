package pageobjects.trashmail_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TrashMail_Create {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions make = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://trashmail.com/");
        driver.findElement(By.xpath("//input[@id='fe-name']")).clear();

        make.doubleClick(driver.findElement(By.xpath("//input[@id='fe-name']"))).sendKeys("Oleg_book2").perform();
        driver.findElement(By.xpath("//input[@id='fe-forward']")).sendKeys("19vova93@mail.ru");
        driver.findElement(By.xpath("//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']")).click();
        driver.findElement(By.xpath("//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']//li[@role='presentation'][4]")).click();
        driver.findElement(By.xpath("//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']")).click();
        driver.findElement(By.xpath("//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']//li[@role='presentation'][1]")).click();
        driver.findElement(By.xpath("//button[@id=\"fe-submit\"]")).click();
    }
}
