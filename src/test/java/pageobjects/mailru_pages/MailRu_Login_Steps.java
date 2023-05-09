package pageobjects.mailru_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MailRu_Login_Steps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        MailRu_Login loginM = new MailRu_Login();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        loginM.OpenLogin();
        loginM.InputLogin();
        loginM.InputPassword();

    }
}
