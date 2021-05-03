package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

//@CucumberOptions(features="src/test/java/features/login.feature" , glue = "steps")

/*//While running in the console we will get the methods to be defined 
That method will contain some special characters to get the method add snippet parameter in above line , 
and copy methods and paste it in steps*/
@CucumberOptions(features="src/test/java/features/login.feature" , glue = "steps" /*, snippets = SnippetType.UNDERSCORE*/)
public class Runner extends AbstractTestNGCucumberTests {

}
