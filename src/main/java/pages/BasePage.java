package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
    }

    //explicit wait
    public static WebDriverWait shortWait(AndroidDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
