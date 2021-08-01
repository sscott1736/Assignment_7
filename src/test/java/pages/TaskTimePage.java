package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TaskTimePage {
    public TaskTimePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//input[@name='USER_LOGIN']")
    public WebElement inputUsername;

    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id='bx_left_menu_menu_calendar']/a/span[1]")
    public WebElement calendarButton;

    @FindBy(xpath="//span[@class='ui-btn-extra']")
    public WebElement addBox;

    @FindBy(xpath="(//span[@class='menu-popup-item-text'])[2]")
    public WebElement newTaskBox;

    @FindBy(xpath="//span[contains(text(),'Time planning')]")
    public WebElement setTimeBox;

    @FindBy(xpath="//*[@id='task-form-bitrix_tasks_task_default_1']" +
            "/div[3]/div[2]/div/div[2]/div[1]/div/div[2]/span/input[1]")
    public WebElement startTaskOn;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']" +
            "/div/div[3]/div/div[3]/a[2]")
    public WebElement startDate;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']" +
            "/div/div[4]/div/span[2]/input[1]")
    public WebElement setStartHours;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[4]/div/span[2]/input[2]")
    public WebElement setStartMinutes;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[4]/div/span[2]/span[4]/span[1]")
    public WebElement setStartAMorPM;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[5]/a[1]/span[2]")
    public WebElement startSelectButton;

    @FindBy(xpath="//*[@id='task-form-bitrix_tasks_task_default_1']/div[3]/div[2]/div/div[2]/div[1]/div/div[4]/span/input[1]")
    public WebElement finishBox;

    @FindBy(xpath="///*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[3]/div/div[4]/a[5]")
    public WebElement endDate;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[4]/div/span[2]/input[1]")
    public WebElement setEndHours;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[4]/div/span[2]/input[2]")
    public WebElement setEndMinutes;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[4]/div/span[2]/span[4]/span[1]")
    public WebElement setEndAMorPM;

    @FindBy(xpath="//*[@id='popup-window-content-calendar_popup_0.1697537335274404']/div/div[5]/a[1]/span[2]")
    public WebElement endSelectButton;

    public void SwitchToIframe() {
        Driver.getDriver().switchTo().frame("iframe_qbtcwvispm");
    }

    public void LogInToNextBase() {
        inputUsername.sendKeys("helpdesk10@cybertekschool.com");
        inputPassword.sendKeys("UserUser");
        loginButton.click();
    }
}

