package info.seleniumcucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    WebDriver driver;


    @FindBy(id="TxbUsuario")
    WebElement usrInput;

    @FindBy(id="TxbClave")
    WebElement pwdInput;

    @FindBy(id="BtnIngresar")
    WebElement btnIngresar;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void enterKeysUsr( String text){
        waitForElementToBeVisible(usrInput);
        usrInput.sendKeys(text);
    }

    public void enterKeysPwd( String text){
        waitForElementToBeVisible(pwdInput);
        pwdInput.sendKeys(text);
    }

    public void clickUsr(){
        usrInput.click();
    }
    public void clickPwd(){
        pwdInput.click();
    }
    public void clickIngresar(){
        btnIngresar.click();
    }
}