package work.Classwork.day15;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import work.Classwork.day19.L4JLogging;

import java.util.Arrays;

public class WeatherRunner {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
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
        LOGGER.info(text);
    }
}
