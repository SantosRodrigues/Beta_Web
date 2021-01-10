package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.WebDriverAcoes.getDriver;

public class PagPossuiVeiculo {

    private PagHomePage homePage;
    private WebElement btnNaoPossui;

    public void escolherPossuiVeiculo() {
        btnNaoPossui = getDriver().findElement(By.cssSelector(".sc-Axmtr.brgfRr"));
        btnNaoPossui.click();
    }

    public boolean aguardar() {
        homePage = new PagHomePage();
        return homePage.aguardar();
    }
}
