package page;

import Utils.Waiter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkbox;

    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    WebElement removeCheckboxButton;

    @FindBy(xpath = "//form[@id='checkbox-example']/p[@id='message']")
    WebElement checkboxStatusMessage;

    @FindBy(xpath = "//input[@type='text']")
    WebElement input;

    @FindBy(xpath = "//button[contains(text(),'Enable')]")
    WebElement enableInputButton;

    @FindBy(xpath = "//form[@id='input-example']/p[@id='message']")
    WebElement inputStatusMessage;

    public DynamicControlsPage clickRemoveCheckboxButton() {
        removeCheckboxButton.click();
        return this;
    }

    public WebElement getCheckboxStatusMessageText() {
        return Waiter.waitElementToBeDisplayed(checkboxStatusMessage);
    }

    public WebElement getCheckbox() {
        return checkbox;
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
