package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;

import java.util.List;

public class SortableDataTablesTest extends BaseTest {

    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify last name column")
    public void verifyLastNameColumn() {
        mainPageService.clickPageLinkElementByName("Sortable Data Tables");
        SoftAssert softAssert = new SoftAssert();

        List<String> namesList = List.of("Smith", "Bach", "Doe", "Conway");
        List<WebElement> namesInTableList = findElements(By.xpath("//td[@class='last-name']"));

        for (int i = 0; i < namesInTableList.size(); i++) {
            String nameInTable = namesInTableList.get(i).getText();
            softAssert.assertEquals(nameInTable, namesList.get(i)
                    , "Actual name: '" + nameInTable + "' / Expected name: '" + namesList.get(i) + "'"
            );
        }
        softAssert.assertAll();
    }
}
