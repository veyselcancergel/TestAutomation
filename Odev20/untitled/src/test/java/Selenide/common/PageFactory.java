package Selenide.common;

import Selenide.Pages.ButtonsPage;
import Selenide.Pages.WebTablesPage;

public class PageFactory {
    public static WebTablesPage buildWebTablesPage() {
        return new WebTablesPage("https://demoqa.com/webtables");
    }

    public static ButtonsPage buildButtonsPage() {
        return new ButtonsPage("https://demoqa.com/elements");
    }
}
