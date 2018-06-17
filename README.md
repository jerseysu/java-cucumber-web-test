# java-cucumber-web-test
Sample Project - selenium 3 + cucumber-jvm 3.0 BDD style test cases

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

### Scenario Outline
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

### Cucumber Expressions
```
    @When("I search {string}")
    public void i_search(String searchKeyword) {
        System.err.println(String.format("KeyWord: %s", searchKeyword));
        GoogleLandingPage page = PageFactory.initElements(driver, GoogleLandingPage.class);
        page.searchFor(searchKeyword);
    }
```

### Page Factory
```
    public class GoogleLandingPage {
        @FindBy(how = How.NAME, using = "q")
        protected WebElement searchBox;

        public void searchFor(String searchKeyword) {
            searchBox.sendKeys(searchKeyword);
            searchBox.submit();
        }
    }
```

## Execution
- Maven
`mvn test`

## Documentation:


## Author

Jersey Su – [@jerseysu](https://twitter.com/jerseysu) 
