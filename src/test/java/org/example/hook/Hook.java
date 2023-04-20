package org.example.hook;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static org.example.utils.CapturaDeTela.capturarTela;
import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.iniciarNavegador;

public class Hook {

    public static Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        Hook.scenario = scenario;

        iniciarNavegador();
    }

    @After
    public void after(Scenario scenario) {

        if (scenario.isFailed()) {
            capturarTela("Cenario falhou!", getDriver(), scenario);
        }
        getDriver().quit();
    }
}