package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PaymentPage extends BasePage {

    private AppiumDriver driver;

    @FindAll({
            @FindBy(xpath = "//android.view.View[@index=4]/android.widget.EditText"),
            @FindBy(xpath = "//android.view.View[@index=2]/android.widget.EditText"),
            @FindBy(id = "card-number")
    })
    private WebElement cardNo;

    @FindAll({
            @FindBy(xpath = "//android.view.View[@index=5]/android.widget.Button"),
            @FindBy(xpath = "//android.view.View[@index=3]/android.widget.Button"),
            @FindBy(xpath = "//android.view.View[@index=1]/android.widget.Button"),
            @FindBy(xpath = "//android.view.View[@index=2]/android.widget.Spinner"),
            @FindBy(id = "dcMonth")
    })
    private WebElement monthTab;

    @FindAll({
            @FindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView[@index=3]"),
    })
    private WebElement month;

    @FindAll({
            @FindBy(xpath = "//android.view.View[@index=4]/android.widget.Button"),
            @FindBy(xpath = "//android.view.View[@index=6]/android.widget.Button"),
            @FindBy(xpath = "//android.view.View[@index=2]/android.widget.Spinner"),
            @FindBy(id = "dcYear")
    })
    private WebElement yearTab;

    @FindAll({
            @FindBy(xpath = "//android.widget.ListView/android.widget.CheckedTextView[@index=7]"),
    })
    private WebElement year;

    @FindAll({
            @FindBy(xpath = "//android.view.View[@index=7]/android.widget.EditText"),
            @FindBy(xpath = "//android.view.View[@index=5]/android.widget.EditText"),
            @FindBy(xpath = "//android.view.View[@index=3]/android.widget.EditText")
    })
    private WebElement cvv;

    @FindAll({
            @FindBy(xpath = "//android.view.View[@index=10]/android.widget.Button"),
            @FindBy(xpath = "//android.view.View[@index=8]/android.widget.Button")
    })
    private WebElement payNow;

    public PaymentPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void enterCardNo(String cardNum) {
        waitForElementToBeVisible(cardNo);
        cardNo.sendKeys(cardNum);
    }

    public void enterCVV(String cvv) {
        waitForElementToBeVisible(this.cvv);
        this.cvv.sendKeys(cvv);
    }

    public void selectMonth() {
        waitForElementToBeClickable(monthTab);
        monthTab.click();
        waitForElementToBeClickable(month);
        month.click();
    }

    public void selectYear() {
        waitForElementToBeClickable(yearTab);
        yearTab.click();
        waitForElementToBeClickable(year);
        year.click();
    }

    public void selectPayNow() {
        waitForElementToBeClickable(payNow);
        payNow.click();
    }
}
