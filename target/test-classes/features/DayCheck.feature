Feature: Day Checking
  Scenario: Sunday is not Friday
    Given today is Sunday
    When I ask whether it's Friday
    Then I should be told "No, it's not Friday"
