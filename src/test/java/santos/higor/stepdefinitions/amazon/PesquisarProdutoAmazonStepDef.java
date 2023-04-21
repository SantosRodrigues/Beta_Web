package santos.higor.stepdefinitions.amazon;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Dado;
import santos.higor.utils.CapturaDeTela;
import org.junit.Assert;

import java.util.List;

import static santos.higor.hook.Hook.scenario;
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
        CapturaDeTela.capturarTela("Retorno de produto disponivel", getDriver(), scenario);
    }

    @Entao("deve ser retornado a mensagem de {string} indisponivel")
    public void deve_ser_retornado_a_mensagem_de_produto_indisponivel(String produto) {
        Assert.assertTrue(pagAmazonHomePagePO.aguardarQuePesquisaSejaRealizada());
        Assert.assertEquals(pagAmazonResultadoPesquisaPO.mensagemDeProdutoNaoEncontrado(), "Nenhum resultado para " + produto);
        CapturaDeTela.capturarTela("Retorno de produto indisponivel", getDriver(), scenario);
    }

    @Dado("e selecionado o produto desejado")
    public void e_selecionado_o_produto_desejado() {
        pagAmazonResultadoPesquisaPO.selecionarProduto(index);
    }
}