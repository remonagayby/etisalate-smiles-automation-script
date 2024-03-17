package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    private final By cancelLocationDetection = By.id("ae.etisalat.smiles:id/category/9");
    private final By exploreAllButton = By.xpath("//android.widget.FrameLayout[@content-desc='Explore all']");

    public HomePage clickCancelLocationDetection() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(cancelLocationDetection));
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(cancelLocationDetection).click();
        return this;
    }
    public ExploreAllPage clickExploreAll() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(exploreAllButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(exploreAllButton).click();
        return new ExploreAllPage(driver);
    }
}
