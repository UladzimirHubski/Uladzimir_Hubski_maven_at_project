package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pageobjects.booking_pages.BookingAccount_Create;
import pageobjects.mailru_pages.MailRu_Login;
import pageobjects.mailru_pages.MailRu_Mail;
import pageobjects.trashmail_pages.Email_Create;
import work.classwork.day19.L4JLogging;

public class BookingConfirmEmailSteps {
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    private final Email_Create createEmail = new Email_Create();
    private final MailRu_Login loginM = new MailRu_Login();
    private final MailRu_Mail mailM = new MailRu_Mail();
    private final BookingAccount_Create accCreate = new BookingAccount_Create();

    @Given("I register new email")
    public void registerNewEmail() {
        LOGGER.info(String.format("Test %s Started", getClass()));
        createEmail.OpenLogin();
        createEmail.Input_Name();
        createEmail.Input_PersonalEmail();
        createEmail.Select_Forwards();
        createEmail.Select_Life_Span();
        createEmail.Submit();
        LOGGER.debug("Test \"I register new email\" passed");
    }

    @Then("I register new user on Booking")
    public void registerUser() {
        accCreate.OpenLoginPage();
        accCreate.EnterLogin();
        accCreate.EnterPassword();
        LOGGER.debug("Test \"I register new user on Booking\" passed");
    }

    @Then("I open email")
    public void openEmail() throws InterruptedException {
        loginM.OpenLogin();
        loginM.InputLogin();
        loginM.InputPassword();
        LOGGER.debug("I open email");
    }

    @Then("I open confirmation message")
    public void openMessage() {
        mailM.FindFolder();
        mailM.OpenFolder();
        mailM.FindFirstLetter();
        mailM.OpenFirstLetter();
        LOGGER.debug("Test \"I open confirmation message\" passed");
    }

    @Then("I check confirmation to pass test")
    public void confirmationMessagePass() throws InterruptedException {
        mailM.SubmitAccountEmail();
        mailM.CheckConfermedEmail();
        LOGGER.debug("Test \"I check confirmation to pass test\" passed");
    }
}
