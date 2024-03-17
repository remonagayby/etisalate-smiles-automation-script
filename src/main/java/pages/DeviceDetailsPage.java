package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class DeviceDetailsPage extends BasePage{
    public DeviceDetailsPage(AndroidDriver driver) {
        super(driver);
    }

    private final By color = By.xpath("(//*[@resource-id='ae.etisalat.smiles:id/circle_color'])[2]");
    private final By buyNowButton = By.id("ae.etisalat.smiles:id/tv_buy_now");

    public DeviceDetailsPage changeColor() {
        driver.findElement(color).click();
        return this;
    }

    public void clickBuyNow() {
        driver.findElement(buyNowButton).click();
    }
}
