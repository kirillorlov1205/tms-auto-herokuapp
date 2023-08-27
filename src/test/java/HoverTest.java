import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HoverTest extends BaseSetUp {

    @Test
    public void verifyLinksTransaction() {
        Utilities.getPageLinkElementByName("Hovers").click();
        Actions action = new Actions(Driver.getDriver());
        SoftAssert softAssert = new SoftAssert();

        List<WebElement> profilesList = Driver.findElementsByLocator(Constants.PROFILE_LOCATOR);
        List<WebElement> profileNamesList = Driver.findElementsByLocator(Constants.PROFILE_NAME_LOCATOR);

        int profileNumber = 1;
        for (int i = 0; i < profilesList.size(); i++) {
            action.moveToElement(profilesList.get(i)).perform();
            softAssert.assertEquals(profileNamesList.get(i).getText(), "name: user" + profileNumber,
                    "User name is not: " + "name: user" + profileNumber);

            Driver.findElementByLocator(By.xpath("//a[@href='/users/" + profileNumber + "']")).click();
            softAssert.assertFalse(Driver.getDriver().getPageSource().contains("404"));

            Driver.getDriver().navigate().back();
            Driver.getDriver().manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
            profileNumber++;
        }
        softAssert.assertAll();
    }
}
