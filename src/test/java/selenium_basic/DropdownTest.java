package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;

import java.util.List;

public class DropdownTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Test
    public void verifyDropdownSelection() {
        mainPageService.clickPageLinkElementByName("Dropdown");
        Select select = new Select(findElement(By.xpath("//select[@id='dropdown']")));
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
