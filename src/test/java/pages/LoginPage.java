package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private AppiumDriver driver;

    private String app_package_name = "net.one97.paytm:id/";

    private By mobileNumber = By.id(app_package_name + "edit_username");
    private By password = By.id(app_package_name + "lyt_password");
    private By loginButton = By.id(app_package_name + "lyt_sign_in_button");
    private By facebookButton = By.id(app_package_name + "btn_facebook");
    private By doItLater = By.xpath("//android.widget.TextView[1]");

    public LoginPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterMobileNumber(String mobileNumber) {
        waitForElementToBeVisible(driver.findElement(this.mobileNumber));
        sendKeys(this.mobileNumber, mobileNumber);
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(driver.findElement(this.password));
        sendKeys(this.password, password);
    }

    public void clickOnLogin() {
        waitForElementToBeClickable(loginButton);
        clickBy(loginButton);
    }

    public void clickOnFacebook() {
        waitForElementToBeClickable(facebookButton);
        clickBy(facebookButton);
    }

    public void clickOnDoItLater() {
        waitForElementToBeClickable(doItLater);
        clickBy(doItLater);
    }
}
