package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;
import io.appium.java_client.AppiumDriver;
import pages.FacebookPage;
import pages.LoginPage;

public class LoginSteps extends BaseSteps implements En {

    private AppiumDriver getDriver() {
        return getDriverInstanceFor("tester");
    }

/*    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        getDriver();
    }*/


    @Given("^I enter my mobile number as ([^\"]*) and password as ([^\"]*) and login$")
    public void iEnterMyMobileNumberAs(String mobileNumber,String password) throws Throwable {
        new LoginPage(getDriver()).enterMobileNumber(mobileNumber);
        new LoginPage(getDriver()).enterPassword(password);
        new LoginPage(getDriver()).clickOnLogin();
    }

    @And("^I click on facebook button$")
    public void iClickOnFacebookButton() throws Throwable {
        new LoginPage(getDriver()).clickOnFacebook();
    }

    @And("^I enter my email or phone number as ([^\"]*)$")
    public void iEnterMyEmailAddressAs(String emailOrPhone) throws Throwable{
        new FacebookPage(getDriver()).enterEmail(emailOrPhone);
    }

    @And("^I enter my facebook password as ([^\"]*)$")
    public void iEnterMyFacebookPasswordAs(String password) throws Throwable{
        new FacebookPage(getDriver()).enterPassword(password);
    }

    @And("^I click on facebook login button$")
    public void iClickOnFacebookLoginButton() throws Throwable{
        new FacebookPage(getDriver()).clickOnLogin();
    }

    @And(("^I click on continue button$"))
    public void iClickOnContinueButton() throws Throwable{
        new FacebookPage(getDriver()).clickOnContinue();
    }

    @And("^I click on \"do it later\"$")
    public void clickOnDoItLater() throws Throwable{
        new LoginPage(getDriver()).clickOnDoItLater();
    }
}
