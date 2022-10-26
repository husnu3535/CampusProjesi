package StepDefinitions.User_Story_4_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

import java.awt.*;

public class User_Story_4_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Fields")
    public void editToFields() {
        dc.findAndSend("NAMEINPUT","Meliha");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Makbule");
        fm.findAndSend("code","556757");
        dc.findAndClick("saveButton");
    }
}
