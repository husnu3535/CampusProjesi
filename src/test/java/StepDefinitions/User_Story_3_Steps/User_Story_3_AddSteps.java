package StepDefinitions.User_Story_3_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_3_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();

    @Given("Clicking on the Setup, Parameters, Document Types options from the menu categories")
    public void clickingOnTheSetupParametersDocumentTypesOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("documentTypes");

    }

    @When("Add to Document Types")
    public void addToDocumentTypes() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","MuhasebeDefteri");
        fm.documentTypesAction();
        fm.findAndSend("description","Defterler");
        fm.findAndClick("useCamera");
        dc.findAndClick("saveButton");


    }
}
