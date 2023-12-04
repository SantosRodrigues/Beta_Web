package santos.higor.stepdefinitions.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import santos.higor.webdriveracoes.WebDriverSetup;

import static santos.higor.webdriveracoes.WebDriverAcoes.esperarWebDriverElement;

public class PagAmazonPerfilProdutoPO {

    public PagAmazonPerfilProdutoPO() {
        PageFactory.initElements(WebDriverSetup.getDriver(), this);
    }

    @FindBy(css = "#add-to-cart-button")
    private WebElement btnAdicionarCarrinho;
    @FindBy(css = ".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold")
    private WebElement txtProdutoAdicionadoAoCarrinhoComSucesso;

    public void adicionarProdutoAoCarrinho() {
        esperarWebDriverElement(() -> WebDriverSetup.getWait().until(ExpectedConditions.elementToBeClickable(btnAdicionarCarrinho)));
        btnAdicionarCarrinho.click();
    }

    public String validarProdutoAdicionadoAoCarrinhoComSucesso() {
        esperarWebDriverElement(() -> WebDriverSetup.getWait().until(ExpectedConditions.visibilityOf(txtProdutoAdicionadoAoCarrinhoComSucesso)));
        return txtProdutoAdicionadoAoCarrinhoComSucesso.getText();
    }
}
