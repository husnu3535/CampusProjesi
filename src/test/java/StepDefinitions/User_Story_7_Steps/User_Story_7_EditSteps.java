package StepDefinitions.User_Story_7_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_7_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    @When("Edit to School Locations")
    public void editToSchoolLocations() {
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Mehmedov");
        fm.findAndSend("shortname2","Bayramoviç");
        fm.findAndSend("capacity","40");
        dc.findAndClick("saveButton");

    }
}
