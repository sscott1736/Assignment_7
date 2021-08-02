package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TaskPage;

public class TaskTab_StepDefinitions {

    TaskPage taskPage = new TaskPage();

    @When("user navigates to Tasks")
    public void userNavigatesToTasks() {
        taskPage.taskTab.click();
    }

    @And("clicks on Add")
    public void clicksOnAdd() {
        taskPage.addButton.click();
    }


    @And("enters {string}")
    public void enters(String toDoItem) {
        taskPage.toDoInputBox.sendKeys(toDoItem);
    }

    @And("clicks {string} button")
    public void clicksButton(String button) {
        switch (button) {
            case "checkmark":
                taskPage.checkmarkButton.click();
                break;
            case "add":
                taskPage.addButton.click();
                break;
        }
    }

    @Then("user should see {string} in checklist")
    public void userShouldSeeInChecklist(String expectedToDoItem) {
        String actualAddedToDoItem = taskPage.addedToDoItem.getText().trim();
        Assert.assertEquals(expectedToDoItem, actualAddedToDoItem);
    }


}
