package StepDefinitions.User_Story_9_Steps;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_9_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Bank Accounts")
    public void deleteToBankAccounts() {
        dc.findAndSend("NAMEINPUT","Jimenez");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
