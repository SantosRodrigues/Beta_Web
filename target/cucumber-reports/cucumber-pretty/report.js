$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Novo Cliente - BomPracredito.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Solicitação de emprestimo",
  "description": "",
  "id": "solicitação-de-emprestimo",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Cenario: Novo cliente solicita credito com sucesso - Pegando CPF do 4Devs",
  "description": "",
  "id": "solicitação-de-emprestimo;cenario:-novo-cliente-solicita-credito-com-sucesso---pegando-cpf-do-4devs",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@NovoClienteSucesso4devs"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que eu acesso o site e preencho as seguintes informacoes",
  "rows": [
    {
      "cells": [
        "valor",
        "parcelas",
        "nome",
        "email",
        "aceitoTermo"
      ],
      "line": 9
    },
    {
      "cells": [
        "\u003cvalor\u003e",
        "\u003cparcelas\u003e",
        "\u003cnome\u003e",
        "\u003cemail\u003e",
        "\u003caceitoTermo\u003e"
      ],
      "line": 10
    }
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "clico no botao continuar sem custo e sem compromisso",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "aguardo o carregamento da tela de motivo do emprestimo",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "seleciono o \"\u003cmotivo\u003e\" do emprestimo",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "aguardo o carregamento da tela de possui veiculo",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "seleciono uma altenativa na tela de possui \"\u003cveiculo\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "aguardo o carregamento da tela possui imovel",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "seleciono uma alternativa na tela de possui \"\u003cimovel\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "aguardo o carregamento da tela de cpf",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "acesso o site do 4devs",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "solicito a geracao de um novo cpf",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "copio o cpf gerado",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "encerro a pagina do fourdevs",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "colo o documento no campo cpf",
  "keyword": "Quando "
});
formatter.step({
  "line": 24,
  "name": "clico no botao continuar",
  "keyword": "Entao "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "solicitação-de-emprestimo;cenario:-novo-cliente-solicita-credito-com-sucesso---pegando-cpf-do-4devs;",
  "rows": [
    {
      "cells": [
        "valor",
        "parcelas",
        "nome",
        "email",
        "aceitoTermo",
        "motivo",
        "veiculo",
        "imovel"
      ],
      "line": 26,
      "id": "solicitação-de-emprestimo;cenario:-novo-cliente-solicita-credito-com-sucesso---pegando-cpf-do-4devs;;1"
    },
    {
      "cells": [
        "1500",
        "12",
        "marcos silva",
        "auto",
        "sim",
        "outro",
        "nao",
        "nao"
      ],
      "line": 27,
      "id": "solicitação-de-emprestimo;cenario:-novo-cliente-solicita-credito-com-sucesso---pegando-cpf-do-4devs;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 10159065500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Cenario: Novo cliente solicita credito com sucesso - Pegando CPF do 4Devs",
  "description": "",
  "id": "solicitação-de-emprestimo;cenario:-novo-cliente-solicita-credito-com-sucesso---pegando-cpf-do-4devs;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@NovoClienteSucesso4devs"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que eu acesso o site e preencho as seguintes informacoes",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "rows": [
    {
      "cells": [
        "valor",
        "parcelas",
        "nome",
        "email",
        "aceitoTermo"
      ],
      "line": 9
    },
    {
      "cells": [
        "1500",
        "12",
        "marcos silva",
        "auto",
        "sim"
      ],
      "line": 10
    }
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "clico no botao continuar sem custo e sem compromisso",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "aguardo o carregamento da tela de motivo do emprestimo",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "seleciono o \"outro\" do emprestimo",
  "matchedColumns": [
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "aguardo o carregamento da tela de possui veiculo",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "seleciono uma altenativa na tela de possui \"nao\"",
  "matchedColumns": [
    6
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "aguardo o carregamento da tela possui imovel",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "seleciono uma alternativa na tela de possui \"nao\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "aguardo o carregamento da tela de cpf",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "acesso o site do 4devs",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "solicito a geracao de um novo cpf",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "copio o cpf gerado",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "encerro a pagina do fourdevs",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "colo o documento no campo cpf",
  "keyword": "Quando "
});
formatter.step({
  "line": 24,
  "name": "clico no botao continuar",
  "keyword": "Entao "
});
formatter.match({
  "location": "NovoCliente.preencho_as_seguintes_informacoes(DataTable)"
});
formatter.result({
  "duration": 857763700,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.clico_no_botao_continuar_sem_custo_e_sem_compromisso()"
});
formatter.result({
  "duration": 96282600,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo()"
});
formatter.result({
  "duration": 2798385100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "outro",
      "offset": 13
    }
  ],
  "location": "NovoCliente.seleciono_o_motivo_do_emprestimo(String)"
});
formatter.result({
  "duration": 137416300,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.aguardo_o_carregamento_da_tela_de_possui_veiculo()"
});
formatter.result({
  "duration": 1120091200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nao",
      "offset": 44
    }
  ],
  "location": "NovoCliente.seleciono_uma_altenativa_na_tela_de_possui_veiculo(String)"
});
formatter.result({
  "duration": 110225200,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.aguardo_o_carregamento_da_tela_possui_imovel()"
});
formatter.result({
  "duration": 1101250900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nao",
      "offset": 45
    }
  ],
  "location": "NovoCliente.seleciono_uma_alternativa_na_tela_de_possui_imovel(String)"
});
formatter.result({
  "duration": 99472000,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.aguardo_o_carregamento_da_tela_de_cpf()"
});
formatter.result({
  "duration": 1100589400,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.acesso_o_site_do_devs()"
});
formatter.result({
  "duration": 10727180500,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.solicito_a_geracao_de_um_novo_cpf()"
});
formatter.result({
  "duration": 212466000,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.copio_o_cpf_gerado()"
});
formatter.result({
  "duration": 648147500,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.encerro_a_pagina_do_devs()"
});
formatter.result({
  "duration": 988019500,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.colo_o_documento_no_campo_cpf()"
});
formatter.result({
  "duration": 183449100,
  "status": "passed"
});
formatter.match({
  "location": "NovoCliente.clico_no_botao_continuar()"
});
formatter.result({
  "duration": 72767200,
  "status": "passed"
});
formatter.after({
  "duration": 736568100,
  "status": "passed"
});
});