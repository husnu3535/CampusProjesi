package StepDefinitions.User_Story_8_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @When("Delete to Departments")
    public void deleteToDepartments() {
        parent.waitEditButtonVerify();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
