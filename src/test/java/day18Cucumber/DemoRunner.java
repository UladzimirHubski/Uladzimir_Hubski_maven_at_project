package day18Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"day18Cucumber"}, // пакет где лежит раннер?
        features = {"src/test/resources/features/first.feature"}
        //,tags = "@QA"
)

public class DemoRunner {
}
