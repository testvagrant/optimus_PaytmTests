package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MobileRechargePage extends BasePage {

    private AppiumDriver driver;
    private String app_package_name = "net.one97.paytm:id/";
    private By prepaid = By.id(app_package_name + "radio_prepaid");
    private By postpaid = By.id(app_package_name + "radio_postpaid");
    private By editPhoneNumber = By.id(app_package_name + "edit_no");
    private By editAmount = By.id(app_package_name + "edit_amount");
    private By proceedButton = By.id(app_package_name+"proceed_btn");
    private By proceedToPay = By.id(app_package_name+"btn_pay_now");

    public MobileRechargePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnPrepaid(){
        waitForElementToBeClickable(prepaid);
        if(!driver.findElement(prepaid).isSelected()) {
            clickBy(prepaid);
        }
    }

    public void clickOnPostpaid(){
        waitForElementToBeClickable(postpaid);
        if(!driver.findElement(postpaid).isSelected()){
            clickBy(postpaid);
        }
    }

    public void enterMobileNumber(String phoneNumber){
        waitForElementToBeVisible(editPhoneNumber);
        sendKeys(editPhoneNumber,phoneNumber);
    }

    public void enterAmount(String amount){
        waitForElementToBeVisible(editAmount);
        sendKeys(editAmount,amount);
    }

    public void clickOnProceedButton(){
        waitForElementToBeClickable(proceedButton);
        clickBy(proceedButton);
    }

    public void proceedToPay(){
        waitForElementToBeClickable(proceedToPay);
        clickBy(proceedToPay);
    }
}
