package support;

import org.openqa.selenium.By;

public class Constants {

    //    Add/Remove element page
    public static final By ADD_ELEMENT_BUTTON_LOCATOR = By.xpath("//button[text()='Add Element']");
    public static final By REMOVE_ELEMENT_BUTTON_LOCATOR = By.xpath("//button[text()='Delete']");

    //    Checkboxes
    public static final By FIRST_CHECKBOX_LOCATOR = By.xpath("//input[@type='checkbox'][1]");
    public static final By SECOND_CHECKBOX_LOCATOR = By.xpath("//input[@type='checkbox'][2]");

    //    Inputs
    public static final By INPUT_FIELD_LOCATOR = By.xpath("//input[@type='number']");

    //    Typos
    public static final By TEXT_LOCATOR = By.xpath("//p");
    public static final By PROFILE_LOCATOR = By.xpath("//div[@class='figure']");
    public static final By PROFILE_NAME_LOCATOR = By.xpath("//h5");

//    Notification Messages
    public static final By NOTIFICATION_MESSAGE_LOCATOR = By.xpath("//div[@class='flash notice']");
    public static final By INVOKE_NOTIFICATION_MESSAGE_BUTTON_LOCATOR = By.xpath("//a[@href='/notification_message']");
}
