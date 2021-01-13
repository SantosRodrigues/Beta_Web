package org.example.BomPraCredito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagMotivoEmprestimo {

    public PagMotivoEmprestimo(){
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

