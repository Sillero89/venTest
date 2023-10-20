package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import library.CommonFunctions;
import org.openqa.selenium.WebDriver;
import page_objects.ContactFormPage;
import page_objects.ResultPage;

import static org.assertj.core.api.ClassBasedNavigableListAssert.assertThat;


public class AgeValidationSteps {
    private WebDriver driver;
    private CommonFunctions env;
    private ContactFormPage contactFormPage;
    private ResultPage resultPage;
    @Given("Age incorrect data")
    public void none() {    }


    @And("the user enters a valid email")
    public void the_user_enters_a_valid_email() {

    }
    @And("the user enters a message")
    public void the_user_enters_message() {

    }
    @And("the user enters {string} into age")
    public void the_user_enters_into_age(String age) {


    }

    @Then("the form is not submitted")
    public void the_form_is_not_submitted() {

    }

    @Then("the Result page shows the age {String}")
    public void the_Result_page_shows_the_age(String age) {
        assertThat( resultPage.equals(a)).isEqualTo(true);


    }

    @After("@LastScenario")
    public void tearDown() {
        driver.quit();
    }

}
