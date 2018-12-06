package poc.mobile.cielo.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "poc.mobile.cielo.steps", // caminho step definitions
		tags = "@funcionalidade",
		plugin = {"pretty","html:target/report-html"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, /*true, só cenários(executa o gherkin)*/
		strict = false
		)
public class RunnerTest {

	
}
