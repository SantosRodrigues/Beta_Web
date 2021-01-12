package org.example;

import org.example.BomPraCredito.*;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Runner {

    private PagHomePage homePage;
    private PagMotivoEmprestimo motivoEmprestimo;
    private PagPossuiVeiculo possuiVeiculo;
    private PagPossuiImovel possuiImovel;
    private PagPreencherCPF preencherCPF;

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
        possuiImovel = new PagPossuiImovel();
        preencherCPF = new PagPreencherCPF();

        homePage.preencherDados();
        Assert.assertTrue(homePage.aguardar());
        motivoEmprestimo.escolherMotivo();
        Assert.assertTrue(motivoEmprestimo.aguardar());
        possuiVeiculo.escolherNaoPossouVeiculo();
        Assert.assertTrue(possuiVeiculo.aguardar());
        possuiImovel.escolherNaoPossouVeiculo();
        Assert.assertTrue(possuiImovel.aguardar());
        preencherCPF.preencherCPF();
        Assert.assertTrue(preencherCPF.aguardar());
    }

    @After
    public void encerrarTeste() {
//        getDriver().quit();
    }
}
