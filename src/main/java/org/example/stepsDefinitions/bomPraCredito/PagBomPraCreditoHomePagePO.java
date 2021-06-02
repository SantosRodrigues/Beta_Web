package org.example.stepsDefinitions.bomPraCredito;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getWait;

public class PagBomPraCreditoHomePagePO {

    public PagBomPraCreditoHomePagePO() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#btnTwoThousand")
    private WebElement btnValor2000;
    @FindBy(css = "#btnThreeThousand")
    private WebElement btnValor3000;
    @FindBy(css = "#btnFiveThousand")
    private WebElement btnValor5000;
    @FindBy(css = "#btnTenThousand")
    private WebElement btnValor10000;
    @FindBy(css = "#btnOtherValue")
    private WebElement btnValorOutro;
    @FindBy(css = "#amount")
    private WebElement inpOutroValor;
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

    public void preencherDados(String nome, String email, String parcelas, String valor) {
            inpEmail.sendKeys(email);
            inpNomeCompleto.sendKeys(nome);

            switch (valor) {
                case "2000":
                    btnValor2000.click();
                    break;
                case "3000":
                    btnValor3000.click();
                    break;
                case "5000":
                    btnValor5000.click();
                    break;
                case "10000":
                    btnValor10000.click();
                    break;
                default:
                    btnValorOutro.click();
                    getWait().until(ExpectedConditions.elementToBeClickable(inpOutroValor));
                    inpOutroValor.sendKeys(valor);
                    break;
            }

            switch (parcelas) {
                case "9":
                    btnQtdParcelas9.click();
                    break;
                case "12":
                    btnQtdParcelas12.click();
                    break;
                case "18":
                    btnQtdParcelas18.click();
                    break;
                case "24":
                    btnQtdParcelas24.click();
                    break;
            }
            btnOfertas.click();
    }

    public void avancar() {
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