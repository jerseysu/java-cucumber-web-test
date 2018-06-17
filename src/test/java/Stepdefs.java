import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "./driver/chromedriver";
    protected WebDriver driver;
    protected WebElement searchBox;

    @Given("I go to google")
    public void i_go_to_google() {
        driver.get("http://www.google.com/xhtml");
    }

    @When("I search {string}")
    public void i_search(String searchKeyword) {
        System.err.println(String.format("keyword: %s", searchKeyword));
        searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchKeyword);
        searchBox.submit();
    }

    @Then("I should see {string}")
    public void i_should_see(String searchKeyword) {
        // Write code here that turns the phrase above into concrete actions
        searchBox = driver.findElement(By.xpath("//*[@value = \'" + searchKeyword + "\']"));
        System.err.println(String.format("var: %s", searchBox.isDisplayed()));
        assertTrue(searchBox.isDisplayed());
    }

    @Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        System.setProperty(WEBDRIVER_CHROME_DRIVER, WEBDRIVER_CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
    }	
	
	@After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        driver.quit();
    }
}