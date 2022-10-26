Feature: Add - Edit - Delete Bank Accounts under Parameters Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Add Bank Accounts to Parameters
    Given  Clicking on the Setup, Parameters, Bank Accounts options from the menu categories
    When   Add to Bank Accounts
    Then   Confirmation of successfully

  Scenario: Edit Bank Accounts to Parameters
    Given Clicking on the Setup, Parameters, Bank Accounts options from the menu categories
    When  Edit to Bank Accounts
    Then  Confirmation of successfully

  Scenario: Delete Bank Accounts to Parameters
    Given Clicking on the Setup, Parameters, Bank Accounts options from the menu categories
    When  Delete to Bank Accounts
    Then  Confirmation of successfully

