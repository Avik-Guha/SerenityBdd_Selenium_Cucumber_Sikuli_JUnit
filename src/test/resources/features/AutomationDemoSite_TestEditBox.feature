@AutomationDemoSite_TestEditBox
Feature: Test Edit Box
  This is to test Edit box

  @AutomationDemoSite_TestEditBox_EnterText
  Scenario: Verify User is able to enter text in Edit box
    Given Launch Automation Demo Site Register page
    When User enters text in "First Name" field in Register page
    And User enters text in "Last Name" field in Register page

  @AutomationDemoSite_TestEditBox_TestMinLength
  Scenario: Verify Minimum length in Edit box
    Given Launch Automation Demo Site Register page
    Then Verify minimum length in Password field is 6
