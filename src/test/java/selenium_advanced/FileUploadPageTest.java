package selenium_advanced;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium_basic.BaseTest;
import service.FileUploadPageService;
import service.MainPageService;

public class FileUploadPageTest extends BaseTest {

    private FileUploadPageService fileUploadPageService;
    private MainPageService mainPageService;

    @BeforeClass
    public void setup() {
        fileUploadPageService = new FileUploadPageService();
        mainPageService = new MainPageService();
    }

    @Test(testName = "Verify file uploading")
    public void verifyFileUploading() {
        mainPageService.clickPageLinkElementByName("File Upload");
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
