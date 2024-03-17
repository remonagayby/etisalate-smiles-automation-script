package tests;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void homePage() {
        loginPage.clickSkipToLogin()
                .clickOnPhoneNumberField()
                .enterPhoneNumber(phoneNumber)
                .clickSendCode()
                .clickAllowButton()
                .enterOTP(OTP)
                .clickAllowSmilesButton()
                .clickCancelLocationDetection()
                .clickExploreAll();
    }
}
