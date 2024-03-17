package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OTPPage extends BasePage{
    public OTPPage(AndroidDriver driver) {
        super(driver);
    }

    private final By allowButton = By.xpath("//android.widget.Button[@text='Allow']");
   private final By otp = By.xpath("//android.widget.EditText");

   public OTPPage clickAllowButton() {
       driver.findElement(allowButton).click();
       return this;
   }

    public OTPPage enterOTP(String otpCode) {
       try {
           shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(otp));
       } catch (Exception e) {
           e.printStackTrace();
       }
        driver.findElement(otp).sendKeys(otpCode);
        return this;
    }

    public HomePage clickAllowSmilesButton() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(allowButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(allowButton).click();
        return new HomePage(driver);
    }



}
