
package Selenide.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage{
    public SelenideElement liMenu = $(By.id("item-3"));
    public SelenideElement btnAdd = $(By.id("addNewRecordButton"));
    public SelenideElement txtFirstName = $(By.id("firstName"));
    public SelenideElement txtLastName = $(By.id("lastName"));

    public SelenideElement txtEmail = $(By.id("userEmail"));

    public SelenideElement txtAge = $(By.id("age"));

    public SelenideElement txtSalary = $(By.id("salary"));

    public SelenideElement txtDepartment = $(By.id("department"));

    public SelenideElement btnSubmit = $(By.id("submit"));

    public SelenideElement btnEdit = $(By.id("edit-record-4"));

    public SelenideElement EditTxtFirstName = $(By.id("firstName"));

    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }

    public void AddRecord(String FirstName, String LastName, String Email, String   Age, String  Salary, String Department) {
        btnAdd.click();
        txtFirstName.setValue(FirstName);
        txtLastName.setValue(LastName);
        txtEmail.setValue(Email);
        txtAge.setValue(Age);
        txtSalary.setValue(Salary);
        txtDepartment.setValue(Department);
        btnSubmit.click();
    }

    public void EditRecord(String FirstName ) {
        btnEdit.click();
        txtFirstName.setValue(FirstName);
        btnSubmit.click();
    }
}
