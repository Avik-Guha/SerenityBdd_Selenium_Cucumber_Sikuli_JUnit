@AutomationDemoSite_TestDataTables
Feature: Test Data Tables
  This is to test Data Tables

  @AutomationDemoSite_TestDataTables_FetchRowValues
  Scenario: Verify User is able to fetch row values in a table
    Given Launch Automation Demo Site WebTable page
    Then Fetch record of user with email as "Jerry@mail.com" in Data Table in Web Table page
    