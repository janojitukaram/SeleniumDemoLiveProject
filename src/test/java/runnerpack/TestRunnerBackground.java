package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/featuretags/background.feature",
                 glue="stepdefinitions",
                 plugin= {"pretty","html:target/HtmlReports/report.html"
                         }
                 

                )
public class TestRunnerBackground {

}
