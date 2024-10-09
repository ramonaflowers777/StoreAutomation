package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.JavaScriptAlertsPage;

import static io.qameta.allure.Allure.step;

public class JavaScriptAlertPageSteps {
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();

    @When("I generate JS Alert on the Javascript Alert Page")
    public void generateJSAlert() {
        step("I generate JS Alert on the Javascript Alert Page");
        javaScriptAlertsPage.clickForJsAlertBtn();
    }

    @Then("Success message is displayed on Javascript Alerts Page")
    public void acceptAlert() {
        step("Check that success message is displayed on Javascript Alerts Page");
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success messasge is not displayed");
    }
}
