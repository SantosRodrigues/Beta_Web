package org.example.amazon;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;

public class PesquisarProdutoStepDef {

    private PagAmazonHomePagePO pagAmazonHomePagePO = new PagAmazonHomePagePO();
    private PagAmazonResultadoPesquisaPO pagAmazonResultadoPesquisaPO = new PagAmazonResultadoPesquisaPO();

    @Dado("^que seja acessado o \"([^\"]*)\" da amazon$")
    public void que_seja_acessado_o_site_da_amazon(String url) {
        getDriver().get(url);
    }

    @E("^seja preenchida a barra de pesquisa com o nome do \"([^\"]*)\" que desejo procurar$")
    public void seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String pesquisa) {
        pagAmazonHomePagePO.preencherBarraDePesquisa(pesquisa);
    }

    @Quando("^o botao de pesquisar e pressionado$")
    public void o_botao_de_pesquisar_e_pressionado() {
        pagAmazonHomePagePO.clicarEmPesquisar();
    }

    @Entao("^deve ser retornado o \"([^\"]*)\" pesquisado$")
    public void deve_ser_retornado_o_produto_pesquisado(String produto) {
        Assert.assertTrue(pagAmazonHomePagePO.aguardarPesquisa());
        Assert.assertTrue(pagAmazonResultadoPesquisaPO.resgatarNomeDoProduto(produto));
    }

}
