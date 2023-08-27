package specs;

import org.testng.Assert;
import org.testng.annotations.Test;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

public class NotificationMessageTest extends BaseSetUp {

    @Test(testName = "Verify notification message")
    public void verifyNotificationMessage() {
        Utilities.getPageLinkElementByName("Notification Messages").click();
        Driver.findElementByLocator(Constants.INVOKE_NOTIFICATION_MESSAGE_BUTTON_LOCATOR).click();

        String message = Driver.findElementByLocator(Constants.NOTIFICATION_MESSAGE_LOCATOR).getText();
        Assert.assertTrue(message.contains("Action successful"),
                "Message is: '" + message + "'"
        );
    }
}
