import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

public class InputTest extends BaseSetUp {

    @Override
    @BeforeMethod
    public void beforeMethod() {
        Driver.openUrl("http://the-internet.herokuapp.com");
        Utilities.getPageLinkElementByName("Inputs").click();
    }

    @Test(testName = "Verify number input")
    public void verifyNumberInput() {
        String testNum = "123";
        Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR).sendKeys(testNum);
        Assert.assertEquals(Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value"), "123");
    }

    @Test(testName = "Verify string input")
    public void verifyStringInput() {
        String testStr = "str";
        Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR).sendKeys(testStr);
        Assert.assertTrue(Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value").isEmpty());
    }

    @Test(testName = "Verify arrow up input")
    public void verifyArrowUpInput() {
        String expectedValue = "1";
        Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR).sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value"), expectedValue, "Value doesn't match: " + expectedValue);
    }

    @Test(testName = "Verify arrow down input")
    public void verifyArrowDownInput() {
        String expectedValue = "-1";
        Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR).sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(Driver.findElementByLocator(Constants.INPUT_FIELD_LOCATOR)
                .getAttribute("value"), expectedValue, "Value doesn't match: " + expectedValue);
    }
}
