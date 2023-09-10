package page;

import Utils.Waiter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DynamicControlsPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> checkboxesList;

    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    private WebElement removeCheckboxButton;

    @FindBy(xpath = "//form[@id='checkbox-example']/p[@id='message']")
    private WebElement checkboxStatusMessage;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement input;

    @FindBy(xpath = "//button[contains(text(),'Enable')]")
    private WebElement enableInputButton;

    @FindBy(xpath = "//form[@id='input-example']/p[@id='message']")
    private WebElement inputStatusMessage;

    public DynamicControlsPage clickRemoveCheckboxButton() {
        removeCheckboxButton.click();
        return this;
    }

    public WebElement getCheckboxStatusMessageText() {
        return Waiter.waitElementToBeDisplayed(checkboxStatusMessage);
    }

    public List<WebElement> getCheckbox() {
        return checkboxesList;
    }

    public WebElement getInput() {
        return input;
    }

    public DynamicControlsPage clickEnableInputButton() {
        enableInputButton.click();
        return this;
    }

    public WebElement getInputStatusMessage() {
        return Waiter.waitElementToBeDisplayed(inputStatusMessage);
    }
}
