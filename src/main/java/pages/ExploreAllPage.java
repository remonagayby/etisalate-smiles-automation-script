package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ExploreAllPage extends BasePage{

    private final By devices = By.xpath("//android.widget.TextView[@text='Telecom']/following-sibling::*[1]");

    public ExploreAllPage(AndroidDriver driver) {
        super(driver);
    }

    public DevicesPage clickOnCategory(String categoryName) {
        scrollToElement(categoryName);
        driver.findElement(devices).click();
        return new DevicesPage(driver);
    }
}