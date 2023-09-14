package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement fileInput;

    @FindBy(xpath = "//input[@class='button']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement uploadedFile;

    public FileUploadPage sendFileToFileInputByFilePath(String filePath) {
        fileInput.sendKeys(filePath);
        return this;
    }

    public FileUploadPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public String getUploadedFileText() {
        return uploadedFile.getText();
    }
}
