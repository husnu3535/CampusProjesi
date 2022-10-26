package StepDefinitions.User_Story_8_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_8_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    @When("Edit to Departments")
    public void editToDepartments() {
        parent.waitEditButtonVerify();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Gabriel");
        fm.findAndSend("codeInput","55004");
        dc.findAndClick("saveButton");

    }
}
