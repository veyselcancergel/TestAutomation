package com.rd.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQa {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");


        driver.findElement(By.cssSelector("#item-4")).click();


        List<WebElement> divElements = driver.findElements(By.cssSelector("div.mt-4"));
        WebElement lastMt4Div = divElements.get(divElements.size() - 2);
        lastMt4Div.findElement(By.cssSelector("button.btn-primary")).click();



        WebElement messageElement = driver.findElement(By.cssSelector("#dynamicClickMessage"));
        String message = messageElement.getText();
        System.out.println("Görünen Mesaj: " + message);


        driver.quit();
    }
}
