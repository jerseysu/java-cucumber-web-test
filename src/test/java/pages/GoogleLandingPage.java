package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

public class GoogleLandingPage {
    @FindBy(how = How.NAME, using = "q")
    protected WebElement searchBox;

    public void searchFor(String searchKeyword) {
        searchBox.sendKeys(searchKeyword);
        searchBox.submit();
    }
} 