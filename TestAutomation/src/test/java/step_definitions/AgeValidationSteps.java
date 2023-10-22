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


public class AgeValidationSteps {
    private WebDriver driver;
    private CommonFunctions env;
    private ContactFormPage contactFormPage;
    private ResultPage resultPage;

    @Before("@AgeFeature")
    public void setUp() {
        driver = new FirefoxDriver();
        contactFormPage = new ContactFormPage(driver);
        resultPage = new ResultPage(driver);
        env = new CommonFunctions(driver);
    }
    @Given("^(?:a web browser is at the Contact form page|" +
            "Age incorrect data)$")
    public void a_web_browser_is_at_the_contact_form_page() {
        env.openWebPage(driver);
    }

    @And("the user enters a valid email")
    public void the_user_enters_a_valid_email() {
        contactFormPage.setEmail(contactFormPage.validEmail);
    }
    @And("the user enters a message")
    public void the_user_enters_message() {
        contactFormPage.setMessage(contactFormPage.message);
    }
    @And("the user enters {string} into age")
    public void the_user_enters_into_age(String age) {
        contactFormPage.setAge(age);
    }
    @When("the user submit form")
    public void the_user_submit_the_form() {
        contactFormPage.clickSubmit();
    }
    @Then("the form is not submitted")
    public void the_form_is_not_submitted() {
        assertThat(contactFormPage.pageVisible()).isEqualTo(true);;
    }
    @Then("the Result page shows the age {string}")
    public void the_Result_page_shows_the_age(String age) {
        assertThat( resultPage.searchText(age)).isEqualTo(true);
    }
    @After("@AgeFeature")
    public void tearDown() { driver.quit();}
}
