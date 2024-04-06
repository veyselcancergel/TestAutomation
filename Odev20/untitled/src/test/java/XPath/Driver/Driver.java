package XPath.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.time.Duration;

public class Driver {
    public static WebDriver webDriver;

    public WebDriver initializeDriver() throws MalformedURLException {
        webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        webDriver.manage().window().maximize();

        return webDriver;
    }


    public void quitDriver() {

        webDriver.quit();
    }
}
