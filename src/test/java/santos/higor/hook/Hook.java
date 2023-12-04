package santos.higor.hook;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverSetup;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;
import static santos.higor.relatorio.Extent.*;
import static santos.higor.utils.CapturaDeTela.recuperarPathTelaCapturada;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;
import static santos.higor.utils.GerenciadorDeScenario.setScenario;
import static santos.higor.validacoes.ValidacaoAssertJ.getExceptionAssertionError;
import static santos.higor.validacoes.ValidacaoAssertJ.setExceptionAssertionError;
import static santos.higor.webdriveracoes.WebDriverAcoes.getWebDriverException;
import static santos.higor.webdriveracoes.WebDriverAcoes.setWebDriverException;

public class Hook {

    private String descricaoDaFalha() {
        String motivoDeError;
        try {
            motivoDeError = getExceptionAssertionError().getMessage();
            setExceptionAssertionError(null);
        } catch (NullPointerException npe) {
            motivoDeError = getWebDriverException().getMessage();
            setWebDriverException(null);
        }
        return motivoDeError;
    }

    @Before
    public void before(Scenario scenario) {
        setScenario(scenario);

        WebDriverSetup.iniciarNavegador();

        ExtentTest cenarioEmExecucao = getExtentInstance().createTest(getScenario().getName());

        setTesteAtualEmExecucao(cenarioEmExecucao);
    }

    @After
    public void after(Scenario scenario) {
        String cenarioFalhou = "Cenario falhou!";

        if (scenario.isFailed()) {
            CapturaDeTela.capturarTela(WebDriverSetup.getDriver(), scenario, cenarioFalhou);

            getTesteAtualEmExecucao()
                    .createNode(String.join(" - ", scenario.getName(), cenarioFalhou))
                    .fail(createScreenCaptureFromPath(recuperarPathTelaCapturada(), descricaoDaFalha())
                    .build());
        }
        WebDriverSetup.getDriver().quit();

    }
}