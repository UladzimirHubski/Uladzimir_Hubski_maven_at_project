package test;

import org.junit.Test;
import pageobjects.booking_pages.BookingAccount_Create;

public class BokingRegistration_Test {
    private final BookingAccount_Create accCreate = new BookingAccount_Create();


    @Test
    public void BookingAccCreation_Test() throws InterruptedException {

        accCreate.OpenLoginPage();
        accCreate.EnterLogin();
        accCreate.EnterPassword();
    }
}
