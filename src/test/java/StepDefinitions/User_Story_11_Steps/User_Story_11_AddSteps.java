package StepDefinitions.User_Story_11_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_11_AddSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    @Given("Clicking on the Setup, Parameters, Discounts options from the menu categories")
    public void clickingOnTheSetupParametersDiscountsOptionsFromTheMenuCategories(){
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("discounts");
    }

    @When("Add to Discounts")
    public void addToDiscounts() {
        parent.waitEditButtonVerify();
        dc.findAndClick("createButton");
        fm.findAndSend("getDescription","Joaquin");
        fm.findAndSend("getIntegrationCode","CAPARROS");
        fm.findAndSend("priority","15");
        dc.findAndClick("saveButton");

    }
}
