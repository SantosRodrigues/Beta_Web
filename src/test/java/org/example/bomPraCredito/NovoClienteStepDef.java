package org.example.bomPraCredito;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.example.geradorDeCpf.Pag4devsPO;
import org.example.webDriverAcoes.WebDriverAcoes;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.example.geradorDeCpf.GeradorDeCpf.cpf;
import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;

public class NovoClienteStepDef {

    private PagBomPraCreditoHomePagePO pagHomePagePO;
    private Pag4devsPO pag4DevsPO;
    private PagBomPraCreditoMotivoEmprestimoPO pagBomPraCreditoMotivoEmprestimoPO;
    private PagBomPraCreditoPossuiVeiculoPO pagBomPraCreditoPossuiVeiculoPO;
    private PagBomPraCreditoPossuiImovelPO pagBomPraCreditoPossuiImovelPO;
    private PagBomPraCreditoPreencherCpfPO pagBomPraCreditoPreencherCpfPO;
    private WebDriverAcoes webDriverAcoes;

    public NovoClienteStepDef() {
        webDriverAcoes = new WebDriverAcoes();
        pagHomePagePO = new PagBomPraCreditoHomePagePO();
        pagBomPraCreditoMotivoEmprestimoPO = new PagBomPraCreditoMotivoEmprestimoPO();
        pagBomPraCreditoPossuiVeiculoPO = new PagBomPraCreditoPossuiVeiculoPO();
        pagBomPraCreditoPossuiImovelPO = new PagBomPraCreditoPossuiImovelPO();
        pagBomPraCreditoPreencherCpfPO = new PagBomPraCreditoPreencherCpfPO();
    }

    @E("^que eu acesse o \"([^\"]*)\"$")
    public void que_eu_acesse_o_site(String url) {
        getDriver().get(url);
    }

    @E("^preencho as seguintes informacoes$")
    public void preencho_as_seguintes_informacoes(DataTable table){


        List<Map<String, String>> dadosHomePage = table.asMaps(String.class, String.class);

        if (dadosHomePage.get(0).get("email").equalsIgnoreCase("auto")) {
            pagHomePagePO.preencherDados(dadosHomePage.get(0).get("nome"), cpf() + "@gmail.com", dadosHomePage.get(0).get("parcelas"));
        } else {
            pagHomePagePO.preencherDados(dadosHomePage.get(0).get("nome"), dadosHomePage.get(0).get("email"), dadosHomePage.get(0).get("parcelas"));
        }
    }

    @E("^clico no botao continuar sem custo e sem compromisso$")
    public void clico_no_botao_continuar_sem_custo_e_sem_compromisso(){
        pagHomePagePO.avancar();
    }

    @E("^aguardo o carregamento da tela de motivo do emprestimo$")
    public void aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo(){
        Assert.assertTrue(pagHomePagePO.aguardar());
    }

    @E("^seleciono o \"([^\"]*)\" do emprestimo$")
    public void seleciono_o_motivo_do_emprestimo(String emprestimo){
        if (emprestimo.equalsIgnoreCase("outro")) {
            pagBomPraCreditoMotivoEmprestimoPO.escolherMotivo();
        }
    }

    @E("^aguardo o carregamento da tela de possui veiculo$")
    public void aguardo_o_carregamento_da_tela_de_possui_veiculo(){
        Assert.assertTrue(pagBomPraCreditoMotivoEmprestimoPO.aguardar());
    }

    @E("^seleciono uma altenativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_altenativa_na_tela_de_possui_veiculo(String veiculo){
        if (veiculo.equals("nao")) {
            pagBomPraCreditoPossuiVeiculoPO.escolherNaoPossouVeiculo();
        }
    }

    @E("^aguardo o carregamento da tela possui imovel$")
    public void aguardo_o_carregamento_da_tela_possui_imovel(){
        Assert.assertTrue(pagBomPraCreditoPossuiVeiculoPO.aguardar());
    }

    @E("^seleciono uma alternativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_alternativa_na_tela_de_possui_imovel(String imovel){
        if (imovel.equalsIgnoreCase("nao")) {
            pagBomPraCreditoPossuiImovelPO.escolherNaoPossouVeiculo();
        }
    }

    @E("^aguardo o carregamento da tela de cpf$")
    public void aguardo_o_carregamento_da_tela_de_cpf(){
        Assert.assertTrue(pagBomPraCreditoPossuiImovelPO.aguardar());
    }

    @E("^acesso o site do 4devs$")
    public void acesso_o_site_do_devs(){
        pag4DevsPO = new Pag4devsPO();
    }

    @E("^solicito a geracao de um novo cpf$")
    public void solicito_a_geracao_de_um_novo_cpf(){
        pag4DevsPO.gerarCpfSemPontuacao();
    }

    @E("^copio o cpf gerado$")
    public void copio_o_cpf_gerado(){
        pag4DevsPO.copiarCpf();
    }

    @E("^encerro a pagina do fourdevs$")
    public void encerro_a_pagina_do_devs(){
        pag4DevsPO.encerrarPagina4devs();
    }

    @Quando("^colo o documento no campo cpf$")
    public void colo_o_documento_no_campo_cpf(){
        pagBomPraCreditoPreencherCpfPO.preencherCPF();
    }

    @Entao("^clico no botao continuar$")
    public void clico_no_botao_continuar(){
        Assert.assertTrue(pagBomPraCreditoPreencherCpfPO.avancar());
    }


}
