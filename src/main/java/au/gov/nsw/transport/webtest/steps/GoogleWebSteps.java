package au.gov.nsw.transport.webtest.steps;


import au.gov.nsw.transport.webtest.pages.GooglePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class GoogleWebSteps {
    @Managed
    WebDriver driver;

    @ManagedPages(defaultUrl = "http://www.google.com.au")
    Pages pages;

    @Given("the user is on the google home page")
    public void userIsOnLoginPage() {
        pages.get(GooglePage.class).open();
    }

    @When("the user searches for $searchTerm")
    public void userSearchesFor(String searchTerm) {
        pages.get(GooglePage.class).searchFor(searchTerm);
    }

    @Then("they should see the wikipedia article for $searchTerm")
    public void wikipediaArticleForSearchShouldBeShown(String searchTerm) {
        pages.get(GooglePage.class).resultsContains(searchTerm);
        pages.get(GooglePage.class).resultsContains("Wikipedia, the free encyclopedia");
    }

}
