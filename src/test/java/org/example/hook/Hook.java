package org.example.hook;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.webDriverAcoes.WebDriverAcoes;

import static org.example.utils.CapturaDeTela.capturarTela;

public class Hook extends WebDriverAcoes {

    @Before
    public void Before() {
        iniciarNavegador();
    }

    @After
    public void After(Scenario scenario) {

        if (scenario.isFailed()) {
            capturarTela("Cenario falhou!", getDriver());
        }
        getDriver().quit();
    }
}