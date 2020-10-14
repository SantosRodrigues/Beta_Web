package org.example;

import static org.junit.Assert.assertTrue;

import org.example.BomPraCredito.PagHomePage;
import org.example.BomPraCredito.PagMotivoEmprestimo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Runner {

    private PagHomePage homePage;
    private PagMotivoEmprestimo motivoEmprestimo;

    @Before
    public void iniciarTeste() {
    WebDriverAcoes driverAcoes = new WebDriverAcoes();
    driverAcoes.inicalizarDriverChrome();
    }

    @Test
    public void execucaoDoTeste() {
        homePage = new PagHomePage();
        motivoEmprestimo = new PagMotivoEmprestimo();

        homePage.preencherDados();
        Assert.assertTrue(homePage.aguardar());
        motivoEmprestimo.escolherMotivo();
        Assert.assertTrue(motivoEmprestimo.aguardar());

    }

    @After
    public void encerrarTeste() {

    }
}
