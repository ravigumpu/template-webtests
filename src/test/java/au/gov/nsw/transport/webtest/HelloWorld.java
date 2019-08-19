package webtest;

import net.thucydides.jbehave.ThucydidesJUnitStory;

public class HelloWorld extends ThucydidesJUnitStory {

    public HelloWorld() {
        System.setProperty("thucydides.browser.width","1000");
    }
}
