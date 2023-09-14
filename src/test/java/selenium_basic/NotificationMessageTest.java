package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.MainPageService;
import utils.Constants;

public class NotificationMessageTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify notification message")
    public void verifyNotificationMessage() {
        mainPageService.clickPageLinkElementByName("Notification Messages");
        findElement(Constants.INVOKE_NOTIFICATION_MESSAGE_BUTTON_LOCATOR).click();

        String message = findElement(Constants.NOTIFICATION_MESSAGE_LOCATOR).getText();
        Assert.assertTrue(message.contains("Action successful"),
                "Message is: '" + message + "'"
        );
    }
}
