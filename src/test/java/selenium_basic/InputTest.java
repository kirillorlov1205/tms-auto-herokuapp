package selenium_basic;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.MainPageService;
import utils.Constants;

public class InputTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Override
    @BeforeMethod
    public void beforeMethod() {
        openPage("http://the-internet.herokuapp.com");
        mainPageService.clickPageLinkElementByName("Inputs");
    }

    @Test(testName = "Verify number input")
    public void verifyNumberInput() {
        String testNum = "123";
        findElement(Constants.INPUT_FIELD_LOCATOR).sendKeys(testNum);
        Assert.assertEquals(findElement(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value"), "123");
    }

    @Test(testName = "Verify string input")
    public void verifyStringInput() {
        String testStr = "str";
        findElement(Constants.INPUT_FIELD_LOCATOR).sendKeys(testStr);
        Assert.assertTrue(findElement(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value").isEmpty());
    }

    @Test(testName = "Verify arrow up input")
    public void verifyArrowUpInput() {
        String expectedValue = "1";
        findElement(Constants.INPUT_FIELD_LOCATOR).sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(findElement(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value"), expectedValue, "Value doesn't match: " + expectedValue);
    }

    @Test(testName = "Verify arrow down input")
    public void verifyArrowDownInput() {
        String expectedValue = "-1";
        findElement(Constants.INPUT_FIELD_LOCATOR).sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(findElement(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value"), expectedValue, "Value doesn't match: " + expectedValue);
    }
}
