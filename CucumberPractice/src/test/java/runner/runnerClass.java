package runner;



import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/java/featureFiles/checkLogin.feature"} ,
dryRun = !true,
glue="stepDefinitions",
snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE,
monochrome = true,
plugin = {"pretty",
"html:reportsA/result.html",
"json:reportsB/result.json",
"junit:reportsC/result.xml"}
)

public class runnerClass extends AbstractTestNGCucumberTests {

}	