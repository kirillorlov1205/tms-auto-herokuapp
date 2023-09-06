package specs;

import Utils.Support;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.Constants;

public class AddRemoveTest extends BaseTest {

    @Test(testName = "Verify Element addition and removing")
    public void verifyElementAdditionAndRemoving() {
        Support.getPageLinkElementByName("Add/Remove Elements").click();

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
