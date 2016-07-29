package au.gov.nsw.transport.webtest;

import net.thucydides.jbehave.ThucydidesJUnitStory;

public class Single extends ThucydidesJUnitStory {

    public Single() {
        System.setProperty("thucydides.browser.width","1000");
    }
}
