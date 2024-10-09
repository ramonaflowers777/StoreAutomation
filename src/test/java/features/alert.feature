Feature: Alerts
  I am a user
  I want to handle alert
  To be able to accept it

  Scenario: Alert handling
    Given I go to "JavaScript Alerts" on the Main Page
    When I generate JS Alert on the Javascript Alert Page
    And I accept Alert
    Then Success message is displayed on Javascript Alerts Page