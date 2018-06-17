# java-cucumber-web-test
Sample Project - selenium + cucumber-jvm BDD style test cases

[![Build Status](https://travis-ci.com/jerseysu/java-cucumber-web-test.svg?branch=master)](https://travis-ci.com/jerseysu/java-cucumber-web-test)

## Requirements

- Java 10.0.1
- Apache Maven 3.5.3
- Cucumber-jvm 3.0.0
- Selenium 3.12.0
- ChromeDriver 2.39.562713
- Docker (if you wanna run by docker)

## Installation 

```
# Install Java
$ brew cask install java

# Install Maven 
$ brew install maven

# Install Chromedriver
$ version="2.39"
$ curl -O  http://chromedriver.storage.googleapis.com/$version/chromedriver_mac64.zip
$ unzip -a chromedriver_mac64.zip
$ mv chromedriver driver/.
$ rm -r chromedriver_mac64.zip
```

## Webdriver

```
# Place webdriver into driver folder
$ ./driver/.
```

## Useful Sample:

```
Scenario Outline: Searching a keyword
    Given I go to google
    When I search "<food>"
    Then I should see "<food>"

    Examples:
    | food    |
    | pizza   |
    | ham     |
```

## Execution
- Maven
`mvn test`

## Documentation:


## Author

Jersey Su – [@jerseysu](https://twitter.com/jerseysu) 
