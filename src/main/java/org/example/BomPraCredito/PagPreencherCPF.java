package org.example.BomPraCredito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.GeradorDeCpf.cpf;
import static org.example.WebDriverAcoes.getDriver;

public class PagPreencherCPF {

    public PagPreencherCPF() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = ".sc-AxhUy.sc-AxgMl.bidPMB")
    private WebElement btnProximo;
    @FindBy(xpath = "//input[@name='cpf']")
    private WebElement lblCpf;

    public void preencherCPF() {
        lblCpf.sendKeys(cpf());
        btnProximo.click();
    }
}
