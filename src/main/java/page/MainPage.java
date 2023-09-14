package page;

import driver.DriverSingleTone;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    public void clickPageLinkElementByName(String name) {
        DriverSingleTone.getInstance().getDriver().findElement(By.xpath("//a[text()='" + name
                + "']")).click();
    }
}
