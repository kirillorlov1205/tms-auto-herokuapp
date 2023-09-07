package page;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    static public WebElement getPageLinkElementByName(String name) {
        return DriverSingleTone.getInstance().getDriver().findElement(
                By.xpath("//a[text()='" + name + "']"));
    }
}
