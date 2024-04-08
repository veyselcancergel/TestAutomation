package Selenide.common;

import Selenide.Driver.DriverFactory;
import Selenide.Pages.ButtonsPage;
import Selenide.Pages.WebTablesPage;


public class PageManager {
    public WebTablesPage webTablesPage;

    public ButtonsPage buttonsPage;

    public  PageManager() {
        DriverFactory.initDriver();

        webTablesPage = PageFactory.buildWebTablesPage( );
        buttonsPage = PageFactory.buildButtonsPage();
    }
}
