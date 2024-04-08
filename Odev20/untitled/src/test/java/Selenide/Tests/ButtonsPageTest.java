package Selenide.Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ButtonsPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.buttonsPage.open();
        pageManager.buttonsPage.liMenu.click();
    }

    @Description("Bu test senaryosunda Click Me'ye tıklandıktan sonra gelen mesaj kontrol edilir.")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void btnClikMe(){
        step("Click Me'ye tıklanır");
        pageManager.buttonsPage.btnClickMe.click();

        step("Mesaj kontrol edilir");
        assertEquals(pageManager.buttonsPage.pMessage.text(), "You have done a dynamic click");
    }
}
