package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherRunner {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("погода минск");
        driver.findElement(By.xpath("//*[@aria-label= \"погода минск\"]")).click();

    }
}
