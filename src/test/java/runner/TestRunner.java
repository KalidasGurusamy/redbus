package runner;

/*
 * import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		glue= {"steps"}
		)

public class Runnerjunit {

}
 */

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/feature",
		glue = "steps"
		)
public class TestRunner extends AbstractTestNGCucumberTests  {

}
