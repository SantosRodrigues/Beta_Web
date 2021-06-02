$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/bomPraCredito/Novo Cliente - BomPracredito.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Solicitação de emprestimo",
  "description": "",
  "id": "solicitação-de-emprestimo",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Cenario: Novo cliente solicita credito com sucesso - Pegando CPF do 4Devs",
  "description": "",
  "id": "solicitação-de-emprestimo;cenario:-novo-cliente-solicita-credito-com-sucesso---pegando-cpf-do-4devs",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@CTWeb"
    },
    {
      "line": 5,
      "name": "@CTBomPraCredito"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que eu acesse o site bom pra credito",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencho as seguintes informacoes",
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
  "keyword": "E "
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
        "2000",
        "9",
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
  "duration": 2710263200,
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
      "line": 5,
      "name": "@CTBomPraCredito"
    },
    {
      "line": 5,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que eu acesse o site bom pra credito",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "preencho as seguintes informacoes",
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
        "2000",
        "9",
        "marcos silva",
        "auto",
        "sim"
      ],
      "line": 10
    }
  ],
  "keyword": "E "
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
  "location": "NovoClienteBomPraCreditoStepDef.que_eu_acesse_o_site_site_bom_pra_credito()"
});
formatter.result({
  "duration": 3612275700,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.preencho_as_seguintes_informacoes(DataTable)"
});
formatter.result({
  "duration": 1767376500,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.clico_no_botao_continuar_sem_custo_e_sem_compromisso()"
});
formatter.result({
  "duration": 73484300,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo()"
});
formatter.result({
  "duration": 2824538000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "outro",
      "offset": 13
    }
  ],
  "location": "NovoClienteBomPraCreditoStepDef.seleciono_o_motivo_do_emprestimo(String)"
});
formatter.result({
  "duration": 330921800,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.aguardo_o_carregamento_da_tela_de_possui_veiculo()"
});
