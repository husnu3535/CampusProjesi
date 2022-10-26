package StepDefinitions.User_Story_8_Steps;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class User_Story_8_AddSteps {
    DialogContent dc=new DialogContent();
    FormContent fm=new FormContent();
    LeftNav ln=new LeftNav();
    Parent parent=new Parent();
    @Given("Clicking on the Setup, School Setup, Departments options from the menu categories")
    public void clickingOnTheSetupSchoolSetupDepartmentsOptionsFromTheMenuCategories() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("SchoolSetup");
        ln.findAndClick("departments");

    }

    @When("Add to Departments")
    public void addToDepartments() {
        dc.findAndClick("createButton");
        fm.findAndSend("nameInput","Facundo");
        fm.findAndSend("codeInput","246642");
        fm.veriftText("activeButton","Active");

        fm.sectionClick();
        fm.findAndSend("shortname2","VeriBilimi");
        fm.findAndSend("name2","dataScience");
        fm.findAndClick("addButton");

        fm.departmentConstants();
        fm.findAndSend("key","baloon");
        fm.findAndSend("values","12200");
        fm.findAndClick("addButton");

        fm.findAndClick("schoolDepartment");
        dc.findAndClick("saveButton");



    }
}
