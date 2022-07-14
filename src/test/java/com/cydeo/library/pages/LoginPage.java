package com.cydeo.library.pages;

import com.cydeo.base.BasePage;
import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    public WebElement inputemailInput;

    @FindBy(id = "inputPassword")
    public WebElement inputpasswordInput;

    @FindBy(xpath = "//button")
    public WebElement btnButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
