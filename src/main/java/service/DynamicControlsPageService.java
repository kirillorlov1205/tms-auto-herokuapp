package service;

import page.DynamicControlsPage;

public class DynamicControlsPageService {

    private DynamicControlsPage dynamicControlsPage;

    public DynamicControlsPageService clickEnableInputButton() {
        dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.clickEnableInputButton();
        return this;
    }

    public String getCheckboxStatusMessageText() {
        return dynamicControlsPage.getCheckboxStatusMessageText();
    }

    public DynamicControlsPageService clickRemoveCheckboxButton() {
        dynamicControlsPage = new DynamicControlsPage();
        dynamicControlsPage.clickRemoveCheckboxButton();
        return this;
    }

    public boolean isCheckboxListEmpty() {
        return dynamicControlsPage.isCheckboxListEmpty();
    }

    public boolean isInputEnabled() {
        return dynamicControlsPage.isInputEnabled();
    }

    public String getInputStatusMessageText() {
        return dynamicControlsPage.getInputStatusMessageText();
    }
}
