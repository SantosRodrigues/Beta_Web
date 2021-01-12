package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagPossuiImovel {

    private WebElement btnNaoPossouImovel;

    public void escolherNaoPossouVeiculo(){

        btnNaoPossouImovel = getDriver().findElement(By.cssSelector("[class='sc-Axmtr dHxBdi'] > [src='./static/media/no.6dc4fcf6.svg']"));
        btnNaoPossouImovel.click();
    }

    public boolean aguardar(){
        try{
            getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cpf']")));
            return true;
        }catch(Exception e){
            return false;
        }
    }
}