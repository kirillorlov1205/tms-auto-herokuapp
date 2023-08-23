package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities {

    static public WebElement getPageLinkElementByName(String name) {
        return Driver.findElementByLocator(By.xpath("//a[text()='" + name + "']"));
    }
}
