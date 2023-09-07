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
        String actualFileName = fileUploadPageService
                .sendFileToFileInputByFilePath("C:\\Users\\Kiryl.Arlou\\IdeaProjects\\tms-auto-herokuapp\\src\\test" +
                        "\\resources\\testFile")
                .clickSubmitButton()
                .getUploadedFileText();
        String expectedFileName = "testFile";
        Assert.assertEquals(actualFileName, expectedFileName, "File name doesn't match expected");
    }
}
