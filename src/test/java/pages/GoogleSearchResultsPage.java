package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

public class GoogleSearchResultsPage {
    @FindBy(how = How.NAME, using = "q")
    protected WebElement searchBox;

    public void checkSearchResult(String searchResult) {
        assertEquals(searchResult, searchBox.getAttribute("value"));
    }
}