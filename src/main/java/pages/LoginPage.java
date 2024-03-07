package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    private final By phoneNumberField = By.xpath("//android.widget.EditText");
    private final By sendCode = By.className("android.widget.Button");


    public LoginPage enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    }

    public OTPPage clickLogin() {
        driver.findElement(sendCode).click();
        return new OTPPage(driver);
    }


}
