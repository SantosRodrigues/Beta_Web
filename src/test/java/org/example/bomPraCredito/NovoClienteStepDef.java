package org.example.bomPraCredito;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import org.example.geradorDeCpf.Pag4devsPO;
import org.example.webDriverAcoes.WebDriverAcoes;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.example.geradorDeCpf.GeradorDeCpf.cpf;

public class NovoClienteStepDef {

    private PagHomePagePO pagHomePagePO;
    private Pag4devsPO pag4DevsPO;
    private PagMotivoEmprestimoPO pagMotivoEmprestimoPO;
    private PagPossuiVeiculoPO pagPossuiVeiculoPO;
    private PagPossuiImovelPO pagPossuiImovelPO;
    private PagPreencherCpfPO pagPreencherCpfPO;
    private WebDriverAcoes webDriverAcoes;

    public NovoClienteStepDef() {
        webDriverAcoes = new WebDriverAcoes();
        pagHomePagePO = new PagHomePagePO();
        pagMotivoEmprestimoPO = new PagMotivoEmprestimoPO();
        pagPossuiVeiculoPO = new PagPossuiVeiculoPO();
        pagPossuiImovelPO = new PagPossuiImovelPO();
        pagPreencherCpfPO = new PagPreencherCpfPO();
    }

    @Dado("^que eu acesso o site e preencho as seguintes informacoes$")
    public void preencho_as_seguintes_informacoes(DataTable table) throws Throwable {
        List<Map<String, String>> dadosHomePage = table.asMaps(String.class, String.class);

        if (dadosHomePage.get(0).get("email").equalsIgnoreCase("auto")) {
            pagHomePagePO.preencherDados(dadosHomePage.get(0).get("nome"), cpf() + "@gmail.com", dadosHomePage.get(0).get("parcelas"));
        } else {
            pagHomePagePO.preencherDados(dadosHomePage.get(0).get("nome"), dadosHomePage.get(0).get("email"), dadosHomePage.get(0).get("parcelas"));
        }
    }

    @Dado("^clico no botao continuar sem custo e sem compromisso$")
    public void clico_no_botao_continuar_sem_custo_e_sem_compromisso() throws Throwable {
        pagHomePagePO.avancar();
    }

    @Dado("^aguardo o carregamento da tela de motivo do emprestimo$")
    public void aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo() throws Throwable {
        Assert.assertTrue(pagHomePagePO.aguardar());
    }

    @Dado("^seleciono o \"([^\"]*)\" do emprestimo$")
    public void seleciono_o_motivo_do_emprestimo(String emprestimo) throws Throwable {
        if (emprestimo.equalsIgnoreCase("outro")) {
            pagMotivoEmprestimoPO.escolherMotivo();
        }
    }

    @Dado("^aguardo o carregamento da tela de possui veiculo$")
    public void aguardo_o_carregamento_da_tela_de_possui_veiculo() throws Throwable {
        Assert.assertTrue(pagMotivoEmprestimoPO.aguardar());
    }

    @Dado("^seleciono uma altenativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_altenativa_na_tela_de_possui_veiculo(String veiculo) throws Throwable {
        if (veiculo.equals("nao")) {
            pagPossuiVeiculoPO.escolherNaoPossouVeiculo();
        }
    }

    @Dado("^aguardo o carregamento da tela possui imovel$")
    public void aguardo_o_carregamento_da_tela_possui_imovel() throws Throwable {
        Assert.assertTrue(pagPossuiVeiculoPO.aguardar());
    }

    @Dado("^seleciono uma alternativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_alternativa_na_tela_de_possui_imovel(String imovel) throws Throwable {
        if (imovel.equalsIgnoreCase("nao")) {
            pagPossuiImovelPO.escolherNaoPossouVeiculo();
        }
    }

    @Dado("^aguardo o carregamento da tela de cpf$")
    public void aguardo_o_carregamento_da_tela_de_cpf() throws Throwable {
        Assert.assertTrue(pagPossuiImovelPO.aguardar());
    }

    @Dado("^acesso o site do 4devs$")
    public void acesso_o_site_do_devs() throws Throwable {
        pag4DevsPO = new Pag4devsPO();

    }

    @Dado("^solicito a geracao de um novo cpf$")
    public void solicito_a_geracao_de_um_novo_cpf() throws Throwable {
        pag4DevsPO.gerarCpfSemPontuacao();
    }

    @Dado("^copio o cpf gerado$")
    public void copio_o_cpf_gerado() throws Throwable {
        pag4DevsPO.copiarCpf();
    }

    @Dado("^encerro a pagina do fourdevs$")
    public void encerro_a_pagina_do_devs() throws Throwable {
        pag4DevsPO.encerrarPagina4devs();
    }

    @Dado("^colo o documento no campo cpf$")
    public void colo_o_documento_no_campo_cpf() throws Throwable {
        pagPreencherCpfPO.preencherCPF();
    }

    @Quando("^clico no botao continuar$")
    public void clico_no_botao_continuar() throws Throwable {
        Assert.assertTrue(pagPreencherCpfPO.avancar());
    }


}
