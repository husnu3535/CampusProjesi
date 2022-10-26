Feature: Add - Edit - Delete Departments under School Setup

Background:
  Given Navigate to basqar
  When Enter username and password and click login button
  Then User should login successfuly

  Scenario: Add Departments to School Setup
    Given  Clicking on the Setup, School Setup, Departments options from the menu categories
    When   Add to Departments
    Then   Confirmation of successfully

    Scenario: Edit Departments to School Setup
      Given Clicking on the Setup, School Setup, Departments options from the menu categories
      When  Edit to Departments
      Then  Confirmation of successfully

    Scenario: Delete Departments to School Setup
      Given Clicking on the Setup, School Setup, Departments options from the menu categories
      When  Delete to Departments
      Then  Confirmation of successfully






