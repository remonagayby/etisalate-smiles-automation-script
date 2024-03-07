package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    private final By exploreAllButton = By.id("ae.etisalat.smiles:id/navigation_bar_item_icon_view");

    public ExploreAllPage clickExploreAll() {
        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(exploreAllButton));
        driver.findElement(exploreAllButton).click();

        return new ExploreAllPage(driver);
    }
}
