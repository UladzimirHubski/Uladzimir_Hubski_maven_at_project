package pageobjects.mailru_pages;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailRu_Mail {
    WebDriver driver = Driver.getWebDriver();

    //private final static String Folder = String.format("//a[@data-folder-link-id='%s']", 2);
    private final static String FOLDER = "//a[@data-folder-link-id='2']";
    private final static String FIRST_EMAIL = "//*[@class='llc llc_normal llc_first llc_new llc_new-selection js-letter-list-item js-tooltip-direction_letter-bottom'][1]";

    private final static String SUBMIT_BUTTON = "//div[@class='letter__body']//a[@class='button_mr_css_attr']";

    private final static String CONFIRMEDMESSAGE = "//h1";

    public void FindFolder() {
        driver.findElement(By.xpath(FOLDER));
    }

    public void OpenFolder() {
        driver.findElement(By.xpath(FOLDER)).click();
    }

    public void FindFirstLetter() {
        driver.findElement(By.xpath(FIRST_EMAIL));
    }

    public void OpenFirstLetter() {
        driver.findElement(By.xpath(FIRST_EMAIL)).click();
    }

    public void SubmitAccountEmail() {
        driver.findElement(By.xpath(SUBMIT_BUTTON)).click();
    }

    public void CheckConfermedEmail() throws InterruptedException {
        Assert.assertEquals("Email Confirmed", driver.findElement(By.xpath(CONFIRMEDMESSAGE)).getText());
    }
}
