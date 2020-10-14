package org.example;

import static org.junit.Assert.assertTrue;

import org.example.BomPraCredito.PagHomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Runner {

    private PagHomePage homePage;

    @Before
    public void iniciarTeste() {
    WebDriverAcoes driverAcoes = new WebDriverAcoes();
    driverAcoes.inicalizarDriverChrome();
    }

    @Test
    public void shouldAnswerWithTrue() {
        homePage = new PagHomePage();

        homePage.preencherDados();
    }

    @After
    public void encerrarTeste() {

    }
}
