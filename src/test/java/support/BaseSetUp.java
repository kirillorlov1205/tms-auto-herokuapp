package support;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import support.Driver;

public class BaseSetUp {

    @BeforeMethod
    public void beforeMethod() {
        Driver.openUrl("http://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void afterClass() {
//        Driver.getDriver().quit();
    }
}
