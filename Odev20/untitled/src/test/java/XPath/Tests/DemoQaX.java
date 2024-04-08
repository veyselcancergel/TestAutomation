package XPath.Tests;

import com.CssSelector.Driver.Driver;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

import static io.qameta.allure.Allure.step;

public class DemoQaX {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    String url ="https://demoqa.com/elements";

    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }
    @Description("Buttons sekmesine tıklanır.ClickMe sekmesine tıklanır.Çıkan metin expected metin ile karşılaştırılır.")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ClickOperation() {
        step("Buttons sekmesine tıklanır.");
        driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();

        step("ClickMe butonuna tıklanır.");
        driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).click();

        step("Çıkan metin alınır. Expected metin ile karşılatırılır.");
        WebElement messageElement = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]"));
        String message = messageElement.getText();

        String expected = "You have done a dynamic click";

        Assert.assertEquals(expected,message);

        step("mesaj yazdırılır.");
        System.out.println("Görünen Mesaj: " + message);


        driver.quit();
    }
}
