package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.booking_pages.BookingAccount_Create;
import pageobjects.mailru_pages.MailRu_Login;
import pageobjects.mailru_pages.MailRu_Mail;
import pageobjects.trashmail_pages.Email_Create;

public class BookingConfirmEmailSteps {
    private final Email_Create createEmail = new Email_Create();
    private final MailRu_Login loginM = new MailRu_Login();
    private final MailRu_Mail mailM = new MailRu_Mail();
    private final BookingAccount_Create accCreate = new BookingAccount_Create();

    @Given("I register new email")
    public void registerNewEmail() {
        createEmail.OpenLogin();
        createEmail.Input_Name();
        createEmail.Input_PersonalEmail();
        createEmail.Select_Forwards();
        createEmail.Select_Life_Span();
        createEmail.Submit();
    }

    @Then("I register new user on Booking")
    public void registerUser() {
        accCreate.OpenLoginPage();
        accCreate.EnterLogin();
        accCreate.EnterPassword();
    }

    @Then("I open email")
    public void openEmail() throws InterruptedException {
        loginM.OpenLogin();
        loginM.InputLogin();
        loginM.InputPassword();
    }

    @Then("I open confirmation message")
    public void openMessage() {
        mailM.FindFolder();
        mailM.OpenFolder();
        mailM.FindFirstLetter();
        mailM.OpenFirstLetter();
    }

    @Then("I check confirmation to pass test")
    public void confirmationMessagePass() throws InterruptedException {
        mailM.SubmitAccountEmail();
        mailM.CheckConfermedEmail();
    }
}
