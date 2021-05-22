Feature: Login
  @login
  Scenario: login with valid email and passwod
    Given I am at orangeHRM
    And I input valid ID and password
    Then I click longin button