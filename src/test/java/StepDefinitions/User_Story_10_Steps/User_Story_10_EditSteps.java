package StepDefinitions.User_Story_10_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import io.cucumber.java.en.When;

public class User_Story_10_EditSteps {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();
    FormContent fm=new FormContent();
    @When("Edit to Grade Levels")
    public void editToGradeLevels() {
        parent.waitEditButtonVerify();
        dc.findAndClick("gradeEditButton");
        fm.findAndSend("nameInput","Oliver");
        fm.findAndSend("shortname2","Torres");
        fm.findAndSend("order","10");
        fm.veriftText("activeButton","Active");
        fm.findAndClick("nextGrade");
        fm.findAndClick("leonard");
        dc.findAndClick("saveButton");

    }
}
