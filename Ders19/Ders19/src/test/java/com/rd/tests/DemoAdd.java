package com.rd.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoAdd {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");


        driver.findElement(By.cssSelector("#addNewRecordButton")).click();

        WebElement firstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        firstNameInput.sendKeys("Veysel");

        WebElement lastNameInput = driver.findElement(By.cssSelector("input#lastName"));
        lastNameInput.sendKeys("Can");

        WebElement emailInput = driver.findElement(By.cssSelector("input#userEmail"));
        emailInput.sendKeys("veyselcancergel@gmail.com");

        WebElement ageInput = driver.findElement(By.cssSelector("input#age"));
        ageInput.sendKeys("35");

        WebElement salaryInput = driver.findElement(By.cssSelector("input#salary"));
        salaryInput.sendKeys("5000");

        WebElement departmentInput = driver.findElement(By.cssSelector("input#department"));
        departmentInput.sendKeys("Quality");

        driver.findElement(By.cssSelector("#submit")).click();

        driver.findElement(By.cssSelector("#edit-record-4")).click();

        WebElement EditfirstNameInput = driver.findElement(By.cssSelector("input#firstName"));

        EditfirstNameInput.sendKeys("Veysel2");

        driver.findElement(By.cssSelector("#submit")).click();
        //driver.quit();
    }
}
