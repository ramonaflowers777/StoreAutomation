package stepdefinitions;

import aquality.selenium.browser.AlertActions;
import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.en.When;

import static io.qameta.allure.Allure.step;

public class BrowserSteps {
    @When("I accept Alert")
    public void acceptAlert() {
        step("i accept alert");
        AqualityServices.getBrowser().handleAlert(AlertActions.ACCEPT);
    }
}
