package service;

import page.FramePage;

public class FramePageService {

    private FramePage framesPage;

    public String getIframeText() {
        framesPage = new FramePage();
        return framesPage
                .switchToIframe()
                .getParagraph().getText();
    }

    public FramePageService clickIframeLink() {
        framesPage = new FramePage();
        framesPage.clickIframeLink();
        return this;
    }
}
