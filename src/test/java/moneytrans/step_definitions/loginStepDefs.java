package moneytrans.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import moneytrans.pages.LoginPage;
import moneytrans.pages.ServicesPage;
import moneytrans.utilities.BrowserUtils;
import moneytrans.utilities.ConfigurationReader;
import moneytrans.utilities.Driver;
import org.junit.Assert;


public class loginStepDefs {
    @Given("The user is on the main page")
    public void the_user_is_on_the_main_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        //BrowserUtils.waitForClickability(new LoginPage().closePopup,10);
        //new LoginPage().closePopup.click();

    }

    @When("The user clicks on login button")
    public void the_user_clicks_on_login_button() {
        BrowserUtils.waitForClickability(new LoginPage().loginButton,10);
        new LoginPage().loginButton.click();

    }
    @When("The user enters valid credentials and click log in button")
    public void the_user_enters_valid_credentials_and_click_log_in_button() {

       String email = ConfigurationReader.get("email");
       String password = ConfigurationReader.get("password");

        BrowserUtils.waitForVisibility(new LoginPage().email,10);
        new LoginPage().email.sendKeys(email);
        new LoginPage().password.sendKeys(password);

        new LoginPage().loginButton2.click();

        BrowserUtils.waitFor(3);

    }
    @Then("The user should be at services page of the website")
    public void the_user_should_be_at_services_page_of_the_website() {

        String expectedTitle = new ServicesPage().serviceTitle.getAttribute("text");

        System.out.println(expectedTitle);

        String actualTitle = Driver.get().getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
