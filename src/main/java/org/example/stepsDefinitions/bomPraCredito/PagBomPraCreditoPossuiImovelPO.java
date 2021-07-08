package org.example.stepsDefinitions.bomPraCredito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getWait;

public class PagBomPraCreditoPossuiImovelPO {

    public PagBomPraCreditoPossuiImovelPO() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "[class='sc-Axmtr dHxBdi'] > [src='./static/media/no.6dc4fcf6.svg']")
    private WebElement btnNaoPossouImovel;
    @FindBy(xpath = "//input[@name='cpf']")
    private WebElement lblCpf;

    public void escolherNaoPossouVeiculo() {
        btnNaoPossouImovel.click();
    }

    public boolean aguardar() {
        try {
            getWait().until(ExpectedConditions.visibilityOf(lblCpf));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}