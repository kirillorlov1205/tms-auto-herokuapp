package service;

import page.FileUploadPage;

public class FileUploadPageService {

    private FileUploadPage fileUploadPage;

    public FileUploadPageService sendFileToFileInputByFilePath(String filePath) {
        fileUploadPage = new FileUploadPage();
        fileUploadPage.sendFileToFileInputByFilePath(filePath);
        return this;
    }

    public FileUploadPageService clickSubmitButton() {
        fileUploadPage = new FileUploadPage();
        fileUploadPage.clickSubmitButton();
        return this;
    }

    public String getUploadedFileText() {
        fileUploadPage = new FileUploadPage();
        return fileUploadPage.getUploadedFile().getText();
    }
}
