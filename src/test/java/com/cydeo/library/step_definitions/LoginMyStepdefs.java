package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginMyStepdefs {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    LoginPage login = new LoginPage();
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

        
    }

    @When("I login as a librarian")
    public void iLoginAsALibrarian() {

        login.inputemailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        login.inputpasswordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        login.btnButton.click();



        
    }

    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
        String expectedURL = "dashboard";
        wait.until(ExpectedConditions.urlContains(expectedURL));

        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("dashboard is not appear on URL", actualURL.contains(expectedURL));
    }

        @When("I login as a student")
        public void i_login_as_a_student() {
            login.inputemailInput.sendKeys(ConfigurationReader.getProperty("student55_user"));
            login.inputpasswordInput.sendKeys(ConfigurationReader.getProperty("student55_pass"));
            login.btnButton.click();
        }


        @Then("books should be displayed")
        public void books_should_be_displayed() {

        String expectedURL = "books";
        wait.until(ExpectedConditions.urlContains(expectedURL));
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("dashboard is not appear on URL",actual.contains(expectedURL));


    }
}
