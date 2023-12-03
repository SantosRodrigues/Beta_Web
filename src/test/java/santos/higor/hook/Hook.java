package santos.higor.hook;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverAcoes;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;
import static santos.higor.relatorio.Extent.*;
import static santos.higor.utils.CapturaDeTela.recuperarPathTelaCapturada;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;
import static santos.higor.utils.GerenciadorDeScenario.setScenario;

public class Hook {

    @Before
    public void before(Scenario scenario) {
        setScenario(scenario);

        WebDriverAcoes.iniciarNavegador();

        ExtentTest cenarioEmExecucao = getExtentInstance().createTest(getScenario().getName());

        setTesteAtualEmExecucao(cenarioEmExecucao);
    }

    @After
    public void after(Scenario scenario) {
        String mensagemCenarioFalhou = "Cenario falhou!";

        if (scenario.isFailed()) {
            CapturaDeTela.capturarTela(WebDriverAcoes.getDriver(), scenario, mensagemCenarioFalhou);

            getTesteAtualEmExecucao()
                    .createNode(String.join(" - ",scenario.getName(), mensagemCenarioFalhou))
                    .fail(createScreenCaptureFromPath(recuperarPathTelaCapturada(), mensagemCenarioFalhou)
                    .build());
        }
        WebDriverAcoes.getDriver().quit();

    }
}