package Selenide.Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ButtonsPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.buttonsPage.open();
        pageManager.buttonsPage.liMenu.click();
    }

    @Test
    public void addProductToCart(){
        pageManager.buttonsPage.btnClickMe.click();;
        assertEquals(pageManager.buttonsPage.pMessage.text(), "You have done a dynamic click");
    }
}
