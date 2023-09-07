package service;

import org.openqa.selenium.WebElement;
import page.DynamicControlsPage;

public class DynamicControlsPageService {

    DynamicControlsPage dynamicControlsPage;

    public String getCheckboxStatusMessageText() {
        dynamicControlsPage = new DynamicControlsPage();
        return dynamicControlsPage.getCheckboxStatusMessageText().getText();
    }

    public DynamicControlsPageService clickRemoveCheckboxButton() {
        dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.clickRemoveCheckboxButton();
        return this;
    }

    public WebElement getCheckbox() {
        dynamicControlsPage = new DynamicControlsPage();
        return dynamicControlsPage.getCheckbox();
    }

    public WebElement getInput() {
        dynamicControlsPage = new DynamicControlsPage();
        return dynamicControlsPage.getInput();
    }

    public DynamicControlsPageService clickEnableInputButton() {
        dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.clickEnableInputButton();
        return this;
    }

    public String getInputStatusMessageText() {
        dynamicControlsPage = new DynamicControlsPage();
        return dynamicControlsPage.getInputStatusMessage().getText();
    }
}
