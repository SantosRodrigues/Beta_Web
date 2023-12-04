package santos.higor.stepdefinitions.amazon;

import com.aventstack.extentreports.gherkin.model.Then;
import io.cucumber.java.pt.Entao;
import santos.higor.utils.CapturaDeTela;
import santos.higor.validacoes.ValidacaoAssertJ;
import santos.higor.webdriveracoes.WebDriverSetup;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;
import static santos.higor.relatorio.Extent.getTesteAtualEmExecucao;
import static santos.higor.utils.CapturaDeTela.recuperarPathTelaCapturada;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;

public class CarrinhoAmazonStepDef {

    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Entao("validar que produto foi adicionado ao carrinho com sucesso")
    public void validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso() {
        ValidacaoAssertJ validacaoIgualdade = new ValidacaoAssertJ();

        validacaoIgualdade.validoQueTextoEIgual("Adicionado ao carrinho", pagAmazonPerfilProdutoPO.validarProdutoAdicionadoAoCarrinhoComSucesso());

        CapturaDeTela.capturarTela(WebDriverSetup.getDriver(), getScenario(), "Produto adicionado ao carrinho");

        getTesteAtualEmExecucao().createNode(Then.class,"Produto adicionado ao carrinho")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Produto adicionado ao carrinho").build());

    }
}