package selenium_advanced;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium_basic.BaseTest;
import service.DynamicControlsPageService;
import service.MainPageService;

public class DynamicControlsPageTest extends BaseTest {

    DynamicControlsPageService dynamicControlsPageService;
    MainPageService mainPageService;

    @BeforeClass
    private void setup() {
        dynamicControlsPageService = new DynamicControlsPageService();
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify checkbox removing")
    public void verifyCheckboxRemoving() {
        SoftAssert softAssert = new SoftAssert();
        mainPageService.getPageLinkElementByName("Dynamic Controls").click();
        dynamicControlsPageService.clickRemoveCheckboxButton();

        String actualMessage = dynamicControlsPageService.getCheckboxStatusMessageText();
        String expectedMessage = "It's gone!";
        softAssert.assertEquals(actualMessage, expectedMessage, "Actual message doesn't match expected");

//TBD        no such element: Unable to locate element: {"method":"xpath","selector":"//input[@type='checkbox']"}
        softAssert.assertFalse(dynamicControlsPageService.getCheckbox().isDisplayed());
        softAssert.assertAll();
    }

    @Test(testName = "Verify input activation")
    public void verifyInputActivation() {
        SoftAssert softAssert = new SoftAssert();
        mainPageService.getPageLinkElementByName("Dynamic Controls").click();
        dynamicControlsPageService.clickEnableInputButton();
        softAssert.assertFalse(dynamicControlsPageService.getInput().isEnabled());

        String actualMessage = dynamicControlsPageService.clickEnableInputButton().getInputStatusMessageText();
        String expectedMessage = "It's enabled!";
        softAssert.assertEquals(actualMessage, expectedMessage, "Actual message doesn't match expected");
        softAssert.assertTrue(dynamicControlsPageService.getInput().isEnabled());
        softAssert.assertAll();
    }
}
