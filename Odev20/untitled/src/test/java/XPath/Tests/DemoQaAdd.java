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

public class DemoQaAdd {
    public static WebDriver driver;
    Driver webDriver = new Driver();
    String url ="https://demoqa.com/webtables";

    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }
    @Test

    public void AddOperation() {


        driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Veysel");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Can");
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("veyselcancergel@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("35");
        driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("5000");
        driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("Quality");

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]")).click();

        WebElement EditfirstNameInput = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));

        EditfirstNameInput.sendKeys("Veysel");

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        WebElement messageElement = driver.findElement(By.xpath("//div[text()=\"VeyselVeysel\"]"));
        String message = messageElement.getText();

        String expect = "VeyselVeysel";
        Assert.assertEquals(expect,message);
    //driver.quit();
}
}
