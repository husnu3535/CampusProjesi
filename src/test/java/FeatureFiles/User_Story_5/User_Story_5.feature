Feature: Add - Edit - Delete Positions under Human Resources Setup

Background:
  Given Navigate to basqar
  When Enter username and password and click login button
  Then User should login successfuly

  Scenario: Add Positions to Human Resources
    Given  Clicking on the Setup, Human Resources, Positions options from the menu categories
    When   Add to Position
    Then   Confirmation of successfully

    Scenario: Edit Positions to Human Resources
      Given  Clicking on the Setup, Human Resources, Positions options from the menu categories
      When   Edit to Positions
      Then   Confirmation of successfully

      Scenario: Delete Positions to Human Resources
        Given Clicking on the Setup, Human Resources, Positions options from the menu categories
        When  Delete to Positions
        Then  Confirmation of successfully

