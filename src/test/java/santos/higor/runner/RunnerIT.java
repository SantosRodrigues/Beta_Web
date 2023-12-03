package santos.higor.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import santos.higor.utils.CapturaDeTela;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
import static santos.higor.relatorio.Extent.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CAMELCASE,
        features = "classpath:features",
        glue = {"santos.higor"},
        tags = "@CTWeb",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty"
        }
)

public class RunnerIT {

    @BeforeClass
    public static void beforeClass() {
        CapturaDeTela.limparDiretorioDeCapturaDeTela();
        startExtent();
        startSpark();
        getExtentInstance().attachReporter(getSparkInstance());

    }

    @AfterClass
    public static void afterClass() {
        getExtentInstance().flush();
    }
}