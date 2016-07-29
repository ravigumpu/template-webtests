package au.gov.nsw.transport.webtest.steps;


import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloWorldSteps {

    @Given("I call the helloworld method")
    public void givenICallTheHelloworldMethod() {
    }

    @Then("the method will return hello world")
    public void thenTheMethodWillReturnHelloWorld() {
        // call some services etc
        String helloworld = "helloworld";
        assertThat(helloworld, is("helloworld"));
    }

}
