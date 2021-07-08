package org.example.stepsDefinitions.devs4;

import org.example.webDriverAcoes.WebDriverAcoes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.*;

public class Pag4devsPO {

    private WebDriverAcoes webDriverAcoes = new WebDriverAcoes();

    public Pag4devsPO() {
        webDriverAcoes.abrirPagina4devsCPF();
        PageFactory.initElements(getDriver4Devs(), this);
    }

    @FindBy(xpath = "//label[@for='pontuacao_nao']")
    private WebElement inpSemPontuacao;
    @FindBy(css = "#bt_gerar_cpf")
    private WebElement btnGerarCPF;
    @FindBy(css = ".clipboard-copy")
    private WebElement spnCopiar;

    public void aguardandoCarregarPagina(){
        getWait4Devs().until(ExpectedConditions.elementToBeClickable(inpSemPontuacao));
    }

    public void gerarCpfSemPontuacao() {
        inpSemPontuacao.click();
        btnGerarCPF.click();
    }

    public void copiarCpf() {
        getWait4Devs().until(ExpectedConditions.visibilityOf(spnCopiar));
        spnCopiar.click();
    }

    public void encerrarPagina4devs() {
        getDriver4Devs().quit();
    }
}
