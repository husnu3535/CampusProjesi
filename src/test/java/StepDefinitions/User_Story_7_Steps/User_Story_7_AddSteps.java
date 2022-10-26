package StepDefinitions.User_Story_7_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_7_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, School Setup, School Locations options from the menu categories")
    public void clickingOnTheSetupSchoolSetupSchoolLocationsOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("SchoolSetup");
        ln.findAndClick("schoolLocations");

    }

    @When("Add to School Locations")
    public void addToSchoolLocations() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","ayse");
        fm.findAndSend("shortname2","gurbuz");
        fm.findAndClick("locationType");
        fm.findAndClick("other");
        fm.findAndSend("capacity","5");
        dc.findAndClick("saveButton");

    }
}
