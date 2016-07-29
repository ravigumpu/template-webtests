package au.gov.nsw.transport.webtest.steps;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.StepFactory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static net.thucydides.core.steps.StepData.withTestDataFrom;

public class GoogleSearchDataDrivenSteps {
    @Managed
    WebDriver driver;

    @ManagedPages(defaultUrl = "http://www.google.com.au")
    Pages pages;

    @Steps
    GoogleSearchCheck googleSearchCheck;

    private String dataSource;

    @Given("the search data from $dataSource")
    public void givenTheSearchDataFrom(String dataSource) {
        this.dataSource = dataSource;
    }

    @When("the user does some special search")
    public void whenTheUserDoesSomeSpecialSearch() {
    }

    @Then("they should see the appropriate stuff")
    public void thenTheyShouldSeeTheAppropriateStuff() throws IOException {
        StepFactory stepFactory = new StepFactory(pages);
        withTestDataFrom(dataSource).usingFactory(stepFactory).run(googleSearchCheck).checkSearch();
    }
}
