@Herokuapp_TestAlerts
Feature: Test Alerts
  This is to test Alerts

  @Herokuapp_TestAlerts_RegularAlert
  Scenario: Handle Regular Alert
    Given Launch Herokuapp Alerts page
    Then User is able to handle Regular alert

  @Herokuapp_TestAlerts_ConfirmAlert
  Scenario: Handle Confirm Alert
    Given Launch Herokuapp Alerts page
    Then User is able to handle Confirm alert

  @Herokuapp_TestAlerts_PromptAlert
  Scenario: Handle Prompt Alert
    Given Launch Herokuapp Alerts page
    Then User is able to handle Prompt alert
