package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"bomPraCredito","hook"},
        tags = {"@NovoClienteSucesso4devs"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty"
        }
)

public class Runner {
}

