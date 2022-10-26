package StepDefinitions.User_Story_2_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_2_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Attestation")
    public void editToAttestation() {
        dc.findAndSend("NAMEINPUT","Esra");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Elmas");
        dc.findAndClick("saveButton");

    }
}
