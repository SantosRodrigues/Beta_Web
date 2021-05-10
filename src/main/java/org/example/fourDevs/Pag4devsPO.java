package org.example.fourDevs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.*;

public class Pag4devsPO {

    public Pag4devsPO() {
        abrirPagina4devsCPF();
        PageFactory.initElements(getDriver4Devs(), this);
    }

    @FindBy(xpath = "//label[@for='pontuacao_nao']")
    private WebElement inpSemPontuacao;
    @FindBy(css = "#bt_gerar_cpf")
    private WebElement btnGerarCPF;
    @FindBy(css = ".clipboard-copy")
    private WebElement spnCopiar;

    public void gerarCpfSemPontuacao() {
        getWait4Devs().until(ExpectedConditions.visibilityOf(inpSemPontuacao));
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
