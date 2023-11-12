package santos.higor.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverAcoes;

import static santos.higor.relatorio.Extent.*;
import static santos.higor.relatorio.ExtentStatus.getStatus;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;
import static santos.higor.utils.GerenciadorDeScenario.setScenario;

public class Hook {

    @Before
    public void before(Scenario scenario) {
        setScenario(scenario);

        WebDriverAcoes.iniciarNavegador();
        setCurrentTest(getExtentInstance().createTest(getScenario().getName()));
    }

    @After
    public void after(Scenario scenario) {
        String mensagemCenarioFalhou = "Cenario falhou!";


        if (scenario.isFailed()) {
            CapturaDeTela.capturarTela(WebDriverAcoes.getDriver(), scenario, mensagemCenarioFalhou);
            getCurrentTest().log(getStatus(getScenario().getStatus()), mensagemCenarioFalhou);
        }
        WebDriverAcoes.getDriver().quit();

    }
}