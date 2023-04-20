package org.example.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static org.example.utils.CapturaDeTela.limparDiretorioDeCapturaDeTela;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"org.example"},
        tags = "@CTWeb",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty"
        }
)

public class RunnerIT {

        @BeforeClass
        public static void beforeClass() {
                limparDiretorioDeCapturaDeTela();
        }
}