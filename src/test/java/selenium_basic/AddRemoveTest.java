package selenium_basic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;
import utils.Constants;

public class AddRemoveTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify Element addition and removing")
    public void verifyElementAdditionAndRemoving() {
        mainPageService.clickPageLinkElementByName("Add/Remove Elements");

        findElement(Constants.ADD_ELEMENT_BUTTON_LOCATOR).click();
        findElement(Constants.ADD_ELEMENT_BUTTON_LOCATOR).click();

        int expectedSizeAfterElementsAddition = 2;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(findElements(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).size(),
                expectedSizeAfterElementsAddition);

        int expectedSizeAfterElementRemoving = 1;
        findElement(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).click();
        softAssert.assertEquals(findElements(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).size(),
                expectedSizeAfterElementRemoving, "Length of list with buttons = '"
                        + findElements(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).size() + "', should be: "
                        + expectedSizeAfterElementRemoving);
        softAssert.assertAll();
    }
}
