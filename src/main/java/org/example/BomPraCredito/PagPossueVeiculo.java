package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.WebDriverAcoes.getDriver;

public class PagPossueVeiculo {

    private PagHomePage homePage = new PagHomePage();

    private WebElement naoPossouVeiculo;

    public void escolherNaoPossouVeiculo(){
        naoPossouVeiculo = getDriver().findElement(By.cssSelector(".sc-Axmtr.dHxBdi > [src='./static/media/no.6dc4fcf6.svg']"));
        naoPossouVeiculo.click();
    }

    public boolean aguardar(){
       return homePage.aguardar();
    }
}
