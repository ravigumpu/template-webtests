package au.gov.nsw.transport.webtest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://www.google.com")
public class GooglePage extends PageObject {


    @FindBy(id = "lst-ib")
    WebElement searchBox;

    @FindBy(name = "btnG")
    WebElement searchButton;

    @FindBy(id = "res")
    WebElement results;

    @FindBy(linkText = "Gmail")
    WebElement Gmail;

    @FindBy(id = "gmail-sign-in")
    WebElement signinLink;

    @FindBy(id = "Email")
    WebElement Email;

    @FindBy(id = "Passwd")
    WebElement Password;

    @FindBy(id = "signIn")
    WebElement signInButton;



    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String searchTerm) {
        open();
        typeInto(searchBox, searchTerm);
        element(searchButton).click();
    }

    public void resultsContains(String text) {
        element(results).shouldContainText(text);
    }
    public void clickongmaillink() {
        element(Gmail).click();
    }
    public void clickonsigninlink() {
        element(signinLink).click();
    }

    public void entermail() {
        element(Email).click();

    }

    public void enterpassword() {
        element(Password).click();
    }

    public void clickonsigninbutton() {
        element(signInButton).click();
    }
}
