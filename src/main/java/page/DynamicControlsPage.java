package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

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

    public String getCheckboxStatusMessageText() {
        return Waiter.waitElementToBeDisplayed(checkboxStatusMessage).getText();
    }

    public boolean isCheckboxListEmpty() {
        return checkboxesList.isEmpty();
    }

    public boolean isInputEnabled() {
        return input.isEnabled();
    }

    public DynamicControlsPage clickEnableInputButton() {
        enableInputButton.click();
        return this;
    }

    public String getInputStatusMessageText() {
        return Waiter.waitElementToBeDisplayed(inputStatusMessage).getText();
    }
}
