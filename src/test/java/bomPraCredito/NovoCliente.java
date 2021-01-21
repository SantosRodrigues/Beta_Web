package bomPraCredito;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.example.WebDriverAcoes;
import org.example.bomPraCredito.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.example.GeradorDeCpf.cpf;

public class NovoCliente {

    private PagHomePage pagHomePage;
    private Pag4devs pag4devs;
    private PagMotivoEmprestimo pagMotivoEmprestimo;
    private PagPossuiVeiculo pagPossuiVeiculo;
    private PagPossuiImovel pagPossuiImovel;
    private PagPreencherCPF pagPreencherCPF;
    private WebDriverAcoes webDriverAcoes;

    public NovoCliente() {
        webDriverAcoes = new WebDriverAcoes();
        pagHomePage = new PagHomePage();
        pagMotivoEmprestimo = new PagMotivoEmprestimo();
        pagPossuiVeiculo = new PagPossuiVeiculo();
        pagPossuiImovel = new PagPossuiImovel();
        pagPreencherCPF = new PagPreencherCPF();
    }

    @Dado("^que eu acesso o site e preencho as seguintes informacoes$")
    public void preencho_as_seguintes_informacoes(DataTable table) throws Throwable {
        List<Map<String, String>> dadosHomePage = table.asMaps(String.class, String.class);

        if (dadosHomePage.get(0).get("email").equalsIgnoreCase("auto")) {
            pagHomePage.preencherDados(dadosHomePage.get(0).get("nome"), cpf() + "@gmail.com", dadosHomePage.get(0).get("parcelas"));
        } else {
            pagHomePage.preencherDados(dadosHomePage.get(0).get("nome"), dadosHomePage.get(0).get("email"), dadosHomePage.get(0).get("parcelas"));
        }
    }

    @Dado("^clico no botao continuar sem custo e sem compromisso$")
    public void clico_no_botao_continuar_sem_custo_e_sem_compromisso() throws Throwable {
        pagHomePage.avancar();
    }

    @Dado("^aguardo o carregamento da tela de motivo do emprestimo$")
    public void aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo() throws Throwable {
        Assert.assertTrue(pagHomePage.aguardar());
    }

    @Dado("^seleciono o \"([^\"]*)\" do emprestimo$")
    public void seleciono_o_motivo_do_emprestimo(String emprestimo) throws Throwable {
        if (emprestimo.equalsIgnoreCase("outro")) {
            pagMotivoEmprestimo.escolherMotivo();
        }
    }

    @Dado("^aguardo o carregamento da tela de possui veiculo$")
    public void aguardo_o_carregamento_da_tela_de_possui_veiculo() throws Throwable {
        Assert.assertTrue(pagMotivoEmprestimo.aguardar());
    }

    @Dado("^seleciono uma altenativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_altenativa_na_tela_de_possui_veiculo(String veiculo) throws Throwable {
        if (veiculo.equals("nao")) {
            pagPossuiVeiculo.escolherNaoPossouVeiculo();
        }
    }

    @Dado("^aguardo o carregamento da tela possui imovel$")
    public void aguardo_o_carregamento_da_tela_possui_imovel() throws Throwable {
        Assert.assertTrue(pagPossuiVeiculo.aguardar());
    }

    @Dado("^seleciono uma alternativa na tela de possui \"([^\"]*)\"$")
    public void seleciono_uma_alternativa_na_tela_de_possui_imovel(String imovel) throws Throwable {
        if (imovel.equalsIgnoreCase("nao")) {
            pagPossuiImovel.escolherNaoPossouVeiculo();
        }
    }

    @Dado("^aguardo o carregamento da tela de cpf$")
    public void aguardo_o_carregamento_da_tela_de_cpf() throws Throwable {
        Assert.assertTrue(pagPossuiImovel.aguardar());
    }

    @Dado("^acesso o site do 4devs$")
    public void acesso_o_site_do_devs() throws Throwable {
        pag4devs = new Pag4devs();

    }

    @Dado("^solicito a geracao de um novo cpf$")
    public void solicito_a_geracao_de_um_novo_cpf() throws Throwable {
        pag4devs.gerarCpfSemPontuacao();
    }

    @Dado("^copio o cpf gerado$")
    public void copio_o_cpf_gerado() throws Throwable {
        pag4devs.copiarCpf();
    }

    @Dado("^encerro a pagina do fourdevs$")
    public void encerro_a_pagina_do_devs() throws Throwable {
        pag4devs.encerrarPagina4devs();
    }

    @Dado("^colo o documento no campo cpf$")
    public void colo_o_documento_no_campo_cpf() throws Throwable {
        pagPreencherCPF.preencherCPF();
    }

    @Quando("^clico no botao continuar$")
    public void clico_no_botao_continuar() throws Throwable {
        Assert.assertTrue(pagPreencherCPF.avancar());
    }


}
