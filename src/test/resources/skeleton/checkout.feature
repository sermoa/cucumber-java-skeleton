Feature: Checkout

  Scenario: Buy 3 espressos
    Given an espresso costs £2
    When I sell 3 espressos
    Then the total should be £6

  Scenario: Buy croissants and espressos
    Given a croissant costs £4
    And an espresso costs £2
    When I sell 2 croissants
    And I sell 3 espressos
    Then the total should be £14