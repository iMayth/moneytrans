package moneytrans.pages;

import moneytrans.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//body/div[@id='ModalPopup']/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='loginButton']")
    public WebElement loginButton2;

    @FindBy(xpath = "//*[@id=\"popmake-16742\"]/button")
    public WebElement closePopup;

    @FindBy(className = "close")
    public WebElement carpi;

    @FindBy(id = "catapultCookie")
    public WebElement closePopup2;
}
