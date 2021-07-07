@TestLogin
Feature: Launch Application
  This is a test feature to launch an application

  @TestLogin_launchApp
  Scenario: Launch Orange HRM
    Given Launch Application

  @TestLogin_Check_login_with_correct_credential
  Scenario: Launch Orange HRM
    Given Login as Admin
    Then Verify Dashboard page is displayed
