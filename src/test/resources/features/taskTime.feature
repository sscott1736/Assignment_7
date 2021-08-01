Feature: Configuring Task time frame
   User story:
   As a user, I should be able to assign tasks by clicking on Task tab.

@wip
Scenario: Configuring Task time frame
Given user is logged in
When user navigates to Calendar button and click on it
And clicks on dropdown box on the right side from Add button
And clicks on New task box
And click on Time planing button
And click on Start task on box
And click on the preferred start date in calendar
And enter preferred start time in Time line
And click on Finish box
And click on the preferred end date in calendar
And enter preferred end time in Time line
Then user should see preferred Start and Finish date/time, and Duration in hours