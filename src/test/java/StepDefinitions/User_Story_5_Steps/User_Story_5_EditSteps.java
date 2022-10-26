package StepDefinitions.User_Story_5_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_5_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Positions")
    public void editToPositions() {
        dc.findAndSend("NAMEINPUT","Gamze");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Yeliz");
        fm.findAndSend("shortname","Uygun");
        dc.findAndClick("saveButton");

    }
}
