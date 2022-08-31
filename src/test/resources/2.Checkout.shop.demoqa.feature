Feature: Check Out

  Scenario: user add first item
    Given user navigate to web page
    When search item
    And add item
    When search item
    And add item
    When user filling billing detail
    And user place order
    Then validate scenario