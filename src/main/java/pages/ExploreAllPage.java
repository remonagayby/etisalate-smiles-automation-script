package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExploreAllPage extends BasePage{
    public ExploreAllPage(AndroidDriver driver) {
        super(driver);
    }

    private final By devicesIcon = By.xpath("");

    public ExploreAllPage clickDevices() {
        WebElement element = driver.findElement(MobileBy.AndroidUIAutomator("new UISelector().textContains(\"Devices\")"));
        element.click();
    }
}
