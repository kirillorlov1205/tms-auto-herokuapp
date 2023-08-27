package specs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import support.BaseSetUp;
import support.Driver;
import support.Utilities;

import java.util.List;

public class SortableDataTablesTest extends BaseSetUp {

    @Test(testName = "Verify last name column")
    public void verifyLastNameColumn() {
        Utilities.getPageLinkElementByName("Sortable Data Tables").click();
        SoftAssert softAssert = new SoftAssert();

        List<String> namesList = List.of("Smith", "Bach", "Doe", "Conway");
        List<WebElement> namesInTableList = Driver.findElementsByLocator(By.xpath("//td[@class='last-name']"));

        for (int i = 0; i < namesInTableList.size(); i++) {
            String nameInTable = namesInTableList.get(i).getText();
            softAssert.assertEquals(nameInTable, namesList.get(i)
                    , "Actual name: '" + nameInTable + "' / Expected name: '" + namesList.get(i) + "'"
            );
        }
        softAssert.assertAll();
    }
}
