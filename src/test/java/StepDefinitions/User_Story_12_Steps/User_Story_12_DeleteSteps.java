package StepDefinitions.User_Story_12_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_12_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @When("Delete to Nationalities")
    public void deleteToNationalities() {
        dc.verifyText("nameVerify","Name");
        dc.findAndSend("NAMEINPUT","GUATEMALA");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");


    }
}
