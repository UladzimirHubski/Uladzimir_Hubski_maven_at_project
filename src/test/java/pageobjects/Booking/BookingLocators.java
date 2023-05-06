package pageobjects.Booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingLocators {
    public WebDriver driver;

    public BookingLocators(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@aria-label='Скрыть меню входа в аккаунт.']")
    private WebElement HideLogin;

    @FindBy(xpath = "//*[@data-date='2023-05-29']")
    private WebElement DataBefore;


    @FindBy(xpath = "//*[@data-date='2023-05-30']")
    private WebElement DataAfter;

    @FindBy(xpath = "//*[@data-date='2023-05-30']")
    private WebElement Occypancy;

    @FindBy(css = "[name='ss']")
    private WebElement CityLocatorField;

    @FindBy(xpath = "//*[@data-testid='autocomplete-result']/div/div[text()='Берлин']")
    private WebElement CityLocatorSelect;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement ConfirmButton;


    public void OccypancyMenu() {
        Occypancy.click();
    }

    public void HideLoginClick() {
        if (HideLogin.isDisplayed()) {
            HideLogin.click();
        }
    }

    public void DataBeforeClick() {
        DataBefore.click();
    }

    public void DataAfterClick() {
        DataAfter.click();
    }


    public void CitySelect() {
        CityLocatorField.sendKeys("Берлин");
        CityLocatorSelect.click();
    }

    public void ConfirmBooking() {
        ConfirmButton.click();
    }

}
