package santos.higor.stepdefinitions.amazon;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import santos.higor.webdriveracoes.WebDriverAcoes;

public class PagAmazonHomePagePO {

    public PagAmazonHomePagePO() {
        PageFactory.initElements(WebDriverAcoes.getDriver(), this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement lblBarraDePesquisa;
    @FindBy(css = "#nav-search-submit-button")
    private WebElement btnPesquisar;
    @FindBy(css = "#nav-main")
    private WebElement divResultadoPesquisa;

    public void preencherBarraDePesquisa(String pesquisa) {
        WebDriverAcoes.getWait().until(ExpectedConditions.elementToBeClickable(lblBarraDePesquisa));
        lblBarraDePesquisa.sendKeys(pesquisa);
    }

    public void clicarEmPesquisar() {
        btnPesquisar.click();
    }

    public boolean aguardarQuePesquisaSejaRealizada() {
        try {
            WebDriverAcoes.getWait().until(ExpectedConditions.visibilityOf(divResultadoPesquisa));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}
