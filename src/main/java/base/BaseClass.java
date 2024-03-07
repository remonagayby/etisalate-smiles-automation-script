package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static AndroidDriver driver;
    protected static Properties properties;
    protected static FileInputStream file;

    public void initiateDriver(Properties properties) throws MalformedURLException {
        String ServerURL = properties.getProperty("url");
        String projectPath = System.getProperty("user.dir");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
        capabilities.setCapability(MobileCapabilityType.APP, projectPath + "/apps/Smiles.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");

        driver = new AndroidDriver(new URL(ServerURL), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void initiateProperties() throws IOException {
        properties = new Properties();
        file = new FileInputStream("/Users/remonagayby/Projects/EtistalatTask/src/test/resources/config/config.properties");
        properties.load(file);
    }
}
