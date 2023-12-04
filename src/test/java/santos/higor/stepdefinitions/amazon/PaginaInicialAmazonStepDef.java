package santos.higor.stepdefinitions.amazon;

import com.aventstack.extentreports.gherkin.model.And;
import com.aventstack.extentreports.gherkin.model.Given;
import com.aventstack.extentreports.gherkin.model.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import santos.higor.utils.CapturaDeTela;
import santos.higor.webdriveracoes.WebDriverSetup;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;
import static santos.higor.enums.Parametros.URL_AMAZON;
import static santos.higor.properties.VariavelDoSistema.getParametro;
import static santos.higor.relatorio.Extent.*;
import static santos.higor.utils.CapturaDeTela.recuperarPathTelaCapturada;
import static santos.higor.utils.GerenciadorDeScenario.getScenario;

public class PaginaInicialAmazonStepDef {

    private final PagAmazonHomePagePO pagAmazonHomePagePO = new PagAmazonHomePagePO();

    @Dado("que seja acessado o site da amazon")
    public void que_seja_acessado_o_site_da_amazon() {
        WebDriverSetup.getDriver().get(getParametro(URL_AMAZON));
        CapturaDeTela.capturarTela(WebDriverSetup.getDriver(), getScenario(), "Pagina Inicial");
        getTesteAtualEmExecucao().createNode(Given.class, "Pagina Inicial")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Tela inicial").build());

    }

    @E("seja preenchida a barra de pesquisa com o nome do {string} que desejo procurar")
    public void seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String pesquisa) {
        pagAmazonHomePagePO.preencherBarraDePesquisa(pesquisa);
        CapturaDeTela.capturarTela(WebDriverSetup.getDriver(), getScenario(), "Preencher barra de pesquisa");
        getTesteAtualEmExecucao().createNode(And.class, "Preencher barra de pesquisa")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Barra de pesquisa preenchida").build());
    }

    @Quando("o botao de pesquisar e pressionado")
    public void o_botao_de_pesquisar_e_pressionado() {
        pagAmazonHomePagePO.clicarEmPesquisar();
        getTesteAtualEmExecucao().createNode(When.class, "Clica em pesquisar")
                .pass(createScreenCaptureFromPath(recuperarPathTelaCapturada(),"Pesquisar").build());
    }
}