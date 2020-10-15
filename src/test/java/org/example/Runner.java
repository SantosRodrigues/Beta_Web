package org.example;

import org.example.BomPraCredito.PagHomePage;
import org.example.BomPraCredito.PagMotivoEmprestimo;
import org.example.BomPraCredito.PagPossuiVeiculo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Runner {

    private PagHomePage homePage;
    private PagMotivoEmprestimo motivoEmprestimo;
    private PagPossuiVeiculo possuiVeiculo;

    @Before
    public void iniciarTeste() {
        WebDriverAcoes driverAcoes = new WebDriverAcoes();
        driverAcoes.iniciarNavegador("chrome");
    }

    @Test
    public void execucaoDoTeste() {
        homePage = new PagHomePage();
        motivoEmprestimo = new PagMotivoEmprestimo();
        possuiVeiculo = new PagPossuiVeiculo();

        homePage.preencherDados();
        Assert.assertTrue(homePage.aguardar());
        motivoEmprestimo.escolherMotivo();
        Assert.assertTrue(motivoEmprestimo.aguardar());
        possuiVeiculo.escolherPossuiVeiculo();
        Assert.assertTrue(possuiVeiculo.aguardar());

    }

    @After
    public void encerrarTeste() {

    }
}
