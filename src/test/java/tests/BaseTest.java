package tests;

import base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import util.Utilities;

import java.io.IOException;

public class BaseTest extends BaseClass {
    LoginPage loginPage;
    String phoneNumber = Utilities.getData(1, 0, "Sheet1");
    String OTP = Utilities.getData(1, 1, "Sheet1");


    @BeforeMethod
    public void setUp() throws IOException {
        initiateProperties();
        initiateDriver(properties);
        loginPage = new LoginPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}