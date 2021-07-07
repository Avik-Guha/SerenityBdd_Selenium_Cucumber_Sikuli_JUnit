@Herokuapp_TestWaits
Feature: Test Waits
  This is to test Waits

  @Herokuapp_TestWaits_SetAndCheckImplicitWait
  Scenario: Verify Implicit Wait
    Given Launch Herokuapp Dynamic Loading Wait page
    Then Verify Implicit Wait Time
    When User sets Implicit Wait Time
    Then Verify Implicit Wait Time
    When User clicks on Start button
 		Then Verify Hello World text is displayed
  
  @Herokuapp_TestWaits_CheckImplicitWait
  Scenario: Verify Implicit Wait
    Given Launch Herokuapp Dynamic Loading Wait page
    Then Verify Implicit Wait Time
