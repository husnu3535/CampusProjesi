package StepDefinitions.User_Story_2_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.awt.*;

public class User_Story_2_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    LeftNav ln=new LeftNav();
    @Given("Clicking on the Human resources, Setup, Attestation options from the menu categories")
    public void clickingOnTheHumanResourcesSetupAttestationOptionsFromTheMenuCategories() {
        ln.findAndClick("HumanResources");
        ln.findAndClick("setupClick");
        ln.findAndClick("attestations");

    }



    @When("Add to Attestation")
    public void addToAttestation() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Esra");
        dc.findAndClick("saveButton");


    }

}
