$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/amazon/Pesquisar produto - Amazon.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Pesquisar produto desejado",
  "description": "",
  "id": "pesquisar-produto-desejado",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validar que o produto esteja disponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CTWeb"
    },
    {
      "line": 7,
      "name": "@CTAmazon"
    },
    {
      "line": 7,
      "name": "@CTAmazonProdutoDisponivel"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "deve ser retornado o \"\u003cproduto\u003e\" pesquisado",
  "keyword": "Entao "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 14,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;;1"
    },
    {
      "cells": [
        "mi band"
      ],
      "line": 15,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 2209239600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Buscar pelo produto desejado para adicionar ao carrinho",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 15,
  "name": "Validar que o produto esteja disponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-disponivel;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@CTAmazonProdutoDisponivel"
    },
    {
      "line": 7,
      "name": "@CTAmazon"
    },
    {
      "line": 7,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "seja preenchida a barra de pesquisa com o nome do \"mi band\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "deve ser retornado o \"mi band\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
formatter.result({
  "duration": 2852135600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 51
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String)"
});
formatter.result({
  "duration": 498078700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 1260502700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 22
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.deve_ser_retornado_o_produto_pesquisado(String)"
});
formatter.result({
  "duration": 1925470700,
  "status": "passed"
});
formatter.after({
  "duration": 749385000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Validar que o produto esteja indisponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@CTWeb"
    },
    {
      "line": 17,
      "name": "@CTAmazon"
    },
    {
      "line": 17,
      "name": "@CTAmazonProdutoIndisponivel"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "deve ser retornado a mensagem de \"\u003cproduto\u003e\" indisponivel",
  "keyword": "Entao "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 24,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;1"
    },
    {
      "cells": [
        "dnhasjkdlhasdhasda"
      ],
      "line": 25,
      "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1247995200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Buscar pelo produto desejado para adicionar ao carrinho",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 25,
  "name": "Validar que o produto esteja indisponivel",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-o-produto-esteja-indisponivel;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 17,
      "name": "@CTAmazonProdutoIndisponivel"
    },
    {
      "line": 17,
      "name": "@CTAmazon"
    },
    {
      "line": 17,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "seja preenchida a barra de pesquisa com o nome do \"dnhasjkdlhasdhasda\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "deve ser retornado a mensagem de \"dnhasjkdlhasdhasda\" indisponivel",
  "matchedColumns": [
    0
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
formatter.result({
  "duration": 1902977100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dnhasjkdlhasdhasda",
      "offset": 51
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String)"
});
formatter.result({
  "duration": 585930700,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 891701500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dnhasjkdlhasdhasda",
      "offset": 34
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.deve_ser_retornado_a_mensagem_de_produto_indisponivel(String)"
});
formatter.result({
  "duration": 297387800,
  "status": "passed"
});
formatter.after({
  "duration": 750352100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Validar que produto foi adicionado ao carrinho",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 27,
      "name": "@CTWeb"
    },
    {
      "line": 27,
      "name": "@CTAmazon"
    },
    {
      "line": 27,
      "name": "@CTAmazonCarrinhoSucesso"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 30,
  "name": "seja preenchida a barra de pesquisa com o nome do \"\u003cproduto\u003e\" que desejo procurar",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "deve ser retornado o \"\u003cproduto\u003e\" pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "e selecionado o produto desejado",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "o perfil do produto e carregado",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "a opcao de adicionar ao carrinho e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 36,
  "name": "validar que produto foi adicionado ao carrinho com sucesso",
  "keyword": "Entao "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;",
  "rows": [
    {
      "cells": [
        "produto"
      ],
      "line": 38,
      "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;1"
    },
    {
      "cells": [
        "mi band"
      ],
      "line": 39,
      "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 1238484100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Buscar pelo produto desejado para adicionar ao carrinho",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.scenario({
  "line": 39,
  "name": "Validar que produto foi adicionado ao carrinho",
  "description": "",
  "id": "pesquisar-produto-desejado;validar-que-produto-foi-adicionado-ao-carrinho;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 27,
      "name": "@CTAmazonCarrinhoSucesso"
    },
    {
      "line": 27,
      "name": "@CTAmazon"
    },
    {
      "line": 27,
      "name": "@CTWeb"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "que seja acessado o site da amazon",
  "keyword": "Dado "
});
formatter.step({
  "line": 30,
  "name": "seja preenchida a barra de pesquisa com o nome do \"mi band\" que desejo procurar",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "o botao de pesquisar e pressionado",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "deve ser retornado o \"mi band\" pesquisado",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "e selecionado o produto desejado",
  "keyword": "E "
});
formatter.step({
  "line": 34,
  "name": "o perfil do produto e carregado",
  "keyword": "E "
});
formatter.step({
  "line": 35,
  "name": "a opcao de adicionar ao carrinho e pressionado",
  "keyword": "Quando "
});
formatter.step({
  "line": 36,
  "name": "validar que produto foi adicionado ao carrinho com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.que_seja_acessado_o_site_da_amazon()"
});
formatter.result({
  "duration": 3580412400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 51
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.seja_preenchida_a_barra_de_pesquisa_com_o_nome_do_produto_que_desejo_procurar(String)"
});
formatter.result({
  "duration": 521054800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_botao_de_pesquisar_e_pressionado()"
});
formatter.result({
  "duration": 1417634100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mi band",
      "offset": 22
    }
  ],
  "location": "PesquisarProdutoAmazonStepDef.deve_ser_retornado_o_produto_pesquisado(String)"
});
formatter.result({
  "duration": 1955300100,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.e_selecionado_o_produto_desejado()"
});
formatter.result({
  "duration": 2770056100,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.o_perfil_do_produto_e_carregado()"
});
formatter.result({
  "duration": 272591800,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.a_opcao_de_adicionar_ao_carrinho_e_pressionado()"
});
formatter.result({
  "duration": 1078644400,
  "status": "passed"
});
formatter.match({
  "location": "PesquisarProdutoAmazonStepDef.validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso()"
});
formatter.result({
  "duration": 333161600,
  "status": "passed"
});
formatter.after({
  "duration": 792327100,
  "status": "passed"
});
formatter.uri("features/bomPraCredito/Novo Cliente - BomPracredito.feature");
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
  "duration": 1277695300,
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
  "duration": 2081453700,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.preencho_as_seguintes_informacoes(DataTable)"
});
formatter.result({
  "duration": 1405696600,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.clico_no_botao_continuar_sem_custo_e_sem_compromisso()"
});
formatter.result({
  "duration": 60826400,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.aguardo_o_carregamento_da_tela_de_motivo_do_emprestimo()"
});
formatter.result({
  "duration": 2589755000,
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
  "duration": 276896200,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.aguardo_o_carregamento_da_tela_de_possui_veiculo()"
});
formatter.result({
  "duration": 1304286800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nao",
      "offset": 44
    }
  ],
  "location": "NovoClienteBomPraCreditoStepDef.seleciono_uma_altenativa_na_tela_de_possui_veiculo(String)"
});
formatter.result({
  "duration": 205880700,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.aguardo_o_carregamento_da_tela_possui_imovel()"
});
formatter.result({
  "duration": 1322429900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nao",
      "offset": 45
    }
  ],
  "location": "NovoClienteBomPraCreditoStepDef.seleciono_uma_alternativa_na_tela_de_possui_imovel(String)"
});
formatter.result({
  "duration": 224198900,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.aguardo_o_carregamento_da_tela_de_cpf()"
});
formatter.result({
  "duration": 1329460100,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.acesso_o_site_do_devs()"
});
formatter.result({
  "duration": 3829557900,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.solicito_a_geracao_de_um_novo_cpf()"
});
formatter.result({
  "duration": 141938900,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.copio_o_cpf_gerado()"
});
formatter.result({
  "duration": 791288900,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.encerro_a_pagina_do_devs()"
});
formatter.result({
  "duration": 716208800,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.colo_o_documento_no_campo_cpf()"
});
formatter.result({
  "duration": 406772900,
  "status": "passed"
});
formatter.match({
  "location": "NovoClienteBomPraCreditoStepDef.clico_no_botao_continuar()"
});
formatter.result({
  "duration": 76064700,
  "status": "passed"
});
formatter.after({
  "duration": 748261300,
  "status": "passed"
});
});