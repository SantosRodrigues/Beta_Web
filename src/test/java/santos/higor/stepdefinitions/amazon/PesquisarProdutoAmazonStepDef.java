package santos.higor.stepdefinitions.amazon;

import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.gherkin.model.Then;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Dado;
import santos.higor.utils.CapturaDeTela;
import org.junit.Assert;

import java.util.List;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;
import static santos.higor.relatorio.Extent.getTesteAtualEmExecucao;
import static santos.higor.utils.CapturaDeTela.recuperarPathTelaCapturada;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;
import static santos.higor.webdriveracoes.WebDriverAcoes.getDriver;

public class PesquisarProdutoAmazonStepDef {

    private final PagAmazonHomePagePO pagAmazonHomePagePO = new PagAmazonHomePagePO();
    private final PagAmazonResultadoPesquisaPO pagAmazonResultadoPesquisaPO = new PagAmazonResultadoPesquisaPO();
    private int index = 0;

    @Entao("deve ser retornado o {string} pesquisado")
    public void deve_ser_retornado_o_produto_pesquisado(String produto) {
        Assert.assertTrue(pagAmazonHomePagePO.aguardarQuePesquisaSejaRealizada());
        boolean itemEncontrado = false;

        List<String> listaDeProdutos = pagAmazonResultadoPesquisaPO.retornarListaDeProdutosEncontrados();
        for (String item : listaDeProdutos) {
            this.index++;
            if (item.contains(produto)) {
                itemEncontrado = true;
                break;
            }
        }
        Assert.assertTrue(itemEncontrado);
        CapturaDeTela.capturarTela(getDriver(), getScenario(), "Retorno de produto disponivel");
        getTesteAtualEmExecucao().createNode(Then.class,"Retorno de produto disponivel")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Pesquisa de produto").build());

    }

    @Entao("deve ser retornado a mensagem de {string} indisponivel")
    public void deve_ser_retornado_a_mensagem_de_produto_indisponivel(String produto) {
        Assert.assertTrue(pagAmazonHomePagePO.aguardarQuePesquisaSejaRealizada());
        Assert.assertEquals(pagAmazonResultadoPesquisaPO.mensagemDeProdutoNaoEncontrado(), "Nenhum resultado para " + produto);
        CapturaDeTela.capturarTela(getDriver(), getScenario(), "Retorno de produto indisponivel");
        getTesteAtualEmExecucao().createNode(Then.class,"Retorno de produto indisponivel")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Pesquisa de produto indisponivel").build());

    }

    @Dado("e selecionado o produto desejado")
    public void e_selecionado_o_produto_desejado() {
        pagAmazonResultadoPesquisaPO.selecionarProduto(index);
        getTesteAtualEmExecucao().createNode(Given.class,"Produto selecionado")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Produto selecionado").build());
    }
}