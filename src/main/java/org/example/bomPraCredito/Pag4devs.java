package org.example.bomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.*;

public class Pag4devs {

    public Pag4devs() {
        abrirPagina4devsCPF();
    }

    private WebElement inpSemPontuacao;
    private WebElement btnGerarCPF;
    private WebElement spnCopiar;

    public void gerarCpfSemPontuacao() {
        getWait4Devs().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id='pontuacao_nao']")));
        inpSemPontuacao = getDriver4Devs().findElement(By.cssSelector("[id='pontuacao_nao']"));
        inpSemPontuacao.click();

        btnGerarCPF = getDriver4Devs().findElement(By.cssSelector("#bt_gerar_cpf"));
        btnGerarCPF.click();



    }
    public void copiarCpf(){
        spnCopiar = getWait4Devs().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".clipboard-copy")));
        spnCopiar = getDriver4Devs().findElement(By.cssSelector(".clipboard-copy"));
        spnCopiar.click();

    }

    public void encerrarPagina4devs(){
        getDriver4Devs().quit();
    }


}
