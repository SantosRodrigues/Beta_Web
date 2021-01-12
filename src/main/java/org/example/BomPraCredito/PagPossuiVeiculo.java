package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagPossuiVeiculo {


    private WebElement naoPossouVeiculo;

    public void escolherNaoPossouVeiculo(){

        naoPossouVeiculo = getDriver().findElement(By.cssSelector(".sc-Axmtr.dHxBdi > [src='./static/media/no.6dc4fcf6.svg']"));
        naoPossouVeiculo.click();
    }

    public boolean aguardar(){
       try{
           getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='sc-Axmtr dHxBdi'] > [src='./static/media/no.6dc4fcf6.svg']")));
           return true;
       }catch(Exception e){
           return false;
       }
    }
}
