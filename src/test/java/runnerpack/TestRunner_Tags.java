package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\featuretags",
                 glue="stepdefinitions",
                 tags=("(@smoke and not @regression) and  @important")
                )
public class TestRunner_Tags {

}
