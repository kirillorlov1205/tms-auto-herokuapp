package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.MainPageService;
import utils.Constants;

public class TyposTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify text spelling")
    public void verifyTextSpelling() {
        mainPageService.clickPageLinkElementByName("Typos");
        String pageText = findElement(Constants.PARAGRAPH_LOCATOR).getText().trim();
        Assert.assertEquals(pageText, Constants.PARAGRAPH, "Paragraph has mistakes");
    }
}
