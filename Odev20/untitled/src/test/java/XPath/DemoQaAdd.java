package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaAdd {

    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");


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

        EditfirstNameInput.sendKeys("Veysel2");

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    //driver.quit();
}
}
