package pages;

import api.APIRequest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DevicesPage extends BasePage{
    public DevicesPage(AndroidDriver driver) {
        super(driver);
    }

    private final By mobileDevices = By.className("android.widget.FrameLayout");

    public APIRequest selectDevice(String targetText) {

        List<WebElement> mobileDevicesOptions = driver.findElements(mobileDevices);
        for (WebElement deviceOption: mobileDevicesOptions) {
            if (deviceOption.getText().contains("phone")) {
                System.out.println(deviceOption.getText());
                deviceOption.click();
                break;
            }
        }
        return new APIRequest();
    }
}
