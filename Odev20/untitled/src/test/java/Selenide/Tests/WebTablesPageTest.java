package Selenide.Tests;

import Selenide.Pages.WebTablesPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class WebTablesPageTest extends BaseTest{
    @BeforeMethod
    public void before(){
        pageManager.webTablesPage.open();
        pageManager.webTablesPage.liMenu.click();
    }

    @Description("add butonuna tıklanır. Gerekli bilgiler girildikten sonra summit tıklanıp kayıt oluşturulur. Daha sonra edit tıklanır ve first name bilgisi değişirilip doğruluğu kontrol edilir." )
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void ControlRecord(){
        step("addRecord metoduna ilgili veriler gönderilir.");
        pageManager.webTablesPage.AddRecord("Vey","Can","veyselcancergel@gmail.com","35","35000","Quality");
        step("EditRecord metoduna ilgili bilgiler gönderilir.");
        pageManager.webTablesPage.EditRecord("Veysel");
        step("edit butonuna tıklanır");
        pageManager.webTablesPage.btnEdit.click();
        step("firstname elementindeki değer ile actual değer doğruluğu kontrol edilir.");
        assertEquals(pageManager.webTablesPage.txtFirstName.getValue(), "Veysel");
    }
}
