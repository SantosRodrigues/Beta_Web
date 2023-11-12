package santos.higor.stepdefinitions.amazon;

import com.aventstack.extentreports.Status;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import santos.higor.utils.CapturaDeTela;
import org.junit.Assert;

import static santos.higor.relatorio.Extent.getCurrentTest;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;
import static santos.higor.webdriveracoes.WebDriverAcoes.getDriver;

public class PerfilProdutoAmazonStepDef {

    private final PagAmazonResultadoPesquisaPO pagAmazonResultadoPesquisaPO = new PagAmazonResultadoPesquisaPO();
    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Dado("^o perfil do produto e carregado$")
    public void o_perfil_do_produto_e_carregado() {
        Assert.assertTrue(pagAmazonResultadoPesquisaPO.aguardarPerfilProduto());
        CapturaDeTela.capturarTela(getDriver(), getScenario(), "Perfil do produto");
        getCurrentTest().log(Status.PASS,"Perfil do produto");
    }

    @Quando("a opcao de adicionar ao carrinho e pressionado")
    public void a_opcao_de_adicionar_ao_carrinho_e_pressionado() {
        pagAmazonPerfilProdutoPO.adicionarProdutoAoCarrinho();
        getCurrentTest().log(Status.PASS,"Adicionar ao carrinho");
    }
}