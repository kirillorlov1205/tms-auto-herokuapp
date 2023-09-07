package selenium_basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.Constants;
import page.MainPage;

public class NotificationMessageTest extends BaseTest {

    @Test(testName = "Verify notification message")
    public void verifyNotificationMessage() {
        MainPage.getPageLinkElementByName("Notification Messages").click();
        findElement(Constants.INVOKE_NOTIFICATION_MESSAGE_BUTTON_LOCATOR).click();

        String message = findElement(Constants.NOTIFICATION_MESSAGE_LOCATOR).getText();
        Assert.assertTrue(message.contains("Action successful"),
                "Message is: '" + message + "'"
        );
    }
}
