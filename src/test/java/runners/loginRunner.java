package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = "src/test/resources/fetaures",
		dryRun = !true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE
		)
public class loginRunner extends AbstractTestNGCucumberTests{

}
