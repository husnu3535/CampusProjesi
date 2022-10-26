package StepDefinitions.User_Story_2_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_2_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Attestation")
    public void deleteToAttestation() {
        dc.findAndSend("NAMEINPUT","Elmas");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
