package moneytrans.pages;

import moneytrans.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//header/div[1]/div[2]/div[3]/div[1]/nav[1]/ul[1]/li[5]/a[1]")
    public WebElement loginButton;


}
