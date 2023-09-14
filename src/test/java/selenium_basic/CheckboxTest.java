package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;
import utils.Constants;

public class CheckboxTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Override
    @BeforeMethod
    public void beforeMethod() {
        openPage("http://the-internet.herokuapp.com/");
        mainPageService.clickPageLinkElementByName("Checkboxes");
    }

    @Test(testName = "Verify first checkbox Selection")
    public void verifyFirstCheckboxSelection() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(findElement(Constants.FIRST_CHECKBOX_LOCATOR).isSelected(),
                "Checkbox one is selected");
        findElement(Constants.FIRST_CHECKBOX_LOCATOR).click();
        softAssert.assertTrue(findElement(Constants.FIRST_CHECKBOX_LOCATOR).isSelected(),
                "Checkbox one isn't selected");
        softAssert.assertAll();
    }

    @Test(testName = "Verify second checkbox selection")
    public void verifySecondCheckboxSelection() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(findElement(Constants.SECOND_CHECKBOX_LOCATOR).isSelected(),
                "Checkbox two is not selected");
        findElement(Constants.SECOND_CHECKBOX_LOCATOR).click();
        Assert.assertFalse(findElement(Constants.SECOND_CHECKBOX_LOCATOR).isSelected(),
                "checkbox two is selected");
        softAssert.assertAll();
    }
}
