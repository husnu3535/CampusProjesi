package StepDefinitions.User_Story_10_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_10_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    Parent parent=new Parent();
    @Given("Clicking on the Setup, Parameters, Grade Levels options from the menu categories")
    public void clickingOnTheSetupParametersGradeLevelsOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("gradeLevels");

    }

    @When("Add to Grade Levels")
    public void addToGradeLevels() {
        parent.waitEditButtonVerify();
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Bruce");
        fm.findAndSend("shortname2","Wayne");
        fm.findAndSend("order","7");
        fm.findAndClick("nextGrade");
        fm.findAndClick("gulluselect");
        dc.findAndClick("saveButton");

    }
}
