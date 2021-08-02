Feature: User should be able to add items to Checklist
  User story:
  As a user, I should be able to assign tasks by clicking on Task tab.

  @add_to_checklist
  Scenario Outline: User can click on "Checklist" to create checklist items
    Given user is logged in
    When user navigates to Tasks
    And clicks on Add
    And enters "<to-do item>"
    And clicks "<button>" button
    Then user should see "<to-do item>" in checklist
    Examples:
      | to-do item    | button    |
      | buy groceries | checkmark |
      | learn java    | add       |