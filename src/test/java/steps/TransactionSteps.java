package steps;


import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.MobileRechargePage;
import pages.PaymentPage;

public class TransactionSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("tester");
    }

    @And("^I choose mobile prepaid option$")
    public void iClickOnMobilePrepaidButton() throws Throwable {
        new LoginPage(getDriver()).clickOnDenyPermission();
        new LoginPage(getDriver()).clickOnDenyPermission();
        new HomePage(getDriver()).clickOnMobilePrepaid();
    }

    @And("^I click on \"Prepaid\" button$")
    public void iClickOnPrepaidButton() throws Throwable {
        new MobileRechargePage(getDriver()).clickOnPrepaid();
    }

    @And("^I choose prepaid option and enter my mobile number as ([^\"]*) and amount as ([^\"]*)$")
    public void iEnterMyPhoneNumberAs(String mobileNumber,String amount) {
        MobileRechargePage mobileRechargePage = new MobileRechargePage(getDriver());
        mobileRechargePage.enterMobileNumber(mobileNumber);
        mobileRechargePage.enterAmount(amount);
        mobileRechargePage.clickOnProceedButton();
    }

    @And("^I proceed to pay the amount$")
    public void iProceedToPayTheAmount(){
        new MobileRechargePage(getDriver()).proceedToPay();
    }

    @And("^I enter my card number as ([^\"]*)$")
    public void iEnterMyCardNumberAs(String cardNumber){
        new PaymentPage(getDriver()).enterCardNo(cardNumber);
    }

    @And("^I enter my cvv as ([^\"]*)$")
    public void iEnterTheMonth(String cvv){
        new PaymentPage(getDriver()).enterCVV(cvv);
    }

    @And("^I enter the month and year$")
    public void iEntertheMonthAndYear(){
        new PaymentPage(getDriver()).selectMonth();
        new PaymentPage(getDriver()).selectYear();
    }

    @And("^I choose to pay now$")
    public void iChooseToPayNow(){
        new PaymentPage(getDriver()).selectPayNow();
    }

    @And("^I click on pay or scan button$")
    public void iClickOnPayOrScanButton(){
        new HomePage(getDriver()).clickOnPayOrScan();
    }

    @And("^I start another activity$")
    public void iStartAnotherActivity() throws InterruptedException {
        new HomePage(getDriver()).startAnotherActivity(getDriver());
    }
}
