package santos.higor.stepdefinitions.amazon;

import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.gherkin.model.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import santos.higor.utils.CapturaDeTela;
import santos.higor.validacoes.ValidacaoAssertJ;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;
import static santos.higor.relatorio.Extent.getTesteAtualEmExecucao;
import static santos.higor.utils.CapturaDeTela.recuperarPathTelaCapturada;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;
import static santos.higor.webdriveracoes.WebDriverSetup.getDriver;

public class PerfilProdutoAmazonStepDef {

    private final PagAmazonResultadoPesquisaPO pagAmazonResultadoPesquisaPO = new PagAmazonResultadoPesquisaPO();
    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Dado("^o perfil do produto e carregado$")
    public void o_perfil_do_produto_e_carregado() {
        ValidacaoAssertJ validacaoAssertJ = new ValidacaoAssertJ();

        validacaoAssertJ.validoQueSejaVerdadeiro(pagAmazonResultadoPesquisaPO.aguardarPerfilProduto());

        CapturaDeTela.capturarTela(getDriver(), getScenario(), "Perfil do produto");

        getTesteAtualEmExecucao().createNode(Given.class,"Perfil do produto")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Perfil do produto").build());
    }

    @Quando("a opcao de adicionar ao carrinho e pressionado")
    public void a_opcao_de_adicionar_ao_carrinho_e_pressionado() {
        pagAmazonPerfilProdutoPO.adicionarProdutoAoCarrinho();
        getTesteAtualEmExecucao().createNode(When.class,"Adicionar ao carrinho")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Adicionar ao carrinho").build());
    }
}