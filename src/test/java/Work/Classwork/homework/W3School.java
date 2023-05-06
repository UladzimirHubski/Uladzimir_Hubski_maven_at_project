package Work.Classwork.homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class W3School {

    WebDriver driver = new ChromeDriver();

    @Before
    public void beforeTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Test
    public void tutorialTest() {
        driver.get("https://www.w3schools.com/java/");
        Actions make = new Actions(driver);
        make
                .doubleClick(driver.findElement(By.xpath("//h1/span[contains(text(),'Tutorial')]")))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();
        driver.get("https://google.com");
        make
                .click(driver.findElement(By.cssSelector("[name='q']")))
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v").clickAndHold()
                .keyUp(Keys.LEFT_CONTROL)
                .keyDown(Keys.ENTER)
                .build()
                .perform();
        int counter = 0;
        List<WebElement> allResults = driver.findElements(By.xpath("//*[@id='rso']/div//descendant:: a[@href]/h3"));
        List<WebElement> displayedResults = new ArrayList<>();
        for (WebElement item : allResults) {
            if (item.isDisplayed()) {
                displayedResults.add(item);
            }
        }
        for (WebElement item : displayedResults) {
            if (item.getText().toLowerCase().contains("tutorial")) {
                counter++;
            }
        }
        Assert.assertEquals("Some links don't contain the 'Tutorial' word", displayedResults.size(), counter);
    }


    @After
    public void afterTests() {
        driver.quit();

    }
}
