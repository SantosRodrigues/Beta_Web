package org.example.bomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.*;

public class PagBomPraCreditoPreencherCpfPO {

    private WebElement lblCpf;
    private WebElement btnProximo;


    public void preencherCPF() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sc-fzoLsD.gdXpyc")));
        lblCpf = getDriver().findElement(By.cssSelector(".sc-fzoLsD.gdXpyc"));
        lblCpf.sendKeys(Keys.CONTROL, "v");

        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cpf']")));
        btnProximo = getDriver().findElement(By.cssSelector(".sc-AxhUy.sc-AxgMl.bidPMB"));

    }

    public boolean avancar() {
        try {
            btnProximo.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
