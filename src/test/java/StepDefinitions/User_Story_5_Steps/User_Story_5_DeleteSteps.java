package StepDefinitions.User_Story_5_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_5_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Positions")
    public void deleteToPositions() {
        dc.findAndSend("NAMEINPUT","Yeliz");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");
    }
}
