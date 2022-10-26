package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement Dashboard;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement AcceptCookies;

    @FindBy(xpath = "//button[@matbadgeposition='below']//fa-icon")
    private WebElement createButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement succesfully;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'NAME')])[1]//input")
    private WebElement NAMEINPUT;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement SEARCHBUTTON;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[12]//fa-icon")
    private WebElement EDİTBUTTON;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[33]//fa-icon")
    private WebElement DELETEBUTTONROW9;

    @FindBy(xpath = "(//span[contains(@class,'mat-button-wrapper')])[13]//fa-icon")
    private WebElement DELETEBUTTON;

    @FindBy(xpath = "//span[contains(text(),' Delete ')]")
    private WebElement DELETEBUTTON2;

    @FindBy(xpath = "//span[text()='Campus Project']")
    private WebElement schoolButton;

    @FindBy(xpath = "//span[text()=' Halo Imperial College  ']")
    private WebElement haloImperial;

    @FindBy(xpath = "(//button[@color='accent'])[9]//fa-icon")
    private WebElement gradeEditButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']//input")
    private WebElement descriptionInput;

    @FindBy(xpath = "//div[text()=' Name ']")
    private WebElement nameVerify;



    WebElement myElement;

    public void findAndSend(String strElement,String value) {
        switch (strElement) {
            case "username":myElement=username;break;
            case "password":myElement=password;break;
            case "NAMEINPUT":myElement=NAMEINPUT;break;
            case "descriptionInput":myElement=descriptionInput;break;





        }
        sendKeysFunction(myElement,value);
    }

    public void findAndClick(String strElement){
        switch (strElement){
            case "loginButton":myElement=loginButton;break;
            case "acceptCookies":myElement=AcceptCookies;break;
            case "createButton":myElement=createButton;break;
            case "saveButton":myElement=saveButton;break;
            case "SEARCHBUTTON":myElement=SEARCHBUTTON;break;
            case "EDİTBUTTON":myElement=EDİTBUTTON;break;
            case "DELETEBUTTON":myElement=DELETEBUTTON;break;
            case "DELETEBUTTON2":myElement=DELETEBUTTON2;break;
            case "schoolButton":myElement=schoolButton;break;
            case "haloImperial":myElement=haloImperial;break;
            case "gradeEditButton":myElement=gradeEditButton;break;
            case "DELETEBUTTONROW9":myElement=DELETEBUTTONROW9;break;

            



        }
        clickFunction(myElement);
    }



    public void verifyText(String strElement,String text){
        switch (strElement){
            case "Dashboard":myElement=Dashboard;break;
            case "succesfully":myElement=succesfully;break;
            case "nameVerify":myElement=nameVerify;break;



        }
        verifyContainsText(myElement,text);
    }

}
