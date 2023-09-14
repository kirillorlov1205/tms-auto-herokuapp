package page;

import driver.DriverSingleTone;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextPage extends BasePage {

    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement contextButton;

    public void contextClickButton() {
        Actions actions = new Actions(DriverSingleTone.getInstance().getDriver());
        actions.contextClick(contextButton).perform();
    }
}
