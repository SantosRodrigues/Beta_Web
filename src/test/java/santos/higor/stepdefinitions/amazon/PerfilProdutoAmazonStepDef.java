package santos.higor.stepdefinitions.amazon;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import santos.higor.utils.CapturaDeTela;
import org.junit.Assert;

import static santos.higor.hook.Hook.scenario;
import static santos.higor.webdriveracoes.WebDriverAcoes.getDriver;

public class PerfilProdutoAmazonStepDef {

    private final PagAmazonResultadoPesquisaPO pagAmazonResultadoPesquisaPO = new PagAmazonResultadoPesquisaPO();
    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Dado("^o perfil do produto e carregado$")
    public void o_perfil_do_produto_e_carregado() {
        Assert.assertTrue(pagAmazonResultadoPesquisaPO.aguardarPerfilProduto());
        CapturaDeTela.capturarTela(getDriver(), scenario, "Perfil do produto");
    }

    @Quando("a opcao de adicionar ao carrinho e pressionado")
    public void a_opcao_de_adicionar_ao_carrinho_e_pressionado() {
        pagAmazonPerfilProdutoPO.adicionarProdutoAoCarrinho();
    }
}