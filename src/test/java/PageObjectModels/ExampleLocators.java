package PageObjectModels;

import Utilities.DriverManager;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleLocators extends Methods {
    public ExampleLocators() {
        PageFactory.initElements(DriverManager.get(), this);
    }

    @FindBy(xpath = "(//a[text()='Giriş Yap'])[1]")
    public WebElement login;
    @FindBy(id = "life")
    public WebElement emailBox;
    @FindBy(id = "lifp")
    public WebElement passwordBox;
    @FindBy(id = "lfb")
    public WebElement loginBtn;
    @FindBy(linkText = "Adam")
    public WebElement accountName;
    @FindBy(id = "setup")
    public WebElement setup;
    @FindBy(id = "parameters")
    public WebElement parameters;
    @FindBy(linkText = "fees")
    public WebElement fees;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "setup": return this.setup;
            case "parameters": return this.parameters;
            case "fees": return this.fees;
        }

        return null;
    }
}
