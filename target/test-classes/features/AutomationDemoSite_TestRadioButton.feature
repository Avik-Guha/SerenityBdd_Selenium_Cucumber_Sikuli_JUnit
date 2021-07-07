@AutomationDemoSite_TestRadioButton
Feature: Test Radio Button
  This is to test Radio Button

  @AutomationDemoSite_TestRadioButton_CheckRadioButton
  Scenario: Verify User is able to check Radio Button
    Given Launch Automation Demo Site Register page
    When User checks on "Male" radio button in Register page
    When User checks on "FeMale" radio button in Register page
    