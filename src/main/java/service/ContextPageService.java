package service;

import page.ContextPage;

public class ContextPageService {

    private ContextPage contextPage;

    public void contextClick() {
        contextPage = new ContextPage();
        contextPage.contextClickButton();
    }

    public String getTextFromAlert() {
        return contextPage.getTextFromAlert();
    }
}
