package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.ofMillis;

public class BasePage {

    public static AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        BasePage.driver = driver;
    }

    //explicit wait
    public static WebDriverWait shortWait(AndroidDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Custom scrolling function
    private static void scroll(AndroidDriver driver) {
        int startX = driver.manage().window().getSize().width / 2;
        int startY = (int) (driver.manage().window().getSize().height * 0.8);
        int endY = (int) (driver.manage().window().getSize().height * 0.2);

        new io.appium.java_client.TouchAction<>(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public void scrollToElement(String targetText) {

        // Set the maximum number of scrolls
        int maxScrolls = 10;
        int scrolls = 0;

        // Loop to scroll until the element is found or maximum scrolls reached
        boolean elementFound = false;
        while (!elementFound && scrolls < maxScrolls) {
            try {
                // Scroll to the element
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                                + "new UiSelector().textContains(\"" + targetText + "\").instance(0))"));

                // If element is found, set elementFound to true to exit the loop
                elementFound = true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // If element is not found, perform custom scrolling
                System.out.println("Element not found, performing custom scroll...");
                scroll(driver);
                scrolls++;
            }
        }
    }
}
