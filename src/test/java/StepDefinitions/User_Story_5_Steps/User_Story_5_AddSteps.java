package StepDefinitions.User_Story_5_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_5_AddSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    FormContent fm=new FormContent();
    @Given("Clicking on the Setup, Human Resources, Positions options from the menu categories")
    public void clickingOnTheSetupHumanResourcesPositionsOptionsFromTheMenuCategories() {
        ln.findAndClick("HumanResources");
        ln.findAndClick("setupClick");
        ln.findAndClick("positions");

    }

    @When("Add to Position")
    public void addToPosition() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Gamze");
        fm.findAndSend("shortname","Çelik");
        dc.findAndClick("saveButton");

    }
}
