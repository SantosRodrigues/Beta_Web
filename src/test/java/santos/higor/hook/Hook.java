package santos.higor.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverAcoes;

public class Hook {

    public static Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        Hook.scenario = scenario;

        WebDriverAcoes.iniciarNavegador();
    }

    @After
    public void after(Scenario scenario) {

        if (scenario.isFailed()) {
            CapturaDeTela.capturarTela("Cenario falhou!", WebDriverAcoes.getDriver(), scenario);
        }
        WebDriverAcoes.getDriver().quit();

    }
}