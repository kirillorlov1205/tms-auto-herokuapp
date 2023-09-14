package selenium_basic;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;
import utils.Constants;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HoverTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Test
    public void verifyLinksTransaction() {
        mainPageService.clickPageLinkElementByName("Hovers");
        Actions action = new Actions(DriverSingleTone.getInstance().getDriver());
        SoftAssert softAssert = new SoftAssert();

        List<WebElement> profilesList = findElements(Constants.PROFILE_LOCATOR);
        List<WebElement> profileNamesList = findElements(Constants.PROFILE_NAME_LOCATOR);

        int profileNumber = 1;
        for (int i = 0; i < profilesList.size(); i++) {
            action.moveToElement(profilesList.get(i)).perform();
            softAssert.assertEquals(profileNamesList.get(i).getText(), "name: user" + profileNumber,
                    "User name is not: " + "name: user" + profileNumber);

            findElement(By.xpath("//a[@href='/users/" + profileNumber + "']")).click();
            softAssert.assertFalse(DriverSingleTone.getInstance().getDriver().getPageSource().contains("404"));

            DriverSingleTone.getInstance().getDriver().navigate().back();
            DriverSingleTone.getInstance().getDriver().manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
            profileNumber++;
        }
        softAssert.assertAll();
    }
}
