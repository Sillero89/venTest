package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page_objects.ContactFormPage;
import page_objects.ResultPage;

public class EmailValidationSteps {
    private WebDriver driver;
    private CommonFunctions env;
    private ContactFormPage contactFormPage;
    private ResultPage resultPage;

    @Given("a web browser is at the Contact form page")
    public void a_web_browser_is_at_the_contact_form_page() {
        driver = new FirefoxDriver();
        contactFormPage = new ContactFormPage(driver);
        resultPage = new ResultPage(driver);
        env = new CommonFunctions();
        env.openWebPage(driver);
    }

    @Given("^(?:email missing username data|email missing server data|email missing domain data)$")
    public void none() {    }

    @And("the user enters {string} into email")
    public void the_user_enters_into_email(String string) {

    }
    @When("the user submit the form")
    public void the_user_submit_the_form() {

    }
    @Then("element warning {string} is shown")
    public void element_warning_is_shown(String string) {

    }

    @Then("Result page shows {string} message")
    public void result_page_shows_message(String string) {

    }
    @After("@LastScenario")
    public void tearDown() {
        driver.quit();
    }
}
