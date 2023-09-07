package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.Constants;
import page.MainPage;

public class TyposTest extends BaseTest{

    @Test(testName = "Verify text spelling")
    public void verifyTextSpelling() {
        MainPage.getPageLinkElementByName("Typos").click();
        String pageText = findElement(Constants.PARAGRAPH_LOCATOR).getText().trim();
        Assert.assertEquals(pageText, Constants.PARAGRAPH, "Paragraph has mistakes");
    }
}
