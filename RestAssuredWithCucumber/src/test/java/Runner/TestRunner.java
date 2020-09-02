package Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features={"src/test/java/features"}, glue={"stepDefinations"})
@Test
public class TestRunner extends AbstractTestNGCucumberTests{

}
