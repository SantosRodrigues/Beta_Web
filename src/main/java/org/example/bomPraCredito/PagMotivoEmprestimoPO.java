package org.example.bomPraCredito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getWait;

public class PagMotivoEmprestimoPO {

    public PagMotivoEmprestimoPO(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Outro ']")
    private WebElement btnOutrosMotivos;
    @FindBy(css = ".sc-Axmtr.dHxBdi > [src='./static/media/no.6dc4fcf6.svg']")
    private WebElement btnbtnNaoPossouVeiculo;

    public void escolherMotivo() {
        btnOutrosMotivos.click();
    }

    public boolean aguardar() {
        try {
            getWait().until(ExpectedConditions.visibilityOf(btnbtnNaoPossouVeiculo));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

