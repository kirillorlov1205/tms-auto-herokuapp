import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

public class CheckboxTest extends BaseSetUp {

    @Override
    @BeforeMethod
    public void beforeMethod() {
        Driver.openUrl("http://the-internet.herokuapp.com/");
        Utilities.getPageLinkElementByName("Checkboxes").click();
    }

    @Test(testName = "Verify first checkbox Selection")
    public void verifyFirstCheckboxSelection() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(Driver.findElementByLocator(Constants.FIRST_CHECKBOX_LOCATOR).isSelected(),
                "Checkbox one is selected");
        Driver.findElementByLocator(Constants.FIRST_CHECKBOX_LOCATOR).click();
        softAssert.assertTrue(Driver.findElementByLocator(Constants.FIRST_CHECKBOX_LOCATOR).isSelected(),
                "Checkbox one isn't selected");
        softAssert.assertAll();
    }

    @Test(testName = "Verify second checkbox selection")
    public void verifySecondCheckboxSelection() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Driver.findElementByLocator(Constants.SECOND_CHECKBOX_LOCATOR).isSelected(),
                "Checkbox two is not selected");
        Driver.findElementByLocator(Constants.SECOND_CHECKBOX_LOCATOR).click();
        Assert.assertFalse(Driver.findElementByLocator(Constants.SECOND_CHECKBOX_LOCATOR).isSelected(),
                "checkbox two is selected");
        softAssert.assertAll();
    }
}
