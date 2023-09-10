package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverSingleTone {

    private static ThreadLocal<DriverSingleTone> instance = new ThreadLocal<>();

    private static WebDriver driver;

    private DriverSingleTone() {
        driver = WebDriverFactory.getWebDriver();
    }

    public static synchronized DriverSingleTone getInstance() {
        if (instance.get() == null) {
            instance.set(new DriverSingleTone());
        }
        return instance.get();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void closeDriver() {
        try {
            driver.quit();
            driver = null;
        } finally {
            instance.remove();
        }
    }
}
