package org.example.hook;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.webDriverAcoes.WebDriverAcoes;
import org.junit.BeforeClass;

import java.io.File;
import java.io.IOException;

import static org.example.properties.DefinitionsProperties.getProp;
import static org.example.utils.CapturaDeTela.capturarTela;
import static org.example.utils.CapturaDeTela.limparDiretorioDeCapturaDeTela;

public class Hook extends WebDriverAcoes {

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