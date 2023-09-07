package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement fileInput;

    @FindBy(xpath = "//input[@class='button']")
    WebElement submitButton;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    WebElement uploadedFile;

    public FileUploadPage sendFileToFileInputByFilePath(String filePath) {
        fileInput.sendKeys(filePath);
        return this;
    }

    public FileUploadPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    public WebElement getUploadedFile() {
        return uploadedFile;
    }
}
