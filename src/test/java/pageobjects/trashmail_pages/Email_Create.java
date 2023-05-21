package pageobjects.trashmail_pages;

import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import settings.BookingInput;
import work.classwork.day19.L4JLogging;

public class Email_Create {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    WebDriver driver = Driver.getWebDriver();
    Actions make = new Actions(driver);
    private final static String PAGE = BookingInput.FakeEmail;
    private final static String NAMEFIELD = "//input[@id='fe-name']";
    private final static String PSWDFIELD = "//input[@id='fe-forward']";
    private final static String FORWARDS_DROPDOWN = "//div[@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']";
    private final static String NUMBER_DROPDOWN = "//li[@role='presentation'][2]";
    private final static String LIFE_SPAN_DROPDOWN = "//div[1][@class='input-group input-group-sm input-group-btn']//div[@class='input-group-btn']";
    private final static String SUBMIT_BTN = "//button[@id=\"fe-submit\"]";

    public void OpenLogin() {
        driver.get(PAGE);
        LOGGER.trace("Open Page: " + PAGE);
    }

    public void Input_Name() {
        driver.findElement(By.xpath(NAMEFIELD)).clear();
        LOGGER.trace("Clear field: " + NAMEFIELD);
        make.doubleClick(driver.findElement(By.xpath(NAMEFIELD))).sendKeys(BookingInput.TrashEmail).perform();
        LOGGER.trace("Double click on field: " + NAMEFIELD + " and send: " + BookingInput.TrashEmail);
    }

    public void Input_PersonalEmail() {
        driver.findElement(By.xpath(PSWDFIELD)).sendKeys(BookingInput.PersonalEmail);
        LOGGER.trace("Input personal Email in field" + PSWDFIELD);
    }

    public void Select_Forwards() {
        driver.findElement(By.xpath(FORWARDS_DROPDOWN)).click();
        LOGGER.trace("Find Forward dropdown" + FORWARDS_DROPDOWN);
        driver.findElement(By.xpath(String.format(FORWARDS_DROPDOWN + "%s", NUMBER_DROPDOWN))).click();
        LOGGER.trace("Open Forward dropdown and select item: " + NUMBER_DROPDOWN);
    }

    public void Select_Life_Span() {
        driver.findElement(By.xpath(LIFE_SPAN_DROPDOWN)).click();
        LOGGER.trace("Find Life Span dropdown" + LIFE_SPAN_DROPDOWN);
        driver.findElement(By.xpath(String.format(LIFE_SPAN_DROPDOWN + "%s", NUMBER_DROPDOWN))).click();
        LOGGER.trace(String.format("Open Life Span dropdown and select item: %s", NUMBER_DROPDOWN));
    }

    public void Submit() {
        driver.findElement(By.xpath(SUBMIT_BTN)).click();
        LOGGER.trace("Click on submit button" + SUBMIT_BTN);
    }
}
