package org.example.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/",
        glue = {"simulacaoEmprestimo","hooks"},
        tags = {"@CTemprestimo"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty"
        }
)

public class RunnerBdd{
}

