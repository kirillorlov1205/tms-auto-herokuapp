package selenium_advanced;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.MainPage;
import selenium_basic.BaseTest;
import service.FileUploadPageService;

public class FileUploadPageTest extends BaseTest {

    private FileUploadPageService fileUploadPageService;

    @BeforeClass
    public void setup() {
        fileUploadPageService = new FileUploadPageService();
    }

    @Test(testName = "Verify file uploading")
    public void verifyFileUploading() {
        MainPage.getPageLinkElementByName("File Upload").click();
        String fileName = "testFile";
        String filePath = System.getProperty("user.dir") + "/src/test/resources/" + fileName;
        String actualFileName = fileUploadPageService
                .sendFileToFileInputByFilePath(filePath)
                .clickSubmitButton()
                .getUploadedFileText();
        String expectedFileName = fileName;
        Assert.assertEquals(actualFileName, expectedFileName, "File name doesn't match expected");
    }
}
