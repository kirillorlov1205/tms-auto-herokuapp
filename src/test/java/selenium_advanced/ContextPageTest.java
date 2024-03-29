package selenium_advanced;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium_basic.BaseTest;
import service.ContextPageService;
import service.MainPageService;

public class ContextPageTest extends BaseTest {

    private ContextPageService contextMenuPageService;
    private MainPageService mainPageService;

    @BeforeClass
    private void setup() {
        contextMenuPageService = new ContextPageService();
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify alert text")
    public void verifyAlertText() {
        mainPageService.clickPageLinkElementByName("Context Menu");
        contextMenuPageService.contextClick();

        String actualAlertText = contextMenuPageService.getTextFromAlert();
        String expectedAlertText = "You selected a context menu";
        Assert.assertEquals(actualAlertText, expectedAlertText, "Alert message doesn't match expected");
    }
}
