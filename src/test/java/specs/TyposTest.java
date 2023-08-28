package specs;

import org.testng.Assert;
import org.testng.annotations.Test;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

public class TyposTest extends BaseSetUp {

    @Test(testName = "Verify text spelling")
    public void verifyTextSpelling() {
        Utilities.getPageLinkElementByName("Typos").click();
        String pageText = Driver.findElementByLocator(Constants.PARAGRAPH_LOCATOR).getText().trim();
        Assert.assertEquals(pageText, Constants.PARAGRAPH, "Paragraph has mistakes");
    }
}
