package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
    private final By skipToLogin = By.xpath("//*[@text='Skip to login']");
    private final By phoneNumberField = By.className("android.widget.EditText");
    private final By sendCode = By.xpath("//android.widget.TextView[@text='Send Code']");


    public LoginPage clickSkipToLogin() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(skipToLogin));
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(skipToLogin).click();
        return this;
    }

    public LoginPage clickOnPhoneNumberField() {
        driver.findElement(phoneNumberField).click();
        return this;
    }
    public LoginPage enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    }

    public OTPPage clickSendCode() {
        driver.findElement(sendCode).click();
        return new OTPPage(driver);
    }
}
