Feature: Add - Edit - Delete School Locations under School Setup

Background:
  Given Navigate to basqar
  When Enter username and password and click login button
  Then User should login successfuly

  Scenario: Add School Locations to School Setup
    Given  Clicking on the Setup, School Setup, School Locations options from the menu categories
    When   Add to School Locations
    Then   Confirmation of successfully

    Scenario: Edit School Locations to School Setup
      Given Clicking on the Setup, School Setup, School Locations options from the menu categories
      When  Edit to School Locations
      Then  Confirmation of successfully

      Scenario: Delete School Locations to School Setup
        Given Clicking on the Setup, School Setup, School Locations options from the menu categories
        When  Delete to School Locations
        Then  Confirmation of successfully




