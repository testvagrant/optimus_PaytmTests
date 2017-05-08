package pages;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PayAmountPage extends BasePage{

    private AppiumDriver driver;
    private String app_package_name = "net.one97.paytm:id/";
    private By mobileNumberBox = By.xpath("//android.widget.TextView[@text='Mobile Number']");
    private By doItLater = By.id(app_package_name+"tv_dont_ask");
    private By okGotIt = By.id(app_package_name+"tv_got_it");
    private By mobileNumber = By.id(app_package_name+"txt_p2p_account");
    private By amount = By.id(app_package_name+"edit_p2p_amount");
    private By proceed = By.id(app_package_name+"btn_p2p_send_money");
    private By proceedToPay = By.id(app_package_name+"w_custom_dialog_btn_positive");

    public PayAmountPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void selectDoItLater(){
        waitForElementToBeClickable(doItLater);
        clickBy(doItLater);
    }

    public void selectOkGotIt(){
        waitForElementToBeClickable(okGotIt);
        clickBy(okGotIt);
    }

    public void selectMobileNumberTab(){
        waitForElementToBeClickable(mobileNumberBox);
        clickBy(mobileNumberBox);
    }

    public void enterMobileNumber(String mobileNum){
        waitForElementToBeVisible(mobileNumber);
        sendKeys(mobileNumber,mobileNum);
    }

    public void enterAmount(String amount){
        waitForElementToBeClickable(this.amount);
        sendKeys(this.amount,amount);
    }

    public void clickOnProceedButton(){
        waitForElementToBeClickable(proceed);
        clickBy(proceed);
    }

    public void clickOnProceedToPayButton(){
        waitForElementToBeClickable(proceedToPay);
        clickBy(proceedToPay);
    }
}
