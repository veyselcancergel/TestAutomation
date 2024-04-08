package Selenide.Tests;

import Selenide.Pages.WebTablesPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class WebTablesPageTest extends BaseTest{
    @BeforeMethod
    public void before(){
        pageManager.webTablesPage.open();
        pageManager.webTablesPage.liMenu.click();
    }

    @Test
    public void ControlRecord(){
        pageManager.webTablesPage.AddRecord("Vey","Can","veyselcancergel@gmail.com","35","35000","Quality");
        pageManager.webTablesPage.EditRecord("Veysel");

        pageManager.webTablesPage.btnEdit.click();

        assertEquals(pageManager.webTablesPage.txtFirstName.getValue(), "Veysel");
    }
}
