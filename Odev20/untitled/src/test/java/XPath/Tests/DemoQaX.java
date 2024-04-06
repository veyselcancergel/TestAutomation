package XPath.Tests;

import com.CssSelector.Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;

public class DemoQaX {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    String url ="https://demoqa.com/elements";

    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }
    @Test
    public void ClickOperation() {

        driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();

        driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).click();

        WebElement messageElement = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]"));
        String message = messageElement.getText();

        String expected = "You have done a dynamic click";

        Assert.assertEquals(expected,message);

        System.out.println("Görünen Mesaj: " + message);


        driver.quit();
    }
}
