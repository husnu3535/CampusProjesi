package StepDefinitions.User_Story_3_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_3_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Document Types")
    public void deleteToDocumentTypes() {
        dc.findAndSend("NAMEINPUT","YevmiyeDefteri");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
