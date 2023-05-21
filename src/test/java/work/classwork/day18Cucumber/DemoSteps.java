package work.classwork.day18Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoSteps {
    @Given("I open demoG7 site")
    public void iOpenDemoGSite() {
        System.out.println("i opened site");
    }

    @When("I fill {string} in the form")
    public void iFillInTheForm(String text) {
        System.out.printf("Then i printed '%s'String", text);
    }

    @Then("I need to see something")
    public void iNeedToSeeSomething() {
        Assert.assertTrue(true);
        System.out.println("fineshed test");
    }

}
