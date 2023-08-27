package specs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

public class AddRemoveTest extends BaseSetUp {

    @Test(testName = "Verify Element addition and removing")
    public void verifyElementAdditionAndRemoving() {
        Utilities.getPageLinkElementByName("Add/Remove Elements").click();

        Driver.findElementByLocator(Constants.ADD_ELEMENT_BUTTON_LOCATOR).click();
        Driver.findElementByLocator(Constants.ADD_ELEMENT_BUTTON_LOCATOR).click();

        int expectedSizeAfterElementsAddition = 2;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Driver.findElementsByLocator(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).size(),
                expectedSizeAfterElementsAddition);

        int expectedSizeAfterElementRemoving = 1;
        Driver.findElementByLocator(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).click();
        softAssert.assertEquals(Driver.findElementsByLocator(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).size(),
                expectedSizeAfterElementRemoving,
                "Length of list with buttons = '" + Driver.findElementsByLocator(Constants.REMOVE_ELEMENT_BUTTON_LOCATOR).size()
                        + "', should be: " + expectedSizeAfterElementRemoving);
        softAssert.assertAll();
    }
}
