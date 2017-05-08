package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private AppiumDriver driver;
    private String app_package_name = "net.one97.paytm:id/";
    private By helpOverlay = By.id(app_package_name + "help_overlay");
    private By mobile = By.xpath("//android.widget.TextView[@text='Mobile']");
    private By payOrScan = By.xpath("//android.widget.TextView[@text='Pay/Scan']");
    private By bazaar = By.xpath("//android.widget.TextView[@text='Bazaar']");

    public HomePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnMobilePrepaid() throws InterruptedException {
        waitForElementToBeClickable(helpOverlay);
        clickBy(helpOverlay);
        waitForElementToBeClickable(mobile);
        clickBy(mobile);
    }

    public void clickOnPayOrScan() {
        waitForElementToBeClickable(helpOverlay);
        clickBy(helpOverlay);
        waitForElementToBeClickable(payOrScan);
        driver.findElement(payOrScan).click();
    }

    public void scrollDownToShop() {
        waitForElementToBeClickable(helpOverlay);
        clickBy(helpOverlay);
        scrollDownTo(bazaar);
        clickBy(bazaar);
    }

    public void startAnotherActivity(AppiumDriver driver) throws InterruptedException {
        AndroidDriver androidDriver = (AndroidDriver)driver;
        androidDriver.startActivity("com.android.calculator2","com.android.calculator2.Calculator");

    }
}
