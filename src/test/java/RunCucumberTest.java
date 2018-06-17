import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:report/cucumber.html", "json:report/cucumber-report.json"}, features ={"src/test/java/features/"})
public class RunCucumberTest {
}