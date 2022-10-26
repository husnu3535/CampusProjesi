package StepDefinitions.User_Story_7_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_7_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @When("Delete to School Locations")
    public void deleteToSchoolLocations() {
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
