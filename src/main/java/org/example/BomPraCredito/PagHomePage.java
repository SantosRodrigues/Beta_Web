package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.WebDriverAcoes.getDriver;

public class PagHomePage {

    private WebElement btnValor;
    private WebElement btnQtdParcelas;
    private WebElement inpNomeCompleto;
    private WebElement inpEmail;
    private WebElement btnContinuar;
    private WebElement btnOfertas;


    public void preencherDados(){
        btnValor = getDriver().findElement(By.cssSelector("#btnTwoThousand"));
        btnQtdParcelas = getDriver().findElement(By.cssSelector("#btnNineTerm"));
        inpNomeCompleto = getDriver().findElement(By.cssSelector("#name"));
        inpEmail = getDriver().findElement(By.cssSelector("#email"));
        btnContinuar = getDriver().findElement(By.cssSelector("#btnContinue"));
        btnOfertas = getDriver().findElement(By.cssSelector(".bpcform-label-check"));

        btnValor.click();
        inpEmail.sendKeys("456465454646545@gmail.com");
        inpNomeCompleto.sendKeys("Ricador Silva");
        btnQtdParcelas.click();
        btnOfertas.click();
        btnContinuar.click();
    }

    public void aguardar(){

    }
}
