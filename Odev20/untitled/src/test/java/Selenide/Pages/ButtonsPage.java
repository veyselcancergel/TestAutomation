package Selenide.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage extends BasePage{
    public SelenideElement liMenu = $(By.id("item-4"));
    public SelenideElement btnClickMe = $(By.xpath("//button[text()=\"Click Me\"]")); //click me textini alma
    public SelenideElement pMessage = $(By.id("dynamicClickMessage"));

    public ButtonsPage(String pageUrl) {
        super(pageUrl);
    }
}
