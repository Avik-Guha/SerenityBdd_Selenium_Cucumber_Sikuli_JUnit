@AutomationDemoSite_TestCheckBox
Feature: Test Check Box
  This is to test Check box

  @AutomationDemoSite_TestCheckBox_CheckAndUncheckCheckbox
  Scenario: Verify User is able to enter text in Edit box
    Given Launch Automation Demo Site Register page
    When User checks on "Cricket" checkbox in Register page
    Then Verify "Cricket" checkbox in Register page is in Checked status
    When User unchecks on "Cricket" checkbox in Register page
    Then Verify "Cricket" checkbox in Register page is in Unchecked status