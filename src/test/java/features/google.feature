Feature: Google Search
  Google Search Keyword

  Scenario: Google Search ChromeDriver
    Given I go to google
    When I search "Chromedriver"
    Then I should see "Chromedriver"
  
  Scenario Outline: Searching a keyword
      Given I go to google
      When I search "<food>"
      Then I should see "<food>"

      Examples:
      | food    |
      | pizza   |
      | ham     |