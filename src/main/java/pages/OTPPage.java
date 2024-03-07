package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OTPPage extends BasePage{
    public OTPPage(AndroidDriver driver) {
        super(driver);
    }

   private final By otp = By.className("android.widget.TextView");

   private final By loginButton = By.id("com.android.permissioncontroller:id/permission_deny_button");

    public OTPPage enterOTP(String otpCode) {
        driver.findElement(otp).sendKeys(otpCode);
        return this;
    }

    public HomePage clickLogin() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }



}
