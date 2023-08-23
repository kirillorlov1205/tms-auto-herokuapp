import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.Constants;
import support.Driver;
import support.Utilities;

import java.util.List;

public class AddRemoveTest {

    @BeforeMethod
    public void beforeMethod() {
        Driver.getDriver().get("http://the-internet.herokuapp.com/");
        Utilities.getPageLinkElementByName("Add/Remove Elements").click();
    }

    @AfterClass
    public void afterClass() {
        Driver.getDriver().quit();
    }

    @Test(testName = "Verify Element addition and removing")
    public void verifyElementAdditionAndRemoving() {
        Driver.findElementByLocator(Constants.ADD_ELEMENT_BUTTON_LOCATOR).click();
        Driver.findElementByLocator(Constants.ADD_ELEMENT_BUTTON_LOCATOR).click();

        List<WebElement> buttonsList =
                Driver.findElementsByLocator(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(buttonsList.size(), 2);
        Driver.findElementByLocator(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).click();
        softAssert.assertEquals(buttonsList.size(), 1);
    }
}
