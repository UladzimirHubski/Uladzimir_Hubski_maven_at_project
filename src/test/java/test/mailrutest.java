package test;


import org.junit.Test;
import pageobjects.mailru_pages.MailRu_Login;
import pageobjects.mailru_pages.MailRu_Mail;

public class mailrutest {
    private final MailRu_Login loginM = new MailRu_Login();
    private final MailRu_Mail mailM = new MailRu_Mail();

    @Test
    public void MailRuTest() throws InterruptedException {
        loginM.OpenLogin();
        loginM.InputLogin();
        loginM.InputPassword();
        mailM.OpenFolder();
        mailM.FindFirstLetter();
        mailM.OpenFirstLetter();
        mailM.SubmitAccountEmail();
    }
}