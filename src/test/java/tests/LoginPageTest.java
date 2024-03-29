package tests;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void login() {
        loginPage.clickSkipToLogin()
                .clickOnPhoneNumberField()
                .enterPhoneNumber(phoneNumber)
                .clickSendCode()
                .clickAllowButton()
                .enterOTP(OTP)
                .clickAllowSmilesButton();
    }
}
