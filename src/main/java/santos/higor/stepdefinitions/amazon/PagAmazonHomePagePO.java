package santos.higor.stepdefinitions.amazon;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import santos.higor.webdriveracoes.WebDriverSetup;

import static santos.higor.webdriveracoes.WebDriverAcoes.esperarWebDriverElement;

public class PagAmazonHomePagePO {

    public PagAmazonHomePagePO() {
        PageFactory.initElements(WebDriverSetup.getDriver(), this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement lblBarraDePesquisa;
    @FindBy(css = "#nav-search-submit-button")
    private WebElement btnPesquisar;
    @FindBy(css = "#nav-main")
    private WebElement divResultadoPesquisa;

    public void preencherBarraDePesquisa(String pesquisa) {
        esperarWebDriverElement(() -> WebDriverSetup.getWait().until(ExpectedConditions.elementToBeClickable(lblBarraDePesquisa)));
        lblBarraDePesquisa.sendKeys(pesquisa);
    }

    public void clicarEmPesquisar() {
        btnPesquisar.click();
    }

    public boolean aguardarQuePesquisaSejaRealizada() {
        try {
            esperarWebDriverElement(() -> WebDriverSetup.getWait().until(ExpectedConditions.visibilityOf(divResultadoPesquisa)));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

}
