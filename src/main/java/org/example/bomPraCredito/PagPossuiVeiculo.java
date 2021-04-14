package org.example.bomPraCredito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getWait;

public class PagPossuiVeiculo {

    public PagPossuiVeiculo() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = ".sc-Axmtr.dHxBdi > [src='./static/media/no.6dc4fcf6.svg']")
    private WebElement btnNaoPossouVeiculo;
    @FindBy(css = "[class='sc-Axmtr dHxBdi'] > [src='./static/media/no.6dc4fcf6.svg']")
    private WebElement btnNaoPossouImovel;

    public void escolherNaoPossouVeiculo() {
        btnNaoPossouVeiculo.click();
    }

    public boolean aguardar() {
        try {
            getWait().until(ExpectedConditions.visibilityOf(btnNaoPossouImovel));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
