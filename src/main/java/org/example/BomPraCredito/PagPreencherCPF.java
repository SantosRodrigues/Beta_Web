package org.example.BomPraCredito;

import org.example.GeradorDeCpf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.GeradorDeCpf.cpf;
import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagPreencherCPF {

    private WebElement cpf;
    private WebElement proximo;

    public void preencherCPF(){

        cpf = getDriver().findElement(By.cssSelector(".sc-fzoLsD.gdXpyc"));
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cpf']")));
        proximo = getDriver().findElement(By.cssSelector(".sc-AxhUy.sc-AxgMl.bidPMB"));

        cpf.sendKeys(cpf());
        proximo.click();
    }

    public boolean aguardar(){
        return true;
    }
}
