package specs;

import Utils.Support;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.Constants;

public class TyposTest extends BaseTest{

    @Test(testName = "Verify text spelling")
    public void verifyTextSpelling() {
        Support.getPageLinkElementByName("Typos").click();
        String pageText = findElement(Constants.PARAGRAPH_LOCATOR).getText().trim();
        Assert.assertEquals(pageText, Constants.PARAGRAPH, "Paragraph has mistakes");
    }
}
