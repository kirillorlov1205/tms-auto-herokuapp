package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--incognito", "--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    public static WebElement findElementByLocator(By locator) {
        return driver.findElement(locator);
    }

    public static List<WebElement> findElementsByLocator(By locator) {
        return driver.findElements(locator);
    }
}
