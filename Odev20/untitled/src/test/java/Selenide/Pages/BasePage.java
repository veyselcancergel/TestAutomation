package Selenide.Pages;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Selenide;

public class BasePage {

    protected String pageUrl;

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = "https://demoqa.com/elements";
        Selenide.open(url);
    }

    public String getUrl(){
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
