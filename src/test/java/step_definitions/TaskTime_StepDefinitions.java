package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TaskTimePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TaskTime_StepDefinitions {
    TaskTimePage taskTimePage = new TaskTimePage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        String url = ConfigurationReader.getProperty("nextBaseUrl");
        Driver.getDriver().get(url);
        taskTimePage.LogInToNextBase();
    }

    @When("user navigates to Calendar button and click on it")
    public void user_navigates_to_calendar_button_and_click_on_it() {
        taskTimePage.calendarButton.click();
    }

    @When("clicks on dropdown box on the right side from Add button")
    public void clicks_on_dropdown_box_on_the_right_side_from_add_button() {
        taskTimePage.addBox.click();
        BrowserUtils.sleep(2);
    }

    @When("clicks on New task box")
    public void clicks_on_new_task_box() {
        taskTimePage.newTaskBox.click();
    }

    @When("click on Time planing button")
    public void click_on_time_planing_button() {
        taskTimePage.SwitchToIframe();
        taskTimePage.setTimeBox.click();
    }

    @When("click on Start task on box")
    public void click_on_start_task_on_box() {
        taskTimePage.startTaskOn.click();
    }
    @And("click on the preferred start date in calendar")
    public void clickOnThePreferredStartDateInCalendar() {
        taskTimePage.startDate.click();
    }

    @And("enter preferred start time in Time line")
    public void enterPreferredStartTimeInTimeLine() {
        taskTimePage.setTimeBox.click();
        taskTimePage.setStartHours.sendKeys("Enter preferred hour");
        taskTimePage.setStartMinutes.sendKeys("Enter preferred minutes");
        taskTimePage.setStartAMorPM.click();
        taskTimePage.startSelectButton.click();
    }

    @When("click on Finish box")
    public void click_on_finish_box() {
        taskTimePage.finishBox.click();
    }

    @And("click on the preferred end date in calendar")
    public void clickOnThePreferredEndDateInCalendar() {
        taskTimePage.endDate.click();
    }

    @And("enter preferred end time in Time line")
    public void enterPreferredEndTimeInTimeLine() {
        taskTimePage.setEndHours.sendKeys("Enter preferred hour");
        taskTimePage.setEndMinutes.sendKeys("Enter preferred minutes");
        taskTimePage.setEndAMorPM.click();
        taskTimePage.endSelectButton.click();
    }

    @Then("user should see preferred Start and Finish date/time, and Duration in hours")
    public void userShouldSeePreferredStartAndFinishDateTimeAndDurationInHours() {
    }





}
