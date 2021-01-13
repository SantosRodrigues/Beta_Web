package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

import static org.example.GeradorDeCpf.cpf;
import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagHomePage {

    public PagHomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#btnTwoThousand")
    private WebElement btnValor;
    @FindBy(css = "#btnNineTerm.bpcform-button-select.bpcform-hide-mobile")
    private WebElement btnQtdParcelas9;
    @FindBy(css = "#btnTwelveTerm")
    private WebElement btnQtdParcelas12;
    @FindBy(css = "#btnEighteenTerm")
    private WebElement btnQtdParcelas18;
    @FindBy(css = "#btnTwentyFourTerm")
    private WebElement btnQtdParcelas24;
    @FindBy(css = "#name")
    private WebElement inpNomeCompleto;
    @FindBy(css = "#email")
    private WebElement inpEmail;
    @FindBy(css = "#btnContinue")
    private WebElement btnContinuar;
    @FindBy(css = ".bpcform-label-check")
    private WebElement btnOfertas;
    @FindBy(xpath = "//a[text()='Voltar']")
    private WebElement btnVoltar;

    private int numeroRandom;

    Random random = new Random();

    public void preencherDados() {
        inpEmail.sendKeys(cpf() + "@gmail.com");
        inpNomeCompleto.sendKeys("Ricador Silva");
        btnValor.click();

        for (int i = 0; i < 1; i++) {
            numeroRandom = random.nextInt(4);
        }

        switch (numeroRandom) {
            case 0:
                btnQtdParcelas12.click();
                break;

            case 1:
                btnQtdParcelas9.click();
                break;
            case 2:
                btnQtdParcelas18.click();
                break;
            case 3:
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
            getWait().until(ExpectedConditions.visibilityOf(btnVoltar));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}