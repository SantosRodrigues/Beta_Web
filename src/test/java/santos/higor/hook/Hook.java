package santos.higor.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverAcoes;

import static santos.higor.utils.GerenciadorDeScenario.setScenario;

public class Hook {

    @Before
    public void before(Scenario scenario) {
        setScenario(scenario);

        WebDriverAcoes.iniciarNavegador();
    }

    @After
    public void after(Scenario scenario) {

        if (scenario.isFailed()) {
            CapturaDeTela.capturarTela(WebDriverAcoes.getDriver(), scenario, "Cenario falhou!");
        }
        WebDriverAcoes.getDriver().quit();

    }
}