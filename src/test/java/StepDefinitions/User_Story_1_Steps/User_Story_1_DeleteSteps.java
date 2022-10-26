package StepDefinitions.User_Story_1_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_1_DeleteSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Delete to position category")
    public void deleteToPositionCategory() {
        dc.findAndSend("NAMEINPUT","Emir");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
