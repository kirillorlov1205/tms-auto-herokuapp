package selenium_advanced;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.MainPage;
import selenium_basic.BaseTest;
import service.FramePageService;

public class FramePageTest extends BaseTest {

    private FramePageService framePageService;

    @BeforeClass
    public void setup() {
        framePageService = new FramePageService();
    }

    @Test(testName = "Verify iframe text")
    public void verifyIframeText() {
        MainPage.getPageLinkElementByName("Frames").click();
        String actualIframeText = framePageService
                .clickIframeLink()
                .getIframeText();
        String expectedIframeText = "Your content goes here.";
        Assert.assertEquals(actualIframeText, expectedIframeText, "Iframe text doesn't match expected");
    }
}
