package trash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookingLogin {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
               //driver.get("https://account.booking.com/sign-in");
        driver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys("Oleg_AT_G7@trashmail.fr");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@name =\"new_password\"]")).click();
        driver.findElement(By.xpath("//input[@name =\"new_password\"]")).sendKeys("Oleg_AT_G7!");
        driver.findElement(By.xpath("//input[@name =\"confirmed_password\"]")).click();
        driver.findElement(By.xpath("//input[@name =\"confirmed_password\"]")).sendKeys("Oleg_AT_G7!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
