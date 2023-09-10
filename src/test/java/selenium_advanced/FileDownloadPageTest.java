package selenium_advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import selenium_basic.BaseTest;

import java.io.File;

public class FileDownloadPageTest extends BaseTest {

    @Test(testName = "Verify file downloading")
    public void verifyFileDownloading() throws InterruptedException {
        MainPage.getPageLinkElementByName("File Download").click();
        WebElement fileLink = findElement(By.xpath("//a[contains(text(),'trip.txt')]"));
        fileLink.click();
        Thread.sleep(1500);
        String filePath = System.getProperty("user.dir") + "Downloads";

        File folder = new File(System.getProperty(filePath));
//List the files on that folder
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        //Look for the file in the files
        // You should write smart REGEX according to the filename
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                if (fileName.matches("trip.txt")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        Assert.assertTrue(found, "Downloaded document is not found");
        f.deleteOnExit();
    }
}
