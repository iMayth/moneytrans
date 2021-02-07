package moneytrans.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import moneytrans.pages.LoginPage;
import moneytrans.pages.ServicesPage;
import moneytrans.utilities.BrowserUtils;
import moneytrans.utilities.ConfigurationReader;
import moneytrans.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class services01StepDefs {
    @Given("the user is on services page after log in")
    public void the_user_is_on_services_page_after_log_in() {


        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        BrowserUtils.waitForClickability(new LoginPage().loginButton,10);
        new LoginPage().loginButton.click();

        String email = ConfigurationReader.get("email");
        String password = ConfigurationReader.get("password");

        BrowserUtils.waitForVisibility(new LoginPage().email,10);
        new LoginPage().email.sendKeys(email);
        new LoginPage().password.sendKeys(password);
        new LoginPage().loginButton2.click();
        BrowserUtils.waitFor(3);


        String expectedTitle = new ServicesPage().serviceTitle.getAttribute("text");
        System.out.println(expectedTitle);
        String actualTitle = Driver.get().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @When("the user clicks on mobile top up")
    public void the_user_clicks_on_mobile_top_up() {
        BrowserUtils.waitForClickability(new ServicesPage().mobileTopUpBtn,10);
        new ServicesPage().mobileTopUpBtn.click();

    }
    @Then("the user should be able to click on check promotions")
    public void the_user_should_be_able_to_click_on_check_promotions() {
       BrowserUtils.waitForClickability(new ServicesPage().checkPromotions,10);
       new ServicesPage().checkPromotions.click();
    }

    @When("the user searches for nicaragua")
    public void the_user_searches_for_nicaragua() {
        BrowserUtils.waitForClickability(new ServicesPage().countryBox,10);
        new ServicesPage().countryBox.click();
        BrowserUtils.waitForVisibility(new ServicesPage().countrySearch,10);
        new ServicesPage().countrySearch.click();
        new ServicesPage().countrySearch.sendKeys("nicaragua");
        new ServicesPage().countrySearch.sendKeys(Keys.ENTER);
    }


    @Then("the user should be able to click on read more")
    public void the_user_should_be_able_to_click_on_read_more() {

        BrowserUtils.waitForClickability(new ServicesPage().readMore,10);
        new ServicesPage().readMore.click();
    }
    @Then("the user should be able to see full size of read more page on mobile")
    public void the_user_should_be_able_to_see_full_size_of_read_more_page_on_mobile() {



    }


}
