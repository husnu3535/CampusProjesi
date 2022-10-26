package StepDefinitions.User_Story_9_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_9_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    @Given("Clicking on the Setup, Parameters, Bank Accounts options from the menu categories")
    public void clickingOnTheSetupParametersBankAccountsOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("bankAccounts");

    }

    @When("Add to Bank Accounts")
    public void addToBankAccounts() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","JoseMiguel");
        fm.findAndSend("iban","EUR12 5545 6645 3346 6765");
        fm.findAndClick("currency");
        fm.findAndClick("EURO");
        fm.findAndSend("ıntegrationCode","7790");
        dc.findAndClick("saveButton");

    }
}
