package StepDefinitions.User_Story_9_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.contrib.For;

public class User_Story_9_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    @When("Edit to Bank Accounts")
    public void editToBankAccounts() {
        dc.findAndSend("NAMEINPUT","JoseMiguel");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","Jimenez");
        fm.findAndSend("iban","TRY12 5565 7688 6453 3456");
        fm.veriftText("activeButton","Active");
        fm.findAndClick("currency");
        fm.findAndClick("TRY");
        fm.findAndSend("ıntegrationCode","94563");
        dc.findAndClick("saveButton");

    }
}
