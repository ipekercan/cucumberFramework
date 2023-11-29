package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.get().navigate().to("https://www.akakce.com/");
    }

    @When("Enter username and password from excel")
    public void enterUsernameAndPasswordFromExcel() {
        locators.click(locators.login);
        locators.sendKeys(locators.emailBox,"adambronz@gmail.com");
        locators.sendKeys(locators.passwordBox,"Adam.1234");
        locators.click(locators.loginBtn);
    }

    @Then("Verify login successfully")
    public void verifyLoginSuccessfully() {
        locators.verifyContainsText(locators.accountName,"Adam");
    }
    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = locators.getWebElement(strlinkList.get(i));
            locators.click(linkWebElement);
        }
    }

}
