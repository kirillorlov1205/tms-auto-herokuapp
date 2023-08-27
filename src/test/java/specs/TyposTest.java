package specs;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import support.BaseSetUp;
import support.Constants;
import support.Driver;
import support.Utilities;

import java.util.List;

public class TyposTest extends BaseSetUp {

    @Test(testName = "Verify text spelling")
    public void verifyTextSpelling() {
        Utilities.getPageLinkElementByName("Typos").click();
        List<WebElement> list = Driver.findElementsByLocator(Constants.TEXT_LOCATOR);
        Assert.assertTrue(list.get(1).getText().contains("won't"),
                "Paragraph doesn't have 'won't' word");
    }
}
