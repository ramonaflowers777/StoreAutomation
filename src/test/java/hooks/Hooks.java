package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static io.qameta.allure.Allure.step;

public class Hooks {
    private Browser browser = AqualityServices.getBrowser();

    @Before()
    public void setUp() {
        step("Opening browser");
        browser = AqualityServices.getBrowser();
        browser.maximize();
        browser.goTo(SettingsTestData.getEnvData().getHost());
    }

    @After()
    public void tearDown() {
        step("Quitting browser");
        browser.quit();
    }
}
