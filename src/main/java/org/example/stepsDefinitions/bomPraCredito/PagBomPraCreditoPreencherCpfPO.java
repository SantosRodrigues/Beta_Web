package org.example.stepsDefinitions.bomPraCredito;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.*;

public class PagBomPraCreditoPreencherCpfPO {

    public PagBomPraCreditoPreencherCpfPO(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(css = ".sc-fzoLsD.gdXpyc")
    private WebElement lblCpf;
    @FindBy(css = ".sc-AxhUy.sc-AxgMl.bidPMB")
    private WebElement btnProximo;

    public void preencherCPF() {
        getWait().until(ExpectedConditions.elementToBeClickable(lblCpf));
        lblCpf.sendKeys(Keys.CONTROL, "v");
        getWait().until(ExpectedConditions.elementToBeClickable(btnProximo));
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
