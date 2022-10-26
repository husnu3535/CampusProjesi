Feature: Add - Edit - Delete Attestations under Human Resources Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    Scenario: Add to Attestations to Human Resources
      Given Clicking on the Human resources, Setup, Attestation options from the menu categories
      When  Add to Attestation
      Then  Confirmation of successfully

    Scenario: Edit to Attestation to Human Resources
      Given Clicking on the Human resources, Setup, Attestation options from the menu categories
      When  Edit to Attestation
      Then  Confirmation of successfully

      Scenario: Delete to Attestation to Human Resources
        Given Clicking on the Human resources, Setup, Attestation options from the menu categories
        When  Delete to Attestation
        Then  Confirmation of successfully
