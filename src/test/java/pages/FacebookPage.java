package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FacebookPage extends BasePage {

    private AppiumDriver driver;
    private By email_address = By.xpath("//android.widget.EditText[1]");
    private By password = By.xpath("//android.widget.EditText[2]");
    private By loginButton = By.xpath("//android.widget.Button[1]");
    private By continueButton = By.xpath("//android.widget.Button[1]");

    public FacebookPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterEmail(String email){
        waitForElementToBeVisible(email_address);
        driver.findElement(email_address).sendKeys(email);
    }

    public void enterPassword(String password){
        waitForElementToBeVisible(this.password);
        driver.findElement(this.password).sendKeys(password);
    }

    public void clickOnLogin(){
        waitForElementToBeClickable(this.loginButton);
        driver.findElement(this.loginButton).click();
    }

    public void clickOnContinue(){
        waitForElementToBeClickable(continueButton);
        driver.findElement(continueButton).click();
    }
}
