Feature: Tables
  I am a user
  I want to count it's columns
  To be able to check content

  Scenario: Count sum of columns
    Given I go to "Sortable Data Tables" on the Main page
    Then Sum of the Due columns is 251.0
