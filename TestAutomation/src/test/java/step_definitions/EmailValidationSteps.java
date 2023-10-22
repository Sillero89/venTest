package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page_objects.ContactFormPage;
import page_objects.ResultPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EmailValidationSteps {
    private WebDriver driver;
    private CommonFunctions env;
    private ContactFormPage contactFormPage;
    private ResultPage resultPage;

    @Before("@EmailFeature")
    public void setUp() {
        driver = new FirefoxDriver();
        contactFormPage = new ContactFormPage(driver);
        resultPage = new ResultPage(driver);
        env = new CommonFunctions(driver);
    }

    @Given("^(?:web browser is at the Contact form page|" +
            "email missing username data|" +
            "email missing server data|" +
            "email missing domain data)$")
    public void web_browser_is_at_the_contact_form_page() {
        env.openWebPage(driver);
    }

    @And("the user enters {string} into email")
    public void the_user_enters_into_email(String email) {
        contactFormPage.setEmail(email);
    }
    @And("the user enters a valid message")
    public void the_user_enters_message() {
        contactFormPage.setMessage(contactFormPage.message);
    }
    @When("the user submit the form")
    public void the_user_submit_the_form() {
        contactFormPage.clickSubmit();
    }
    @Then("element warning {string} is shown")
    public void element_warning_is_shown(String message) {
        assertThat( contactFormPage.emailValidationMessage().equals(message)).isEqualTo(true);
    }
    @Then("Result page shows {string} message")
    public void result_page_shows_message(String message) {
        assertThat(  resultPage.searchText(message)).isEqualTo(true);
    }
    @After("@EmailFeature")
    public void tearDown() { driver.quit();}
}
