package com.CssSelector.Tests;

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

public class DemoQa {

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

        driver.findElement(By.cssSelector("#item-4")).click();


        List<WebElement> divElements = driver.findElements(By.cssSelector("div.mt-4"));
        WebElement lastMt4Div = divElements.get(divElements.size() - 2);
        lastMt4Div.findElement(By.cssSelector("button.btn-primary")).click();



        WebElement messageElement = driver.findElement(By.cssSelector("#dynamicClickMessage"));
        String message = messageElement.getText();

        String expected = "You have done a dynamic click";

        Assert.assertEquals(expected,message);

        System.out.println("Görünen Mesaj: " + message);


        driver.quit();
    }
}
