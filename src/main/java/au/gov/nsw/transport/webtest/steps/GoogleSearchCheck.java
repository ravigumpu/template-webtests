package au.gov.nsw.transport.webtest.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchCheck {
    @Steps
    private GoogleWebSteps steps;

    String searchTerm;
    String someOtherThing;

    @Step
    public void checkSearch() {
        System.out.println(this);

        // do a bunch of stuff
//        steps.userSearchesFor(searchTerm);
    }

    @Override
    public String toString() {
        return "GoogleSearchCheck{" +
                ", searchTerm='" + searchTerm + '\'' +
                ", someOtherThing='" + someOtherThing + '\'' +
                '}';
    }
}
