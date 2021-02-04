package moneytrans.pages;

import moneytrans.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//*[@id=\"menu-item-16280\"]/a")
    public WebElement loginButton;


}
