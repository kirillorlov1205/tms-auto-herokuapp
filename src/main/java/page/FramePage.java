package page;

import driver.DriverSingleTone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement iframeLink;

    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    WebElement iframe;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    WebElement uploadedFile;

    @FindBy(xpath = "//p")
    WebElement paragraph;

    public FramePage switchToIframe() {
        DriverSingleTone.getInstance().getDriver().switchTo().frame(iframe);
        return this;
    }

    public WebElement getParagraph() {
        return paragraph;
    }

    public WebElement getUploadedFile() {
        return uploadedFile;
    }

    public FramePage clickIframeLink() {
        iframeLink.click();
        return this;
    }
}
