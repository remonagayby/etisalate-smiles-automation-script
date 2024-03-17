package tests;

import org.testng.annotations.Test;

public class DevicesPageTest extends BaseTest{

    @Test
    public void selectDevice() {
        loginPage.clickSkipToLogin()
                .clickOnPhoneNumberField()
                .enterPhoneNumber(phoneNumber)
                .clickSendCode()
                .clickAllowButton()
                .enterOTP(OTP)
                .clickAllowSmilesButton()
                .clickCancelLocationDetection()
                .clickExploreAll()
                .clickOnCategory("Devices");
    }
}
