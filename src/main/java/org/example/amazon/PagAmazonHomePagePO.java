package org.example.amazon;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getWait;

public class PagAmazonHomePagePO {

    public PagAmazonHomePagePO() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement lblBarraDePesquisa;
    @FindBy(css = "#nav-search-submit-button")
    private WebElement btnPesquisar;
    @FindBy(css = ".a-size-base.a-color-base.a-text-normal .a-size-base.a-color-base")
    private WebElement txtResultadoPesquisa;

    public void preencherBarraDePesquisa(String pesquisa) {
        getWait().until(ExpectedConditions.elementToBeClickable(lblBarraDePesquisa));
        lblBarraDePesquisa.sendKeys(pesquisa);
    }

    public void clicarEmPesquisar() {
        btnPesquisar.click();
    }

    public boolean aguardarPesquisa() {
        try {
            getWait().until(ExpectedConditions.visibilityOf(txtResultadoPesquisa));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}
