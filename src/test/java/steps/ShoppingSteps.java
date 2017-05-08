package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;

public class ShoppingSteps extends BaseSteps {

    public AppiumDriver getDriver(){return getDriverInstanceFor("tester");}

    @And("^I scroll down the screen$")
    public void iScrollDownTheScreen(){
         new HomePage(getDriver()).scrollDownToShop();
    }
}
