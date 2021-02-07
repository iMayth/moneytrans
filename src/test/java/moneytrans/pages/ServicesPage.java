package moneytrans.pages;


import moneytrans.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage extends BasePage{
    public ServicesPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "ng-binding")
    public WebElement serviceTitle;

    @FindBy(xpath = "//button[contains(text(),'Mobile top up')]")
    public WebElement mobileTopUpBtn;

    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[1]/div[3]/div[1]/div[4]/a[1]/span[1]")
    public WebElement checkPromotions;

    //@FindBy(xpath = "//span[@id='select2-chosen-8']")
    //public WebElement countryBox;

    @FindBy(id = "select2-chosen-6")
    public WebElement countryBox;

    @FindBy(xpath = "//a[contains(text(),'Prices by country')]")
    public WebElement pricesByCounty;

    //@FindBy(xpath = "//input[@id='s2id_autogen337_search']")
    //public WebElement countrySearch;

    @FindBy(xpath = "//*[@id=\"s2id_autogen6_search\"]")
    public WebElement countrySearch;

    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/a[1]")
    public WebElement countryBox2;

   // @FindBy(xpath ="/html[1]/body[1]/div[11]/div[1]/input[1]")
   // public WebElement countrySearch2;

    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[5]/div[1]/div[1]/div[8]/button[1]")
    public WebElement readMore;

}
