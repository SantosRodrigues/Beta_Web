package org.example.stepsDefinitions.bomPraCredito;

import cucumber.api.DataTable;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.example.stepsDefinitions.devs4.Pag4devsPO;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.example.utils.GeradorDeCpf.cpf;
import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getDriver4Devs;
import static org.example.properties.DefinitionsProperties.getProp;
import static org.example.utils.CapturaDeTela.capturarTela;

public class NovoClienteBomPraCreditoStepDef {

    private final PagBomPraCreditoHomePagePO pagHomePagePO = new PagBomPraCreditoHomePagePO();
    private final PagBomPraCreditoMotivoEmprestimoPO pagBomPraCreditoMotivoEmprestimoPO = new PagBomPraCreditoMotivoEmprestimoPO();
    private final PagBomPraCreditoPossuiVeiculoPO pagBomPraCreditoPossuiVeiculoPO = new PagBomPraCreditoPossuiVeiculoPO();
    private final PagBomPraCreditoPossuiImovelPO pagBomPraCreditoPossuiImovelPO = new PagBomPraCreditoPossuiImovelPO();
    private final PagBomPraCreditoPreencherCpfPO pagBomPraCreditoPreencherCpfPO = new PagBomPraCreditoPreencherCpfPO();
    private Pag4devsPO pag4DevsPO;

    @E("^que eu acesse o site bom pra credito")
    public void que_eu_acesse_o_site_site_bom_pra_credito() {
        getDriver().get(getProp().getProperty("prop.url.bomPraCredito"));
    }

    @E("^preencho as seguintes informacoes$")
    public void preencho_as_seguintes_informacoes(DataTable table) {
        capturarTela("Pagina inicial", getDriver());

        List<Map<String, String>> dadosHomePage = table.asMaps(String.class, String.class);

        if (dadosHomePage.get(0).get("email").equalsIgnoreCase("auto")) {
            pagHomePagePO.preencherDados(dadosHomePage.get(0).get("nome"), cpf() + "@gmail.com", dadosHomePage.get(0).get("parcelas"), dadosHomePage.get(0).get("valor"));
        } else {
            pagHomePagePO.preencherDados(dadosHomePage.get(0).get("nome"), dadosHomePage.get(0).get("email"), dadosHomePage.get(0).get("parcelas"), dadosHomePage.get(0).get("valor"));
        }
        capturarTela("Preenchendo informações iniciais", getDriver());
    }

    @E("^clico no botao continuar sem custo e sem compromisso$")
    public void clico_no_botao_continuar_sem_custo_e_sem_compromisso() {
        pagHomePagePO.avancar();
    }

    @E("^aguardo o carregamento da tela de motivo do emprestimo$")
    public void aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo() {
        Assert.assertTrue(pagHomePagePO.aguardar());
        capturarTela("Tela de motivo do emprestimo", getDriver());
    }

    @E("^seleciono o \"([^\"]*)\" do emprestimo$")
    public void seleciono_o_motivo_do_emprestimo(String emprestimo) {
        if (emprestimo.equalsIgnoreCase("outro")) {
            pagBomPraCreditoMotivoEmprestimoPO.escolherMotivo();
        } else {
            System.err.print("Opção inexistente no formulario!");
        }
        capturarTela("Preenchendo motivo do emprestimo", getDriver());
    }

    @E("^aguardo o carregamento da tela de possui veiculo$")
    public void aguardo_o_carregamento_da_tela_de_possui_veiculo() {
        Assert.assertTrue(pagBomPraCreditoMotivoEmprestimoPO.aguardar());
        capturarTela("Tela possui veiculo", getDriver());
    }

    @E("^seleciono uma altenativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_altenativa_na_tela_de_possui_veiculo(String veiculo) {
        if (veiculo.equalsIgnoreCase("nao")) {
            pagBomPraCreditoPossuiVeiculoPO.escolherNaoPossouVeiculo();
        } else {
            System.err.print("Opção inexistente no formulario!");
        }
        capturarTela("preenchendo tela de possui veiculo", getDriver());
    }

    @E("^aguardo o carregamento da tela possui imovel$")
    public void aguardo_o_carregamento_da_tela_possui_imovel() {
        Assert.assertTrue(pagBomPraCreditoPossuiVeiculoPO.aguardar());
        capturarTela("Tela de possui imovel", getDriver());
    }

    @E("^seleciono uma alternativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_alternativa_na_tela_de_possui_imovel(String imovel) {
        if (imovel.equalsIgnoreCase("nao")) {
            pagBomPraCreditoPossuiImovelPO.escolherNaoPossouVeiculo();
        } else {
            System.err.print("Opção inexistente no formulario!");
        }
        capturarTela("Preenchendo tela de possui imovel", getDriver());
    }

    @E("^aguardo o carregamento da tela de cpf$")
    public void aguardo_o_carregamento_da_tela_de_cpf() {
        Assert.assertTrue(pagBomPraCreditoPossuiImovelPO.aguardar());
        capturarTela("Tela de cpf", getDriver());
    }

    @E("^acesso o site do 4devs$")
    public void acesso_o_site_do_devs() {
        pag4DevsPO = new Pag4devsPO();
        pag4DevsPO.aguardandoCarregarPagina();
        capturarTela("Tela de gerador de cpf", getDriver4Devs());
    }

    @E("^solicito a geracao de um novo cpf$")
    public void solicito_a_geracao_de_um_novo_cpf() {
        pag4DevsPO.gerarCpfSemPontuacao();
    }

    @E("^copio o cpf gerado$")
    public void copio_o_cpf_gerado() {
        pag4DevsPO.copiarCpf();
        capturarTela("Tela com os dados do cpf gerado", getDriver4Devs());
    }

    @E("^encerro a pagina do fourdevs$")
    public void encerro_a_pagina_do_devs() {
        pag4DevsPO.encerrarPagina4devs();
    }

    @Quando("^colo o documento no campo cpf$")
    public void colo_o_documento_no_campo_cpf() {
        pagBomPraCreditoPreencherCpfPO.preencherCPF();
        capturarTela("Preenchendo as informações do cpf", getDriver());
    }

    @Entao("^clico no botao continuar$")
    public void clico_no_botao_continuar() {
        Assert.assertTrue(pagBomPraCreditoPreencherCpfPO.avancar());
    }

}