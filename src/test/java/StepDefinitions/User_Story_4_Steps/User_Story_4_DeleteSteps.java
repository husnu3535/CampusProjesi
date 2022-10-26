package StepDefinitions.User_Story_4_Steps;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_4_DeleteSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    @When("Delete to Fields")
    public void deleteToFields() {
        dc.findAndSend("NAMEINPUT","Makbule");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("DELETEBUTTON");
        dc.findAndClick("DELETEBUTTON2");

    }
}
