package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.xml.xpath.XPath;
import java.time.Duration;

public class CreateEmail {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions make = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://trashmail.com/");

        make.doubleClick(driver.findElement(By.xpath("//input[@id='fe-name']"))).sendKeys("19vova93").perform();

        driver.findElement(By.xpath("//input[@id='fe-forward']")).sendKeys("19vova93@mail.ru");;
        driver.findElement(By.xpath("//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']")).click();
        driver.findElement(By.xpath("//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']//li[@role='presentation'][3]")).click();
        driver.findElement(By.xpath("//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']")).click();
        driver.findElement(By.xpath("//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']//li[@role='presentation'][1]")).click();
        //driver.findElement(By.xpath("//button[@id=\"fe-submit\"]")).click();
    }
}
