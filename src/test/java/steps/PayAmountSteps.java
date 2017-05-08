package steps;


import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.PayAmountPage;

public class PayAmountSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("tester");
    }

    @And("^I proceed to enter the mobile number$")
    public void iProceedToEnterTheMobileNumber() {
        PayAmountPage payAmountPage = new PayAmountPage(getDriver());
        payAmountPage.selectDoItLater();
        payAmountPage.selectOkGotIt();
        payAmountPage.selectMobileNumberTab();
    }

    @And("^I enter the mobile number as ([^\"]*) and amount as ([^\"]*) and I proceed")
    public void iEnterTheMobileNumberAndAmountAs(String mobileNum, String amount) {
        PayAmountPage payAmountPage = new PayAmountPage(getDriver());
        payAmountPage.enterMobileNumber(mobileNum);
        payAmountPage.enterAmount(amount);
        payAmountPage.clickOnProceedButton();
        payAmountPage.clickOnProceedToPayButton();
    }
}
