package santos.higor.stepdefinitions.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import santos.higor.webdriveracoes.WebDriverSetup;

import java.util.ArrayList;
import java.util.List;

import static santos.higor.webdriveracoes.WebDriverAcoes.esperarWebDriverElement;

public class PagAmazonResultadoPesquisaPO {

    public PagAmazonResultadoPesquisaPO() {
        PageFactory.initElements(WebDriverSetup.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base'][position()=1]")
    private WebElement txtProdutoIndisponivelMensagem;
    @FindBy(xpath = "//span[@class='a-size-medium a-color-base'][position()=2]")
    private WebElement txtProdutoIndisponivelNomeProduto;
    @FindBy(css = "#productTitle")
    private WebElement txtTituloDoProduto;

    public List<String> retornarListaDeProdutosEncontrados() {

        List<String> titulos = new ArrayList<>();

        for (int indicador = 1; indicador <= 48; indicador++) {
            titulos.add(WebDriverSetup.getDriver().findElement((By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[position()=" + indicador + "]"))).getText());
        }

        titulos.replaceAll(String::toLowerCase);
        return titulos;
    }

    public String mensagemDeProdutoNaoEncontrado() {
        return txtProdutoIndisponivelMensagem.getText() + " " + txtProdutoIndisponivelNomeProduto.getText();
    }

    public void selecionarProduto(int index) {
        WebDriverSetup.getDriver().findElement((By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[position()=" + index + "]"))).click();

    }

    public boolean aguardarPerfilProduto() {
        try {
            esperarWebDriverElement(() -> WebDriverSetup.getWait().until(ExpectedConditions.visibilityOf(txtTituloDoProduto)));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
}