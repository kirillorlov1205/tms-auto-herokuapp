package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextPage extends BasePage {

    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement contextButton;

    public WebElement getContextButton() {
        return contextButton;
    }
}
