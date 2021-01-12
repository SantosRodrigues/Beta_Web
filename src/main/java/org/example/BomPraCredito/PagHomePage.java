package org.example.BomPraCredito;

import org.example.GeradorDeCpf;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.GeradorDeCpf.cpf;
import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagHomePage {

    private WebElement btnValor;
    private WebElement btnQtdParcelas;
    private WebElement inpNomeCompleto;
    private WebElement inpEmail;
    private WebElement btnContinuar;
    private WebElement btnOfertas;

    public void preencherDados() {
        btnValor = getDriver().findElement(By.cssSelector("#btnTwoThousand"));
        btnQtdParcelas = getDriver().findElement(By.cssSelector("#btnNineTerm"));
        inpNomeCompleto = getDriver().findElement(By.cssSelector("#name"));
        inpEmail = getDriver().findElement(By.cssSelector("#email"));
        btnContinuar = getDriver().findElement(By.cssSelector("#btnContinue"));
        btnOfertas = getDriver().findElement(By.cssSelector(".bpcform-label-check"));


        btnValor.click();
        inpEmail.sendKeys(cpf() + "@gmail.com");
        inpNomeCompleto.sendKeys("Ricador Silva");
        btnQtdParcelas.click();
        btnOfertas.click();
        btnContinuar.click();

    }


    public boolean aguardar() {
        try {
            getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Voltar']")));
            return true;
        } catch (TimeoutException e) {
            return false;
        }


    }
}
