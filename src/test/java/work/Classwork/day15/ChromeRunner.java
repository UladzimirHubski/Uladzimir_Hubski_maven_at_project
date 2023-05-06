package work.Classwork.day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRunner {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
                System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
        driver.get("https://www.google.com");
                System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
        driver.navigate().to("https://www.ya.ru");
                System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
        driver.navigate().back();
                System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
        driver.navigate().refresh();

        driver.quit();
    }
}
