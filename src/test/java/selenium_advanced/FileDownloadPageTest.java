package selenium_advanced;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium_basic.BaseTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadPageTest extends BaseTest {

    private static String BASE_URL = "http://the-internet.herokuapp.com";

    @Test(testName = "Verify file downloading")
    public void verifyFileDownloading() throws InterruptedException {
        DriverSingleTone.getInstance().getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DriverSingleTone.getInstance().getDriver().get(BASE_URL + "/download");
        String fileToDownloadName = "test-file.txt";
        DriverSingleTone.getInstance().getDriver().findElement(By.xpath(String.format("//*[text()='%s']",
                fileToDownloadName))).click();
        Thread.sleep(2000);
        File folder = new File("C:\\Users\\Kiryl.Arlou\\Downloads");
        File[] files = folder.listFiles();
        boolean found = false;
        File file = null;
        for (File fileItem : files) {
            if (fileItem.isFile()) {
                String fileName = fileItem.getName();
                System.out.println("File " + fileItem.getName());
                if (fileName.matches(fileToDownloadName)) {
                    file = new File(fileName);
                    found = true;
                }
            }
        }
        try {
            Assert.assertTrue(found, "Downloaded document is not found");
        } finally {
            file.deleteOnExit();
        }
    }
}
