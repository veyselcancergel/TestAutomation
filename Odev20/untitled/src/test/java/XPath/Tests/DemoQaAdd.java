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

import static io.qameta.allure.Allure.step;

public class DemoQaAdd {
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

    public void AddOperation() {
        step("Add butonuna tıklanır.");
        driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();

        step("First Name alanına ilgili bilgi yazılır.");
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Veysel");

        step("Last name alanına ilgili bilgi yazılır.");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Can");

        step("Email ilgili bilgi yazılır.");
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("veyselcancergel@gmail.com");

        step("age ilgili bilgi yazılır.");
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("35");

        step("Salary ilgili bilgi yazılır.");
        driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("5000");

        step("Department ilgili bilgi yazılır.");
        driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("Quality");

        step("submit butonuna tıklanır.");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        step("Edite tıklanır.");
        driver.findElement(By.xpath("//*[@id=\"edit-record-4\"]")).click();

        step("firstname alanı seçilir.");
        WebElement EditfirstNameInput = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));

        step("First name alanına ilgili bilgi yazılır.");
        EditfirstNameInput.sendKeys("Veysel");

        step("submit butonuna tıklanır.");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        step("first name alanı seçilir.");
        WebElement messageElement = driver.findElement(By.xpath("//div[text()=\"VeyselVeysel\"]"));
        String message = messageElement.getText();

        step("first name alanında yazılı bilgi alınıp expected değer ile karşılaştırılır.");
        String expect = "VeyselVeysel";
        Assert.assertEquals(expect,message);
    //driver.quit();
}
}
