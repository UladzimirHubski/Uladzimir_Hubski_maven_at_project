package test;

import org.junit.Test;
import pageobjects.trashmail_pages.Email_Create;

public class TrashmailTest {
    private final Email_Create createEmail = new Email_Create();



    @Test
    public void TrashMailTest() throws InterruptedException {
        createEmail.OpenLogin();
        createEmail.Input_Name();
        createEmail.Input_PersonalEmail();
        createEmail.Select_Forwards();
        createEmail.Select_Life_Span();
        createEmail.Submit();
    }
}
