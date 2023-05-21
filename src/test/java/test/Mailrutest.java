package test;


import org.apache.log4j.Logger;
import org.junit.Test;
import pageobjects.mailru_pages.MailRu_Login;
import pageobjects.mailru_pages.MailRu_Mail;
import settings.BookingInput;
import work.classwork.day19.L4JLogging;

public class Mailrutest {

    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());
    private final MailRu_Login loginM = new MailRu_Login();
    private final MailRu_Mail mailM = new MailRu_Mail();

    @Test
    public void MailRuTest() throws InterruptedException {
        LOGGER.info("Test Started");
        loginM.OpenLogin();
        LOGGER.info("Step OpenLogin passed");
        loginM.InputLogin();
        LOGGER.info("Used InputLogin Login: " + BookingInput.MainEmailLogin);
        loginM.InputPassword();
        LOGGER.info("Step InputPassword passed");
        mailM.OpenFolder();
        LOGGER.info("Step OpenFolder passed");
        mailM.FindFirstLetter();
        LOGGER.info("Step FindFirstLetter passed");
        mailM.OpenFirstLetter();
        LOGGER.info("Step OpenFirstLetter passed");
        mailM.SubmitAccountEmail();
        LOGGER.info("Step SubmitAccountEmail passed");
        LOGGER.info("Test Finished");
    }
}