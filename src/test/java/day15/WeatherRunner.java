package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class WeatherRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String text;
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("погода минск");
        //driver.findElement(By.xpath("//*[@role ='listbox'][1]//*[@role = 'presentation'][1]")).submit();
        //driver.findElement(By.xpath("//*[@role ='listbox'][1]//*[@class = 'sbic sb43'][1]")).submit();
        driver.findElement(By.className("sbct")).submit();
        driver.findElement(By.xpath("//*[@id=\"dimg_3\"]")).click();
        //text = driver.findElement(By.xpath("//*[@class ='wob_t wob_gs_l18'][1]")).getAttribute("aria-label");
        text = Arrays.toString(driver.findElement(By.xpath("//*[contains(@aria-label, 'пятница 12:00')][1]")).getAttribute("aria-label").split("°"));
        System.out.println(text);
    }
}
