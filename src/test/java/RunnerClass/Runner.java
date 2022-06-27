package RunnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinition",
//		tags = "@internaltest",
//		tags="@adminpage",@demopage
//		tags="@ScheduedTest",
//		tags="@demopage",
//		tags="@TestTaking",
        tags = "@functionalSuite",
//		plugin = {"pretty"})
//		plugin = { "TestResults/cucumber-reports/TestAutomation.html",
//				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json"},
        plugin = {"pretty",
                "html:build/cucumber-html-report",
                "html:target/cucumber-reports/cucumber-pretty",
                "junit:build/cucumber-junit.xml",
//						"html:target/cucumber-reports/cucumber-pretty.html",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/cucumber-pretty.json",
                "junit:target/cucumber-reports/cucumber-pretty.xml"},
//				plugin = { "com.cucumber.listener.ExtentCucumberFormatter:TestResults/cucumber-reports/TestAutomation.html",
//						"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json"},
//						"rerun:target/cucumber-reports/rerun.txt" }, monochrome = true, dryRun = false, tags = { "@iOSBeta" })
        monochrome = true)

public class Runner {
}
