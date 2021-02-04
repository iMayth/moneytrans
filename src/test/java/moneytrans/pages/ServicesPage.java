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

}
