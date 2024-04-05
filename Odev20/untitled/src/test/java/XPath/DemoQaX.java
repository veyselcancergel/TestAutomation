package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoQaX {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");


        driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();


        List<WebElement> divElements = driver.findElements(By.xpath("//div[@class='mt-4']"));
        WebElement lastMt4Div = divElements.get(divElements.size() - 1);

        WebElement btn = lastMt4Div.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
        btn.click();
        //lastMt4Div.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();

        WebElement messageElement = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]"));
        String message = messageElement.getText();
        System.out.println("Görünen Mesaj: " + message);


        driver.quit();
    }
}
