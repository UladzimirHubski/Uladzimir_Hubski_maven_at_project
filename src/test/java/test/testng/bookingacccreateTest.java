package test.testng;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageobjects.booking_pages.BookingAccount_Create;
import pageobjects.mailru_pages.MailRu_Login;
import pageobjects.mailru_pages.MailRu_Mail;
import pageobjects.trashmail_pages.Email_Create;

public class bookingacccreateTest {
    private final Email_Create createEmail = new Email_Create();
    private final MailRu_Login loginM = new MailRu_Login();
    private final MailRu_Mail mailM = new MailRu_Mail();
    private final BookingAccount_Create accCreate = new BookingAccount_Create();

//    @Before
//    public void CreateEmailTest() throws InterruptedException {
//
//        createEmail.OpenLogin();
//        createEmail.Input_Name();
//        createEmail.Input_PersonalEmail();
//        createEmail.Select_Forwards();
//        createEmail.Select_Life_Span();
//        createEmail.Submit();
//        accCreate.OpenLoginPage();
//        accCreate.EnterLogin();
//        accCreate.EnterPassword();

    // }

    @Test
    public void ConfirmEmailTest2() throws InterruptedException {
        loginM.OpenLogin();
        loginM.InputLogin();
        loginM.InputPassword();
        mailM.FindFolder();
        mailM.OpenFolder();
        mailM.FindFirstLetter();
        mailM.OpenFirstLetter();
        mailM.SubmitAccountEmail();
        mailM.CheckConfermedEmail();
    }
}