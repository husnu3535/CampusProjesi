package StepDefinitions.User_Story_1_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_1_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to position category")
    public void editToPositionCategory() {

        dc.findAndSend("NAMEINPUT","Malais");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","İsmailYüksek");
        dc.findAndClick("saveButton");

    }
}
