package selenium_basic;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        openPage("http://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void afterClass() {
        DriverSingleTone.getInstance().getDriver().quit();
    }

    public static WebElement findElement(By locator) {
        return DriverSingleTone.getInstance().getDriver().findElement(locator);
    }

    public static List<WebElement> findElements(By locator) {
        return DriverSingleTone.getInstance().getDriver().findElements(locator);
    }

    public static void openPage(String url) {
        DriverSingleTone.getInstance().getDriver().get(url);
    }
}
