package StepDefinitions.User_Story_10_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_10_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @When("Delete to Grade Levels")
    public void deleteToGradeLevels() {
        parent.waitEditButtonVerify();
        dc.findAndClick("DELETEBUTTONROW9");
        dc.findAndClick("DELETEBUTTON2");

    }
}
