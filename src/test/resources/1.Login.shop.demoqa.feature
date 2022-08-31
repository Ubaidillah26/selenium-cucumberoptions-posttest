Feature: Login User

  Scenario: User invalid Login
    Given user navigate to login page
    When user enter username password
    And user click button login
    Then validate page with scenario
    
  Scenario: User valid Login
    Given user navigate to login page
    When user enter username password
    And user click button login
    Then validate page with scenario