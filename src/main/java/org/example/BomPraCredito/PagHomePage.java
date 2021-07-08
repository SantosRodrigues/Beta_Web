package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

import static org.example.GeradorDeCpf.cpf;
import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagHomePage {

    private WebElement btnValor;
    private WebElement btnQtdParcelas9;
    private WebElement btnQtdParcelas12;
    private WebElement btnQtdParcelas18;
    private WebElement btnQtdParcelas24;
    private WebElement inpNomeCompleto;
    private WebElement inpEmail;
    private WebElement btnContinuar;
    private WebElement btnOfertas;
    private int numeroRandom;

    Random random = new Random();

    public void preencherDados() {

        btnValor = getDriver().findElement(By.cssSelector("#btnTwoThousand"));
        inpNomeCompleto = getDriver().findElement(By.cssSelector("#name"));
        inpEmail = getDriver().findElement(By.cssSelector("#email"));
        btnContinuar = getDriver().findElement(By.cssSelector("#btnContinue"));
        btnOfertas = getDriver().findElement(By.cssSelector(".bpcform-label-check"));

        inpEmail.sendKeys(cpf() + "@gmail.com");
        inpNomeCompleto.sendKeys("Ricador Silva");
        btnValor.click();

        for(int i = 0;i < 1; i++){
            numeroRandom = random.nextInt(4);
            System.out.println(numeroRandom);
        }

        switch(numeroRandom){
            case 0:
                btnQtdParcelas12 = getDriver().findElement(By.cssSelector("#btnTwelveTerm"));
                btnQtdParcelas12.click();
                break;

            case 1:
                btnQtdParcelas9 = getDriver().findElement(By.cssSelector("#btnNineTerm.bpcform-button-select.bpcform-hide-mobile"));
                btnQtdParcelas9.click();
                break;
            case 2:
                btnQtdParcelas18 = getDriver().findElement(By.cssSelector("#btnEighteenTerm"));
                btnQtdParcelas18.click();
                break;
            case 3:
                btnQtdParcelas24 = getDriver().findElement(By.cssSelector("#btnTwentyFourTerm"));
                btnQtdParcelas24.click();
                break;
            default:
                System.err.println("Houve um problema com a escolha da quantidade de parcelas, reveja o for.");
                break;
        }
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
