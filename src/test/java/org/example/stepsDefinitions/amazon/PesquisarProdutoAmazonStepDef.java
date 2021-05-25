package org.example.stepsDefinitions.amazon;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.example.common.CapturaDeTela;
import org.junit.Assert;

import static org.example.properties.DefinitionsProperties.getProp;
import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;

public class PesquisarProdutoAmazonStepDef {

    private final PagAmazonHomePagePO pagAmazonHomePagePO = new PagAmazonHomePagePO();
    private final PagAmazonResultadoPesquisaPO pagAmazonResultadoPesquisaPO = new PagAmazonResultadoPesquisaPO();
    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();
    private final CapturaDeTela capturaDeTela = new CapturaDeTela();
    private int i;

    @Dado("^que seja acessado o site da amazon$")
    public void que_seja_acessado_o_site_da_amazon() {
        getDriver().get(getProp().getProperty("prop.url.amazon"));
        capturaDeTela.capturarTela("Pagina Inicial", getDriver());
    }

    @E("^seja preenchida a barra de pesquisa com o nome do \"([^\"]*)\" que desejo procurar$")
    public void seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String pesquisa) {
        pagAmazonHomePagePO.preencherBarraDePesquisa(pesquisa);
        capturaDeTela.capturarTela("Preencher barra de pesquisa", getDriver());
    }

    @Quando("^o botao de pesquisar e pressionado$")
    public void o_botao_de_pesquisar_e_pressionado() {
        pagAmazonHomePagePO.clicarEmPesquisar();
    }

    @Entao("^deve ser retornado o \"([^\"]*)\" pesquisado$")
    public void deve_ser_retornado_o_produto_pesquisado(String produto) {
        Assert.assertTrue(pagAmazonHomePagePO.aguardarPesquisa());
        Assert.assertTrue(pagAmazonResultadoPesquisaPO.resgatarNomeDoProduto(produto));
        capturaDeTela.capturarTela("Retorno de produto disponivel", getDriver());
    }

    @Entao("^deve ser retornado a mensagem de \"([^\"]*)\" indisponivel$")
    public void deve_ser_retornado_a_mensagem_de_produto_indisponivel(String produto) {
        Assert.assertTrue(pagAmazonHomePagePO.aguardarPesquisa());
        Assert.assertEquals(pagAmazonResultadoPesquisaPO.mensagemDeProdutoNaoEncontrado(), "Nenhum resultado para " + produto);
        capturaDeTela.capturarTela("Retorno de produto indisponivel", getDriver());
    }

    @Dado("^e selecionado o produto desejado$")
    public void e_selecionado_o_produto_desejado() {
        pagAmazonResultadoPesquisaPO.selecionarProduto();
    }

    @Dado("^o perfil do produto e carregado$")
    public void o_perfil_do_produto_e_carregado() {
        Assert.assertTrue(pagAmazonResultadoPesquisaPO.aguardarPerfilProduto());
        capturaDeTela.capturarTela("Perfil do produto", getDriver());
    }

    @Quando("^a opcao de adicionar ao carrinho e pressionado$")
    public void a_opcao_de_adicionar_ao_carrinho_e_pressionado() {
        pagAmazonPerfilProdutoPO.adicionarProdutoAoCarrinho();

    }

    @Entao("^validar que produto foi adicionado ao carrinho com sucesso$")
    public void validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso() {
        Assert.assertTrue(pagAmazonPerfilProdutoPO.validarProdutoAdicionadoAoCarrinhoComSucesso());
        capturaDeTela.capturarTela("Produto adicionado ao carrinho", getDriver());

    }
}
