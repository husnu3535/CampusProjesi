package StepDefinitions.User_Story_3_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class User_Story_3_EditSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    Parent parent=new Parent();
    @When("Edit to Document Types")
    public void editToDocumentTypes() {

        dc.findAndSend("NAMEINPUT","MuhasebeDefteri");
        dc.findAndClick("SEARCHBUTTON");
        parent.waitUntilLoading();
        dc.findAndClick("EDİTBUTTON");
        fm.findAndSend("nameInput","YevmiyeDefteri");
        dc.findAndClick("saveButton");

    }
}
