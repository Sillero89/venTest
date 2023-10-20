package starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"step_definitions"},
        features = { "src/test/resources/features/ageValidation.feature",
                     "src/test/resources/features/emailValidation.feature"})
public class FunctionalTestSuit {


}
