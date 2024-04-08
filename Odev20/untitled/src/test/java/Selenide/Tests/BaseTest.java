package Selenide.Tests;

import com.codeborne.selenide.Selenide;
import Selenide.Driver.DriverFactory;
import Selenide.common.PageManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected PageManager pageManager;
    protected SoftAssert softAssert;
    @BeforeClass
    public void setUp() {
        pageManager = new PageManager();
        softAssert = new SoftAssert();
    }
    @BeforeMethod
    public void openDriver() {
        Selenide.open();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.close();
    }
}
