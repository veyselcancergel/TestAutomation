package com.CssSelector.Tests;

import com.CssSelector.Driver.Driver;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static io.qameta.allure.Allure.step;

public class DemoAdd {

    public static WebDriver driver;
    Driver webDriver = new Driver();
    String url ="https://demoqa.com/webtables";

    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }
    @Description("add butonuna tıklanır. Gerekli bilgiler girildikten sonra summit tıklanıp kayıt oluşturulur. Daha sonra edit tıklanır ve first name bilgisi değişirilip doğruluğu kontrol edilir." )
    @Severity(SeverityLevel.NORMAL)
        @Test
    public void AddOperation (){
        step("Add butonuna tıklanır.");
        driver.findElement(By.cssSelector("#addNewRecordButton")).click();
        step("First Name alanına ilgili bilgi yazılır.");
        WebElement firstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        firstNameInput.sendKeys("Vey");
        step("Last name alanına ilgili bilgi yazılır.");
        WebElement lastNameInput = driver.findElement(By.cssSelector("input#lastName"));
        lastNameInput.sendKeys("Can");
        step("Email ilgili bilgi yazılır.");
        WebElement emailInput = driver.findElement(By.cssSelector("input#userEmail"));
        emailInput.sendKeys("veyselcancergel@gmail.com");
        step("age ilgili bilgi yazılır.");
        WebElement ageInput = driver.findElement(By.cssSelector("input#age"));
        ageInput.sendKeys("35");
        step("Salary ilgili bilgi yazılır.");
        WebElement salaryInput = driver.findElement(By.cssSelector("input#salary"));
        salaryInput.sendKeys("5000");
        step("Department ilgili bilgi yazılır.");
        WebElement departmentInput = driver.findElement(By.cssSelector("input#department"));
        departmentInput.sendKeys("Quality");
        step("submit butonuna tıklanır.");
        driver.findElement(By.cssSelector("#submit")).click();
        step("Edite tıklanır.");
        driver.findElement(By.cssSelector("#edit-record-4")).click();
        step("firstname alanı seçilir.");
        WebElement EditfirstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        step("first name alanında çift tıklama yapılır.");
        Actions actions = new Actions(driver);
        actions.doubleClick(EditfirstNameInput).perform();
        step("First name alanına ilgili bilgi yazılır.");
        EditfirstNameInput.sendKeys("Veysel");
        step("submit butonuna tıklanır.");
        driver.findElement(By.cssSelector("#submit")).click();
        step("edite tıklanır.");
        driver.findElement(By.cssSelector("#edit-record-4")).click();

        step("first name alanı seçilir.");
        WebElement CheckfirstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        step("first name alanında yazılı bilgi alınıp expected değer ile karşılaştırılır.");
        String value = CheckfirstNameInput.getAttribute("value");

        String expected = "Veysel";

        Assert.assertEquals(expected,value);



        //driver.quit();
    }
}
