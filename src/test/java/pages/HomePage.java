package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private AppiumDriver driver;

    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text='Mobile Prepaid']"),
            @FindBy(xpath = "//android.widget.TextView[@text='Mobile']")
    })
    private WebElement mobile;

    @FindBy(id = "net.one97.paytm:id/help_overlay")
    private WebElement helpOverlay;

    @FindBy(xpath = "//android.widget.TextView[@text='Pay/Scan']")
    private WebElement payOrScan;

    private By bazaar = By.xpath("//android.widget.TextView[@text='Bazaar']");

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnMobilePrepaid() throws InterruptedException {
        try {
            waitForElementToBeClickable(helpOverlay);
            helpOverlay.click();
            waitForElementToBeClickable(mobile);
            mobile.click();
        } catch (Exception e) {
            waitForElementToBeClickable(mobile);
            mobile.click();
        }
    }

    public void clickOnPayOrScan() {
        waitForElementToBeClickable(helpOverlay);
        helpOverlay.click();
        waitForElementToBeClickable(payOrScan);
        payOrScan.click();
    }

    public void scrollDownToShop() {
        waitForElementToBeClickable(helpOverlay);
        helpOverlay.click();
        scrollDownTo(bazaar);
        clickBy(bazaar);
    }

    public void startAnotherActivity(AppiumDriver driver) throws InterruptedException {
        AndroidDriver androidDriver = (AndroidDriver) driver;
        androidDriver.startActivity("com.android.calculator2", "com.android.calculator2.Calculator");

    }
}
