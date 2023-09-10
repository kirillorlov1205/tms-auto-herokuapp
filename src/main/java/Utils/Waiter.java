package Utils;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    public final static int WAIT_2_SECONDS = 2;
    public final static int WAIT_5_SECONDS = 5;
    public final static int WAIT_10_SECONDS = 10;
    public final static int WAIT_500_SECONDS = 500;

    private Waiter() {
    }

    public static WebElement waitElementToBeDisplayedByLocator(By locator) {
        new WebDriverWait(DriverSingleTone.getInstance().getDriver(), Duration.ofSeconds(WAIT_5_SECONDS))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
        return DriverSingleTone.getInstance().getDriver().findElement(locator);
    }

    public static WebElement waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(DriverSingleTone.getInstance().getDriver(), Duration.ofSeconds(WAIT_5_SECONDS))
                .until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
