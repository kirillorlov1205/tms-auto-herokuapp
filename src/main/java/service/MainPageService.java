package service;

import driver.DriverSingleTone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.MainPage;

public class MainPageService {

    private MainPage mainPage;

    public WebElement getPageLinkElementByName(String name) {
        mainPage = new MainPage();
        return DriverSingleTone.getInstance().getDriver().findElement(
                By.xpath("//a[text()='" + name + "']"));
    }
}
