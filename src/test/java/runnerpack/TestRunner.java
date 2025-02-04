package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features/Orangelogin.feature",
                 glue="stepdefinitions",
                 plugin= {"json:target/cucumber.json"
                         }
                )
public class TestRunner {

}
