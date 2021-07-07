@AutomationDemoSite_TestDropdown
Feature: Test Dropdown
  This is to test Dropdown element

  @AutomationDemoSite_TestDropdown_SelectValue
  Scenario: Verify User is able to select value in Dropdown element
    Given Launch Automation Demo Site Register page
    When User selects "Java" value in "Skills" dropdown field in Register page
    And User selects "India" value in "Country" dropdown field in Register page
  	#And User selects "English" and "Hindi" value in Languages dropdown field in Register page
  	
  @AutomationDemoSite_TestDropdown_VerifyIfContainsValue
  Scenario: Verify User is able to verify value in Dropdown element
    Given Launch Automation Demo Site Register page
    Then Verify "Skills" dropdown field in Register page contains "Android" value
    
    @AutomationDemoSite_TestDropdown_VerifyTotalNumberOfValues
  Scenario: Verify User is able to verify total number of values in Dropdown element
    Given Launch Automation Demo Site Register page
    Then Verify total number of values in "Skills" dropdown field in Register page
