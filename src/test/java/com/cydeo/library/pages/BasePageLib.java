package com.cydeo.library.pages;

import com.cydeo.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePageLib extends BasePage {

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboarrLink;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksLink;

    @FindBy(id = "navbarDropdown")
    public WebElement userDropdown;

}
