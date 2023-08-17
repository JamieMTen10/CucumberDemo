package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "StepDefinitions", features = "src/test/resources",tags= "@loanApp")
public class LoanAppTestRunner {

}
