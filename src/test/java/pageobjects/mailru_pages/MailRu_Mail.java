package pageobjects.mailru_pages;

import driver.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import work.Classwork.day19.L4JLogging;

public class MailRu_Mail {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    WebDriver driver = Driver.getWebDriver();

    private final static String FOLDER = "//a[@data-folder-link-id='2']";
    private final static String FIRST_EMAIL = "//*[@class='llc llc_normal llc_first llc_new llc_new-selection js-letter-list-item js-tooltip-direction_letter-bottom'][1]";

    private final static String SUBMIT_BUTTON = "//div[@class='letter__body']//a[@class='button_mr_css_attr']";

    private final static String CONFIRMEDMESSAGE = "//h1";

    public void FindFolder() {
        driver.findElement(By.xpath(FOLDER));
        LOGGER.trace("Find folder: " + FOLDER);
    }

    public void OpenFolder() {
        driver.findElement(By.xpath(FOLDER)).click();
        LOGGER.trace("Open folder: " + FOLDER);
    }

    public void FindFirstLetter() {
        driver.findElement(By.xpath(FIRST_EMAIL));
        LOGGER.trace("Find email: " + FIRST_EMAIL);
    }

    public void OpenFirstLetter() {
        driver.findElement(By.xpath(FIRST_EMAIL)).click();
        LOGGER.trace("Open email: " + FIRST_EMAIL);
    }

    public void SubmitAccountEmail() {
        driver.findElement(By.xpath(SUBMIT_BUTTON)).click();
        LOGGER.trace("Submit booking email button: " + SUBMIT_BUTTON);
    }

    public void CheckConfermedEmail() throws InterruptedException {
        //driver.switchTo().window();
        Assert.assertEquals("Email Confirmed", driver.findElement(By.xpath(CONFIRMEDMESSAGE)).getText());
        LOGGER.trace("Check verification Email" + CONFIRMEDMESSAGE);
    }
}
