package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.GeradorDeCpf.cpf;
import static org.example.WebDriverAcoes.getDriver;
import static org.example.WebDriverAcoes.getWait;

public class PagPreencherCPF {

    private WebElement lblCpf;
    private WebElement btnProximo;

    public void preencherCPF(){

        lblCpf = getDriver().findElement(By.cssSelector(".sc-fzoLsD.gdXpyc"));
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cpf']")));
        btnProximo = getDriver().findElement(By.cssSelector(".sc-AxhUy.sc-AxgMl.bidPMB"));

        lblCpf.sendKeys(cpf());
        btnProximo.click();
    }

    public boolean aguardar(){
        return true;
    }
}
