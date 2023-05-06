package work.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoQaDropdown {

    WebDriver driver = new ChromeDriver();

    @Before
    public void beforeTests() {
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void demoQa() {
        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath("//*[@id='withOptGroup']/div")).click();
        driver.findElement(By.xpath("//div[@id='react-select-2-option-0-0']")).click();
        driver.findElement(By.xpath("//*[@id='selectOne']/div")).click();
        driver.findElement(By.xpath("//div[@id='react-select-3-option-0-1']")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
        Select select = new Select(element);
        select.selectByValue("3");
        driver.findElement(By.xpath("//*[contains(text(), 'Select...')]")).click();
        driver.findElement(By.xpath("//div[@id='react-select-4-option-0']")).click();
        driver.findElement(By.xpath("//div[@id='react-select-4-option-1']")).click();
        driver.findElement(By.xpath("//div[@id='react-select-4-option-2']")).click();
        driver.findElement(By.xpath("//div[@id='react-select-4-option-3']")).click();
        WebElement element1 = driver.findElement(By.xpath("//*[@id='cars']"));
        Select select1 = new Select(element1);
        select1.selectByValue("volvo");
        select1.selectByValue("saab");
    }
    @After
        public void afterTests() {
            driver.quit();
    }
}
