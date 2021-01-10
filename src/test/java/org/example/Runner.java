package org.example;

import static org.example.WebDriverAcoes.getDriver;
import static org.junit.Assert.assertTrue;

import org.example.BomPraCredito.PagHomePage;
import org.example.BomPraCredito.PagMotivoEmprestimo;
import org.example.BomPraCredito.PagPossueVeiculo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Runner {

    private PagHomePage homePage;
    private PagMotivoEmprestimo motivoEmprestimo;
    private PagPossueVeiculo possueVeiculo;

    @Before
    public void iniciarTeste() {
    WebDriverAcoes driverAcoes = new WebDriverAcoes();
    driverAcoes.inicalizarDriverChrome();
    }

    @Test
    public void execucaoDoTeste() {
        homePage = new PagHomePage();
        motivoEmprestimo = new PagMotivoEmprestimo();
        possueVeiculo = new PagPossueVeiculo();

        homePage.preencherDados();
        Assert.assertTrue(homePage.aguardar());
        motivoEmprestimo.escolherMotivo();
        Assert.assertTrue(motivoEmprestimo.aguardar());
        possueVeiculo.escolherNaoPossouVeiculo();
        Assert.assertTrue(possueVeiculo.aguardar());
    }

    @After
    public void encerrarTeste() {
//        getDriver().quit();
    }
}
