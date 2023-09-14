package service;

import page.MainPage;

public class MainPageService {

    private MainPage mainPage;

    public void clickPageLinkElementByName(String name) {
        mainPage = new MainPage();
        mainPage.clickPageLinkElementByName(name);
    }
}
