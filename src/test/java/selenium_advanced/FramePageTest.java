package selenium_advanced;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium_basic.BaseTest;
import service.FramePageService;
import service.MainPageService;

public class FramePageTest extends BaseTest {

    private FramePageService framePageService;
    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        framePageService = new FramePageService();
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify iframe text")
    public void verifyIframeText() {
        mainPageService.clickPageLinkElementByName("Frames");
        String actualIframeText = framePageService
                .clickIframeLink()
                .getIframeText();
        String expectedIframeText = "Your content goes here.";
        Assert.assertEquals(actualIframeText, expectedIframeText, "Iframe text doesn't match expected");
    }
}
