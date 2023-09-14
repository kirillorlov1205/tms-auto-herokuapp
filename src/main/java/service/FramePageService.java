package service;

import page.FramePage;

public class FramePageService {

    private FramePage framesPage;

    public String getIframeText() {
        framesPage = new FramePage();
        return framesPage.getIframeText();
    }

    public FramePageService clickIframeLink() {
        framesPage = new FramePage();
        framesPage.clickIframeLink();
        return this;
    }
}
