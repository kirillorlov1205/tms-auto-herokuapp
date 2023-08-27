import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.BaseSetUp;
import support.Driver;
import support.Utilities;

import java.util.List;

public class DropdownTest extends BaseSetUp {

    @Test
    public void verifyDropdownSelection() {
        Utilities.getPageLinkElementByName("Dropdown").click();
        Select select = new Select(Driver.findElementByLocator(By.xpath("//select[@id='dropdown']")));
        List<WebElement> optionsList = select.getOptions();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(optionsList.get(0).getText(), "Please select an option",
                "Header of dropdown is incorrect");
        softAssert.assertEquals(optionsList.get(1).getText(), "Option 1", "Option 1 is incorrect");
        softAssert.assertEquals(optionsList.get(2).getText(), "Option 2", "Option 2 is incorrect");

        optionsList.get(1).click();
        select.selectByVisibleText("Option 1");
        softAssert.assertTrue(optionsList.get(1).isSelected(), "Option 1 hasn't been selected");

        optionsList.get(2).click();
        select.selectByVisibleText("Option 2");
        softAssert.assertTrue(optionsList.get(2).isSelected(), "Option 2 hasn't been selected");

        softAssert.assertAll();
    }
}
