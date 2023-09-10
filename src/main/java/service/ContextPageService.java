package service;

import driver.DriverSingleTone;
import org.openqa.selenium.interactions.Actions;
import page.ContextPage;

public class ContextPageService {

    private ContextPage contextPage;

    public void contextClick() {
        contextPage = new ContextPage();
        Actions actions = new Actions(DriverSingleTone.getInstance().getDriver());
        actions.contextClick(contextPage.getContextButton()).perform();
    }

    public String getTextFromAlert() {
        return DriverSingleTone.getInstance().getDriver().switchTo().alert().getText();
    }
}
