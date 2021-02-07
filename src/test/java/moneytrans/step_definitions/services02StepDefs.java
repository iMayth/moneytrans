package moneytrans.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import moneytrans.pages.ServicesPage;
import moneytrans.utilities.BrowserUtils;
import org.openqa.selenium.Keys;

public class services02StepDefs {
    @When("the user clicks on prices by country from sidebar")
    public void the_user_clicks_on_prices_by_country_from_sidebar() {
        BrowserUtils.waitForVisibility(new ServicesPage().pricesByCounty,10);
        new ServicesPage().pricesByCounty.click();

    }

    @Then("the user should be able to search for gambia")
    public void the_user_should_be_able_to_search_for_gambia() {
        BrowserUtils.waitForClickability(new ServicesPage().countryBox2,10);
        new ServicesPage().countryBox2.click();
        BrowserUtils.waitForVisibility(new ServicesPage().countrySearch,10);
        new ServicesPage().countrySearch.click();
        new ServicesPage().countrySearch.sendKeys("gambia");
        new ServicesPage().countrySearch.sendKeys(Keys.ENTER);
    }
}
