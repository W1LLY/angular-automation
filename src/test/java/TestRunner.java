import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:home.feature",
        glue = "classpath:stepDefinitions",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)
public class TestRunner {
}
